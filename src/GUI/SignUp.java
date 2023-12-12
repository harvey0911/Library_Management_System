package GUI;

import Circulation_System.Member;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame {
    private JPanel panel1;
    private JLabel nametxt;
    private JLabel emailtxt;
    private JTextField namefield;
    private JTextField emailfield;
    private JLabel passwordtxt;
    private JPasswordField passwordfield1;
    private JPasswordField passwordfield2;
    private JLabel comfirmpasswordtxt;
    private JButton registerButton;
    private JLabel phonenumbertxt;
    private JTextField phonefield;
    private JButton loginButton;


    public SignUp(String title) {
        super(title);
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);


        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String password1=new String(passwordfield1.getPassword());
                String password2= new String(passwordfield2.getPassword());

                if (password1.equals(password2)){
                    Member member= new Member(namefield.getText(), phonefield.getText(),emailfield.getText(), password1);
                    JOptionPane.showMessageDialog(SignUp.this, "your account has been created");
                }else{
                    JOptionPane.showMessageDialog(SignUp.this, "password doesn't match");
                }



            }
        });


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login loginFrame = new Login("Login Form");
            }
        });
    }
}
