package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SendThread extends Thread {

  private Socket socket;

  @Override
  public void run() {

    super.run();
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      PrintWriter pw = new PrintWriter(socket.getOutputStream());

      String message;

      while (true) {
        message = reader.readLine();

        if(message.equals("exit")) {
          break;
        }
        
        pw.println(message);
        pw.flush();
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void setSocket(Socket socket) {

    this.socket = socket;
  }
}