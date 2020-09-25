package server.userDB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JTextField;

import client.frame.ErrorMessagePanel;
import client.frame.IndexPanel;
import client.frame.MainPanel;

public class UserDAO {
  String driver = "oracle.jdbc.driver.OracleDriver";
  String jdbcurl = "jdbc:oracle:thin:@localhost:1521:xe";

  Connection conn;
  PreparedStatement pstmt;
  
  public static String username = null;

  public void connect() {
    try {
      Class.forName(driver);
      conn = DriverManager.getConnection(jdbcurl, "C##yujin", "1234");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void disconnect() {
    try {
      pstmt.close();
      conn.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void insertDB(User user) {
    connect();
    String sql = "insert into member values(?,?,?)";

    try {
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, user.getUname());
      pstmt.setString(2, user.getUemail());
      pstmt.setString(3, user.getPassword());

      pstmt.executeUpdate();

      MainPanel mainPanel = new MainPanel(MainPanel.frame);
      MainPanel.frame.change(mainPanel);

    } catch (SQLException e) {
      ErrorMessagePanel errorPanel = new ErrorMessagePanel("회원가입");
      MainPanel.frame.change(errorPanel);
    }
    disconnect();
  }

  public void findUser(ArrayList<JTextField> userInfos) {
    connect();
    String sql = "select uname from member where uemail=? and password=?";

    String uemail = userInfos.get(0).getText();
    String password = userInfos.get(1).getText();

    try {
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, uemail);
      pstmt.setString(2, password);

      ResultSet rs = pstmt.executeQuery();
      String uname = null;

      while (rs.next()) {
        uname = rs.getString("uname");
      }

      username = uname;
      
      if (username != null) {
        IndexPanel indexPanel = new IndexPanel();
        MainPanel.frame.change(indexPanel);
      } else if (username == null) {
        ErrorMessagePanel err = new ErrorMessagePanel("로그인");
        MainPanel.frame.change(err);
      }

    } catch (SQLException e) {

    }
    disconnect();
  }

  public ArrayList<String> friendList() {  

    String uemail = findUserEmail();
  
    connect();

    ArrayList<String> friends = new ArrayList<String>();

    String sql = "select m.uname from member m, friendList f where m.uemail = f.friendEmail and f.userEmail = ?";

    try {
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, uemail);

      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
        friends.add(rs.getString("uname"));
      }

    } catch (SQLException e) {}
    disconnect();

    return friends;

  }

  private String findUserEmail() {  
    connect();

    String sql = "select uemail from member where uname=?";

    String uemail = null;
    try {
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, username);

      ResultSet rs = pstmt.executeQuery();

      while (rs.next()) {
        uemail = rs.getString("uemail");
      }
    } catch (SQLException e) {
    }

    disconnect();

    return uemail;

  }

}
