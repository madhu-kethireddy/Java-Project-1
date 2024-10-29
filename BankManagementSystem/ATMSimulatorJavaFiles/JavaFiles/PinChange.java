package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {

    JPasswordField pinTextField, repinTextField;
    JButton back, change;
    String pinNumber;

    PinChange(String pinNumber) {
        this.pinNumber = pinNumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,750,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,750);
        add(image);

        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.white);
        text.setBounds(245,250,700,35);
        text.setFont(new Font("System", Font.BOLD, 18));
        image.add(text);

        JLabel pin = new JLabel("NEW PIN:");
        pin.setForeground(Color.white);
        pin.setBounds(180,305,100,30);
        pin.setFont(new Font("System", Font.BOLD, 16));
        image.add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setForeground(Color.black);
        pinTextField.setBounds(330, 305, 160, 30);
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 15));
        image.add(pinTextField);

        JLabel repin = new JLabel("RE-ENTER PIN:");
        repin.setForeground(Color.white);
        repin.setBounds(180,340,125,30);
        repin.setFont(new Font("System", Font.BOLD, 16));
        image.add(repin);

        repinTextField = new JPasswordField();
        repinTextField.setForeground(Color.black);
        repinTextField.setBounds(330, 340, 160, 30);
        repinTextField.setFont(new Font("Raleway", Font.BOLD, 15));
        image.add(repinTextField);

        change = new JButton("CHANGE");
        change.setForeground(Color.black);
        change.setBounds(400, 390, 100, 30);
        change.setFont(new Font("Helvetica",Font.BOLD, 14));
        change.addActionListener(this);
        image.add(change);

        back = new JButton("BACK");
        back.setForeground(Color.black);
        back.setBounds(400, 425, 100, 30);
        back.setFont(new Font("Helvetica",Font.BOLD, 14));
        back.addActionListener(this);
        image.add(back);

        setSize(900, 750);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String nPin = pinTextField.getText();
        String rPin = repinTextField.getText();

        if(ae.getSource() == change){
            if (nPin.equals("")){
                JOptionPane.showMessageDialog(null, "Enter New PIN");
                return;
            } else if (rPin.equals("")){
                JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
                return;
            }

            if(!nPin.equals(rPin)){
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }

            try {
                Conn conn = new Conn();
                String query1 = "UPDATE bank SET pinNumber = '"+rPin+"' WHERE pinNumber = '"+pinNumber+"'";
                String query2 = "UPDATE login SET pinNumber = '"+rPin+"' WHERE pinNumber = '"+pinNumber+"'";
                String query3 = "UPDATE signup_3 SET pinNumber = '"+rPin+"' WHERE pinNumber = '"+pinNumber+"'";

                conn.st.executeUpdate(query1);
                conn.st.executeUpdate(query2);
                conn.st.executeUpdate(query3);

                JOptionPane.showMessageDialog(null,"Pin Changed Successfully.");
                setVisible(false);
                new Transactions(rPin).setVisible(true);

            } catch (Exception e) {
                System.out.println(e);
            }

        } else if (ae.getSource() == back) {
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
        }

    }
    public static void main(String a[]){
      new PinChange("");
    }
}
