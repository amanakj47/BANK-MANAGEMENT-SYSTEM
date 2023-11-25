package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class SignupThree extends JFrame {
    
    JRadioButton r1,r2,r3,r4;

    SignupThree(){
        setLayout(null);
        
        JLabel l1 =  new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40,400,40);
        add(l1);
        
        JLabel type =  new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 140,200,30);
        add(type);
        
        r1= new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,250,20);
        add(r1);
        
        r2= new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,250,20);
        add(r2);
        
        r3= new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,250,20);
        add(r3);
        
        r4= new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,300,20);
        add(r4);
        
        // Button group is used to select a single radio button
        ButtonGroup groupaccount= new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        
        JLabel card  =  new JLabel("Card Number");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 300,200,30);
        add(card);
        
        JLabel number  =  new JLabel("XXXX-XXXX-XXXX-4353");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330, 300,300,30);
        add(number);
        
        JLabel carddetail  =  new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBounds(100, 330,300,20);
        add(carddetail);
        
        JLabel pin  =  new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 370,200,30);
        add(pin);
        
        JLabel pindetail  =  new JLabel("Your 4 Digit PIN");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetail.setBounds(100, 400,300,20);
        add(pindetail);
        
        JLabel pnumber  =  new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(330, 370,300,30);
        add(pnumber);
        
        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);
        

}

public static void main(String args[]){

    new SignupThree();
}
}
