import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contributions implements ActionListener {
    private JFrame fHomePage;
    private ImageIcon iFavIcon,dl1,dr1,du1,dd1, iBack, iForward;
    private JButton bBack, bforward;

    public Contributions() 
{
    //allocating 
    fHomePage = new JFrame();

    //favicon
    iFavIcon = new ImageIcon(getClass().getResource("/image/favicon.png"));
    fHomePage.setIconImage(iFavIcon.getImage());

    // background design(image)
    dl1 = new ImageIcon("image/dl1.png");
    JLabel label_dl1 = new JLabel(dl1);
    label_dl1.setBounds(0, 0, 63,700);
    fHomePage.add(label_dl1);

    //backbutton picture 
    iBack = new ImageIcon("image/back.png");
    JLabel iBackLabel = new JLabel(iBack);
    iBackLabel.setBounds(910, 70, 76,76);
    fHomePage.add(iBackLabel);
    
    //back button
    bBack = new JButton();
    bBack.setBounds(910, 70, 76,76);
    bBack.setForeground(new Color(255,255,255));
    fHomePage.add(bBack);
    bBack.setOpaque(false);
    bBack.setContentAreaFilled(false);
    bBack.setBorderPainted(false);
    bBack.addActionListener(this);



    dr1 = new ImageIcon("image/dr1.png");
    JLabel label_dr1 = new JLabel(dr1);
    label_dr1.setBounds(1021, 0, 63,700);
    fHomePage.add(label_dr1);

    dd1 = new ImageIcon("image/dd1.png");
    JLabel label_dd1 = new JLabel(dd1);
    label_dd1.setBounds(0, 0, 1100,63);
    fHomePage.add(label_dd1);

    du1 = new ImageIcon("image/dd1.png");
    JLabel label_du1 = new JLabel(du1);
    label_du1.setBounds(0, 598, 1100,63);
    fHomePage.add(label_du1);
    fHomePage.getContentPane().setBackground(new Color(189,247,181)); 

    fHomePage.setLayout(null);
    fHomePage.setTitle("User Dashboard - Agro Shop");
    fHomePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fHomePage.setSize(1100, 700);
    fHomePage.setLocationRelativeTo(null);
    fHomePage.setVisible(true);
    fHomePage.setResizable(false); // prevent from resizing 

}

  public void actionPerformed(ActionEvent e) 
  {
    if(e.getSource() == bBack)
            {
              new HomePage();
              fHomePage.setVisible(false);
            }

  }

  
}