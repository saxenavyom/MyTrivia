package mytrivia;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener{
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JButton next,lifeline,submit;
    JLabel qno,question;
    ButtonGroup group;
    JRadioButton option1,option2,option3,option4;
    public static int timer = 20;
    public static int ans_given =0;
    public static int count=0;
    public static int score=0;
    String username;
    
    Quiz(String username){
        this.username=username;
        setLayout(null); // Use null layout
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("pics/bi.jpg"));
        JLabel B_Image = new JLabel(i1);
        B_Image.setLayout(null); // Use null layout for B_Image
        setContentPane(B_Image);
        
        qno = new JLabel();
        qno.setBounds(100,400,200,50);
        qno.setFont(new Font ("Tahoma",Font.BOLD,30));
        qno.setForeground(Color.WHITE);
        B_Image.add(qno);
        
        question = new JLabel();
        question.setBounds(150,400,1400,50);
        question.setFont(new Font ("Tahoma",Font.BOLD,30));
        question.setForeground(Color.WHITE);
        B_Image.add(question);
        
        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";
        
        option1 = new JRadioButton();
        option1.setBounds(100,550,500,30);
        option1.setBackground(new Color(187,141,255));
        option1.setFont(new Font("Arial",Font.BOLD,20));
        option1.setForeground(Color.WHITE);
        B_Image.add(option1);
        
        option2 = new JRadioButton();
        option2.setBounds(100,650,550,30);
        option2.setBackground(new Color(187,141,255));
        option2.setFont(new Font("Arial",Font.BOLD,20));
        option2.setForeground(Color.WHITE);
        B_Image.add(option2);
        
        option3 = new JRadioButton();
        option3.setBounds(650,550,500,30);
        option3.setBackground(new Color(187,141,255));
        option3.setFont(new Font("Arial",Font.BOLD,20));
        option3.setForeground(Color.WHITE);
        B_Image.add(option3);
        
        option4 = new JRadioButton();
        option4.setBounds(650,650,500,30);
        option4.setBackground(new Color(187,141,255));
        option4.setFont(new Font("Arial",Font.BOLD,20));
        option4.setForeground(Color.WHITE);
        B_Image.add(option4);
        
        group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);
        group.add(option4);
        
        next = new JButton("Next");
        next.setBounds(1200, 550,150,30);
        next.setBackground(Color.WHITE);
        next.setFont(new Font("Tahoma",Font.BOLD,20));
        next.setForeground(new Color(167,111,255));
        next.addActionListener(this);
        B_Image.add(next);
        
        lifeline = new JButton("50-50");
        lifeline.setBounds(1200, 600,150,30);
        lifeline.setBackground(Color.WHITE);
        lifeline.setFont(new Font("Tahoma",Font.BOLD,20));
        lifeline.setForeground(new Color(167,111,255));
        lifeline.addActionListener(this);
        B_Image.add(lifeline);
        
        submit = new JButton("Submit");
        submit.setBounds(1200, 650,150,30);
        submit.setBackground(Color.WHITE);
        submit.setForeground(new Color(167,111,255));
        submit.setFont(new Font("Tahoma",Font.BOLD,20));
        submit.addActionListener(this);
        submit.setEnabled(false);
        B_Image.add(submit);
        
        start(count);
        
        setVisible(true);
        setSize(1540,825);
        setLocation(0,0);
     
        
    }
    public void paint(Graphics g){
        super.paint(g);
        String time = "Time Left: "+ timer + " seconds";
        g.setColor(Color.WHITE);
        g.setFont(new Font("Tahoma",Font.BOLD,25));
       
        if(timer>0){
            g.drawString(time, 1200, 70);
        }
        else{
            g.drawString("Times up!!!", 1200, 70);
        }
        timer--;
        
        try{
            Thread.sleep(1000);
            repaint();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        if(ans_given==1){
            ans_given = 0;
            timer=20;
        }
        else if(timer<0){
            timer=20;
            option1.setEnabled(true);
            option2.setEnabled(true);
            option3.setEnabled(true);
            option4.setEnabled(true);
            if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count==9){
                if(group.getSelection()==null){
                useranswers[count][0]= "";
            }
            else{
                useranswers[count][0]=group.getSelection().getActionCommand();
            }
            for(int i=0;i<useranswers.length;i++){
                if(useranswers[i][0]==answers[i][0]){
                    score += 1 ;
                }
            }
            setVisible(false);
            new Score(username,score);
            count = 0;
            score=0;
            }
            else{
            if(group.getSelection()==null){
                useranswers[count][0]= "";
            }
            else{
                useranswers[count][0]=group.getSelection().getActionCommand();
            }
         count++;
         start(count);
        }
    }
    }
    public void start(int count){
        qno.setText(""+(count+1)+".");
        question.setText(questions[count][0]);
        option1.setText(questions[count][1]);
        option1.setActionCommand(questions[count][1]);
        option2.setText(questions[count][2]);
        option2.setActionCommand(questions[count][2]);
        option3.setText(questions[count][3]);
        option3.setActionCommand(questions[count][3]);
        option4.setText(questions[count][4]);
        option4.setActionCommand(questions[count][4]);
        group.clearSelection();
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==next){
            repaint();
            option1.setEnabled(true);
            option2.setEnabled(true);
            option3.setEnabled(true);
            option4.setEnabled(true);
            ans_given =1;
            if(group.getSelection()==null){
                useranswers[count][0]= "";
            }
            else{
                useranswers[count][0]=group.getSelection().getActionCommand();
            }
            if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
            
        }
        else if(ae.getSource()==lifeline){
            if(count==1 || count==2 || count==4 || count==6 || count==8 || count==9){
                option2.setEnabled(false);
                option3.setEnabled(false);
            }
            else{
                option1.setEnabled(false);
                option4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        }
        else{
            ans_given=1;
            if(group.getSelection()==null){
                useranswers[count][0]= "";
            }
            else{
                useranswers[count][0]=group.getSelection().getActionCommand();
            }
            for(int i=0;i<useranswers.length;i++){
                if(useranswers[i][0].equals(answers[i][1])){
                    score += 1 ;
                }
            }
            setVisible(false);
            new Score(username,score);
            count =0;
            score=0;
                    
            
        }
    }
    public static void main(String[] args){
        new Quiz("User");
    }
}
