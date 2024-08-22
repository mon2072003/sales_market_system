
package sales.market.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class form extends JFrame{
    listen listen=new listen();
    JPanel panel=new JPanel();
    Color col=new Color(153,204,255);
    JLabel l=new JLabel("انشاء حساب");
    JLabel l1=new JLabel("اسم الشركة");
    JLabel l2=new JLabel("الوصف");
    JLabel l3=new JLabel("العنوان");
    JLabel l4=new JLabel("التليفون");
    JLabel l5=new JLabel("سجل تجاري");
    JLabel l6=new JLabel("بطاقة ضريبية");
    JLabel l7=new JLabel("ملاحظات");
    JTextField tf1=new JTextField();
    JTextField tf2=new JTextField();
    JTextField tf3=new JTextField();
    JTextField tf4=new JTextField();
    JTextField tf5=new JTextField();
    JTextField tf6=new JTextField();
    JTextArea tf7=new JTextArea();
    JScrollPane sp=new JScrollPane();
    JButton b1=new JButton("تنفيذ");
    JButton b2=new JButton("مسح");
    
    
    
    Connection c;
    Statement k;
    ResultSet rs;
/*******************************************************************************/
ImageIcon execute =new ImageIcon(this.getClass().getResource("/operation.png"));
ImageIcon clear =new ImageIcon(this.getClass().getResource("/clear.png"));
 public void form(){
 ImageIcon icon =new ImageIcon(this.getClass().getResource("/accounting.png"));
 JLabel im=new JLabel(icon);
 im.setBounds(20,20,128,128);
/*******************************************************************************/
 Image ic =new ImageIcon(this.getClass().getResource("/product.png")).getImage();
 this.setIconImage(ic);
 this.setTitle("بيانات الحساب");
 this.setBounds(500,100,500,600);
 this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
 this.setVisible(true);
 this.setResizable(false);
 this.add(panel);
 /******************************************************************************/

 panel.setBackground(col);
 panel.setLayout(null);
 panel.add(im);
 panel.add(l);
 panel.add(l1);
 panel.add(l2);
 panel.add(l3);
 panel.add(l4);
 panel.add(l5);
 panel.add(l6);
 panel.add(l7);
 panel.add(tf1);
 panel.add(tf2);
 panel.add(tf3);
 panel.add(tf4);
 panel.add(tf5);
 panel.add(tf6);
 panel.add(tf7);
 /*****************************************************************************/
 l.setForeground(Color.BLUE);
 l.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
 l1.setFont(new Font("Arabic Typesetting",Font.BOLD,40) {});
 l2.setFont(new Font("Arabic Typesetting",Font.BOLD,40) {});
 l3.setFont(new Font("Arabic Typesetting",Font.BOLD,40) {});
 l4.setFont(new Font("Arabic Typesetting",Font.BOLD,40) {});
 l5.setFont(new Font("Arabic Typesetting",Font.BOLD,40) {});
 l6.setFont(new Font("Arabic Typesetting",Font.BOLD,40) {});
 l7.setFont(new Font("Arabic Typesetting",Font.BOLD,40) {});
 l.setBounds(180, 40, 200,60);
 l1.setBounds(300, 150, 200,40);
 l2.setBounds(300, 190, 200,40);
 l3.setBounds(300, 230, 200,40);
 l4.setBounds(300, 270, 200,40);
 l5.setBounds(300, 310, 200,40);
 l6.setBounds(300, 350, 200,40);
 l7.setBounds(300, 390, 200,40);
 /*****************************************************************************/
tf1.setFont(new Font("",Font.BOLD,20) {});
tf2.setFont(new Font("",Font.BOLD,20) {});
tf3.setFont(new Font("",Font.BOLD,20) {});
tf4.setFont(new Font("",Font.BOLD,20) {});
tf5.setFont(new Font("",Font.BOLD,20) {});
tf6.setFont(new Font("",Font.BOLD,20) {});
tf7.setFont(new Font("",Font.BOLD,20) {});
tf1.setBounds(40, 160, 200,30);
tf2.setBounds(40, 200, 200,30);
tf3.setBounds(40, 240, 200,30);
tf4.setBounds(40, 280, 200,30);
tf5.setBounds(40, 320, 200,30);
tf6.setBounds(40, 360, 200,30);
//tf7.setBounds(40, 360, 200,50);
/******************************************************************************/
b1.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b2.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b1.setBounds(40,480, 130,30);
b2.setBounds(300,480, 130,30);
b1.setBackground(Color.green);
b2.setBackground(Color.red);
b2.setForeground(Color.WHITE);
panel.add(b1);
panel.add(b2);
b1.addActionListener(listen);
b2.addActionListener(listen);
b1.setIcon(execute);
b2.setIcon(clear);
/******************************************************************************/
sp=new JScrollPane(tf7);
sp.setBounds(40, 400, 200,50);
panel.add(sp);
tf7.setLineWrap(true);
/******************************************************************************/
     try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="select name , discreption , address , phone , registeration , tax_card , notice from account"; 
          k=c.createStatement();
          rs=k.executeQuery(query);  
  while(rs.next()){
   tf1.setText(rs.getString("name"));
   tf2.setText(rs.getString("discreption"));
   tf3.setText(rs.getString("address"));
   tf4.setText(rs.getString("phone"));
   tf5.setText(rs.getString("registeration"));
   tf6.setText(rs.getString("tax_card"));
   tf7.setText(rs.getString("notice"));
  }
     } catch (Exception e) {
     } finally {
         try {
           c.close();
           rs.close();
         } catch (Exception e) {
         }
     }
 }  


class listen implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

      if(e.getSource()==b1){
        try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="update account set name='"+tf1.getText()+"',discreption='"+tf2.getText()+"',address='"+tf3.getText()+"',phone='"+tf4.getText()+"',registeration='"+tf5.getText()+"',tax_card='"+tf6.getText()+"',notice='"+tf7.getText()+"'"; 
          k=c.createStatement();
          k.execute(query);
          JOptionPane.showMessageDialog(null,"تم التعديل بنجاح");
        }
        
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        finally{
            try {
               c.close();
               k.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());        
            }
          }   
      
        
        

      }
            
            
            
            
            
            
            
            
            
            
     if(e.getSource()==b2){
      tf1.setText("");
      tf2.setText("");
      tf3.setText("");
      tf4.setText("");
      tf5.setText("");
      tf6.setText("");
      tf7.setText("");
     }




        }
    
}
 
}
