package mytrivia;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rules  extends JFrame implements ActionListener{
    String name;
    JButton back,start;
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(new Color(167,111,255));
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome "+ name + " to MyTrivia");
        heading.setFont(new Font("Bell MT", Font.BOLD, 40));
        heading.setForeground(Color.WHITE);
        heading.setBounds(50, 80, 800, 70);
        add(heading);
        
        JLabel heading1 = new JLabel();
        heading1.setFont(new Font("Arial", Font.BOLD, 15));
        heading1.setForeground(Color.WHITE);
        heading1.setBounds(50, 40, 700, 600);
        heading1.setText(
                "<html>"+ 
                "1. No Cheating: Do not use any form of cheating, including looking up answers on your phone or other devices. Trivia is meant to test your knowledge, not your Googling skills." + "<br><br>" +
                "2. Answer in Time: Be mindful of time limits for answering questions. If there's a time constraint, make sure to answer within the given timeframe." + "<br><br>" +
                "3. Read Carefully: Pay attention to the questions and instructions. Misunderstanding the question can lead to incorrect answers." + "<br><br>" +
                "4. Check Your Answers: Before submitting your answers, double-check them for accuracy to avoid errors." + "<br><br>" +
                "5. No Collaboration: Trivia is typically an individual effort. Do not collaborate with others." + "<br><br>" +
                "6. Report Issues: If you encounter technical issues, bugs, or inappropriate content, report them to the app's support or moderation team." + "<br><br>" +
                "7. Have Fun: Enjoy the quiz app for what it is—a fun and educational experience. Don't take it too seriously, and don't be discouraged by incorrect answers." + "<br><br>" +
            "<html>"
        );
        add(heading1);
        
        start = new JButton("Start");
        start.setBounds(200, 550,80,25);
        start.setBackground(Color.WHITE);
        start.setForeground(new Color(167,111,255));
        start.addActionListener(this);
        add(start);
        
        back = new JButton("Back");
        back.setBounds(520, 550,80,25);
        back.setBackground(Color.WHITE);
        back.setForeground(new Color(167,111,255));
        back.addActionListener(this);
        add(back);
        
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
            setVisible(false);
            new Quiz(name);
            
            
        }
        else if(ae.getSource()==back){
            setVisible(false);
            new Login();
        }
    
    }
    public static void main(String[] args){
        new Rules("User");
    }
}
