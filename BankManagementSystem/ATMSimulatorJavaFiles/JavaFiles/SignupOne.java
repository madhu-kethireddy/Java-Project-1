package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame implements ActionListener {

    long random;
    JTextField nameTextField, fnameTextField, emailTextField, stateTextField, pincodeTextField, cityTextField, addressTextField;
    JDateChooser dateChooser;
    JRadioButton male, female, married, unmarried, other;
    JButton next;

    SignupOne(){
        setLayout(null);

        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO: "+ random);
        formno.setFont(new Font("Raleway",Font.BOLD, 38));
        formno.setBounds(130,15,600,40);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD, 30));
        personalDetails.setBounds(230,75,400,35);
        personalDetails.setForeground(Color.blue);
        add(personalDetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD, 20));
        name.setBounds(100,140,100,30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD, 15));
        nameTextField.setBounds(300, 140, 400, 30);
        nameTextField.setForeground(Color.blue);
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway",Font.BOLD, 20));
        fname.setBounds(100,190,200,30);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD, 15));
        fnameTextField.setBounds(300, 190, 400, 30);
        fnameTextField.setForeground(Color.blue);
        add(fnameTextField);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD, 20));
        dob.setBounds(100,240,200,30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setFont(new Font("Raleway",Font.BOLD, 15));
        add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD, 20));
        gender.setBounds(100,290,200,30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290,60, 30);
        male.setFont(new Font("Raleway", Font.BOLD, 15));
        male.setBackground(Color.yellow);
        male.setForeground(Color.blue);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450, 290,120, 30);
        female.setFont(new Font("Raleway", Font.BOLD, 15));
        female.setBackground(Color.yellow);
        female.setForeground(Color.blue);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway",Font.BOLD, 20));
        email.setBounds(100,340,200,30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD, 15));
        emailTextField.setBounds(300, 340, 400, 30);
        emailTextField.setForeground(Color.blue);
        add(emailTextField);

        JLabel maritial = new JLabel("Maritial Status:");
        maritial.setFont(new Font("Raleway",Font.BOLD, 20));
        maritial.setBounds(100,390,200,30);
        add(maritial);

        married = new JRadioButton("Married");
        married.setBounds(300, 390,100, 30);
        married.setFont(new Font("Raleway", Font.BOLD, 15));
        married.setForeground(Color.blue);
        married.setBackground(Color.yellow);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390,100, 30);
        unmarried.setFont(new Font("Raleway", Font.BOLD, 15));
        unmarried.setForeground(Color.blue);
        unmarried.setBackground(Color.yellow);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(600, 390,100, 30);
        other.setFont(new Font("Raleway", Font.BOLD, 15));
        other.setForeground(Color.blue);
        other.setBackground(Color.yellow);
        add(other);

        ButtonGroup maritialgroup = new ButtonGroup();
        maritialgroup.add(married);
        maritialgroup.add(unmarried);
        maritialgroup.add(other);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD, 20));
        address.setBounds(100,440,200,30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD, 15));
        addressTextField.setBounds(300, 440, 400, 30);
        addressTextField.setForeground(Color.blue);
        add(addressTextField);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD, 20));
        city.setBounds(100,490,200,30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD, 15));
        cityTextField.setBounds(300, 490, 400, 30);
        cityTextField.setForeground(Color.blue);
        add(cityTextField);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD, 20));
        state.setBounds(100,540,200,30);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD, 15));
        stateTextField.setBounds(300, 540, 400, 30);
        stateTextField.setForeground(Color.blue);
        add(stateTextField);

        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Raleway",Font.BOLD, 20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway",Font.BOLD, 15));
        pincodeTextField.setBounds(300, 590, 400, 30);
        pincodeTextField.setForeground(Color.blue);
        add(pincodeTextField);

        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 650, 80, 30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(Color.YELLOW);

        setSize(850, 800);
        setVisible(true);
        setLocation(350,10);
    }
    public void actionPerformed(ActionEvent e){
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }
        String email = emailTextField.getText();
        String maritial =null;
        if(married.isSelected()){
            maritial = "Married";
        } else if (unmarried.isSelected()) {
            maritial = "Unmarried";
        } else if (other.isSelected()) {
            maritial = "Other";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pincodeTextField.getText();

        try{
            if(name.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Name is Required");
            }else {
                Conn c = new Conn();
                String query = "insert into signup values('" + formno + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + maritial + "','" + address + "','" + city + "','" + state + "','" + pincode + "')";
                c.st.executeUpdate(query);
            }
            setVisible(false);
            new SignupTwo(formno).setVisible(true);

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public static void main(String[] args){
        new SignupOne();
    }
}
