package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class Deposit extends JFrame implements ActionListener {

    JTextField amount;
    JButton deposit, back;
    String pinNumber;
    Deposit(String pinNumber){
        this.pinNumber = pinNumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,750,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,750);
        add(image);

        JLabel text = new JLabel("Please enter the amount");
        text.setForeground(Color.white);
        text.setBounds(225,250,700,35);
        text.setFont(new Font("System", Font.BOLD, 18));
        image.add(text);

        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 16));
        amount.setBounds(185, 320, 300, 30);
        image.add(amount);

        deposit = new JButton("Deposit");
        deposit.setForeground(Color.black);
        deposit.setBounds(400, 390, 100, 30);
        deposit.setFont(new Font("Helvetica",Font.BOLD, 14));
        deposit.addActionListener(this);
        image.add(deposit);

        back = new JButton("Back");
        back.setForeground(Color.black);
        back.setBounds(400, 425, 100, 30);
        back.setFont(new Font("Helvetica",Font.BOLD, 14));
        back.addActionListener(this);
        image.add(back);

        setSize(900, 750);
        setLocation(350,0);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == deposit){
            String amountDeposit = amount.getText();
            Date depositDate = new Date();

            if(amountDeposit.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit");
            }
            else {

                try {
                    Conn conn = new Conn();
                    String query = "insert into bank values('" + pinNumber + "','" + depositDate + "','Deposit','" + amountDeposit + "')";
                    conn.st.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs "+amountDeposit+" Deposited Successfully.");
                    setVisible(false);
                    new Transactions(pinNumber).setVisible(true);
                } catch (Exception e) {
                    System.out.println(e);
                }

            }
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
        }
    }

    public static void main(String a[]){
        new Deposit("");
    }
}
