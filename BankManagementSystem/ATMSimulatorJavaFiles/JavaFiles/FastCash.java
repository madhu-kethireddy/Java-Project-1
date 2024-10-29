package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;


public class FastCash extends JFrame implements ActionListener {

    JButton Rs100, Rs500, Rs1000, Rs2000, Rs5000, Rs10000, exit;
    String pinNumber;

    FastCash(String pinNumber){
        this.pinNumber = pinNumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,750,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,750);
        add(image);

        JLabel text = new JLabel("SELECT REQUIRED AMOUNT");
        text.setForeground(Color.white);
        text.setBounds(205,250,700,35);
        text.setFont(new Font("System", Font.BOLD, 18));
        image.add(text);

        Rs100 = new JButton("Rs 100");
        Rs100.setForeground(Color.black);
        Rs100.setBounds(170, 320, 100, 30);
        Rs100.setFont(new Font("Helvetica",Font.BOLD, 14));
        Rs100.addActionListener(this);
        image.add(Rs100);

        Rs500 = new JButton("Rs 500");
        Rs500.setForeground(Color.black);
        Rs500.setBounds(385, 320, 100, 30);
        Rs500.setFont(new Font("Helvetica",Font.BOLD, 14));
        Rs500.addActionListener(this);
        image.add(Rs500);

        Rs1000 = new JButton("Rs 1000");
        Rs1000.setForeground(Color.black);
        Rs1000.setBounds(170, 355, 100, 30);
        Rs1000.setFont(new Font("Helvetica",Font.BOLD, 14));
        Rs1000.addActionListener(this);
        image.add(Rs1000);

        Rs2000 = new JButton("Rs 2000");
        Rs2000.setForeground(Color.black);
        Rs2000.setBounds(385, 355, 100, 30);
        Rs2000.setFont(new Font("Helvetica",Font.BOLD, 14));
        Rs2000.addActionListener(this);
        image.add(Rs2000);

        Rs5000 = new JButton("Rs 5000");
        Rs5000.setForeground(Color.black);
        Rs5000.setBounds(170, 390, 100, 30);
        Rs5000.setFont(new Font("Helvetica",Font.BOLD, 14));
        Rs5000.addActionListener(this);
        image.add(Rs5000);

        Rs10000 = new JButton("Rs 10000");
        Rs10000.setForeground(Color.black);
        Rs10000.setBounds(385, 390, 100, 30);
        Rs10000.setFont(new Font("Helvetica",Font.BOLD, 14));
        Rs10000.addActionListener(this);
        image.add(Rs10000);

        exit = new JButton("Exit");
        exit.setForeground(Color.black);
        exit.setBounds(385, 425, 100, 30);
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
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
        }
        else{
            String amount = ((JButton) e.getSource()).getText().substring(3); // Rs 500

            try{
                Conn conn = new Conn();
                ResultSet rs = conn.st.executeQuery("SELECT * FROM bank WHERE pinNumber = '"+pinNumber+"'");
                int balance = 0;
                while (rs.next()){
                    if(rs.getString("transaction_type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }
                    else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                if (e.getSource() != exit && balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                Date withDrawdate = new Date();
                String query = "INSERT INTO bank VALUES('" + pinNumber + "','" + withDrawdate + "','Withdrawal','" + amount + "')";
                conn.st.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+amount+" Debited Successfully.");

                setVisible(false);
                new Transactions(pinNumber).setVisible(true);
            }catch (Exception ex){
                System.out.println(ex);
            }
        }

        
    }
    public static void main(String[] args){
        new FastCash("");
    }
}
