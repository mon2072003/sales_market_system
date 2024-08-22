
package sales.market.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class calculater extends JFrame{
    float f1;
    float f2;
    String oper;
    v a1=new v();
    JPanel p1=new JPanel();
    JPanel p2=new JPanel();
    JLabel l1=new JLabel("الآلة الحاسبة");
    JLabel l2=new JLabel();
    JTextField tf1=new JTextField();
    JButton d1 = new JButton("  1  ");
    JButton d2 = new JButton("  2  ");
    JButton d3 = new JButton("  3  ");
    JButton d4 = new JButton("  4  ");
    JButton d5 = new JButton("  5  ");
    JButton d6 = new JButton("  6  ");
    JButton d7 = new JButton("  7  ");
    JButton d8 = new JButton("  8  ");
    JButton d9 = new JButton("  9  ");
    JButton d10 = new JButton("  0  ");
    JButton d11 = new JButton("  .  ");
    JButton d12 = new JButton("  +  ");
    JButton d13 = new JButton("  -  ");
    JButton d14 = new JButton("  *  ");
    JButton d15 = new JButton("  /  ");
    JButton d16 = new JButton("  %  ");
    JButton d17 = new JButton("  =  ");
    JButton d18 = new JButton("  DEL  ");

public calculater(){
    Image ic=new ImageIcon(this.getClass().getResource("/product.png")).getImage();
    ImageIcon i =new ImageIcon(this.getClass().getResource("/calculator.png"));
    l2.setIcon(i);
    this.setIconImage(ic);
    this.setTitle("الآلة الحاسبة");
    this.setSize(500,500);
    this.setLocation(500,200);
    this.setResizable(false);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.setLayout(new GridLayout(2,1));
    this.add(p1);
    this.add(p2);
    p1.setBackground(Color.darkGray);
    p2.setBackground(Color.darkGray);
/**********************************************************************/
p1.setLayout(null);
p2.setLayout(new GridLayout(3,6));
l1.setForeground(Color.white);
l1.setBounds(200,20,300,70);
l2.setBounds(20,-30, 256,256);
tf1.setBounds(170, 100,270,70);
Color x=new Color(0,200,150);
tf1.setBackground(x);
tf1.setFont(new Font("Haettenschweiler",Font.PLAIN,50) {});
l1.setFont(new Font("Arabic Typesetting",Font.BOLD,50) {});
p1.add(l1);
p1.add(l2);
p1.add(tf1);
/*********************************************************************/
d1.setFont(new Font("Haettenschweiler",Font.PLAIN,35) {});
d2.setFont(new Font("Haettenschweiler",Font.PLAIN,35) {});
d3.setFont(new Font("Haettenschweiler",Font.PLAIN,35) {});
d4.setFont(new Font("Haettenschweiler",Font.PLAIN,35) {});
d5.setFont(new Font("Haettenschweiler",Font.PLAIN,35) {});
d6.setFont(new Font("Haettenschweiler",Font.PLAIN,35) {});
d7.setFont(new Font("Haettenschweiler",Font.PLAIN,35) {});
d8.setFont(new Font("Haettenschweiler",Font.PLAIN,35) {});
d9.setFont(new Font("Haettenschweiler",Font.PLAIN,35) {});
d10.setFont(new Font("Haettenschweiler",Font.PLAIN,35) {});
d11.setFont(new Font("Haettenschweiler",Font.PLAIN,35) {});
d12.setFont(new Font("Haettenschweiler",Font.PLAIN,35) {});
d13.setFont(new Font("Haettenschweiler",Font.PLAIN,35) {});
d14.setFont(new Font("Haettenschweiler",Font.PLAIN,35) {});
d15.setFont(new Font("Haettenschweiler",Font.PLAIN,35) {});
d16.setFont(new Font("Haettenschweiler",Font.PLAIN,35) {});
d17.setFont(new Font("Haettenschweiler",Font.PLAIN,35) {});
d18.setFont(new Font("Haettenschweiler",Font.PLAIN,25) {});
d1.setBackground(Color.black);
d2.setBackground(Color.black);
d3.setBackground(Color.black);
d4.setBackground(Color.black);
d5.setBackground(Color.black);
d6.setBackground(Color.black);
d7.setBackground(Color.black);
d8.setBackground(Color.black);
d9.setBackground(Color.black);
d10.setBackground(Color.black);
d11.setBackground(Color.black);
d12.setBackground(Color.black);
d13.setBackground(Color.black);
d14.setBackground(Color.black);
d15.setBackground(Color.black);
d16.setBackground(Color.black);
d17.setBackground(Color.blue);
d18.setBackground(Color.red);

d1.setForeground(Color.white);
d2.setForeground(Color.white);
d3.setForeground(Color.white);
d4.setForeground(Color.white);
d5.setForeground(Color.white);
d6.setForeground(Color.white);
d7.setForeground(Color.white);
d8.setForeground(Color.white);
d9.setForeground(Color.white);
d10.setForeground(Color.white);
d11.setForeground(Color.white);
d12.setForeground(Color.white);
d13.setForeground(Color.white);
d14.setForeground(Color.white);
d15.setForeground(Color.white);
d16.setForeground(Color.white);
d17.setForeground(Color.white);
d18.setForeground(Color.white);
p2.add(d1);
p2.add(d2);
p2.add(d3);
p2.add(d4);
p2.add(d5);
p2.add(d6);
p2.add(d7);
p2.add(d8);
p2.add(d9);
p2.add(d10);
p2.add(d11);
p2.add(d12);
p2.add(d13);
p2.add(d14);
p2.add(d15);
p2.add(d16);
p2.add(d17);
p2.add(d18);
d1.addActionListener(a1);
d2.addActionListener(a1);
d3.addActionListener(a1);
d4.addActionListener(a1);
d5.addActionListener(a1);
d6.addActionListener(a1);
d7.addActionListener(a1);
d8.addActionListener(a1);
d9.addActionListener(a1);
d10.addActionListener(a1);
d11.addActionListener(a1);
d12.addActionListener(a1);
d13.addActionListener(a1);
d14.addActionListener(a1);
d15.addActionListener(a1);
d16.addActionListener(a1);
d17.addActionListener(a1);
d18.addActionListener(a1);
}
class v implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==d1){
        tf1.setText(tf1.getText()+"1");
        }
        if(e.getSource()==d2){
        tf1.setText(tf1.getText()+"2");
        }
        if(e.getSource()==d3){
        tf1.setText(tf1.getText()+"3");
        }
        if(e.getSource()==d4){
        tf1.setText(tf1.getText()+"4");
        }
        if(e.getSource()==d5){
        tf1.setText(tf1.getText()+"5");
        }
        if(e.getSource()==d6){
        tf1.setText(tf1.getText()+"6");
        }
        if(e.getSource()==d7){
        tf1.setText(tf1.getText()+"7");
        }
        if(e.getSource()==d8){
        tf1.setText(tf1.getText()+"8");
        }
        if(e.getSource()==d9){
        tf1.setText(tf1.getText()+"9");
        }
        if(e.getSource()==d10){
        tf1.setText(tf1.getText()+"0");
        }
        if(e.getSource()==d11){
        tf1.setText(tf1.getText()+".");
        }
        if(e.getSource()==d12){
            try {
        f1=Float.valueOf(tf1.getText());
        tf1.setText("");
        oper="+";                
            } catch (Exception ex) {
            }

        }
        if(e.getSource()==d13){
            try {
        f1=Float.valueOf(tf1.getText());
        tf1.setText("");
        oper="-";                
            } catch (Exception ex) {
            }

        }
        if(e.getSource()==d14){
            try {
        f1=Float.valueOf(tf1.getText());
        tf1.setText("");
        oper="*";                
            } catch (Exception ex) {
            }

        }
        if(e.getSource()==d15){
            try {
        f1=Float.valueOf(tf1.getText());
        tf1.setText("");
        oper="/";                 
            } catch (Exception ex) {
            }
       
        }
        if(e.getSource()==d16){
            try {
        f1=Float.valueOf(tf1.getText());
        tf1.setText("");
        oper="%";                
            } catch (Exception ex) {
            }

        }
        if(e.getSource()==d17){
        try{
        f2=Float.valueOf(tf1.getText());
        switch(oper){
            case "+":{ tf1.setText(Float.toString(f1+f2)); 
            break;
            }
            case "-":{ tf1.setText(Float.toString(f1-f2));
            break;
            }
            case "*":{ tf1.setText(Float.toString(f1*f2));
            break;
            }
            case "/":{ tf1.setText(Float.toString(f1/f2));
            break;
            }
            case "%":{tf1.setText(Float.toString(f1%f2));
            break;
            }
        }
        
        }
        catch(Exception ex){
            
        }    
            
        }
              
        
        
        if(e.getSource()==d18){
        tf1.setText("");        
        }
        

        }
    
}
}

