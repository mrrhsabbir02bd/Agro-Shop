import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage implements ActionListener {
    private JFrame fHomePage;
    private JLabel lBackgroundImage;
    private JButton bGetStarted,bContributions, bBack;
    private ImageIcon iFavIcon;
    private Font font1;

    public HomePage() 
{
    //allocating 
    fHomePage = new JFrame();
    bGetStarted = new JButton("Get Started");
    bContributions = new JButton("Contributions");
    ImageIcon image = new ImageIcon("gif/gif6.gif");
    lBackgroundImage = new JLabel(image); 
    font1 = new Font ("Aileron", Font.BOLD, 20);

    //favicon
    iFavIcon = new ImageIcon(getClass().getResource("/image/favicon.png"));
    fHomePage.setIconImage(iFavIcon.getImage());
    
    //setbound
    lBackgroundImage.setBounds(0, 0, 700, 700);
    fHomePage.getContentPane().setBackground(new Color(189,247,181)); 

    //getstarted button
    bGetStarted.setBounds(740,250,236, 50);
    bGetStarted.setFont(font1);
    bGetStarted.setForeground(new Color(255,255,255));
    bGetStarted.setBackground(new Color(112,212,96)); 
    bGetStarted.addActionListener(this);

    //contributions button
    bContributions.setBounds(740,350,236, 50);
    bContributions.setFont(font1);
    bContributions.setForeground(new Color(255,255,255));
    bContributions.setBackground(new Color(112,212,96)); 
    bContributions.addActionListener(this);

    //adding into frame
    fHomePage.add(lBackgroundImage);
    fHomePage.add(bGetStarted);
    fHomePage.add(bContributions);
      

    fHomePage.setLayout(null);
    fHomePage.setTitle("Home Page - Agro Shop");
    fHomePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fHomePage.setSize(1100, 700);
    fHomePage.setLocationRelativeTo(null);
    fHomePage.setVisible(true);
    fHomePage.setResizable(false); // prevent from resizing 

}

  public void actionPerformed(ActionEvent e) 
  {

      if (e.getSource() == bGetStarted)
    {
      new WelcomePage();
      fHomePage.setVisible(false);
    }
    else if (e.getSource() == bContributions)
    {
      new Contributions();
      fHomePage.setVisible(false);
    }
  }

  
}