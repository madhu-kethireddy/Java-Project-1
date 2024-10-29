package bank.management.system;

import java.sql.*;

public class Conn {

    Connection connection;
    Statement st;
    String url = "jdbc:mysql://localhost:3306/atmsimulatorsystem";
    String username = "root";
    String password = "madhu";
    public Conn() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            st = connection.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
