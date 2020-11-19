package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiveThread extends Thread {

  private Socket socket;

  @Override
  public void run() {

    super.run();
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      String message;

      while (true) {
        message = reader.readLine();

        System.out.println("cus2 : " + message);
      }
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void setSocket(Socket socket) {

    this.socket = socket;
  }
}