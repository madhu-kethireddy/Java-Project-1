package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {

    String pinNumber;
    JButton back;

    BalanceEnquiry(String pinNumber) {

        this.pinNumber = pinNumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 750);
        add(image);

        int balance = 0;
        try{
            Conn conn = new Conn();
            ResultSet rs = conn.st.executeQuery("SELECT * FROM bank WHERE pinNumber = '"+pinNumber+"'");
            while (rs.next()){
                if(rs.getString("transaction_type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }
                else{
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        back = new JButton("BACK");
        back.setForeground(Color.black);
        back.setBounds(400, 400, 80, 30);
        back.setFont(new Font("Helvetica", Font.BOLD, 14));
        back.addActionListener(this);
        image.add(back);

        JLabel balEquiry = new JLabel("Your Current Account Balance is Rs "+balance);
        balEquiry.setBounds(180, 290, 650, 30);
        balEquiry.setFont(new Font("Helvetica",Font.BOLD, 15));
        balEquiry.setForeground(Color.white);
        image.add(balEquiry);

        setSize(900, 750);
        setLocation(350, 0);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == back) {
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
        }
    }

    public static void main(String[] args){
        new BalanceEnquiry("");
    }

}
