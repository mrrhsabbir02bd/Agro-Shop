import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Font;

public class RegisterPage implements ActionListener {
    private JFrame fHomePage;
    private JLabel lBackgroundImage, lFullname, lUsername, lgender, lRegister, lPassword, lSignin;
    private JTextField tFullname, tUsername;
    private JPasswordField pfPassword;
    private Font font1;
    private ImageIcon iBack, iForward, iFavIcon;
    private JButton bRegister, bSignin, bBack, bClear;
    private JComboBox<String> genderBox;



    public RegisterPage() 
{ 

    //font 
    font1 = new Font ("Aileron", Font.BOLD, 30);
    //allocating 
    fHomePage = new JFrame();

    //favicon
    iFavIcon = new ImageIcon(getClass().getResource("/image/favicon.png"));
    fHomePage.setIconImage(iFavIcon.getImage());


    //adding image
    ImageIcon image = new ImageIcon("image/DefaultPage.png");
    lBackgroundImage = new JLabel(image);

    //backbutton picture 
    iBack = new ImageIcon("image/back.png");
    JLabel iBackLabel = new JLabel(iBack);
    iBackLabel.setBounds(920, 30, 76,76);
    fHomePage.add(iBackLabel);

    iForward = new ImageIcon("image/forward.png");
    JLabel iForwardLabel = new JLabel(iForward);
    iForwardLabel.setBounds(990, 30, 76,76);
    fHomePage.add(iForwardLabel);


    //adding into frame
    fHomePage.add(lBackgroundImage);
    //allocating login form
    lRegister = new JLabel("Register");
    bSignin= new JButton("Login");

    //register label
    lRegister.setBounds(700, 60, 285, 50);
    lRegister.setForeground(new Color(255,255,255)); 
    lRegister.setFont(font1);
    fHomePage.add(lRegister);

    //Full Name Label
    lFullname = new JLabel("Full Name");
    lFullname.setBounds(630, 140, 200, 30);
    Font lFullnameFont = new Font("Aileron", Font.BOLD, 18);
    lFullname.setFont(lFullnameFont);
    lFullname.setForeground(new Color(255,255,255));
    fHomePage.add(lFullname);

    //Full Name Text Field
    tFullname = new JTextField();
    tFullname.setBounds(630, 180, 236, 30);
    Font tFullnameFont = new Font("Aileron", Font.BOLD, 17);
    tFullname.setFont(tFullnameFont);
    tFullname.setForeground(new Color(255,255,255));
    tFullname.setBackground(new Color(50,88,70)); 
    fHomePage .add(tFullname);
    
    //Username Label
    lUsername = new JLabel("Username");
    lUsername.setBounds(630, 220, 236, 30);
    Font lUsernameFont = new Font("Aileron", Font.BOLD, 17);
    lUsername.setFont(lUsernameFont);
    lUsername.setForeground(new Color(255,255,255));
    lUsername.setBackground(new Color(50,88,70)); 
    fHomePage.add(lUsername);

    //Username Textfield
    tUsername = new JTextField();
    tUsername.setBounds(630, 260, 236, 30);
    Font tUsernameFont = new Font("Aileron", Font.BOLD, 17);
    tUsername.setFont(tUsernameFont);
    tUsername.setForeground(new Color(255,255,255));
    tUsername.setBackground(new Color(50,88,70)); 
    fHomePage.add(tUsername);

    //gender label
    lgender = new JLabel("Gender");
    lgender.setBounds(630,380 , 236, 30);
    Font lgenderFont = new Font("Aileron", Font.BOLD, 17);
    lgender.setFont(lgenderFont);
    lgender.setForeground(new Color(255,255,255));
    lgender.setBackground(new Color(50,88,70)); 
    fHomePage.add(lgender);


    String[] genders = {"Male", "Female"};
    genderBox = new JComboBox<>(genders);
    genderBox.setBounds(630, 420, 236, 30);
    fHomePage.add(genderBox);
    Font genderBoxFont = new Font("Aileron", Font.BOLD, 17);
    genderBox.setFont(genderBoxFont);
    genderBox.setForeground(new Color(255,255,255));
    genderBox.setBackground(new Color(50,88,70)); 

    //label Password
    lPassword = new JLabel("Password");
    lPassword.setBounds(630, 300, 236, 30);
    Font lPasswordFont = new Font("Aileron", Font.BOLD, 17);
    lPassword.setFont(lPasswordFont);
    lPassword.setForeground(new Color(255,255,255));
    lPassword.setBackground(new Color(50,88,70)); 
    fHomePage.add(lPassword);

    //password field
    pfPassword = new JPasswordField();
    pfPassword.setBounds(630, 340, 236, 30);
    Font pfPasswordFont = new Font("Aileron", Font.BOLD, 17);
    pfPassword.setFont(pfPasswordFont);
    pfPassword.setForeground(new Color(255,255,255));
    pfPassword.setBackground(new Color(50,88,70)); 
    fHomePage.add(pfPassword);

    //register button
    bRegister = new JButton("Register");
    bRegister.setBounds(630, 480, 236, 30);
    Font bLoginFont = new Font("Aileron", Font.BOLD, 17);
    bRegister.setFont(bLoginFont);
    bRegister.setForeground(new Color(255,255,255));
    bRegister.setBackground(new Color(112,212,96)); 
    fHomePage.add(bRegister);

    //signin label
    lSignin = new JLabel("Already Registered? Login ");
    lSignin.setBounds(630, 580, 236, 30);
    Font lSigninFont = new Font("Aileron", Font.BOLD, 17);
    lSignin.setFont(lSigninFont);
    lSignin.setForeground(new Color(112,212,96));
    lSignin.setBackground(new Color(50,88,70)); 
    fHomePage.add(lSignin);

    //sign in button
    bSignin = new JButton();
    bSignin.setBounds(630, 580, 236, 30);
    Font bSigninFont = new Font("Aileron", Font.BOLD, 15);
    bSignin.setBorder(BorderFactory.createEmptyBorder());
    bSignin.setFont(bSigninFont);
    bSignin.setOpaque(false);
    bSignin.setForeground(new Color(112,212,96));
    bSignin.setOpaque(false);
    bSignin.setBackground(new Color(0, 0, 0, 0));
    fHomePage.add(bSignin);

    //back button
    bBack = new JButton();
    bBack.setBounds(920, 30, 76,76);
    bBack.setForeground(new Color(255,255,255));
    fHomePage.add(bBack);
    bBack.setOpaque(false);
    bBack.setContentAreaFilled(false);
    bBack.setBorderPainted(false);

    //Clear button
    bClear = new JButton("Clear");
    bClear.setBounds(630, 540, 236, 30);
    Font bClearFont = new Font("Aileron", Font.BOLD, 15);
    bClear.setFont(bClearFont);
    bClear.setForeground(new Color(255,255,255));
    bClear.setBackground(new Color(112,212,96)); 
    fHomePage.add(bClear);
    


    //adding action listener
    bBack.addActionListener(this);    
    bSignin.addActionListener(this);    
    bRegister.addActionListener(this);
    bClear.addActionListener(this);

    //setbound
    lBackgroundImage.setBounds(0, 0, 550, 700);
    fHomePage.getContentPane().setBackground(new Color(23,66,45)); 

    fHomePage.setLayout(null);
    fHomePage.setTitle("Registration Page - Agro Shop");
    fHomePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fHomePage.setSize(1100, 700);
    fHomePage.setLocationRelativeTo(null);
    fHomePage.setVisible(true);
    fHomePage.setResizable(false); // prevent from resizing 

}

  public void actionPerformed(ActionEvent e) 
  {
    if(e.getSource() == bSignin)
    {
      new LoginPage();
      fHomePage.setVisible(false);
    }
    else if(e.getSource() == bBack)
    {
      new LoginPage();
      fHomePage.setVisible(false);
    }
    else if (e.getSource() instanceof JButton) {
      JButton button = (JButton) e.getSource();
      if (button.getText().equals("Register")) 
      {
          register();
      }
      else if (button.getText().equals("Clear")) 
      {
        clearFields();
      }
    }
  }

      private void register() {
        String name = tFullname.getText();
        String email = tUsername.getText();
        String password = new String(pfPassword.getPassword());
        String gender = (String) genderBox.getSelectedItem();

        // Check for empty fields
        if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(fHomePage, "Please fill all fields!");
            return;
        }

        // Check for existing email
        if (isEmailExists(email)) {
            JOptionPane.showMessageDialog(fHomePage, "User with this email already exists!");
            return;
        }

        User newUser = new User(name, email, password, gender);

        try {
            FileWriter writer = new FileWriter("userdata.txt", true);
            writer.write(newUser.getName() + "," + newUser.getEmail() + "," + newUser.getPassword() + "," + newUser.getGender() + "\n");
            writer.close();
            JOptionPane.showMessageDialog(fHomePage, "Registration Successful!");
            fHomePage.dispose();
            new LoginPage();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean isEmailExists(String email) {
        try {
            File file = new File("userdata.txt");
            if (!file.exists()) {
                return false;
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[1].equals(email)) {
                    reader.close();
                    return true;
                }
            }
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    private void clearFields() {
      tFullname.setText("");
      tUsername.setText("");
      pfPassword.setText("");
      genderBox.setSelectedIndex(0);
    }
}

  
