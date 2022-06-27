package LoginPage;

import javax.swing.*;
import java.awt.*;

public class LoginPage extends  JFrame {
    private JTextField usertext;
    private JPanel panel1;
    private JPasswordField password;
    private JButton entrarButton;
    private JFrame frame;

    public  LoginPage(){

        frame=new JFrame("Login Frame");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(250, 200));
        frame.setResizable(false);

        //now add the panel
        frame.add(panel1);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
}
