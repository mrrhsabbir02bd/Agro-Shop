import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 
 
public class LoginPage implements ActionListener 
{
    private JFrame fHomePage;
    private JLabel lBackgroundImage,lSignIn;
    private Font font1;
    private JLabel lUsername,lPassword, lRegister;
    private JTextField tfUsername;
    private JPasswordField pfPassword;
    private JButton bLogin, bForgot, bRegister, bBack, bforward;
    private ImageIcon iBack, iForward, iFavIcon;
    private Cursor cursor;
    public LoginPage() 
{
    //allocating fHomePage
    fHomePage = new JFrame();
    font1 = new Font ("Aileron", Font.BOLD, 30);
    ImageIcon image = new ImageIcon("image/DefaultPage.png");
    lBackgroundImage = new JLabel(image);
 
    //favicon
    iFavIcon = new ImageIcon(getClass().getResource("/image/favicon.png"));
    fHomePage.setIconImage(iFavIcon.getImage());
 
    //backbutton picture 
    iBack = new ImageIcon("image/back.png");
    JLabel iBackLabel = new JLabel(iBack);
    iBackLabel.setBounds(920, 30, 76,76);
    fHomePage.add(iBackLabel);
 
    iForward = new ImageIcon("image/forward.png");
    JLabel iForwardLabel = new JLabel(iForward);
    iForwardLabel.setBounds(990, 30, 76,76);
    fHomePage.add(iForwardLabel);
 
 
 
    //back button
    bBack = new JButton();
    bBack.setBounds(920, 30, 76,76);
    bBack.setForeground(new Color(255,255,255));
    fHomePage.add(bBack);
    bBack.setOpaque(false);
    bBack.setContentAreaFilled(false);
    bBack.setBorderPainted(false);
    //allocating login form
    lSignIn = new JLabel("Sign in");
    bLogin = new JButton("Login");

 
    //adding into fHomePage
    fHomePage.add(lBackgroundImage);
    fHomePage.add(lSignIn);
    fHomePage.add(bLogin);
 
    //adding action listener
    bBack.addActionListener(this);
    // bRegister.addActionListener(this);
 
    //setbound
    lBackgroundImage.setBounds(0, 0, 550, 700);
    fHomePage.getContentPane().setBackground(new Color(23,66,45));
 
    //setbound log in form
    lSignIn.setBounds(740, 160, 285, 50);
    lSignIn.setForeground(new Color(255,255,255)); 
    lSignIn.setFont(font1);
 
    //log in button
    bLogin.setBounds(670, 460, 236, 30);
    Font bLoginFont = new Font("Aileron", Font.BOLD, 18);
    bLogin.setFont(bLoginFont);
    bLogin.setForeground(new Color(255,255,255));
    bLogin.setBackground(new Color(112,212,96));
    bLogin.addActionListener(this);	
    fHomePage.add(bLogin);
 
    fHomePage.setLayout(null);
    fHomePage.setTitle("Login Page - Agro Shop");
    fHomePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fHomePage.setSize(1100, 700);
    fHomePage.setLocationRelativeTo(null);
    fHomePage.setVisible(true);
    fHomePage.setResizable(false); // prevent from resizing
 
 
    lUsername = new JLabel("Username");
    lUsername.setBounds(670, 250, 200, 30);
    Font lUsernameFont = new Font("Aileron", Font.BOLD, 18);
    lUsername.setFont(lUsernameFont);
    lUsername.setForeground(new Color(255,255,255));
    fHomePage.add(lUsername);
 
    tfUsername = new JTextField();
    tfUsername.setBounds(670, 290, 236, 30);
    Font tfUsernameFont = new Font("Aileron", Font.BOLD, 17);
    tfUsername.setFont(tfUsernameFont);
    tfUsername.setForeground(new Color(255,255,255));
    tfUsername.setBackground(new Color(50,88,70)); 
    fHomePage .add(tfUsername);
 
    lPassword = new JLabel("Password");
    lPassword.setBounds(670, 340, 200, 30);
    Font lPasswordFont = new Font("Aileron", Font.BOLD, 17);
    lPassword.setFont(lPasswordFont);
    lPassword.setForeground(new Color(255,255,255));
    fHomePage .add(lPassword);
 
    pfPassword = new JPasswordField();
    pfPassword.setBounds(670, 380, 236, 30);
    Font pfPasswordFont = new Font("Aileron", Font.BOLD, 17);
    pfPassword.setFont(pfPasswordFont);
    pfPassword.setForeground(new Color(255,255,255));
    pfPassword.setBackground(new Color(50,88,70));
    pfPassword.setEchoChar('*');
    fHomePage .add(pfPassword);
 
    bForgot = new JButton("Forgot Password?");
    bForgot.setBounds(670, 415, 133, 25);
    Font bForgotFont = new Font("Aileron", Font.BOLD, 15);
    bForgot.setBorder(BorderFactory.createEmptyBorder());
    bForgot.setFont(bForgotFont);
    bForgot.setOpaque(false);
    bForgot.setForeground(new Color(112,212,96));
    bForgot.setOpaque(false);
    bForgot.setBackground(new Color(0, 0, 0, 0));
    fHomePage.add(bForgot);

 
    bRegister = new JButton("Don't have an account? Register");
    bRegister.setBounds(670, 500, 236, 30);
    Font bRegisterFont = new Font("Aileron", Font.BOLD, 15);
    bRegister.setBorder(BorderFactory.createEmptyBorder());
    bRegister.setFont(bRegisterFont);
    bRegister.setOpaque(false);
    bRegister.setForeground(new Color(112,212,96));
    bRegister.setOpaque(false);
    bRegister.setBackground(new Color(0, 0, 0, 0));
	bRegister.addActionListener(this);
    fHomePage.add(bRegister);
    bRegister.setCursor(cursor);
 
}
 
 
public void actionPerformed(ActionEvent e)
        {
			if(e.getSource() == bLogin)
			{
				login();
			}
            else if(e.getSource() == bRegister)
            {
              new RegisterPage();
              fHomePage.setVisible(false);
            }
            else if(e.getSource() == bBack)
			{
              new WelcomePage();
              fHomePage.setVisible(false);
            }
        }
		 private void login() {
        String username = tfUsername.getText();
        String password = new String(pfPassword.getPassword());
 
        // Check if admin login
        if (username.equals("admin") && password.equals("admin123")) {
            JOptionPane.showMessageDialog(fHomePage, "Admin Login Successful!");
            fHomePage.dispose();
            new AdminDashboard();
            return;
        }
 
        // Proceed with regular user login
        User user = authenticateUser(username, password);
        if (user != null) {
            JOptionPane.showMessageDialog(fHomePage, "Login Successful!");
            fHomePage.dispose();
           // new UserDashboard(user);
        } else {
            JOptionPane.showMessageDialog(fHomePage, "Invalid username or password!");
        }
    }
 
    private User authenticateUser(String username, String password) {
        try {
            File file = new File("userdata.txt");
            if (!file.exists()) {
                JOptionPane.showMessageDialog(fHomePage, "No user registered yet!");
                return null;
            }
 
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[3].equals(username) && parts[1].equals(password)) {
                    reader.close();
                    return new User(parts[0], parts[1], parts[2], parts[3]);
                }
            }
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
 