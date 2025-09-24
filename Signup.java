import javax.swing.*;
import java.awt.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame {

    JTextField textName, textFname, textEmail, textAddress, textCity, textState, textPin;
    JDateChooser dateChooser;
    JRadioButton male, female, otherGender, married, unmarried, otherStatus;
    JButton next;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    Signup() {
        super("APPLICATION FORM");

        // Bank icon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        // Application number
        JLabel label1 = new JLabel("APPLICATION FORM NO :" + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290, 100, 600, 30);
        add(label3);

        // Name
        JLabel labelName = new JLabel("Name:");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 150, 200, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 150, 300, 30);
        add(textName);

        // Father's Name
        JLabel labelFname = new JLabel("Father Name:");
        labelFname.setFont(new Font("Raleway", Font.BOLD, 20));
        labelFname.setBounds(100, 200, 200, 30);
        add(labelFname);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway", Font.BOLD, 14));
        textFname.setBounds(300, 200, 300, 30);
        add(textFname);

        // Date of Birth
        JLabel labelDOB = new JLabel("Date Of Birth:");
        labelDOB.setFont(new Font("Raleway", Font.BOLD, 20));
        labelDOB.setBounds(100, 250, 200, 30);
        add(labelDOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 250, 300, 30);
        add(dateChooser);

        // Gender
        JLabel labelGender = new JLabel("Gender:");
        labelGender.setFont(new Font("Raleway", Font.BOLD, 20));
        labelGender.setBounds(100, 300, 200, 30);
        add(labelGender);

        male = new JRadioButton("Male");
        male.setBounds(300, 300, 100, 30);
        female = new JRadioButton("Female");
        female.setBounds(420, 300, 100, 30);
        otherGender = new JRadioButton("Other");
        otherGender.setBounds(540, 300, 100, 30);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(otherGender);

        add(male);
        add(female);
        add(otherGender);

        // Email
        JLabel labelEmail = new JLabel("Email:");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100, 350, 200, 30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 350, 300, 30);
        add(textEmail);

        // Marital Status
        JLabel labelMarital = new JLabel("Marital Status:");
        labelMarital.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMarital.setBounds(100, 400, 200, 30);
        add(labelMarital);

        married = new JRadioButton("Married");
        married.setBounds(300, 400, 100, 30);
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(420, 400, 100, 30);
        otherStatus = new JRadioButton("Other");
        otherStatus.setBounds(540, 400, 100, 30);

        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(otherStatus);

        add(married);
        add(unmarried);
        add(otherStatus);

        // Address
        JLabel labelAddress = new JLabel("Address:");
        labelAddress.setFont(new Font("Raleway", Font.BOLD, 20));
        labelAddress.setBounds(100, 450, 200, 30);
        add(labelAddress);

        textAddress = new JTextField();
        textAddress.setFont(new Font("Raleway", Font.BOLD, 14));
        textAddress.setBounds(300, 450, 300, 30);
        add(textAddress);

        // City
        JLabel labelCity = new JLabel("City:");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCity.setBounds(100, 500, 200, 30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        textCity.setBounds(300, 500, 150, 30);
        add(textCity);

        // State
        JLabel labelState = new JLabel("State:");
        labelState.setFont(new Font("Raleway", Font.BOLD, 20));
        labelState.setBounds(500, 500, 100, 30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        textState.setBounds(600, 500, 150, 30);
        add(textState);

        // Pin Code
        JLabel labelPin = new JLabel("Pin Code:");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPin.setBounds(100, 550, 200, 30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        textPin.setBounds(300, 550, 150, 30);
        add(textPin);

        // Next Button
        next = new JButton("Next");
        next.setBounds(650, 650, 100, 40);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        add(next);

        // Frame settings
        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Signup();
    }
}
