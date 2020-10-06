package server;

import java.io.OutputStream;
import java.net.Socket;

public class Client {

  Socket socket;
  OutputStream outputStream;
  
  public Client(Socket socket) {
    this.socket = socket;
  }
}
