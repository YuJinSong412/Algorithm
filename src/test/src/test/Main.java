package test;

import java.io.IOException;
import java.net.Socket;

public class Main {

  public static void main(String[] args) {
    try {
      Socket socket = new Socket("183.102.90.9", 8888);
      ReceiveThread receive_thread = new ReceiveThread();
      receive_thread.setSocket(socket);
      SendThread send_thread = new SendThread();
      send_thread.setSocket(socket);
      send_thread.start();
      receive_thread.start();
    } catch (IOException e) {
      e.printStackTrace();
    }


  }

}
