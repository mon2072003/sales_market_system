
package sales.market.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class menu extends JFrame {
    q z=new q();
    ArrayList<product1> m=new ArrayList();
    JTable jt1;
    JTableHeader jth1;
    JScrollPane sp1;
    ListSelectionModel select1;
    String data[][]=new String[1][5];
    String column[]={"الباركود","الاسم","الكمية","سعر الشراء","سعر البيع"};
    
    ArrayList<admin> m1=new ArrayList();
    JTable jt2;
    JTableHeader jth2;
    JScrollPane sp2;
    ListSelectionModel select2;
    String data1[][]=new String[1][4];
    String column1[]={"رقم الهوية","اسم المستخدم","كلمة المرور","العمر"};
    
    
    
    ArrayList<Sales_history> m2=new ArrayList();
    JTable jt3;
    JTableHeader jth3;
    JScrollPane sp3;
    ListSelectionModel select3;
    String data2[][]=new String[1][6];
    String column2[]={"رقم الفاتورة","الاجمالي","المدفوع","الباقي","التاريخ","الوقت"};    
    


    ArrayList<product2> m3=new ArrayList();
    JTable jt4;
    JTableHeader jth4;
    JScrollPane sp4;
    ListSelectionModel select4;
//    String data3[][]=new String[50][3];
//    String column3[]={"الباركود","الاسم","الكمية"};
    DefaultTableModel dtm=new DefaultTableModel();
    int iterator;
    int indexer;
    
    
    Connection c;
    Statement k;
    ResultSet rs;
    /*************************************************************************/
    JPanel p =new JPanel();
    JLabel l=new JLabel();
    JLabel l1=new JLabel();
    JLabel l2=new JLabel("رقم الهوية");
    JLabel l3=new JLabel("اسم المستخدم");
    JLabel l4=new JLabel("كلمة المرور");
    JLabel l5=new JLabel("العمر");
    JLabel l6=new JLabel("الاسم");
    JLabel l7=new JLabel("الكمية");
    JLabel l8=new JLabel("سعر الشراء");
    JLabel l9=new JLabel("حدث المعلومات الآتية");
    JLabel l10=new JLabel("سيأتي لاحقا");
    JLabel l11=new JLabel("سعر البيع");
    /************************************************************************/
    JButton b1=new JButton("اضافة");
    JButton b2=new JButton("حذف");
    JButton b3=new JButton("تحديث");
    JButton b4=new JButton("ارسال");
    JButton b5=new JButton("مسح");/*equals clear in delete panel*/
    JButton b6=new JButton("تحديث");
    JButton b7=new JButton("اضافة");
    JButton b8=new JButton("حذف");
    JButton b9=new JButton("بحث");
    JButton b10=new JButton("بحث");
    JButton b11=new JButton("تحديث");
    JButton b12=new JButton("استعلام");
    JButton b13=new JButton("خصم");
    JButton b14=new JButton("استعلام");
    JButton b15=new JButton("استعلام");    
    JButton b16=new JButton("استعلام");
    JButton b17=new JButton("استعلام");

//    JButton b12=new JButton("print and save");
//    JButton b13=new JButton("save only");

    /************************************************************************/
    JTextField tf1=new JTextField();
    JTextField tf2=new JTextField();
    JTextField tf3=new JTextField();
    JTextField tf4=new JTextField();
    JTextField tf5=new JTextField();
    
    
ImageIcon add =new ImageIcon(this.getClass().getResource("/add.png"));
ImageIcon delete =new ImageIcon(this.getClass().getResource("/delete.png"));
ImageIcon update =new ImageIcon(this.getClass().getResource("/update.png"));
ImageIcon search =new ImageIcon(this.getClass().getResource("/search.png"));
ImageIcon sales =new ImageIcon(this.getClass().getResource("/sales.png"));
public menu(){

/**********************************************************************************/
Image ic =new ImageIcon(this.getClass().getResource("/product.png")).getImage();
ImageIcon clear =new ImageIcon(this.getClass().getResource("/clear.png"));
this.setIconImage(ic);
this.setSize(500,500);
this.setResizable(false);
this.setLocation(500,200);
this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
this.setVisible(true);
Color col=new Color(153,204,255);
p.setBackground(col);
p.setLayout(null);
l.setBounds(200,40, 300,70);
l1.setBounds(20,-30, 256,256);
l9.setBounds(160,180, 300,100);
b1.setBounds(80,400, 130,30);
b2.setBounds(80,400, 130,30);
b3.setBounds(80,400, 130,30);
b4.setBounds(80,400, 130,30);
b5.setBounds(300,400, 130,30);
b6.setBounds(80,460, 130,30);
b9.setBounds(40,400, 130,30);
b10.setBounds(40,400, 130,30);
b11.setBounds(80,400, 130,30);
b12.setBounds(40,400, 130,30);
b13.setBounds(40,400, 130,30);
b14.setBounds(40,400, 130,30);
b15.setBounds(160,400, 150,35);
b16.setBounds(40,400, 130,30);
b17.setBounds(40,400, 130,30);

//b12.setBounds(40,400, 200,30);
//b13.setBounds(260,400,200,30);
l.setFont(new Font("Arabic Typesetting",Font.BOLD,50) {});
l2.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
l3.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
l4.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
l5.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
l6.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
l7.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
l8.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
l9.setFont(new Font("Arabic Typesetting",Font.BOLD,47) {});
l11.setFont(new Font("Arabic Typesetting",Font.BOLD,47) {});
b1.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b2.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b3.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b4.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b5.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b6.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b7.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b8.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b9.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b10.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b11.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b12.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b13.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b14.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b15.setFont(new Font("Arabic Typesetting",Font.BOLD,30) {});
b16.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b17.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});

//b12.setFont(new Font("Haettenschweiler",Font.ITALIC,25) {});
//b13.setFont(new Font("Haettenschweiler",Font.ITALIC,25) {});
tf1.setFont(new Font("",Font.BOLD,20) {});
tf2.setFont(new Font("",Font.BOLD,20) {});
tf3.setFont(new Font("",Font.BOLD,20) {});
tf4.setFont(new Font("",Font.BOLD,20) {});
tf5.setFont(new Font("",Font.BOLD,20) {});
b1.setBackground(Color.green);
b2.setBackground(Color.blue);
b3.setBackground(Color.gray);
b4.setBackground(Color.green);
b5.setBackground(Color.red);
b7.setBackground(Color.green);
b8.setBackground(Color.blue);
b9.setBackground(Color.blue);
b10.setBackground(Color.blue);
b11.setBackground(Color.gray);
b12.setBackground(Color.YELLOW);
b13.setBackground(Color.blue);
b14.setBackground(Color.YELLOW);
b15.setBackground(Color.gray);
b16.setBackground(Color.YELLOW);
b17.setBackground(Color.YELLOW);

//b12.setBackground(Color.green);
//b13.setBackground(Color.gray);
l9.setForeground(Color.gray);
b2.setForeground(Color.white);
b3.setForeground(Color.white);
b5.setForeground(Color.white);
b6.setForeground(Color.white);
b6.setBackground(Color.gray);
b8.setForeground(Color.white);
b9.setForeground(Color.white);
b10.setForeground(Color.white);
b11.setForeground(Color.white);
b13.setForeground(Color.white);
b15.setForeground(Color.white);

b5.setIcon(clear);

this.add(l);
this.add(l1);
this.add(p);
p.add(b5);
b5.addActionListener(z);
/**********************************************************************/

             jt1=new JTable(data,column);
             jth1=jt1.getTableHeader();
             jt1.setCellSelectionEnabled(true);  
             select1= jt1.getSelectionModel();  
             jt1.setRowHeight(25);
             select1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
             sp1=new JScrollPane(jt1);
             sp1.setBounds(40,250,400,60);
             jt1.setBackground(Color.white);
             jth1.setBackground(Color.red);
             jth1.setForeground(Color.white);
             jt1.setFont(new Font("",Font.BOLD,15) {});
             jth1.setFont(new Font("Arabic Typesetting",Font.BOLD,24) {});
/***********************************************************************/

             jt2=new JTable(data1,column1);
             jth2=jt2.getTableHeader();
             jt2.setCellSelectionEnabled(true);  
             select2= jt2.getSelectionModel();  
             jt2.setRowHeight(25);
             select2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
             sp2=new JScrollPane(jt2);
             sp2.setBounds(40,250,400,60);
             jt2.setBackground(Color.white);
             jth2.setBackground(Color.red);
             jth2.setForeground(Color.white);
             jt2.setFont(new Font("",Font.BOLD,15) {});
             jth2.setFont(new Font("Arabic Typesetting",Font.BOLD,24) {});
/***********************************************************************/

             jt3=new JTable(data2,column2);
             jth3=jt3.getTableHeader();
             jt3.setCellSelectionEnabled(true);  
             select3= jt3.getSelectionModel();  
             jt3.setRowHeight(25);
             select3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
             sp3=new JScrollPane(jt3);
             sp3.setBounds(40,250,400,60);
             jt3.setBackground(Color.white);
             jth3.setBackground(Color.red);
             jth3.setForeground(Color.white);
             jt3.setFont(new Font("",Font.BOLD,15) {});
             jth3.setFont(new Font("Arabic Typesetting",Font.BOLD,24) {});
/**********************************************************************/

             jt4=new JTable(dtm);
             dtm.addColumn("الباركود");
             dtm.addColumn("الاسم");
             dtm.addColumn("الكمية");
             jth4=jt4.getTableHeader();
             jt4.setCellSelectionEnabled(true);  
             select4= jt4.getSelectionModel();  
             jt4.setRowHeight(25);
             select4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
             sp4=new JScrollPane(jt4);
             sp4.setBounds(40,200,400,180);
             jt4.setBackground(Color.white);
             jth4.setBackground(Color.red);
             jth4.setForeground(Color.white);
             jt4.setFont(new Font("",Font.BOLD,15) {});
             jth4.setFont(new Font("Arabic Typesetting",Font.BOLD,24) {});
}
public void changetheme(){
ImageIcon i =new ImageIcon(this.getClass().getResource("/theme.png"));
l1.setIcon(i);
this.setTitle("تغيير الثيم");
l.setText("تغيير الثيم");
l.setForeground(Color.gray); 
p.remove(b5);
l10.setBounds(160, 200, 200,40);
l10.setFont(new Font("Arabic Typesetting",Font.BOLD,47) {});
l10.setForeground(Color.red);
p.add(l10);

} 
public void changefont(){
ImageIcon i =new ImageIcon(this.getClass().getResource("/font.png"));
l1.setIcon(i);
this.setTitle("تغيير الخط");
l.setText("تغيير الخط");
p.remove(b5);
l10.setBounds(160, 200, 200,40);
l10.setFont(new Font("Arabic Typesetting",Font.BOLD,47) {});
l10.setForeground(Color.red);
p.add(l10);
}
public void addadmin(){
ImageIcon i =new ImageIcon(this.getClass().getResource("/addadmin.png"));
l1.setIcon(i);
this.setTitle("اضافة عامل");
l.setText("اضافة عامل");
l.setForeground(Color.MAGENTA);
l2.setBounds(310,150, 200,100);
l3.setBounds(300,200, 200,100);
l4.setBounds(310,250, 200,100);
l5.setBounds(340,300, 200,100);
tf1.setBounds(80,185, 130,30);
tf2.setBounds(80,235, 130,30);
tf3.setBounds(80,285, 130,30);
tf4.setBounds(80,335, 130,30);
//tf5.setBounds(300,385, 130,30);
p.add(l2);
p.add(l3);
p.add(l4);
p.add(l5);
p.add(b1);
p.add(tf1);
p.add(tf2);
p.add(tf3);
p.add(tf4);
b1.addActionListener(z);
b1.setIcon(add);
}
public void deleteadmin(){
ImageIcon i =new ImageIcon(this.getClass().getResource("/deleteadmin.png"));
l1.setIcon(i);
this.setTitle("طرد عامل");
l.setText("طرد عامل");
l2.setText("ادخل رقم الهوية");
l.setForeground(Color.red); 
//b5.setText("clear");
l2.setBounds(280,150, 200,100);
tf1.setBounds(90, 185,160,30);
this.setSize(500,350);
b2.setBounds(90,250, 130,30);
b5.setBounds(300,250, 130,30);
p.add(l2);
p.add(b2);
p.add(tf1);
b2.addActionListener(z);
b2.setIcon(delete);
}
public void updateadmininfo(){
ImageIcon i =new ImageIcon(this.getClass().getResource("/updateinfo.png"));
l1.setIcon(i);
this.setTitle("تعديل بيانات العامل");
l.setText("تعديل بيانات");
l2.setText("ادخل رقم الهوية");
l2.setBounds(280,130, 200,100);
l3.setBounds(290,220, 200,100);
l4.setBounds(305,270, 200,100);
l5.setBounds(340,320, 200,100);
tf1.setBounds(80,165, 130,30);
tf2.setBounds(80,255, 130,30);
tf3.setBounds(80,305, 130,30);
tf4.setBounds(80,355, 130,30);
l.setForeground(Color.gray);
p.add(l2);
p.add(l3);
p.add(l4);
p.add(l5);
p.add(l9);
p.add(b3);
p.add(tf1);
p.add(tf2);
p.add(tf3);
p.add(tf4);
b3.addActionListener(z);
b3.setIcon(update);
}
public void addproduct(){
ImageIcon i =new ImageIcon(this.getClass().getResource("/addproduct.png"));
l1.setIcon(i);
this.setTitle("اضافة صنف");
this.setSize(500,570);
l.setText("اضافة صنف");
l2.setBounds(305,150, 200,100);
l6.setBounds(315,200, 200,100);
l7.setBounds(315,250, 200,100);
l8.setBounds(305,300, 200,100);
l11.setBounds(315,350, 200,100);
b5.setBounds(300,450, 130,30);
b7.setBounds(60,450, 130,30);
tf1.setBounds(60,185, 130,30);
tf2.setBounds(60,235, 130,30);
tf3.setBounds(60,285, 130,30);
tf4.setBounds(60,335, 130,30);
tf5.setBounds(60,385, 130,30);
l.setForeground(Color.magenta);
l2.setText("الباركود");
p.add(l2);
p.add(l6);
p.add(l7);
p.add(l8);
p.add(l11);
p.add(b7);
p.add(tf1);
p.add(tf2);
p.add(tf3);
p.add(tf4);
p.add(tf5);
b7.addActionListener(z);
b7.setIcon(add);
}
public void deleteproduct(){
ImageIcon i =new ImageIcon(this.getClass().getResource("/deleteproduct.png"));
l1.setIcon(i);
this.setTitle("حذف الصنف");
l.setText("حذف الصنف");
l2.setText("ادخل الباركود");
//b5.setText("clear");
this.setSize(500,350);
l.setForeground(Color.red);
l2.setBounds(280,150, 200,100);
b8.setBounds(50,250, 130,30);
b5.setBounds(300,250, 130,30);
tf1.setBounds(50, 185,180,30);
p.add(l2);
p.add(b8);
p.add(tf1);
b8.addActionListener(z);
b8.setIcon(delete);
} 
public void updateproduct(){
ImageIcon i =new ImageIcon(this.getClass().getResource("/updateproduct.png"));
l1.setIcon(i);
this.setTitle("تعديل بيانات الصنف");
this.setSize(500,570);
l.setText("تعديل بيانات المنتج");
l2.setText("ادخل الباركود");
l.setForeground(Color.gray);
l2.setBounds(280,130, 200,100);
l6.setBounds(320,220, 200,100);
l7.setBounds(320,270, 200,100);
l8.setBounds(310,320, 200,100);
l11.setBounds(320,370, 200,100);
tf1.setBounds(80,165, 130,30);
tf2.setBounds(80,255, 130,30);
tf3.setBounds(80,305, 130,30);
tf4.setBounds(80,355, 130,30);
tf5.setBounds(80,405, 130,30);
b5.setBounds(300,460, 130,30);
p.add(l2);
p.add(l6);
p.add(l7);
p.add(l8);
p.add(l9);
p.add(l11);
p.add(b6);
p.add(tf1);
p.add(tf2);
p.add(tf3);
p.add(tf4);
p.add(tf5);
b6.addActionListener(z);
b6.setIcon(update);
}

public void forproducts(){
ImageIcon i =new ImageIcon(this.getClass().getResource("/search(1).png"));
l1.setIcon(i);    
this.setTitle("بحث عن الصنف");
l.setText("بحث");
l2.setText("ادخل الباركود");
l.setForeground(Color.blue);
l2.setBounds(270,155 ,190,100);
tf1.setBounds(40,190 ,190,30);
b5.setBounds(310,400, 130,30);
p.add(jth1);
p.add(sp1);
p.add(l2);
p.add(tf1);
p.add(b9);
b9.addActionListener(z);
b9.setIcon(search);
}

public void foradmin(){
ImageIcon i =new ImageIcon(this.getClass().getResource("/search(2).png"));
l1.setIcon(i);    
this.setTitle("بحث عن العامل");
l.setText("بحث");
l2.setText("ادخل رقم الهوية");
l2.setBounds(250,155 ,190,100);
tf1.setBounds(40,190 ,190,30);
b5.setBounds(310,400, 130,30);
Color x=new Color(0,160,0);
l.setForeground(x);
p.add(jth2);
p.add(sp2);
p.add(l2);
p.add(tf1);
p.add(b10);
b10.addActionListener(z);
b10.setIcon(search);
}

public void sales_history(){
ImageIcon i =new ImageIcon(this.getClass().getResource("/history.png"));
l1.setIcon(i);    
this.setTitle("تاريخ المبيعات");
l.setText("المبيعات");
Color y=new Color(30,140,70);
l.setForeground(y);
l2.setFont(new Font("Arabic Typesetting",Font.BOLD,40) {});
l2.setText("ادخل رقم الفاتورة");
l2.setBounds(250,155 ,190,100);
tf1.setBounds(40,190 ,190,30);
b5.setBounds(310,400, 130,30);
//p.remove(b5);
//l10.setText("سيأتي قريبا");
//l10.setBounds(180, 200, 280,40);
//l10.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
//l10.setForeground(Color.red);
//p.add(l10);
p.add(l2);
p.add(tf1);
p.add(jth3);
p.add(sp3);
p.add(b12);
b12.addActionListener(z);
b12.setIcon(search);
}





public void purchases_history(){
ImageIcon i =new ImageIcon(this.getClass().getResource("/history.png"));
l1.setIcon(i);    
this.setTitle("تاريخ المشتريات");
l.setText("المشتريات");
Color y=new Color(30,140,70);
l.setForeground(y);
l2.setFont(new Font("Arabic Typesetting",Font.BOLD,40) {});
l2.setText("ادخل رقم الفاتورة");
l2.setBounds(250,155 ,190,100);
tf1.setBounds(40,190 ,190,30);
b5.setBounds(310,400, 130,30);
//p.remove(b5);
//l10.setText("سيأتي قريبا");
//l10.setBounds(180, 200, 280,40);
//l10.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
//l10.setForeground(Color.red);
//p.add(l10);
p.setBackground(new Color(200,200,100));
p.add(l2);
p.add(tf1);
p.add(jth3);
p.add(sp3);
p.add(b16);
b16.addActionListener(z);
b16.setIcon(search);
}





public void sales_return(){
ImageIcon i =new ImageIcon(this.getClass().getResource("/history.png"));
l1.setIcon(i);    
this.setTitle("تاريخ مرتجعات البيع");
l.setText("مرتجعات البيع");
Color y=new Color(30,140,70);
l.setForeground(y);
l2.setFont(new Font("Arabic Typesetting",Font.BOLD,40) {});
l2.setText("ادخل رقم الفاتورة");
l2.setBounds(250,155 ,190,100);
tf1.setBounds(40,190 ,190,30);
b5.setBounds(310,400, 130,30);
//p.remove(b5);
//l10.setText("سيأتي قريبا");
//l10.setBounds(180, 200, 280,40);
//l10.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
//l10.setForeground(Color.red);
//p.add(l10);
p.setBackground(new Color(255,204,153));
p.add(l2);
p.add(tf1);
p.add(jth3);
p.add(sp3);
p.add(b14);
b14.addActionListener(z);
b14.setIcon(search);
}




public void purchases_return(){
ImageIcon i =new ImageIcon(this.getClass().getResource("/history.png"));
l1.setIcon(i);    
this.setTitle("تاريخ مرتجعات الشراء");
l.setText("مرتجعات الشراء");
Color y=new Color(30,140,70);
l.setForeground(y);
l2.setFont(new Font("Arabic Typesetting",Font.BOLD,40) {});
l2.setText("ادخل رقم الفاتورة");
l2.setBounds(250,155 ,190,100);
tf1.setBounds(40,190 ,190,30);
b5.setBounds(310,400, 130,30);
//p.remove(b5);
//l10.setText("سيأتي قريبا");
//l10.setBounds(180, 200, 280,40);
//l10.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
//l10.setForeground(Color.red);
//p.add(l10);
p.setBackground(new Color(177,234,155));
p.add(l2);
p.add(tf1);
p.add(jth3);
p.add(sp3);
p.add(b17);
b17.addActionListener(z);
b17.setIcon(search);
}





public void updatemanagerinfo(){
ImageIcon i =new ImageIcon(this.getClass().getResource("/alert.png"));
l1.setIcon(i); 
this.setTitle("تعديل بيانات المدير");
l.setBounds(190,40, 300,70);
l.setText("تنبيه كن حذرا");
l.setForeground(Color.red);

l2.setText("ادخل رقم الهوية");
l2.setBounds(270,130, 200,100);
l3.setBounds(280,220, 200,100);
l4.setBounds(290,270, 200,100);
l5.setBounds(330,320, 200,100);
tf1.setBounds(80,165, 130,30);
tf2.setBounds(80,255, 130,30);
tf3.setBounds(80,305, 130,30);
tf4.setBounds(80,355, 130,30);
p.add(l2);
p.add(l3);
p.add(l4);
p.add(l5);
p.add(l9);
p.add(b11);
p.add(tf1);
p.add(tf2);
p.add(tf3);
p.add(tf4);
b11.addActionListener(z);
b11.setIcon(update);
}

public void sales(){
ImageIcon i =new ImageIcon(this.getClass().getResource("/sale.png"));
l1.setIcon(i); 
this.setTitle("عروض و خصومات");
l.setBounds(190,40, 300,70);
l.setText("عروض و خصومات");
l2.setText("الباركود");
l3.setText("قيمة الخصم");
tf1.setBounds(40,200,200,30);
tf2.setBounds(40,280,200,30);
l2.setBounds(300, 190, 200, 50);
l3.setBounds(290, 270, 200, 50);
l.setForeground(Color.red);
p.add(l2);
p.add(l3);
p.add(b13);
p.add(tf1);
p.add(tf2);
b13.addActionListener(z);
b13.setIcon(sales);
}




public void shortfalls(){
 ImageIcon i =new ImageIcon(this.getClass().getResource("/package.png"));
 l1.setIcon(i); 
 l.setBounds(270,40, 300,70);
 l.setText("نواقص");
 l.setForeground(Color.blue);
 p.remove(b5);
 p.add(b15);
 b15.addActionListener(z);
 b15.setIcon(search);
 this.setTitle("نواقص");
/*******************************************************************************/
p.add(jth4);
p.add(sp4);




}





    class q implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
   if (e.getSource()==b5){
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
        tf5.setText("");
    }
   
   
   if(e.getSource()==b1){
        try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="insert into admin values ('"+tf1.getText()+"','"+tf2.getText()+"','"+tf3.getText()+"','"+tf4.getText()+"')"; 
          k=c.createStatement();
          k.execute(query);
          JOptionPane.showMessageDialog(null,"اضيف بنجاح");
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
          String query="delete from admin where id='"+tf1.getText()+"'"; 
          k=c.createStatement();
          k.execute(query);
          JOptionPane.showMessageDialog(null,"تم المسح بنجاح");
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
          String query="update admin set username='"+tf2.getText()+"',password='"+tf3.getText()+"',age='"+tf4.getText()+"' where id='"+tf1.getText()+"'"; 
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
    
   
    
    if(e.getSource()==b6){
        try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="update product set name='"+tf2.getText()+"',quantity='"+tf3.getText()+"',cost='"+tf4.getText()+"',price='"+tf5.getText()+"' where id='"+tf1.getText()+"'"; 
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
    
    
    if(e.getSource()==b7){
        try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="insert into product values ('"+tf1.getText()+"','"+tf2.getText()+"','"+tf3.getText()+"','"+tf4.getText()+"','"+tf5.getText()+"')"; 
          k=c.createStatement();
          k.execute(query);
          JOptionPane.showMessageDialog(null,"اضيف بنجاح");
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
    
    
    if(e.getSource()==b8){
        try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="delete from product where id='"+tf1.getText()+"'"; 
          k=c.createStatement();
          k.execute(query);
          JOptionPane.showMessageDialog(null,"تم المسح بنجاح");
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
   
    
    
            if (e.getSource()==b9){
            try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="select id , name , quantity , cost, price from product where id ='"+tf1.getText()+"'"; 
          k=c.createStatement();
          rs=k.executeQuery(query); 
          
          while(rs.next()){
       m.add(new product1(rs.getString("id"),rs.getString("name"),rs.getString("quantity"),rs.getString("cost"),rs.getString("price")));
        }
        for (int i = 0; i <m.size(); i++) {
         data[0][0]=m.get(i).id;
         data[0][1]=m.get(i).name;
         data[0][2]=m.get(i).quantity;
         data[0][3]=m.get(i).cost;
         data[0][4]=m.get(i).price;
        }
         sp1.addNotify();
         if(data[0][0] == null ? tf1.getText() != null : !data[0][0].equals(tf1.getText())){
          JOptionPane.showMessageDialog(null,"هذا الصنف غير مدرج في قاعدة البيانات");
         }
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
    
    
    
    
        if(e.getSource()==b8){
        try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="delete from product where id='"+tf1.getText()+"'"; 
          k=c.createStatement();
          k.execute(query);
          JOptionPane.showMessageDialog(null,"تم المسح بنجاح");
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
   
    
    
            if (e.getSource()==b10){
            try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="select id , username , password , age from admin where id ='"+tf1.getText()+"'"; 
          k=c.createStatement();
          rs=k.executeQuery(query); 
          
          while(rs.next()){
       m1.add(new admin(rs.getString("id"),rs.getString("username"),rs.getString("password"),rs.getString("age")));
        }
        for (int i = 0; i <m1.size(); i++) {
         data1[0][0]=m1.get(i).id;
         data1[0][1]=m1.get(i).username;
         data1[0][2]=m1.get(i).password;
         data1[0][3]=m1.get(i).age;
        }
      sp2.addNotify();
      if( data1[0][0] == null ? tf1.getText() != null : !data1[0][0].equals(tf1.getText())){
         JOptionPane.showMessageDialog(null,"هذا العامل غير موجود في قاعدة البيانات");
      }
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
    
            
    
            
    if(e.getSource()==b11){
        try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="update manager set username='"+tf2.getText()+"',password='"+tf3.getText()+"',age='"+tf4.getText()+"' where id='"+tf1.getText()+"'"; 
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
            
            

    
    
    
    
    
            if (e.getSource()==b12){
            try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="select bill_num , total , payed , remainder , date , time from sales_history where bill_num ='"+tf1.getText()+"'"; 
          k=c.createStatement();
          rs=k.executeQuery(query); 
          
          while(rs.next()){
       m2.add(new Sales_history(rs.getString("bill_num"),rs.getString("total"),rs.getString("payed"),rs.getString("remainder"),rs.getString("date"),rs.getString("time")));
        }
        for (int i = 0; i <m2.size(); i++) {
         data2[0][0]=m2.get(i).bill_id;
         data2[0][1]=m2.get(i).total;
         data2[0][2]=m2.get(i).payed;
         data2[0][3]=m2.get(i).remainder;
         data2[0][4]=m2.get(i).date;
         data2[0][5]=m2.get(i).time;
        }
      sp3.addNotify();
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
    
    

            
            
            

        if(e.getSource()==b13){
        try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="update product set price=(price-"+tf2.getText()+") where id='"+tf1.getText()+"'"; 
          k=c.createStatement();
          k.execute(query);
          JOptionPane.showMessageDialog(null,"تم الخصم بنجاح");
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
            

        
        
        
        
        
        
        
        
            if (e.getSource()==b14){
            try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="select bill_num , total , payed , remainder , date , time from sales_return_history where bill_num ='"+tf1.getText()+"'"; 
          k=c.createStatement();
          rs=k.executeQuery(query); 
          
          while(rs.next()){
       m2.add(new Sales_history(rs.getString("bill_num"),rs.getString("total"),rs.getString("payed"),rs.getString("remainder"),rs.getString("date"),rs.getString("time")));
        }
        for (int i = 0; i <m2.size(); i++) {
         data2[0][0]=m2.get(i).bill_id;
         data2[0][1]=m2.get(i).total;
         data2[0][2]=m2.get(i).payed;
         data2[0][3]=m2.get(i).remainder;
         data2[0][4]=m2.get(i).date;
         data2[0][5]=m2.get(i).time;
        }
      sp3.addNotify();
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
        
        
        
        
        if(e.getSource()==b15){

            iterator=0;
            m3.removeAll(m3);
            dtm.setRowCount(0);
//            sp4.addNotify();
     try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="select id , name , quantity  from product where quantity = 0"; 
          k=c.createStatement();
          rs=k.executeQuery(query);  
     while(rs.next()){
       m3.add(new product2(rs.getString("id"),rs.getString("name"),rs.getString("quantity")));  
       dtm.addRow(new Object[]{m3.get(iterator).id,m3.get(iterator).name,m3.get(iterator).quantity});  
       iterator++; 
     }
 

            
  
     } catch (Exception ex) {
     }
     finally {
         try {
           c.close();
           rs.close();
         } catch (Exception ex) {  
       }
     }

       
            

        
        
        }
        

        
        
        
        
        


            if (e.getSource()==b16){
            try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="select bill_num , total , payed , remainder , date , time from purchases_history where bill_num ='"+tf1.getText()+"'"; 
          k=c.createStatement();
          rs=k.executeQuery(query); 
          
          while(rs.next()){
       m2.add(new Sales_history(rs.getString("bill_num"),rs.getString("total"),rs.getString("payed"),rs.getString("remainder"),rs.getString("date"),rs.getString("time")));
        }
        for (int i = 0; i <m2.size(); i++) {
         data2[0][0]=m2.get(i).bill_id;
         data2[0][1]=m2.get(i).total;
         data2[0][2]=m2.get(i).payed;
         data2[0][3]=m2.get(i).remainder;
         data2[0][4]=m2.get(i).date;
         data2[0][5]=m2.get(i).time;
        }
      sp3.addNotify();
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
        
        
        

            
            
            
            
            
            if (e.getSource()==b17){
            try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="select bill_num , total , payed , remainder , date , time from purchases_return_history where bill_num ='"+tf1.getText()+"'"; 
          k=c.createStatement();
          rs=k.executeQuery(query); 
          
          while(rs.next()){
       m2.add(new Sales_history(rs.getString("bill_num"),rs.getString("total"),rs.getString("payed"),rs.getString("remainder"),rs.getString("date"),rs.getString("time")));
        }
        for (int i = 0; i <m2.size(); i++) {
         data2[0][0]=m2.get(i).bill_id;
         data2[0][1]=m2.get(i).total;
         data2[0][2]=m2.get(i).payed;
         data2[0][3]=m2.get(i).remainder;
         data2[0][4]=m2.get(i).date;
         data2[0][5]=m2.get(i).time;
        }
      sp3.addNotify();
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

