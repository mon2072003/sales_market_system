
package sales.market.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
//import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class Login extends JFrame implements ActionListener,KeyListener{
LoginPanel class2=new LoginPanel();
Connection c;
PreparedStatement k;
void Login(){
Image ic =new ImageIcon(this.getClass().getResource("/product.png")).getImage();

this.setTitle("digital cashier V 2.0 | تسجيل الدخول");
this.setSize(600,530);
this.setResizable(false);
this.setLocation(500,170);
this.setVisible(true);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.add(class2);
this.setIconImage(ic);
class2.b1.addActionListener(this);
Color col=new Color(153,204,255);
class2.setBackground(col);
class2.tf1.addKeyListener(this);
class2.tf2.addKeyListener(this);
addKeyListener(this);
setFocusable(true);
setFocusTraversalKeysEnabled(true);

}    

    @Override
    public void actionPerformed(ActionEvent e) {

        
        
          try {
     String pass=class2.tf2.getText();  
      c= DriverManager.getConnection("jdbc:sqlite:mina.db");
     String query="SELECT username,password from admin where username='"+class2.tf1.getText()+"'"; 
     k=c.prepareStatement(query);
    ResultSet rs=k.executeQuery();
     if(e.getSource()==class2.b1&&class2.rb2.isSelected()){
     
     if (pass.equals(rs.getString("password"))) {
         cash f=new cash();   
         f.cash();
         f.cshp.m2.hide();
         f.cshp.m7.hide();
         f.cshp.b15.hide();
         
         f.cshp1.m2.hide();
         f.cshp1.m7.hide();
         f.cshp1.b15.hide();
         
         f.cshp2.m2.hide();
         f.cshp2.m7.hide();
         f.cshp2.b15.hide();
         
         f.cshp3.m2.hide();
         f.cshp3.m7.hide();
         f.cshp3.b15.hide();
         
         JLabel l6=new JLabel("العامل :"+class2.tf1.getText());
         l6.setBounds(1020, 25, 240, 70);
         l6.setFont(new Font("Arabic Typesetting",Font.BOLD,40) {});
         JLabel l7=new JLabel("العامل :"+class2.tf1.getText());
         l7.setBounds(1020, 25, 240, 70);
         l7.setFont(new Font("Arabic Typesetting",Font.BOLD,40) {});
         JLabel l8=new JLabel("العامل :"+class2.tf1.getText());
         l8.setBounds(1020, 25, 240, 70);
         l8.setFont(new Font("Arabic Typesetting",Font.BOLD,40) {});
         JLabel l9=new JLabel("العامل :"+class2.tf1.getText());
         l9.setBounds(1020, 25, 240, 70);
         l9.setFont(new Font("Arabic Typesetting",Font.BOLD,40) {});
         f.cshp.add(l6);
         f.cshp1.add(l7);
         f.cshp2.add(l8);
         f.cshp3.add(l9);
         this.dispose();
                JOptionPane.showMessageDialog(null,"تم تسجيل الدخول بنجاح");
            }
            
     }
     

     
     
    }
     
      catch (SQLException ex) {
            
        
       }
          finally{
              try {
                c.close();
                k.close();
                
              } catch (SQLException es) {
                 class2.l5.setBounds(198,40,200,30);
                 class2.l5.setText("خطأ");
              }
          }
          




          
          
          try {
     String pass=class2.tf2.getText();  
      c= DriverManager.getConnection("jdbc:sqlite:mina.db");
     String query="SELECT username,password from manager where username='"+class2.tf1.getText()+"'"; 
     k=c.prepareStatement(query);
    ResultSet rs=k.executeQuery();
     if(e.getSource()==class2.b1&&class2.rb1.isSelected()){
     
     if (pass.equals(rs.getString("password"))) {
         cash f=new cash();   
         f.cash();
         JLabel l6=new JLabel("المدير :"+class2.tf1.getText());
         l6.setBounds(1020, 25, 240, 70);
         l6.setFont(new Font("Arabic Typesetting",Font.BOLD,40) {});
         JLabel l7=new JLabel("المدير :"+class2.tf1.getText());
         l7.setBounds(1020, 25, 240, 70);
         l7.setFont(new Font("Arabic Typesetting",Font.BOLD,40) {});
         JLabel l8=new JLabel("المدير :"+class2.tf1.getText());
         l8.setBounds(1020, 25, 240, 70);
         l8.setFont(new Font("Arabic Typesetting",Font.BOLD,40) {});
         JLabel l9=new JLabel("المدير :"+class2.tf1.getText());
         l9.setBounds(1020, 25, 240, 70);
         l9.setFont(new Font("Arabic Typesetting",Font.BOLD,40) {});
         f.cshp.add(l6);
         f.cshp1.add(l7);
         f.cshp2.add(l8);
         f.cshp3.add(l9);
         this.dispose();
                JOptionPane.showMessageDialog(null,"تم تسجيل الدخول بنجاح");
            }
            
     }
     

     
     
    }
     
      catch (SQLException ex) {
            
        
       }
          finally{
              try {
                c.close();
                k.close();
              } catch (SQLException es) {
                 class2.l5.setBounds(198,40,200,30);
                 class2.l5.setText("خطأ");
              }
          }          
          
          
          
          
      }

    @Override
    public void keyTyped(KeyEvent e) {
    
    }

    @Override
    public void keyPressed(KeyEvent e) {
   if(e.getKeyCode()==KeyEvent.VK_ENTER){
     class2.b1.doClick();
     }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
     }