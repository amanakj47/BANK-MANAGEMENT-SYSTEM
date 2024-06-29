package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*; // To import and use the Random Package .
import com.toedter.calendar.JDateChooser; // To use the calender for DOB
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {

    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pinTextField;
    long random;
    JButton next;
    JRadioButton married, unmarried, others;
    JRadioButton male, female, other;
    JDateChooser dateChooser;

    SignupOne() {

        setLayout(null);

        //Using Random fn to create a application number which will be unique .
        Random ran = new Random();

        // Generate a random 4-digit number
        long min = 1000; // Minimum 4-digit number
        long max = 9999; // Maximum 4-digit number
        random = ran.nextLong(max - min + 1) + min;

        // Print the random 4-digit number
        //System.out.println(random);
        //Creating the head label of the Signup page -->>
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        JLabel personDetails = new JLabel("Page 1: Peraonal Deatails");
        personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personDetails.setBounds(290, 80, 400, 30);
        add(personDetails);

        // Name Label &Text Field
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 22));
        name.setBounds(100, 140, 100, 30);
        add(name);

        nameTextField = new JTextField(); // To add the box in front of card no. (text) 
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);

        //Father's Name : -
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 22));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

        fnameTextField = new JTextField(); // To add the box in front of card no. (text) 
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);

        //DOB
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 22));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        // We will import .jar file for adding a CALENDER by going to the libraries-> Right Click -> Add JAR file
        //Create new Object for JDate Chooser for using Calender ->

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(Color.BLACK);
        add(dateChooser);

        //Gender
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 22));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        // We need to create the Radio Button for the Gender textfield ->
        //Male->
        male = new JRadioButton("Male");
        male.setBounds(300, 290, 100, 30);
        add(male);

        //Female ->
        female = new JRadioButton("Female");
        female.setBounds(400, 290, 120, 30);
        add(female);

        //Others->
        others = new JRadioButton("Other");
        others.setBounds(500, 290, 100, 30);
        add(others);

        //Now to make changes so that only one out of the three M / F /O can be choosen->

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(others);

        //Email->
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 22));
        email.setBounds(100, 340, 200, 30);
        add(email);

        emailTextField = new JTextField(); // To add the box in front of card no. (text) 
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);

        //Marital Status ->>
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 22));
        marital.setBounds(100, 390, 200, 30);
        add(marital);

        //Married->
        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        add(married);

        //unmarried ->
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        add(unmarried);

        //Others->
        other = new JRadioButton("Others");
        other.setBounds(630, 390, 100, 30);
        add(other);

        //Now to make changes so that only one out of the three M / F /O can be choosen->
        //Grouping the genders ->
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);

        //Address-->
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 22));
        address.setBounds(100, 440, 200, 30);
        add(address);

        addressTextField = new JTextField(); // To add the box in front of card no. (text) 
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);

        //City ->>
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 22));
        city.setBounds(100, 490, 200, 30);
        add(city);

        cityTextField = new JTextField(); // To add the box in front of card no. (text) 
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);

        //State ->>
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 22));
        state.setBounds(100, 540, 200, 30);
        add(state);

        stateTextField = new JTextField(); // To add the box in front of card no. (text) 
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);

        //pincode->
        JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 22));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);

        pinTextField = new JTextField(); // To add the box in front of card no. (text) 
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pinTextField.setBounds(300, 590, 400, 30);
        add(pinTextField);

        // Button Creation
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.BLACK);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);// To create a action
        add(next);

// TO create frame ->
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);

    }
    // To use the actions of the buttons ->>
    // We Will do overriding the fn which we did in Login.java

    public void actionPerformed(ActionEvent ae) {

        // Getting the values using this Overriding -->>
        String formno = "" + random; // converting random (Long) to string;
        String name = nameTextField.getText();// to get the value of name using getText fn .
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        } else if (other.isSelected()) {
            gender = "Other";
        }

        String email = emailTextField.getText();
        String marital = null;
        if (married.isSelected()) {
            marital = "Married";
        } else if (unmarried.isSelected()) {
            marital = "UnMarried";
        } else if (other.isSelected()) {
            marital = "Other";
        }

        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();

        // Database is an ext entity , so there is a  chance of error , so use try/Catch -->
        try {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is Required");
            } else if (fname.equals("")) {
                JOptionPane.showMessageDialog(null, "Father's Name is Required");
            } else if (dob.equals("")) {
                JOptionPane.showMessageDialog(null, "Date of Birth is Required");
            } //            else if(gender.equals("")){
            //                JOptionPane.showMessageDialog(null,"Gender is Required");
            //            }
            else if (email.equals("")) {
                JOptionPane.showMessageDialog(null, "Email is Required");
            } else if (address.equals("")) {
                JOptionPane.showMessageDialog(null, "Address is Required");
            } else if (city.equals("")) {
                JOptionPane.showMessageDialog(null, "City is Required");
            } else if (state.equals("")) {
                JOptionPane.showMessageDialog(null, "State is Required");
            } else if (pin.equals("")) {
                JOptionPane.showMessageDialog(null, "Pin Code is Required");
            } else {
                Conn c = new Conn();//line creates an instance of a Conn class or object named c
                // Below line defines a SQL query as a string. The query is an SQL INSERT statement that is used to insert data into the signup table.
                //Creating MySQL query for inserting and establishing connection (Step-4)-->>
                String query = "insert into signup values('" + formno + "', '" + name + "', '" + fname + "','" + dob + "','" + gender + "','" + email + "','" + marital + "','" + address + "','" + city + "','" + pin + "','" + state + "')";
                //
                c.s.executeUpdate(query);
                
                //If user data is successfully entered then SignupTwo should be open after pressing
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
                
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String args[]) {

        new SignupOne();
    }
}
 