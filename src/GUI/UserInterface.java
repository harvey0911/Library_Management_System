package GUI;

import Cataloging_Classification_System.Subject;
import Circulation_System.Member;

import javax.swing.*;
import java.awt.*;

public class UserInterface extends JFrame {

    private JComboBox SubjectComboBox;
    private JPanel panel1;

    private JList list;
    private JComboBox comboBox1;
    private JList list1;
    private JList list2;
    private JList list3;

    public UserInterface(Member member){
        this.setTitle("user interface");

        SubjectComboBox = new JComboBox<>(Subject.values());
        SubjectComboBox.setSelectedItem(null);




        //list= new JList<>(Subject.values());




        JPanel panel = new JPanel(new FlowLayout());
        panel.add(SubjectComboBox);

        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        this.setVisible(true);

    }



}
