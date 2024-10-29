package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SignupThree extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit, cancel;
    String formno;

    SignupThree(String formno){
        this.formno = formno;
        setLayout(null);
        setTitle("ACCOUNT DETAILS - PAGE 3");

        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Raleway",Font.BOLD, 30));
        l1.setBounds(230,40,400, 40);
        add(l1);

        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD, 25));
        type.setBounds(100,100,200, 30);
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setForeground(Color.blue);
        r1.setBackground(Color.yellow);
        r1.setFont(new Font("Raleway", Font.BOLD, 18));
        r1.setBounds(120,140, 200, 30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setForeground(Color.blue);
        r2.setBackground(Color.yellow);
        r2.setFont(new Font("Raleway", Font.BOLD, 18));
        r2.setBounds(380,140, 250, 30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setForeground(Color.blue);
        r3.setBackground(Color.yellow);
        r3.setFont(new Font("Raleway", Font.BOLD, 18));
        r3.setBounds(120,180, 200, 30);
        add(r3);

        r4 = new JRadioButton("Recurring Account");
        r4.setForeground(Color.blue);
        r4.setBackground(Color.yellow);
        r4.setFont(new Font("Raleway", Font.BOLD, 18));
        r4.setBounds(380,180, 200, 30);
        add(r4);

        ButtonGroup typeGroup = new ButtonGroup();
        typeGroup.add(r1);
        typeGroup.add(r2);
        typeGroup.add(r3);
        typeGroup.add(r4);

        JLabel cardDetails = new JLabel("Card Number:");
        cardDetails.setFont(new Font("Raleway",Font.BOLD, 25));
        cardDetails.setBounds(100,240,200, 30);
        add(cardDetails);

        JLabel digitNumber = new JLabel("Your 16 Digit cardNumber");
        digitNumber.setFont(new Font("Raleway",Font.BOLD, 12));
        digitNumber.setForeground(Color.darkGray);
        digitNumber.setBounds(100,260,200, 30);
        add(digitNumber);

        JLabel pinDetails = new JLabel("PIN:");
        pinDetails.setFont(new Font("Raleway",Font.BOLD, 25));
        pinDetails.setBounds(100,300,200, 30);
        add(pinDetails);

        JLabel pinDigit = new JLabel("Your 4 Digit PinNumber");
        pinDigit.setFont(new Font("Raleway",Font.BOLD, 12));
        pinDigit.setForeground(Color.darkGray);
        pinDigit.setBounds(100,320,200, 30);
        add(pinDigit);

        JLabel cardNumber = new JLabel("XXX-XXX-XXX-4364");
        cardNumber.setForeground(Color.blue);
        cardNumber.setFont(new Font("Raleway",Font.BOLD, 26));
        cardNumber.setBounds(350,245,250, 30);
        add(cardNumber);

        JLabel pinNumber = new JLabel("XXXX");
        pinNumber.setForeground(Color.blue);
        pinNumber.setFont(new Font("Raleway",Font.BOLD, 26));
        pinNumber.setBounds(350,305,250, 30);
        add(pinNumber);

        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway",Font.BOLD, 25));
        services.setBounds(100,370,400, 30);
        add(services);

        c1 = new JCheckBox("ATM Card");
        c1.setForeground(Color.blue);
        c1.setBackground(Color.yellow);
        c1.setFont(new Font("Raleway", Font.BOLD, 18));
        c1.setBounds(120,410, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setForeground(Color.blue);
        c2.setBackground(Color.yellow);
        c2.setFont(new Font("Raleway", Font.BOLD, 18));
        c2.setBounds(380,410, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setForeground(Color.blue);
        c3.setBackground(Color.yellow);
        c3.setFont(new Font("Raleway", Font.BOLD, 18));
        c3.setBounds(120,450, 200, 30);
        add(c3);

        c4 = new JCheckBox("Email & SMS Alerts");
        c4.setForeground(Color.blue);
        c4.setBackground(Color.yellow);
        c4.setFont(new Font("Raleway", Font.BOLD, 18));
        c4.setBounds(380,450, 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book Request");
        c5.setForeground(Color.blue);
        c5.setBackground(Color.yellow);
        c5.setFont(new Font("Raleway", Font.BOLD, 18));
        c5.setBounds(120,490, 250, 30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setForeground(Color.blue);
        c6.setBackground(Color.yellow);
        c6.setFont(new Font("Raleway", Font.BOLD, 18));
        c6.setBounds(380,490, 200, 30);
        add(c6);

        c7 = new JCheckBox("I hereby declare that the above details are correct to the best of my knowledge.");
        c7.setForeground(Color.blue);
        c7.setBackground(Color.yellow);
        c7.setFont(new Font("Raleway", Font.BOLD, 16));
        c7.setBounds(80,560, 650, 30);
        add(c7);

        submit = new JButton("Submit");
        submit.setBackground(Color.black);
        submit.setFont(new Font("Raleway",Font.BOLD, 20));
        submit.setBounds(250, 620, 100, 30);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Raleway",Font.BOLD, 20));
        cancel.setBounds(400, 620, 100, 30);
        cancel.addActionListener(this);
        add(cancel);


        getContentPane().setBackground(Color.YELLOW);
        setSize(800,720);
        setLocation(350,0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
            String accountType = null;
            if (r1.isSelected()) {
                accountType = "Saving Account";
            } else if (r2.isSelected()) {
                accountType = "Fixed Deposit Account";
            } else if (r3.isSelected()) {
                accountType = "Current Account";
            } else if (r4.isSelected()) {
                accountType = "Recurring Account";
            }

            Random random = new Random();
            String cardNumber = ""+Math.abs((random.nextLong() % 9000000L) + 6523_8100_0000_0000L);
            String pinNumber = ""+Math.abs((random.nextLong() % 9000L) + 1000L);
            String facility = getFacility();

            try{
                if(e.getSource() == submit){
                    if(accountType.isEmpty()){
                        JOptionPane.showMessageDialog(null, "AccountType is Required");
                    } else {
                        Conn conn = new Conn();
                        String query = "insert into signup_3 values('" + formno+ "','" + accountType + "','" + cardNumber+ "','" +pinNumber + "','" + facility + "')";
                        String queryLoign = "insert into login values('" + formno+ "','" + cardNumber+ "','" +pinNumber + "')";
                        conn.st.executeUpdate(query);
                        conn.st.executeUpdate(queryLoign);
                        JOptionPane.showMessageDialog(null,"CardNumber: "+ cardNumber + "\n" + "Pin: "+ pinNumber);

                        setVisible(false);
                        new Deposit(pinNumber).setVisible(true);
                    }
                } else if (e.getSource() == cancel) {
                    setVisible(false);
                    new Login().setVisible(true);
                }

            } catch (Exception exception){
                System.out.println(exception);
            }
    }

    public String getFacility() {
        String facility = "";
        if(c1.isSelected()){
            facility += "ATM Card, ";
        }
        if (c2.isSelected()) {
            facility += "Internet Banking, ";
        }
        if (c3.isSelected()) {
            facility += "Mobile Banking, ";
        }
        if (c4.isSelected()) {
            facility += "Email & SMS Alerts, ";
        }
        if (c5.isSelected()) {
            facility += "Cheque Book Request, ";
        }
        if (c6.isSelected()) {
            facility += "E-Statement, ";
        }

        // Remove the last comma and space
        if (!facility.isEmpty()) {
            facility= facility.substring(0, facility.length() - 2);
        }

        // Call method to store values in the database
        return facility;

    }

    public static void main(String[] args){
        new SignupThree("");
    }
}
