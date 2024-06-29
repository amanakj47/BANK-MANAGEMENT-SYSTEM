 package bank.management.system;

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

    JTextField pan, aadharTextField, seniorCitizentextField, pinTextField;
   
    JButton next;
    JRadioButton syes, sno, others, eyes, eno;
    JComboBox religion, category, income, education, occupation;
    String formno;

    SignupTwo(String fomrno) {
        this.formno = formno;

        setLayout(null);

//    
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
 
        JLabel additionalDetails = new JLabel("Page 2: Additional Deatails");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        // Religion Drop Down-->
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 22));
        name.setBounds(100, 140, 100, 30);
        add(name);

        //Religion field will be a DROP-DOWN box which can be made using ComboBox->
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

        //Category Drop-down: -
        JLabel fname = new JLabel("Category");
        fname.setFont(new Font("Raleway", Font.BOLD, 22));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

        String valcategory[] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);

        //Income -->>
        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD, 22));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        String incomecategory[] = {"NULL", "< 1,50,000", "<2,50,0000", "<5,00,000", "Upto 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        // Education Qualification-->>
        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("Raleway", Font.BOLD, 22));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        //Email->
        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway", Font.BOLD, 22));
        email.setBounds(100, 315, 200, 30);
        add(email);

        String eduacationValues[] = {"Non-Graduation", "Graduate", "Post-Graduation", "Doctrate", "Others"};
        education = new JComboBox(eduacationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);

        //Marital Status ->>
        JLabel occupationLabel = new JLabel("Occupation:");
        occupationLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        occupationLabel.setBounds(100, 390, 200, 30);
        add(occupationLabel);

        String occupationValues[] = {"Salaried", "Self-Employed", "Business", "Student", "Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 390, 400, 30); // Corrected Y-position to 390
        occupation.setBackground(Color.WHITE);
        add(occupation);

        //Address-->
        JLabel address = new JLabel("PAN Number:");
        address.setFont(new Font("Raleway", Font.BOLD, 22));
        address.setBounds(100, 440, 200, 30);
        add(address);

        pan = new JTextField(); // To add the box in front of card no. (text) 
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);

        //Aaadhar Number ->>
        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 22));
        aadhar.setBounds(100, 490, 200, 30);
        add(aadhar);

        aadharTextField = new JTextField(); // To add the box in front of card no. (text) 
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300, 490, 400, 30);
        add(aadharTextField);

        //Senior Citizen ->>
        JLabel seniorCitizen = new JLabel("Senior Citizen:");
        seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 22));
        seniorCitizen.setBounds(100, 540, 200, 30);
        add(seniorCitizen);

        

        //Yes->
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        add(syes);

        //No ->
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        add(sno);

        ButtonGroup seniorCitizenGroup = new ButtonGroup();
        seniorCitizenGroup.add(syes);
        seniorCitizenGroup.add(sno);
        


        //Existing Account->
        JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 22));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);


        //Yes->
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        add(eyes);

        //No ->
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        add(eno);

        ButtonGroup existingAccountGroup = new ButtonGroup();
        existingAccountGroup.add(eyes);
        existingAccountGroup.add(eno);

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

    // converting random (Long) to string;
        // to get the value from dropdown using getSelectedItem() fn-> which returns object ! so typecast it using (String) .
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if (syes.isSelected()) {
            seniorcitizen = "Yes";
        } else if (sno.isSelected()) {
            seniorcitizen = "No";
        }

        String existingaccount = null;
        if (eyes.isSelected()) {
            existingaccount = "Yes";
        } else if (sno.isSelected()) {
            existingaccount = "No";
        }

        String span = pan.getText();
        String saadhar = aadharTextField.getText();

        // Database is an ext entity , so there is a  chance of error , so use try/Catch -->
        try {
            Conn c = new Conn();
            String query = "insert into signuptwo values('" + formno + "', '" + sreligion + "', '" + scategory + "','" + sincome + "','" + seducation + "','" + soccupation + "','" + span + "','" + saadhar + "','" + seniorcitizen + "','" + existingaccount + "')";
            //
            c.s.executeUpdate(query);
            
            //Signup3 object-->>
            setVisible(false);
            new SignupThree(formno).setVisible(true);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String args[]) {

        new SignupTwo("");
    }
}
