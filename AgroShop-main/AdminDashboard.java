import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class AdminDashboard implements ActionListener {
    private JFrame frame;
    private ImageIcon iFavIcon;
    private JLabel lBackgroundImage;
    private Font font1;
    private ImageIcon iBack, iForward;
    private JButton bBack;
 
    public AdminDashboard() {
        frame = new JFrame("Admin Dashboard - Agro Shop");
        frame.setSize(1100, 700);
        font1 = new Font ("Aileron", Font.BOLD, 20);
        frame.setLayout(null);
 
        JLabel titleLabel = new JLabel("Admin Dashboard");
        frame.add(titleLabel);
        titleLabel.setFont(font1);
        titleLabel.setBounds(770,150,236, 50);
        titleLabel.setFont(font1);
        titleLabel.setForeground(new Color(255,255,255));
        titleLabel.setBackground(new Color(112,212,96));
 
        JButton manageUsersButton = new JButton("Manage Users");
        manageUsersButton.addActionListener(this);
        frame.add(manageUsersButton);
        manageUsersButton.setFont(font1);
        manageUsersButton.setBounds(740,250,236, 50);
        manageUsersButton.setFont(font1);
        manageUsersButton.setForeground(new Color(255,255,255));
        manageUsersButton.setBackground(new Color(112,212,96)); 
 
        JButton manageProductsButton = new JButton("Manage Products");
        manageProductsButton.setBounds(350, 80, 200, 30);
        manageProductsButton.addActionListener(this);
        frame.add(manageProductsButton);
        manageProductsButton.setFont(font1);
        manageProductsButton.setBounds(740,350,236, 50);
        manageProductsButton.setFont(font1);
        manageProductsButton.setForeground(new Color(255,255,255));
        manageProductsButton.setBackground(new Color(112,212,96)); 

        //backbutton picture 
        iBack = new ImageIcon("image/back.png");
        JLabel iBackLabel = new JLabel(iBack);
        iBackLabel.setBounds(920, 30, 76,76);
        frame.add(iBackLabel);

 
        iForward = new ImageIcon("image/forward.png");
        JLabel iForwardLabel = new JLabel(iForward);
        iForwardLabel.setBounds(990, 30, 76,76);
        frame.add(iForwardLabel);

        //back button
        bBack = new JButton();
        bBack.setBounds(920, 30, 76,76);
        bBack.setForeground(new Color(255,255,255));
        frame.add(bBack);
        bBack.setOpaque(false);
        bBack.setContentAreaFilled(false);
        bBack.setBorderPainted(false);

        JButton logoutButton = new JButton("Logout");
        logoutButton.addActionListener(this);
        frame.add(logoutButton);
        logoutButton.setFont(font1);
        logoutButton.setBounds(740,450,236, 50);
        logoutButton.setFont(font1);
        logoutButton.setForeground(new Color(255,255,255));
        logoutButton.setBackground(new Color(255, 71, 76)); 
 

        //favicon
        iFavIcon = new ImageIcon(getClass().getResource("/image/favicon.png"));
        frame.setIconImage(iFavIcon.getImage());
        
        //background image
        ImageIcon image = new ImageIcon("image/DefaultPage.png");
        lBackgroundImage = new JLabel(image);
        frame.add(lBackgroundImage);
        lBackgroundImage.setBounds(0, 0, 550, 700);
        frame.getContentPane().setBackground(new Color(23,66,45)); 
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

    }
 
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();
            if (button.getText().equals("Manage Users")) {
                frame.dispose(); // Close Admin Dashboard
				// new ManageUsers();
            } else if (button.getText().equals("Manage Books")) {
                frame.dispose(); // Close Admin Dashboard
				// new manageProducts();
            } else if (button.getText().equals("Logout")) {
                frame.dispose();
                // new Login();
            }
        }
    }
}