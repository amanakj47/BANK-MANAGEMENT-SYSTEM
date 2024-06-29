package bank.management.system;

import javax.swing.*;
import java.awt.*; //Without importing this , image class wont work.
import java.awt.event.*; // used to add ActionListener to the code which allows the functioning of the keys like PIN , signup
import java.sql.*;



public class Login extends JFrame implements ActionListener {// ActionListener->> For functioning of the buttons, to use this we need to overwrite the AcionListener
  
    // Globally defining the button names so that it can be used  globaaly(outside the Login())
    JButton login, signup , clear ;
    
    //Globally defining the text fields to use ;
    JTextField cardTextField  ;
    
    // Using JPasswordField for pin to hide the password .
    JPasswordField pinTextField ;
    
    
    
    
    Login() { // Creating a Constructor of login
        
        
        
        setLayout(null);// To set the custom layout we need to set this as null , which was default earlier(which make the image in center).
        
        setTitle("ATM"); // Used to set the title of the frame .
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/Bank Latest.jpeg")); // To get the syystem resourse i.e the image to the Frame.
        Image i2= i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);// To align the image 
        ImageIcon i3= new ImageIcon(i2); //converting image to imageIcon so that it can be placed in JLabel.
        JLabel label = new JLabel(i3);// YOu cannnot directly place any image inside a frame, you need to create a JLabel for this. Only ImageIcon can be placed inside the the JLable and not the image directly. So covert the Image To IMAGEICON.
        label.setBounds(70,10,100,100);// to move the image to the corner and removing it from the center.
        add(label); // The "add" fn is used to add anything to the frame.
        setSize(800, 480); //Used to set the size of frame (login frame) bu the frame will be not visible now
        setVisible(true); //To see the frame we need to use this fn.
        setLocation(350,200); // to open the frame in the center i.e 350 from left and 200 from up.
        
        //Now to change the color of the frame  -->>
        getContentPane().setBackground(Color.WHITE);
        
        // Now to add the text in the Frame and setting the place and fonts -->(using JLabel) 
        
        JLabel text = new JLabel("Welcome to ATM");// Creating the JLabel for the text.
        text.setFont(new Font("Osward", Font.BOLD ,38));// Setting Font , Style, Size.
        text.setBounds(200,40,400,40); //Setting the place where the font has to be set .
        add(text); //Fn used to add something in the frame.
        
        // Adding label for CARD No. and adding the box
        
        JLabel cardno = new JLabel("Card No : ");// Creating the JLabel for the text.
        cardno.setFont(new Font("Raleway", Font.BOLD ,28));// Setting Font , Style, Size.
        cardno.setBounds(120,150,150,30); //Setting the place where the font has to be set .
        add(cardno); //Fn used to add something in the frame.
        
        //Adding label for PIN -->
        
        JLabel pin = new JLabel("PIN : ");// Creating the JLabel for the text.
        pin.setFont(new Font("Raleway", Font.BOLD ,28));// Setting Font , Style, Size.
        pin.setBounds(120,220,250,30); //Setting the place where the font has to be set .
        add(pin); //Fn used to add something in the frame.
        
        //To create a box infront of the CARD No. ->>
        cardTextField = new JTextField(); // To add the box in front of card no. (text) 
        cardTextField.setBounds(300,150,230,30); 
        //cardTextField.setForeground(Color.BLACK);
        //cardTextField.setFont(new Font("Arial"));
        add(cardTextField);
        
        //To create a box infront of the PIN ->>
        
        pinTextField = new JPasswordField(); // To add the box in front of card no. (text) 
        pinTextField.setBounds(300,220,230,30); 
        add(pinTextField);
        
        //  Now to CREATE SIGNIN Button -> using JButon class
        
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100 , 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.BLACK);
        login.addActionListener(this);// To add the action to the button
        add(login);

        
        //Creating Clear Button-->>
        
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100 , 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.BLACK);
        clear.addActionListener(this);
        add(clear);
        
        //Creatting the signup Button-->>
        
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230 , 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.BLACK);
        signup.addActionListener(this);
        add(signup);
        


// Add your other components (text fields, buttons, etc.) on top of the background
// Place them as needed using their bounds


    }
    
    
    // Overwritng the actionListener -->>
    // In this fn , we will define what fn will be done by the button when pressed ->>
    public void actionPerformed(ActionEvent ae){
        
        // Now defing the button roles using ae-->>
        
        
        // From here the change is made to open the signup page -> GPT 
        if (ae.getSource() == signup) {
        // Hide the Login frame
        setVisible(false);

        // Create an instance of SignupOne
        SignupOne signupOne = new SignupOne();

        // Set the visibility of SignupOne frame to true
        signupOne.setVisible(true);
    }
        
        // till here it is corrected by GPT 
        
        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if(ae.getSource() == login){
            
            //Establishing the connection with the database;
            Conn conn= new Conn();
            String cardnumber= cardTextField.getText();
            String pinnumber= pinTextField.getText();
            String query ="select * from login where cardnumber='"+cardnumber+"' and pin = '"+pinnumber+"'";
            try{
                ResultSet rs= conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
        else if(ae.getSource() == signup){
            
        }
           
        
    }
    
        
        
        
        
        
    
        
        
    
    

    public static void main(String args[]){
        new Login();
    }
}


