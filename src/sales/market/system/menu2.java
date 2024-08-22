
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
import java.util.ArrayList;
//import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.JTableHeader;

public class menu2 extends JFrame {
v x=new v();
JPanel p=new JPanel();
JTextField tf1=new JTextField();
JTextField tf2=new JTextField();
JTextField tf3=new JTextField();
JTextField tf4=new JTextField();
JTextField tf5=new JTextField();
/*********************************************************************/
JLabel l=new JLabel();
JLabel l1=new JLabel();
JLabel l2=new JLabel("الكود");
JLabel l3=new JLabel("الاسم");
JLabel l4=new JLabel("الهاتف");
JLabel l5=new JLabel("العنوان");
JLabel l6=new JLabel("الشركة");
JLabel l7=new JLabel("حدث المعلومات الآتية");
JLabel l8=new JLabel();
/*********************************************************************/
JButton b1=new JButton("اضافة");
JButton b2=new JButton("حذف");
JButton b3=new JButton("تحديث");
JButton b4=new JButton("مسح");
JButton b5=new JButton("بحث");
/*********************************************************************/
    Connection c;
    Statement k;
    ResultSet rs;
/*********************************************************************/
    ArrayList<supplier> m1=new ArrayList();
    JTable jt2;
    JTableHeader jth2;
    JScrollPane sp2;
    ListSelectionModel select2;
    String data1[][]=new String[1][5];
    String column1[]={"الكود","الاسم","الهاتف","العنوان","الشركة"};
/*********************************************************************/
ImageIcon add =new ImageIcon(this.getClass().getResource("/add.png"));
ImageIcon delete =new ImageIcon(this.getClass().getResource("/delete.png"));
ImageIcon update =new ImageIcon(this.getClass().getResource("/update.png"));
ImageIcon search =new ImageIcon(this.getClass().getResource("/search.png"));
ImageIcon clear =new ImageIcon(this.getClass().getResource("/clear.png"));
menu2(){
Image ic=new ImageIcon(this.getClass().getResource("/product.png")).getImage();
this.setIconImage(ic);
this.setSize(500,550);
this.setResizable(false);
this.setLocation(500,200);
this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
this.setVisible(true);
this.add(p);
/**************************************************************************/
Color col=new Color(153,204,255);
p.setBackground(col);
p.setLayout(null);
l.setBounds(20,-34, 256,256);
l8.setBounds(150,50, 500,500);
l1.setBounds(200,40, 300,70);
l1.setFont(new Font("Arabic Typesetting",Font.BOLD,65) {});
l2.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
l3.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
l4.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
l5.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
l6.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
l7.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
p.add(l);
p.add(l1);
/**************************************************************************/
b1.setBounds(80,425, 130,30);
b2.setBounds(80,250, 130,30);
b3.setBounds(80,425, 130,30);
b4.setBounds(300,425, 130,30);
b5.setBounds(80,425, 130,30);
b1.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b2.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b3.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b4.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b5.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b1.setBackground(Color.green);
b2.setBackground(Color.blue);
b3.setBackground(Color.gray);
b4.setBackground(Color.red);
b5.setBackground(Color.blue);
b2.setForeground(Color.white);
b3.setForeground(Color.white);
b4.setForeground(Color.white);
b5.setForeground(Color.white);
p.add(b4);
b1.addActionListener(x);
b2.addActionListener(x);
b3.addActionListener(x);
b4.addActionListener(x);
b5.addActionListener(x);
b4.setIcon(clear);
/**************************************************************************/
tf1.setFont(new Font("",Font.BOLD,20) {});
tf2.setFont(new Font("",Font.BOLD,20) {});
tf3.setFont(new Font("",Font.BOLD,20) {});
tf4.setFont(new Font("",Font.BOLD,20) {});
tf5.setFont(new Font("",Font.BOLD,20) {});
/**************************************************************************/

             jt2=new JTable(data1,column1);
             jth2=jt2.getTableHeader();
             jt2.setCellSelectionEnabled(true);  
             select2= jt2.getSelectionModel();  
             jt2.setRowHeight(25);
             select2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
             sp2=new JScrollPane(jt2);
             sp2.setBounds(30,250,430,60);
             jt2.setBackground(Color.white);
             jth2.setBackground(Color.red);
             jth2.setForeground(Color.white);
             jt2.setFont(new Font("",Font.BOLD,15) {});
             jth2.setFont(new Font("Arabic Typesetting",Font.BOLD,24) {});
}    

void addsupplier(){
this.setTitle("اضافة مورد");
ImageIcon i =new ImageIcon(this.getClass().getResource("/addsupplier.png"));
l.setIcon(i);
l1.setText("اضافة مورد");
l1.setForeground(Color.MAGENTA);
l2.setBounds(315,135, 200,100);
l3.setBounds(315,185, 200,100);
l4.setBounds(310,235, 200,100);
l5.setBounds(310,285, 200,100);
l6.setBounds(310,335, 200,100);
tf1.setBounds(80,170, 130,30);
tf2.setBounds(80,220, 130,30);
tf3.setBounds(80,270, 130,30);
tf4.setBounds(80,320, 130,30);
tf5.setBounds(80,370, 130,30);
p.add(b1);
p.add(l2);
p.add(l3);
p.add(l4);
p.add(l5);
p.add(l6);
p.add(tf1);
p.add(tf2);
p.add(tf3);
p.add(tf4);
p.add(tf5);
b1.setIcon(add);
}

void deletesupplier(){
this.setTitle("حذف المورد");
ImageIcon i =new ImageIcon(this.getClass().getResource("/deletesupplier.png"));
l.setIcon(i);
l1.setText("حذف المورد");
l2.setText("ادخل الكود");
l2.setBounds(290,150, 200,100);
tf1.setBounds(80, 185,180,30);
l1.setForeground(Color.red);
this.setSize(500,350);
b4.setBounds(300,250, 130,30);
b2.setBounds(80,250, 130,30);
p.add(b2);
p.add(l2);
p.add(tf1);
b2.setIcon(delete);
}

void updatesupplier(){
this.setTitle("تعديل بيانات المورد");
ImageIcon i =new ImageIcon(this.getClass().getResource("/updatesupplier.png"));
l.setIcon(i);
l1.setText("تعديل بيانات المورد");
l1.setFont(new Font("Arabic Typesetting",Font.BOLD,50) {});
l1.setForeground(Color.gray);
l7.setForeground(Color.gray);
l2.setText("ادخل الكود");
l2.setBounds(300,130, 200,100);
l3.setBounds(315,220, 200,100);
l4.setBounds(310,270, 200,100);
l5.setBounds(310,320, 200,100);
l6.setBounds(310,370, 200,100);
l7.setBounds(160,180, 300,100);
tf1.setBounds(80,165, 130,30);
tf2.setBounds(80,255, 130,30);
tf3.setBounds(80,305, 130,30);
tf4.setBounds(80,355, 130,30);
tf5.setBounds(80,405, 130,30);
b3.setBounds(80,455, 130,30);
b4.setBounds(300,455, 130,30);
p.add(b3);
p.add(l2);
p.add(l3);
p.add(l4);
p.add(l5);
p.add(l6);
p.add(l7);
p.add(tf1);
p.add(tf2);
p.add(tf3);
p.add(tf4);
p.add(tf5);
b3.setIcon(update);
}





public void viewsuppliers(){
ImageIcon i =new ImageIcon(this.getClass().getResource("/view.png"));
l.setIcon(i);
this.setTitle("بحث عن مورد");
l1.setText("بحث عن مورد");
l2.setText("ادخل الكود");
l2.setBounds(280,190 ,190,40);
l1.setForeground(Color.BLUE);
tf1.setBounds(30,190 ,190,30);
b4.setBounds(325,425, 130,30);
b5.setBounds(30,425, 130,30);
p.add(jth2);
p.add(sp2);
p.add(tf1);
p.add(b5);
p.add(l2);
b5.setIcon(search);
}





public void contact(){
ImageIcon i =new ImageIcon(this.getClass().getResource("/email.png"));
l.setIcon(i);  

ImageIcon i1 =new ImageIcon(this.getClass().getResource("/facebook.jpg"));
Image i2 = i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
ImageIcon i3 = new ImageIcon(i2);
l8.setIcon(i3);
this.setTitle("تواصل معي");
l1.setText("تواصل معي");
l1.setForeground(Color.blue);
p.remove(b4);
p.add(l8);
}



class  v implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {


            
            
   if(e.getSource()==b1){
        try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="insert into supplier values ('"+tf1.getText()+"','"+tf2.getText()+"','"+tf3.getText()+"','"+tf4.getText()+"','"+tf5.getText()+"')"; 
          k=c.createStatement();
          k.execute(query);
          JOptionPane.showMessageDialog(null,"تمت الاضافة بنجاح");
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
        try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="delete from supplier where code='"+tf1.getText()+"'"; 
          k=c.createStatement();
          k.execute(query);
          JOptionPane.showMessageDialog(null,"تم الحذف بنجاح");
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
   
   
   




    
    if(e.getSource()==b3){
        try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="update supplier set name='"+tf2.getText()+"',phone='"+tf3.getText()+"',address='"+tf4.getText()+"',company='"+tf5.getText()+"' where code='"+tf1.getText()+"'"; 
          k=c.createStatement();
          k.execute(query);
          JOptionPane.showMessageDialog(null,"تم التحديث بنجاح");
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
    
   
 if(e.getSource()==b4){
 tf1.setText("");
 tf2.setText("");
 tf3.setText("");
 tf4.setText("");
 tf5.setText("");
 }  

 
 
 




if(e.getSource()==b5){
            try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="select code , name , phone , address , company from supplier where code ='"+tf1.getText()+"'"; 
          k=c.createStatement();
          rs=k.executeQuery(query); 
          
          while(rs.next()){
       m1.add(new supplier(rs.getString("code"),rs.getString("name"),rs.getString("phone"),rs.getString("address"),rs.getString("company")));
        }
        for (int i = 0; i <m1.size(); i++) {
         data1[0][0]=m1.get(i).code;
         data1[0][1]=m1.get(i).name;
         data1[0][2]=m1.get(i).phone;
         data1[0][3]=m1.get(i).address;
         data1[0][4]=m1.get(i).company;
        }
      sp2.addNotify();
            } 
            
            catch (SQLException ex) {

            } 
            
            finally {
                try {
                    c.close();
                    rs.close();
                } catch (SQLException ex) {
               
                }
            }
}

 
 


 
            
        }
    }
}
