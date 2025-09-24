package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JLabel label1, label2, label3;
    JTextField cardTextField;
    JPasswordField pinTextField;
    JButton loginButton, clearButton, signupButton;

    Login() {
        super("Bank Management System");

        // Bank icon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 10, 100, 100);
        add(image);

        // Card icon
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630, 350, 100, 100);
        add(iimage);

        // Labels
        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(230, 125, 450, 40);
        add(label1);

        label2 = new JLabel("Card No :");
        label2.setFont(new Font("Raleway", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150, 190, 375, 30);
        add(label2);

        label3 = new JLabel("PIN :");
        label3.setFont(new Font("Raleway", Font.BOLD, 28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150, 250, 375, 30);
        add(label3);

        // Text fields
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 190, 300, 30);
        cardTextField.setFont(new Font("Arial", Font.PLAIN, 18));
        add(cardTextField);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 250, 300, 30);
        pinTextField.setFont(new Font("Arial", Font.PLAIN, 18));
        add(pinTextField);

        // Buttons
        loginButton = new JButton("LOGIN");
        loginButton.setBounds(300, 320, 100, 30);
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.WHITE);
        loginButton.addActionListener(this);
        add(loginButton);

        clearButton = new JButton("CLEAR");
        clearButton.setBounds(420, 320, 100, 30);
        clearButton.setBackground(Color.BLACK);
        clearButton.setForeground(Color.WHITE);
        clearButton.addActionListener(this);
        add(clearButton);

        signupButton = new JButton("SIGNUP");
        signupButton.setBounds(540, 320, 100, 30);
        signupButton.setBackground(Color.BLACK);
        signupButton.setForeground(Color.WHITE);
        signupButton.addActionListener(this);
        add(signupButton);

        // Background
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0, 0, 850, 480);
        add(iiimage);

        setLayout(null);
        setSize(850, 480);
        setLocation(450, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == loginButton) {
            String cardNo = cardTextField.getText();
            String pin = new String(pinTextField.getPassword());
            // Here, you can add database validation
            JOptionPane.showMessageDialog(this, "Login clicked\nCard: " + cardNo + "\nPIN: " + pin);
        } else if (ae.getSource() == clearButton) {
            cardTextField.setText("");
            pinTextField.setText("");
        } else if (ae.getSource() == signupButton) {
            // Open Signup page (You can create Signup class)
            JOptionPane.showMessageDialog(this, "Signup clicked");
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}

