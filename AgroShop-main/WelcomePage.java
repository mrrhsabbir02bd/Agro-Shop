import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage implements ActionListener {
    private JFrame fHomePage;
    private JLabel lBackgroundImage;
    private JButton bUser,bAdmin, bBack;
    private Font font1;
    private ImageIcon iFavIcon;
    private Cursor cursor;

    public WelcomePage() 
{
    //allocating 
    fHomePage = new JFrame();
    bUser = new JButton("USER PANEL");
    bAdmin = new JButton("ADMIN PANEL");
    font1 = new Font ("Aileron", Font.BOLD, 21);
    ImageIcon image = new ImageIcon("image/Untitled-4.png"); //adding image
    lBackgroundImage = new JLabel(image);
    cursor = new Cursor(Cursor.HAND_CURSOR);

    //favicon
    iFavIcon = new ImageIcon(getClass().getResource("/image/favicon.png"));
    fHomePage.setIconImage(iFavIcon.getImage());

    //back button
    bBack = new JButton();
    bBack.setBounds(920, 30, 76,76);
    bBack.setForeground(new Color(255,255,255));
    fHomePage.add(bBack);
    bBack.setOpaque(false);
    bBack.setContentAreaFilled(false);
    bBack.setBorderPainted(false);
  
    //set
    lBackgroundImage.setBounds(0, 0, 1100, 700);
    bUser.setBounds(620, 405, 306, 38);
    bUser.setBackground(new Color(112,212,96)); 
    bUser.setFont(font1);
    bAdmin.setBounds(620, 510, 306, 38);
    bAdmin.setBackground(new Color(112,212,96)); 
    bAdmin.setFont(font1);

    //adding action listeners
    bUser.addActionListener(this);
    bBack.addActionListener(this);


    //adding into frame
    fHomePage.add(lBackgroundImage);
    fHomePage.add(bUser);
    fHomePage.add(bAdmin);
    

    //frame attributes
    fHomePage.setLayout(null);
    fHomePage.setTitle("Welcome Page - Agro Shop");
    fHomePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fHomePage.setSize(1100, 700);
    fHomePage.setLocationRelativeTo(null);
    fHomePage.setVisible(true);
    fHomePage.setResizable(false); // prevent from resizing 
    bUser.setCursor(cursor);
    bAdmin.setCursor(cursor);
    



}

  public void actionPerformed(ActionEvent e) 
  {
    if(e.getSource() == bUser)
		{
			new LoginPage();
      fHomePage.setVisible(false);
		}
    else if (e.getSource() == bBack)
    {
      new HomePage();
      fHomePage.setVisible(false);
    }
  }

}
