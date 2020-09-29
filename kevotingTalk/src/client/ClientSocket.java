package client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.HashMap;
import client.frame.ChatWindowPanel;
import server.ServerLaunch;
import server.userDB.UserDAO;

public class ClientSocket {
  
  static Socket socket;
  
  public void startClient() {
    
    Thread thread = new Thread() {
      
      @Override
      public void run() {
        try {
          socket = new Socket();
          socket.connect(new InetSocketAddress("localhost", 5027)); 
          System.out.println("연결 요청");
          setName(UserDAO.username);
          System.out.println(getName());
          //-> socket 생성 및 연결 요청
        } catch (IOException e) {
          System.out.println("서버 통신 안됨");
//          if(!socket.isClosed()) {
//            
//          }
        }
        receive();
      }
    };
    thread.setName(UserDAO.username);
    thread.start();
  }
  
  //서버에서 보낸 데이터를 받는 역할
  public void receive() {
    while(true) {
      try {
        byte[] byteArr = new byte[100];
        InputStream inputStream = socket.getInputStream();
        
        int readByteCount = inputStream.read(byteArr);
        
        if(readByteCount == -1) { throw new IOException();}
        
        String data = new String(byteArr, 0, readByteCount, "UTF-8");
        
        System.out.println("정답!! : "+data);
        
        
        ChatWindowPanel.displayText(data);
  
 
      }catch(Exception e) {}
    }
  }
  
  //사용자가 메시지 입력 후 전송 버튼 클릭하면 메시지를 매개값으로 호출, 서버로 메시지를 보내는 역할 
  public void send(String data) {    
    Thread thread = new Thread() {
      @Override
      public void run() {
        try {
          OutputStream outputStream = socket.getOutputStream();
          byte[] byteArr = data.getBytes("UTF-8");
          outputStream.write(byteArr);
          outputStream.flush();
          System.out.println("서버로 보내기 완료");
        } catch (Exception e) {
          System.out.println("ㄴㄴ서버 통신 안됨");
          e.printStackTrace();
        }
        
      }
    };
    thread.start();
  }


}
