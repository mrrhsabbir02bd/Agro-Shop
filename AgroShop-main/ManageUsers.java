import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageUsers implements ActionListener {
    private JFrame fHomePage;
    private ImageIcon iFavIcon,dl1,dr1,du1,dd1,iBack,iForward;
    private JButton bBack;

    public ManageUsers() 
{
    //allocating 
    fHomePage = new JFrame();

    //favicon
    iFavIcon = new ImageIcon(getClass().getResource("/image/favicon.png"));
    fHomePage.setIconImage(iFavIcon.getImage());

    //backbutton picture 
    iBack = new ImageIcon("image/back.png");
    JLabel iBackLabel = new JLabel(iBack);
    iBackLabel.setBounds(850, 60, 76,76);
    fHomePage.add(iBackLabel);
     
    iForward = new ImageIcon("image/forward.png");
    JLabel iForwardLabel = new JLabel(iForward);
    iForwardLabel.setBounds(920, 60, 76,76);
    fHomePage.add(iForwardLabel);
        
    //back button
    bBack = new JButton();
    bBack.setBounds(850, 60, 76,76);
    bBack.setForeground(new Color(255,255,255));
    fHomePage.add(bBack);
    bBack.setOpaque(false);
    bBack.setContentAreaFilled(false);
    bBack.setBorderPainted(false);

    // background design(image)
    dl1 = new ImageIcon("image/dl1.png");
    JLabel label_dl1 = new JLabel(dl1);
    label_dl1.setBounds(0, 0, 63,700);
    fHomePage.add(label_dl1);

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

    //manage user buttons

    JLabel titleLabel = new JLabel("Manage Users");
    titleLabel.setBounds(480, 110, 200, 40);
    fHomePage.add(titleLabel);
    Font titleLabelFont = new Font("Aileron", Font.BOLD, 25);
    titleLabel.setFont(titleLabelFont);
    titleLabel.setForeground(new Color(0,0,0));

    

    JButton displayUsersButton = new JButton("Display Users");
    displayUsersButton.setBounds(250, 200, 236, 50);
    displayUsersButton.addActionListener(this);
    fHomePage.add(displayUsersButton);
    Font displayUsersButtonFont = new Font("Aileron", Font.BOLD, 18);
    displayUsersButton.setFont(displayUsersButtonFont);
    displayUsersButton.setForeground(new Color(255,255,255));
    displayUsersButton.setBackground(new Color(112,212,96)); 


    JButton addUserButton = new JButton("Add User");
    addUserButton.setBounds(250, 300, 236, 50);
    addUserButton.addActionListener(this);
    fHomePage.add(addUserButton);
    Font addUserButtonFont = new Font("Aileron", Font.BOLD, 18);
    addUserButton.setFont(addUserButtonFont);
    addUserButton.setForeground(new Color(255,255,255));
    addUserButton.setBackground(new Color(112,212,96)); 


    JButton updateUserButton = new JButton("Update User");
    updateUserButton.setBounds(650, 200, 200, 50);
    updateUserButton.addActionListener(this);
    fHomePage.add(updateUserButton);
    Font updateUserButtonFont = new Font("Aileron", Font.BOLD, 18);
    updateUserButton.setFont(updateUserButtonFont);
    updateUserButton.setForeground(new Color(255,255,255));
    updateUserButton.setBackground(new Color(112,212,96)); 

    JButton searchUserButton = new JButton("Search User");
    searchUserButton.setBounds(650, 300, 200, 50);
    searchUserButton.addActionListener(this);
    fHomePage.add(searchUserButton);
    Font searchUserButtonFont = new Font("Aileron", Font.BOLD, 18);
    searchUserButton.setFont(searchUserButtonFont);
    searchUserButton.setForeground(new Color(255,255,255));
    searchUserButton.setBackground(new Color(112,212,96)); 

    JButton deleteUserButton = new JButton("Delete User");
    deleteUserButton.setBounds(450, 400, 200, 50);
    deleteUserButton.addActionListener(this);
    fHomePage.add(deleteUserButton);
    Font deleteUserButtonFont = new Font("Aileron", Font.BOLD, 18);
    deleteUserButton.setFont(deleteUserButtonFont);
    deleteUserButton.setForeground(new Color(255,255,255));
    deleteUserButton.setBackground(new Color(112,212,96)); 

    JButton logoutButton = new JButton("Logout");
    logoutButton.setBounds(450, 500, 200, 50);
    deleteUserButton.addActionListener(this);
    fHomePage.add(logoutButton);
    Font logoutButtonFont = new Font("Aileron", Font.BOLD, 18);
    logoutButton.setFont(logoutButtonFont);
    logoutButton.setForeground(new Color(255,255,255));
    logoutButton.setBackground(new Color(112,212,96)); 
    


    fHomePage.setLayout(null);
    fHomePage.setTitle("Manage Users - Agro Shop");
    fHomePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fHomePage.setSize(1100, 700);
    fHomePage.setLocationRelativeTo(null);
    fHomePage.setVisible(true);
    fHomePage.setResizable(false); // prevent from resizing 

}


  public void actionPerformed(ActionEvent e) 
  {


  }

  
}