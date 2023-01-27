import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static javax.swing.SwingConstants.CENTER;

public class GUI {
    public GUI() {
        //setting the frame window
        JFrame frame = new JFrame("Medical Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,600);

        //setting icon to the GUI
        ImageIcon icon = new ImageIcon("./images/icon.jpg");
        frame.setIconImage(icon.getImage());

        //setting a login background
        JLabel background=new JLabel(new ImageIcon("./images/login.jpg"));
        frame.add(background);
        background.setLayout(new FlowLayout());

        //setting login page
        JLabel namelabel= new JLabel("Username:", CENTER);
        //namelabel.setHorizontalTextPosition(JLabel.LEFT);
        //namelabel.setVerticalTextPosition(JLabel.CENTER);
        JLabel passwordLabel = new JLabel("Password: ", CENTER);
        //passwordLabel.setHorizontalTextPosition(JLabel.LEFT);
        //passwordLabel.setVerticalTextPosition(JLabel.CENTER);
        final JTextField userText = new JTextField(6);

        final JPasswordField passwordText = new JPasswordField(6);
        passwordText.setEchoChar('*');

        JButton loginButton = new JButton("Login");

        background.add(namelabel);
        background.add(userText);
        background.add(passwordLabel);
        background.add(passwordText);
        background.add(loginButton);


        frame.setVisible(true);
    }
}
