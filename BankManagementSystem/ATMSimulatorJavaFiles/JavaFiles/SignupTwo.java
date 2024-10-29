package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener {

    JTextField aadharTextField, panTextField;
    JRadioButton eyes, eno, syes, sno;
    JComboBox religion, category, eduQualification, income, occupation;
    JButton next;
    String formno;

    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD, 28));
        additionalDetails.setBounds(250,60,400,35);
        additionalDetails.setForeground(Color.blue);
        add(additionalDetails);

        JLabel Religion = new JLabel("Religion:");
        Religion.setFont(new Font("Raleway",Font.BOLD, 20));
        Religion.setBounds(100,140,100,30);
        add(Religion);

        String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setFont(new Font("Raleway",Font.BOLD, 15));
        religion.setForeground(Color.blue);
        religion.setBackground(Color.white);
        add(religion);

        JLabel Category = new JLabel("Category: ");
        Category.setFont(new Font("Raleway",Font.BOLD, 20));
        Category.setBounds(100,190,200,30);
        add(Category);

        String valCategory[] = {"General","OBC","SC","ST","Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setFont(new Font("Raleway",Font.BOLD, 15));
        category.setForeground(Color.blue);
        category.setBackground(Color.white);
        add(category);

        JLabel Income = new JLabel("Income:");
        Income.setFont(new Font("Raleway",Font.BOLD, 20));
        Income.setBounds(100,240,200,30);
        add(Income);

        String valIncome[] = {"Null","< 1,00,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
        income = new JComboBox(valIncome);
        income.setBounds(300, 240, 400, 30);
        income.setFont(new Font("Raleway",Font.BOLD, 15));
        income.setForeground(Color.blue);
        income.setBackground(Color.white);
        add(income);

        JLabel educational = new JLabel("Educational");
        educational.setFont(new Font("Raleway",Font.BOLD, 20));
        educational.setBounds(100,290,200,30);
        add(educational);

        JLabel Qualification = new JLabel("Qualification:");
        Qualification.setFont(new Font("Raleway",Font.BOLD, 20));
        Qualification.setBounds(100,315,200,30);
        add(Qualification);

        String eduValues[] = {"Under Graduate","Post Graduate","12th Equivalent","SSC","Other"};
        eduQualification = new JComboBox(eduValues);
        eduQualification.setBounds(300,315,400,30);
        eduQualification.setFont(new Font("Raleway",Font.BOLD, 15));
        eduQualification.setForeground(Color.blue);
        eduQualification.setBackground(Color.white);
        add(eduQualification);

        JLabel Occupation = new JLabel("Occupation:");
        Occupation.setFont(new Font("Raleway",Font.BOLD, 20));
        Occupation.setBounds(100,370,200,30);
        add(Occupation);

        String ocpValues[] = {"Self-Employed","Salaried","Student","Other"};
        occupation = new JComboBox(ocpValues);
        occupation.setBounds(300, 370, 400, 30);
        occupation.setFont(new Font("Raleway",Font.BOLD, 15));
        occupation.setForeground(Color.blue);
        occupation.setBackground(Color.white);
        add(occupation);

        JLabel panNumber = new JLabel("PAN Number:");
        panNumber.setFont(new Font("Raleway",Font.BOLD, 20));
        panNumber.setBounds(100,420,200,30);
        add(panNumber);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD, 15));
        panTextField.setBounds(300, 420, 400, 30);
        panTextField.setForeground(Color.blue);
        add(panTextField);

        JLabel aadharNumber = new JLabel("Aadhar Number:");
        aadharNumber.setFont(new Font("Raleway",Font.BOLD, 20));
        aadharNumber.setBounds(100,470,200,30);
        add(aadharNumber);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway",Font.BOLD, 15));
        aadharTextField.setBounds(300, 470, 400, 30);
        aadharTextField.setForeground(Color.blue);
        add(aadharTextField);

        JLabel seniorCitizen = new JLabel("Senior Citizen:");
        seniorCitizen.setFont(new Font("Raleway",Font.BOLD, 20));
        seniorCitizen.setBounds(100,520,200,30);
        add(seniorCitizen);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 520, 90, 30);
        syes.setForeground(Color.blue);
        syes.setFont(new Font("Raleway",Font.BOLD, 15));
        syes.setBackground(Color.yellow);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(500, 520, 90, 30);
        sno.setForeground(Color.blue);
        sno.setFont(new Font("Raleway",Font.BOLD, 15));
        sno.setBackground(Color.yellow);
        add(sno);

        ButtonGroup senior_citizen = new ButtonGroup();
        senior_citizen.add(sno);
        senior_citizen.add(syes);

        JLabel existingAccount = new JLabel("Existing Account:");
        existingAccount.setFont(new Font("Raleway",Font.BOLD, 20));
        existingAccount.setBounds(100,570,200,30);
        add(existingAccount);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 570, 90, 30);
        eyes.setForeground(Color.blue);
        eyes.setFont(new Font("Raleway",Font.BOLD, 15));
        eyes.setBackground(Color.yellow);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(500, 570, 90, 30);
        eno.setForeground(Color.blue);
        eno.setFont(new Font("Raleway",Font.BOLD, 15));
        eno.setBackground(Color.yellow);
        add(eno);

        ButtonGroup existing_account = new ButtonGroup();
        existing_account.add(eno);
        existing_account.add(eyes);

        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 620, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.YELLOW);

        setSize(850, 800);
        setVisible(true);
        setLocation(350,10);
    }
    public void actionPerformed(ActionEvent e){
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seduQualifiaction = (String) eduQualification.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String pan = panTextField.getText();
        String aadhar = aadharTextField.getText();
        String senCzn = null;
        if(syes.isSelected()){
            senCzn = "Yes";
        } else if (sno.isSelected()) {
            senCzn = "No";
        }
        String exAcc =null;
        if(eyes.isSelected()){
            exAcc = "Yes";
        } else if (eno.isSelected()) {
            exAcc = "No";
        }


        try{
            if(aadhar.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Aadhar Number is Required");
            }
            else {
                Conn c = new Conn();
                String query = "insert into signup_2 values('" + formno+ "','" + sreligion + "','" + scategory + "','" + sincome + "','" + seduQualifiaction + "','" + soccupation + "','" + pan + "','" + aadhar + "','" + senCzn + "','" + exAcc + "')";
                c.st.executeUpdate(query);
            }
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public static void main(String[] args){
        new SignupTwo("");
    }
}
