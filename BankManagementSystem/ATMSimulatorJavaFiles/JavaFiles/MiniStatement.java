package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MiniStatement extends JFrame implements ActionListener
{
    String pinNumber;

    MiniStatement(String pinNumber){
        this.pinNumber = pinNumber;
        setLayout(null);
        setTitle("Account Mini Statement");

        JLabel bankName = new JLabel("Bank of Baroda");
        bankName.setBounds(170, 25, 300, 40);
        bankName.setFont(new Font("Helvetica", Font.BOLD, 28));
        bankName.setForeground(Color.black);
        add(bankName);

        JLabel cardNumber = new JLabel();
        cardNumber.setBounds(65, 110, 500, 30);
        cardNumber.setFont(new Font("Helvetica",Font.BOLD, 20));
        cardNumber.setForeground(Color.BLACK);
        add(cardNumber);

        JLabel miniStatement = new JLabel();
        miniStatement.setBounds(25, 0, 500, 600);
        miniStatement.setFont(new Font("Helvetica",Font.BOLD, 15));
        miniStatement.setForeground(Color.ORANGE);
        add(miniStatement);

        JLabel balance = new JLabel();
        balance.setBounds(90, 450, 400, 30);
        balance.setFont(new Font("Helvetica",Font.BOLD, 15));
        balance.setForeground(Color.black);
        add(balance);

        try{
            Conn conn = new Conn();
            ResultSet rs = conn.st.executeQuery("SELECT * FROM login WHERE pinNumber = '"+pinNumber+"'");
            while (rs.next()){
                cardNumber.setText("Card Number:   "+rs.getString("cardNumber").substring(0,4)+"XXXXXXXX"+rs.getString("cardNumber").substring(12));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        try{
            Conn conn = new Conn();
            int bal = 0;
            ResultSet rs = conn.st.executeQuery("SELECT * FROM bank WHERE pinNumber = '"+pinNumber+"' ");
            while (rs.next()){
                miniStatement.setText(miniStatement.getText() + "<html>"+rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;" + rs.getString("transaction_type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><html>");
                if(rs.getString("transaction_type").equals("Deposit")){
                    bal += Integer.parseInt(rs.getString("amount"));
                }
                else{
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
            }
            balance.setText("Your current account balance is Rs "+bal);
        } catch (Exception e) {
            System.out.println(e);
        }

        getContentPane().setBackground(Color.WHITE);
        setSize(570, 670);
        setLocation(20, 0);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){

    }
    public static void main(String[] args){
        new MiniStatement("");
    }
}
