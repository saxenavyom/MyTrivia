package mytrivia;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {
    JButton rules,exit;
    JTextField tfname;
    Login(){
        setLayout(null); // Use null layout
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("pics/19629.jpg"));
        JLabel B_Image = new JLabel(i1);
        B_Image.setLayout(null); // Use null layout for B_Image
        setContentPane(B_Image);
        
        JLabel heading = new JLabel("MyTrivia");
        heading.setFont(new Font("Bell MT", Font.BOLD, 60));
        heading.setForeground(Color.WHITE);
        heading.setBounds(650, 20, 300, 70);
        B_Image.add(heading);
        
        JLabel heading1 = new JLabel("Enter Your Name");
        heading1.setFont(new Font("Bell MT", Font.BOLD, 25));
        heading1.setForeground(Color.WHITE);
        heading1.setBounds(680, 110, 250, 40);
        B_Image.add(heading1);
        
        tfname = new JTextField();
        tfname.setBounds(660,150,230,28);
        tfname.setFont(new Font("Arial",Font.PLAIN,15));
        tfname.setForeground(new Color(167,111,255));
        B_Image.add(tfname);
        
        rules = new JButton("Next");
        rules.setBounds(680, 200,80,20);
        rules.setBackground(Color.WHITE);
        rules.setForeground(new Color(167,111,255));
        rules.addActionListener(this);
        B_Image.add(rules);
        
        exit = new JButton("Exit");
        exit.setBounds(790, 200,80,20);
        exit.setBackground(Color.WHITE);
        exit.setForeground(new Color(167,111,255));
        exit.addActionListener(this);
        B_Image.add(exit);

        setSize(1000,350); 
        setLocation(150,150);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
            
        }
        else if(ae.getSource()==exit){
            setVisible(false);
        }
    
    }
    
    public static void main(String[] args){
        new Login();
    }
    
}
