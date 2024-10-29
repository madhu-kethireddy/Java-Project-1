package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transactions extends JFrame implements ActionListener {
     JButton deposit, withdraw, fastCash, miniStatement, balanceEnquiry, pinChange, exit;
     String pinNumber;
    Transactions(String pinNumber){
        this.pinNumber = pinNumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,750,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,750);
        add(image);

        JLabel text = new JLabel("Please select your Transaction");
        text.setForeground(Color.white);
        text.setBounds(205,250,700,35);
        text.setFont(new Font("System", Font.BOLD, 18));
        image.add(text);

        deposit = new JButton("Deposit");
        deposit.setForeground(Color.black);
        deposit.setBounds(170, 320, 130, 30);
        deposit.setFont(new Font("Helvetica",Font.BOLD, 14));
        deposit.addActionListener(this);
        image.add(deposit);

        withdraw = new JButton("Cash Withdraw");
        withdraw.setForeground(Color.black);
        withdraw.setBounds(345, 320, 150, 30);
        withdraw.setFont(new Font("Helvetica",Font.BOLD, 14));
        withdraw.addActionListener(this);
        image.add(withdraw);

        fastCash = new JButton("Fast Cash");
        fastCash.setForeground(Color.black);
        fastCash.setBounds(170, 355, 130, 30);
        fastCash.setFont(new Font("Helvetica",Font.BOLD, 14));
        fastCash.addActionListener(this);
        image.add(fastCash);

        miniStatement = new JButton("Mini Statement");
        miniStatement.setForeground(Color.black);
        miniStatement.setBounds(345, 355, 150, 30);
        miniStatement.setFont(new Font("Helvetica",Font.BOLD, 14));
        miniStatement.addActionListener(this);
        image.add(miniStatement);

        pinChange = new JButton("Pin Change");
        pinChange.setForeground(Color.black);
        pinChange.setBounds(170, 390, 130, 30);
        pinChange.setFont(new Font("Helvetica",Font.BOLD, 14));
        pinChange.addActionListener(this);
        image.add(pinChange);

        balanceEnquiry = new JButton("Balance Enquiry");
        balanceEnquiry.setForeground(Color.black);
        balanceEnquiry.setBounds(345, 390, 150, 30);
        balanceEnquiry.setFont(new Font("Helvetica",Font.BOLD, 14));
        balanceEnquiry.addActionListener(this);
        image.add(balanceEnquiry);

        exit = new JButton("Exit");
        exit.setForeground(Color.black);
        exit.setBounds(345, 425, 150, 30);
        exit.setFont(new Font("Helvetica",Font.BOLD, 14));
        exit.addActionListener(this);
        image.add(exit);


        setSize(900,750);
        setLocation(350,0);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == exit){
            System.exit(0);
        }else if(e.getSource() == deposit){
            setVisible(false);
            new Deposit(pinNumber).setVisible(true);
        } else if (e.getSource() == withdraw) {
            setVisible(false);
            new Withdraw(pinNumber).setVisible(true);
        }else if (e.getSource() == fastCash) {
            setVisible(false);
            new FastCash(pinNumber).setVisible(true);
        } else if (e.getSource() == pinChange) {
            setVisible(false);
            new PinChange(pinNumber).setVisible(true);
        } else if (e.getSource() == balanceEnquiry) {
            setVisible(false);
            new BalanceEnquiry(pinNumber).setVisible(true);
        } else if (e.getSource() == miniStatement) {
            new MiniStatement(pinNumber).setVisible(true);
        }
    }
    public static void main(String[] args){
       new Transactions("");
    }
}
