package GUI;

import Circulation_System.Member;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Circulation_System.MyDatabase_utility.MylistsUtility.members;

public class Login extends JFrame {

    private JTextField emailfield;
    private JPasswordField passwordField1;
    private JLabel password;
    private JButton SubmitButton;
    private JPanel panelMain;
    private JButton signUpButton;
    boolean found=false;
    public Login(String title) {
        super(title);
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

        SubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailfield.getText();
                String password = new String(passwordField1.getPassword());


                for (Member member: members) {

                    if(member.getEmail().equals(email)){
                            found=true;
                        if(member.getPassword().equals(password)){

                            login(member);
                        }
                        else
                            JOptionPane.showMessageDialog(Login.this, "incorrect password !try again");
                    }

                }

                if(!found){
                    JOptionPane.showMessageDialog(Login.this,"there is no such email in our database ! would you like to create an account?");
                    Singup();
                }



            }
        });


        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SignUp signUp= new SignUp("Sign up form");
            }
        });
    }

    // Simulated login validation



    public JPanel getPanelMain() {
        return panelMain;
    }

    public void setPanelMain(JPanel panelMain) {
        this.panelMain = panelMain;
    }


    public void login(Member member){

        UserInterface userInterface= new UserInterface(member);

    }
    public void Singup(){
        SignUp signUp= new SignUp("Sign up form");
    }
}