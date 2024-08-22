
package sales.market.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class LoginPanel extends JPanel implements ActionListener,MouseListener{
JTextField tf1=new JTextField();
JPasswordField tf2=new JPasswordField();
JLabel l1=new JLabel("اسم المستخدم");
JLabel l2=new JLabel("كلمة المرور");
JLabel l3=new JLabel("تسجيل دخول");
JLabel l4=new JLabel("powered by Eng / Mina Ezzat");
JLabel l5=new JLabel("سجل");
JButton b1=new JButton("ارسال");
JButton b2=new JButton("مسح");
JRadioButton rb1=new JRadioButton("مدير");
JRadioButton rb2=new JRadioButton("عامل");
ButtonGroup  bg=new ButtonGroup();


LoginPanel(){
ImageIcon icon =new ImageIcon(this.getClass().getResource("/login.png"));
JLabel im=new JLabel(icon);
ImageIcon chat =new ImageIcon(this.getClass().getResource("/chat.png"));
JLabel i=new JLabel(chat);
this.add(im);
this.add(l5);
this.add(i);
im.setBounds(10,20,256,256);
i.setBounds(185,30,64,64);
tf1.setBounds(100,300,150,30);
tf2.setBounds(100,350,150,30);
l1.setBounds(320,290,150,40);
l2.setBounds(340,340,150,40);
l3.setBounds(300,20,256,256);
l4.setBounds(240,450,200,30);
l5.setBounds(195,35,200,30);
b1.setBounds(100,400,150,35);
b2.setBounds(320,400,150,35);
rb1.setBounds(280,230,100,30);
rb2.setBounds(390,230,100,30);
l3.setForeground(Color.red);
l4.setForeground(Color.red);
l5.setForeground(Color.white);
ImageIcon login =new ImageIcon(this.getClass().getResource("/password.png"));
ImageIcon clear =new ImageIcon(this.getClass().getResource("/clear.png"));
b1.setIcon(login);
b2.setIcon(clear);
b1.setBackground(Color.blue);
b2.setBackground(Color.red);
Color col=new Color(153,204,255);
rb1.setBackground(col);
rb2.setBackground(col);
b1.setForeground(Color.white);
b2.setForeground(Color.white);
b1.addMouseListener(this);
b2.addActionListener(this);
l1.setFont(new Font("Arabic Typesetting",Font.BOLD,42) {});
l2.setFont(new Font("Arabic Typesetting",Font.BOLD,42) {});
l3.setFont(new Font("Arabic Typesetting",Font.BOLD,60) {});
l4.setFont(new Font("impact",Font.PLAIN,15) {});
l5.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b1.setFont(new Font("Arabic Typesetting",Font.BOLD,30) {});
b2.setFont(new Font("Arabic Typesetting",Font.BOLD,30) {});
tf1.setFont(new Font("",Font.BOLD,25) {});
tf2.setFont(new Font("",Font.BOLD,25) {});
rb1.setFont(new Font("Arabic Typesetting",Font.BOLD,42) {});
rb2.setFont(new Font("Arabic Typesetting",Font.BOLD,42) {});
this.setLayout(null);
this.add(tf1);
this.add(tf2);
this.add(l1);
this.add(l2);
this.add(l3);
this.add(l4);
this.add(b1);
this.add(b2);
this.add(rb1);
this.add(rb2);
bg.add(rb1);
bg.add(rb2);
}    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
     
          
            
        
        
        
        if (e.getSource()==b2) {
            tf1.setText("");
            tf2.setText("");
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
       b1.setBackground(Color.black);
    }

 

    
    @Override
    public void mouseExited(MouseEvent e) {
        b1.setBackground(Color.blue);
    }
    }

