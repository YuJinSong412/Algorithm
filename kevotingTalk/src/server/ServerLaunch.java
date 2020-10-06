package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import server.userDB.UserDAO;

public class ServerLaunch {

  static ExecutorService executorService;
  static ServerSocket serverSocket;
    static List<Client> connections = new Vector<Client>();  //연결되어있는 클라이언트들
  
  public static void main(String[] args) {
    
    startServer();

  }
  
  static void startServer() {
    executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    
    try {
      serverSocket = new ServerSocket();
      serverSocket.bind(new InetSocketAddress("localhost",5027));
      System.out.println("서버 연결 기다림");
      //-> serverSocket 생성 및 포트 바인딩
      
      
    }catch(Exception e) {
      if(!serverSocket.isClosed()) {
        stopServer();
      }
      return;
    }
    
    //연결을 수락하는 코드
    Runnable runnable = new Runnable() { //수락 작업 생성

      @Override
      public void run() {
        
        while(true) {
          try {
            Socket socket = serverSocket.accept();
            System.out.println("연결 수락: " + socket.getRemoteSocketAddress() + ": " + Thread.currentThread().getName());  //Thread.currentThread().getName());
            
            Client client = new Client(socket);
            connections.add(client);
            System.out.println("연결 개수: "+connections.size());
            
          } catch (IOException e) {
            e.printStackTrace();
          }
          
        }
        
      }
      
    };
    executorService.submit(runnable);
  }
  
  static void stopServer() {
    try {
      Iterator<Client> iterator = connections.iterator();
      while(iterator.hasNext()) {
        Client client = iterator.next();
        client.socket.close();
        iterator.remove();
      }
      if(serverSocket!= null && !serverSocket.isClosed()) {
        serverSocket.close();
      }
      if(executorService != null && !executorService.isShutdown()) {
        executorService.shutdown();
      }
    }catch(Exception e) {}
  }
  
   static class Client{
    Socket socket;
    OutputStream outputStream;
    public Client(Socket socket) {
      this.socket = socket;
      try {
        outputStream = socket.getOutputStream();
      } catch (IOException e) {
        e.printStackTrace();
      }
      receive();
    }
    
    //클라이언트의 데이터를 받는 메소드
    public void receive() {
      Runnable runnable = new Runnable() {

        @Override
        public void run() {
          try {
            while(true) {
              byte[] byteArr = new byte[100];
              InputStream inputStream = socket.getInputStream();
              
              int readByteCount = inputStream.read(byteArr);
              
              if(readByteCount == -1) { throw new IOException();}
              
              System.out.println("요청처리: "+ socket.getRemoteSocketAddress());
              
              String data = new String(byteArr, 0, readByteCount, "UTF-8");
              print(data);
//              for(Client client : connections) {
//                client.send(data);
//              }
              
            }
          }catch(Exception e) {
            
          }
        }

        
        
      };
      executorService.submit(runnable);
    }
    private void print(String data) {

      for(Client client : connections) {
        //client.send(data);
        System.out.println("fsdfsdfsdf"+client);
        try {
          client.outputStream.write(data.getBytes());
          client.outputStream.flush();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
    }


    public void send(String data) {
      Runnable runnable = new Runnable() {

        @Override
        public void run() {
          try {
            byte[] byteArr = data.getBytes("UTF-8");
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(byteArr);
            outputStream.flush();
            System.out.println("보내따");
          }catch(IOException e) {
            System.out.println("못보내따");
          }
          
        }
        
      };
      executorService.submit(runnable);
    }
  }

}