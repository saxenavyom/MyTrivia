package mytrivia;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Score extends JFrame implements ActionListener {
    JButton Aplay;
    Score(String name,int score){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("pics/bg.jpg"));
        JLabel Bg = new JLabel(i1);
        setContentPane(Bg);
        
        JLabel heading = new JLabel("Thank You!!");
        heading.setBounds(280,140,200,100);
        heading.setFont(new Font ("Tahoma",Font.BOLD,30));
        heading.setForeground(new Color(167,111,255));
        Bg.add(heading);
        
        JLabel heading1 = new JLabel(name+" For Playing MyTrivia");
        heading1.setBounds(240,150,500,150);
        heading1.setFont(new Font ("Tahoma",Font.BOLD,18));
        heading1.setForeground(new Color(167,111,255));
        Bg.add(heading1);
        
        JLabel heading2 = new JLabel("Your Score: "+score);
        heading2.setBounds(300,190,500,150);
        heading2.setFont(new Font ("Tahoma",Font.BOLD,20));
        heading2.setForeground(new Color(167,111,255));
        Bg.add(heading2);
        
        Aplay = new JButton("Play Again");
        Aplay.setBounds(310, 300,130,30);
        Aplay.setBackground(new Color(167,111,255));
        Aplay.setFont(new Font ("Tahoma",Font.BOLD,15));
        Aplay.setForeground(Color.WHITE);
        Aplay.addActionListener(this);
        Bg.add(Aplay);
        
        setSize(750,550);
        setLocation(400,150);
        setLayout(null);
        setVisible(true);
}
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==Aplay){
            setVisible(false);
            new Login();
        }
        
    }
    public static void main(String[] args){
        new Score("user",0);
    }
    
}
