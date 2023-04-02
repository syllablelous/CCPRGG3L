package com.mycompany.basicloginsystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BasicLoginSystem implements ActionListener{
    
    private static JLabel lblUsername, lblPassword;
    private static JTextField txtUsername;
    private static JPasswordField txtPassword;
    private static JButton bttnLogin;
    private static JFrame loginTrue;
    private static JPanel panel2;
    
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame login = new JFrame("LOGIN SYSTEM");
        login.setSize(400, 400);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.add(panel);
        
        panel.setLayout(null);
        
        lblUsername = new JLabel("Username:");
        lblPassword = new JLabel("Password:");
        lblUsername.setBounds(10, 20, 80, 25);
        lblPassword.setBounds(10, 50, 80, 25);
        panel.add(lblUsername);
        panel.add(lblPassword);
        
        txtUsername = new JTextField(15);
        txtPassword = new JPasswordField(8);
        txtUsername.setBounds(80,20, 120, 25);
        txtPassword.setBounds(80, 50, 120, 25);
        panel.add(txtUsername);
        panel.add(txtPassword);
        
        bttnLogin = new JButton("Login");
        bttnLogin.setBounds(80, 80, 80, 25);
        bttnLogin.addActionListener(new BasicLoginSystem());
        panel.add(bttnLogin);
        
        login.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String setUser = "RusselRapi"; //pre-defined username
        String setPass = "rapi2004"; //pre-defined password
        if((username.equals(setUser)) && password.equals(setPass)){
            studentInfo();
        }
        else{
            JOptionPane.showMessageDialog(null, "Incorrect input on username/password. Please try again", "LOGIN ERROR", JOptionPane.WARNING_MESSAGE);
        }
 
    }
    
    public void studentInfo(){
        loginTrue = new JFrame("INTRODUCE YOURSELF");
        loginTrue.setSize(400, 400);
        loginTrue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel2 = new JPanel();
        loginTrue.add(panel2);
        loginTrue.setVisible(true);
        
    }

}
