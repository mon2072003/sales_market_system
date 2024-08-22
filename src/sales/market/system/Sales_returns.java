
package sales.market.system;

import java.sql.Connection;
import java.sql.ResultSet;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Statement;
import java.sql.DriverManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;




public class Sales_returns extends JPanel{
    Connection c;
    Statement k;
    ResultSet rs;
    ArrayList<product> z=new ArrayList();
    ArrayList<safe1> safe=new ArrayList();
    JTextArea area=new JTextArea();
    JTextArea area2=new JTextArea();
    JTable jt;
    JTableHeader jth;
    JScrollPane sp;
    JScrollPane sp1;
    JScrollPane sp2;
    ListSelectionModel select;
    DefaultTableModel dtm=new DefaultTableModel();
    int n=0;
    int i;
    int index;
    float selection;
    float d=0;
    float in=0;
    float out=0;
//    int x;
//    int h;
    int remainders;
    int prints;
    Sales_returns.v a=new Sales_returns.v();
    Sales_returns.v1 a1=new Sales_returns.v1();
    int bill=0;
    Random rand=new Random();
/**********************************date**************************************/
 LocalDateTime now=LocalDateTime.now();
 DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yy");
 DateTimeFormatter f1 = DateTimeFormatter.ofPattern("HH:mm");
/**************************text field****************************************/
    JTextField tf1=new JTextField();
    JTextField tf2=new JTextField("1");
    JTextField tf3=new JTextField("0.0");
    JTextField tf4=new JTextField();
    JTextField tf5=new JTextField("0.0");
/*****************************label******************************************/
    JLabel l1=new JLabel("الباركود");
    JLabel l2=new JLabel("الكمية");
    JLabel l3=new JLabel("مرتجعات البيع");
    JLabel l4=new JLabel("الإجمالي");
    JLabel l5=new JLabel("التاريخ :"+now.format(f));
    JLabel l6=new JLabel("المدفوع");
    JLabel l7=new JLabel("الباقي");
    JLabel l8=new JLabel("الفاتورة");
    JLabel l9=new JLabel("powered by Eng / Mina Ezzat");
    JLabel l10=new JLabel("ملاحظة");
    JLabel l11=new JLabel("الخزينة");
/***************************buttons******************************************/    
    JButton b1=new JButton("اضافة");
    JButton b2=new JButton("حذف");
    JButton b3=new JButton("طباعة");
    JButton b4=new JButton("جديد");
    /*************menu buttons********************/
    JMenuItem b5=new JMenuItem("تغيير الثيم ");
    JMenuItem b6=new JMenuItem("تغيير الخط");
    JMenuItem b7=new JMenuItem("اضافة عامل");
    JMenuItem b8=new JMenuItem("طرد عامل");
    JMenuItem b9=new JMenuItem("تحديث بيانات العامل");
    JMenuItem b10=new JMenuItem("اضافة صنف");
    JMenuItem b11=new JMenuItem("حذف الصنف");
    JMenuItem b12=new JMenuItem("تعديل الصنف");
    JMenuItem b13=new JMenuItem("تسجيل الخروج");
    
    JMenuItem b14=new JMenuItem("عن الصنف");
    JMenuItem b15=new JMenuItem("عن العامل");
    JMenuItem b16=new JMenuItem("المبيعات");
    JMenuItem b17=new JMenuItem("تعديل بيانات المدير");
    JMenuItem b18=new JMenuItem("احصل على الباقي");
    /********************************************/
    JMenuItem b19=new JMenuItem("اضافة موردين");
    JMenuItem b20=new JMenuItem("حذف المورد");
    JMenuItem b21=new JMenuItem("تعديل بيانات المورد");
    JMenuItem b22=new JMenuItem("عن المورد");
    JMenuItem b23=new JMenuItem("الآلة الحاسبة");
    JMenuItem b24=new JMenuItem("تواصل معي");
    JMenuItem b25=new JMenuItem("انشاء حساب");
    JMenuItem b26=new JMenuItem("عروض و خصومات");
    JMenuItem b27=new JMenuItem("مرتجعات البيع");
    JMenuItem b28=new JMenuItem("الخزينة");
    JMenuItem b29=new JMenuItem("نواقص");
    JMenuItem b30=new JMenuItem("مشتريات");
    JMenuItem b31=new JMenuItem("مرتجعات الشراء");
/*****************************menu bar******************************************/
    JMenu m1=new JMenu("اعدادات");
    JMenu m2=new JMenu("العمال");
    JMenu m3=new JMenu("الاصناف");
    JMenu m4=new JMenu("تسجيل خروج");
    JMenu m5=new JMenu("بحث");
    JMenu m6=new JMenu("التاريخ");
    JMenu m7=new JMenu("المدير");
    JMenu m8=new JMenu("المورد");
    JMenu m9=new JMenu("احصائيات");
    JMenu m10=new JMenu("تواصل");
    JMenuBar mb1=new JMenuBar();
/*****************************ComboBox******************************************/
    JComboBox combo=new JComboBox();
/*******************************************************************************/
    ButtonGroup bg=new ButtonGroup();
    JRadioButton rb1=new JRadioButton("كاش");
    JRadioButton rb2=new JRadioButton("فيزا");
public  Sales_returns() { 
this.setName("مرتجعات البيع");
this.setLayout(null);
Color col=new Color(255,204,153);
this.setBackground(col);
/*****************************icon*******************************************/
ImageIcon icon =new ImageIcon(this.getClass().getResource("/product-return.png"));
JLabel im=new JLabel(icon);
im.setBounds(40, 40, 265, 265);
this.add(im);
/****************************buttons*****************************************/
b1.setBounds(150,600,130,35);
b2.setBounds(300,600,130,35);
b3.setBounds(450,600,130,35);
b4.setBounds(600,600,130,35);
b18.setBounds(860,550,150,35);
b1.setBackground(Color.green);
b2.setBackground(Color.red);
b3.setBackground(Color.blue);
b4.setBackground(Color.black);
b18.setBackground(Color.GRAY);
b2.setForeground(Color.white);
b3.setForeground(Color.white);
b4.setForeground(Color.white);
b18.setForeground(Color.white);


ImageIcon add =new ImageIcon(this.getClass().getResource("/add.png"));
ImageIcon subtract =new ImageIcon(this.getClass().getResource("/subtract.png"));
ImageIcon print =new ImageIcon(this.getClass().getResource("/printer.png"));
ImageIcon clear =new ImageIcon(this.getClass().getResource("/new.png"));
ImageIcon money =new ImageIcon(this.getClass().getResource("/money.png"));
b1.setIcon(add);
b2.setIcon(subtract);
b3.setIcon(print);
b4.setIcon(clear);
b18.setIcon(money);


b1.setFont(new Font("Arabic Typesetting",Font.BOLD,30) {});
b2.setFont(new Font("Arabic Typesetting",Font.BOLD,30) {});
b3.setFont(new Font("Arabic Typesetting",Font.BOLD,30) {});
b4.setFont(new Font("Arabic Typesetting",Font.BOLD,30) {});
b18.setFont(new Font("Arabic Typesetting",Font.BOLD,22) {});
this.add(b1);
this.add(b2);
this.add(b3);
this.add(b4);
this.add(b18);

/**********************************menu*************************************/
//m1.setBounds(20,0,100,50);
//m2.setBounds(80,0,100,50);
//m3.setBounds(170,0,100,50);
//m4.setBounds(260,0,100,50);
m1.setForeground(Color.white);
m2.setForeground(Color.white);
m3.setForeground(Color.white);
m4.setForeground(Color.white);
m5.setForeground(Color.white);
m6.setForeground(Color.white);
m7.setForeground(Color.white);
m8.setForeground(Color.white);
m9.setForeground(Color.white);
m10.setForeground(Color.white);

ImageIcon settings =new ImageIcon(this.getClass().getResource("/settings.png"));
ImageIcon employee =new ImageIcon(this.getClass().getResource("/employee.png"));
ImageIcon products =new ImageIcon(this.getClass().getResource("/products.png"));
ImageIcon logout =new ImageIcon(this.getClass().getResource("/switch.png"));
ImageIcon search =new ImageIcon(this.getClass().getResource("/search.png"));
ImageIcon history =new ImageIcon(this.getClass().getResource("/history1.png"));
ImageIcon manager =new ImageIcon(this.getClass().getResource("/manager.png"));
ImageIcon supplier =new ImageIcon(this.getClass().getResource("/supplier.png"));
ImageIcon stats =new ImageIcon(this.getClass().getResource("/stats.png"));
ImageIcon contact =new ImageIcon(this.getClass().getResource("/contact.png"));
m1.setIcon(settings);
m2.setIcon(employee);
m3.setIcon(products);
m4.setIcon(logout);
m5.setIcon(search);
m6.setIcon(history);
m7.setIcon(manager);
m8.setIcon(supplier);
m9.setIcon(stats);
m10.setIcon(contact);

m1.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
m2.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
m3.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
m4.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
m5.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
m6.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
m7.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
m8.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
m9.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
m10.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
/********************menu buttons*******************************/
b5.setBackground(Color.white);
b6.setBackground(Color.white);
b7.setBackground(Color.white);
b8.setBackground(Color.white);
b9.setBackground(Color.white);
b10.setBackground(Color.white);
b11.setBackground(Color.white);
b12.setBackground(Color.white);
b13.setBackground(Color.white);
b14.setBackground(Color.white);
b15.setBackground(Color.white);
b16.setBackground(Color.white);
b17.setBackground(Color.white);
b19.setBackground(Color.white);
b20.setBackground(Color.white);
b21.setBackground(Color.white);
b22.setBackground(Color.white);
b23.setBackground(Color.white);
b24.setBackground(Color.white);
b25.setBackground(Color.white);
b26.setBackground(Color.white);
b27.setBackground(Color.white);
b28.setBackground(Color.white);
b29.setBackground(Color.white);
b30.setBackground(Color.white);
b31.setBackground(Color.white);

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
b15.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b16.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b17.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b19.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b20.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b21.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b22.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b23.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b24.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b25.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b26.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b27.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b28.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b29.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b30.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
b31.setFont(new Font("Arabic Typesetting",Font.BOLD,25) {});
m1.add(b5);
m1.add(b6);
m1.add(b25);
m2.add(b7);
m2.add(b8);
m2.add(b9);
m3.add(b10);
m3.add(b11);
m3.add(b12);
m3.add(b26);
m4.add(b13);
m5.add(b14);
m5.add(b15);
m5.add(b22);
m6.add(b16);
m6.add(b27);
m6.add(b30);
m6.add(b31);
m7.add(b17);
m8.add(b19);
m8.add(b20);
m8.add(b21);
//m8.add(b22);
m9.add(b23);
m9.add(b28);
m9.add(b29);
m10.add(b24);
b1.addActionListener(a);
b2.addActionListener(a);
b3.addActionListener(a);
b4.addActionListener(a);
b5.addActionListener(a);
b6.addActionListener(a);
b7.addActionListener(a);
b8.addActionListener(a);
b9.addActionListener(a);
b10.addActionListener(a);
b11.addActionListener(a);
b12.addActionListener(a);
b13.addActionListener(a);
b14.addActionListener(a);
b15.addActionListener(a);
b16.addActionListener(a);
b17.addActionListener(a);
b18.addActionListener(a);
b19.addActionListener(a);
b20.addActionListener(a);
b21.addActionListener(a);
b22.addActionListener(a);
b23.addActionListener(a);
b24.addActionListener(a);
b25.addActionListener(a);
b26.addActionListener(a);
b27.addActionListener(a);
b28.addActionListener(a);
b29.addActionListener(a);
b30.addActionListener(a);
b31.addActionListener(a);
/***************************************************************/
Color colo=new Color(50,100,255);
mb1.setBackground(colo);
mb1.setBounds(0,0,1550,35);
this.add(mb1);
mb1.add(m1);
mb1.add(m2);
mb1.add(m3);
mb1.add(m5);
mb1.add(m6);
mb1.add(m7);
mb1.add(m8);
mb1.add(m9);
mb1.add(m10);
mb1.add(m4);

/**********************************label************************************/
l1.setBounds(350,250,150,150);
l2.setBounds(360,320,150,150);
l3.setBounds(300,100,200,200);
l4.setBounds(1050,390,150,150);
l5.setBounds(1000, 65, 240, 70);
l6.setBounds(1050,440,150,150);
l7.setBounds(1070,540,150,150);
l8.setBounds(1270,20,150,150);
l9.setBounds(1210,650,400,50);
l10.setBounds(360,390,150,150);
l11.setBounds(760,30,150,70);

l1.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
l2.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
l3.setFont(new Font("Arabic Typesetting",Font.BOLD,50) {});
l4.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
l5.setFont(new Font("Arabic Typesetting",Font.BOLD,40) {});
l6.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
l7.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
l8.setFont(new Font("Arabic Typesetting",Font.BOLD,70) {});
l9.setFont(new Font("impact",Font.PLAIN,20) {});
l10.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
l11.setFont(new Font("Arabic Typesetting",Font.BOLD,40) {});

l3.setForeground(Color.blue);
l8.setForeground(Color.blue);
l9.setForeground(Color.red);
this.add(l1);
this.add(l2);
this.add(l3);
this.add(l4);
this.add(l5);
this.add(l6);
this.add(l7);
this.add(l8);
this.add(l9);
this.add(l10);
this.add(l11);
/*******************************text field*********************************/
tf1.setBounds(130, 310, 200, 30);
tf2.setBounds(130, 380, 200, 30);
tf3.setBounds(860, 450, 150, 30);
tf4.setBounds(860, 500, 150, 30);
tf5.setBounds(860, 600, 150, 30);
area2.setLineWrap(true);

tf1.setFont(new Font("",Font.BOLD,30) {});
tf2.setFont(new Font("",Font.BOLD,30) {});
tf3.setFont(new Font("",Font.BOLD,30) {});
tf4.setFont(new Font("",Font.BOLD,30) {});
tf5.setFont(new Font("",Font.BOLD,30) {});
area2.setFont(new Font("",Font.BOLD,20) {});
tf3.setEditable(false);
tf5.setEditable(false);
Color v=new Color(0,150,0);
tf3.setForeground(v);
tf4.setForeground(Color.blue);
tf5.setForeground(Color.red);
this.add(tf1);
this.add(tf2);
this.add(tf3);
this.add(tf4);
this.add(tf5);
this.add(area2);
/***************************radio button************************************/
bg.add(rb1);
bg.add(rb2);
rb1.setBounds(630,500,150,50);
rb2.setBounds(460,500,150,50);
rb1.setBackground(col);
rb2.setBackground(col);
rb1.setActionCommand("كاش");
rb2.setActionCommand("فيزا");
rb1.setSelected(true);
rb1.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
rb2.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
this.add(rb1);
this.add(rb2);
/**********************************table************************************/

             
             jt=new JTable(dtm);
             dtm.addColumn("الباركود");
             dtm.addColumn("الاسم");
             dtm.addColumn("الكمية");
             dtm.addColumn("سعر الوحدة");
             dtm.addColumn("الاجمالي");
             jth=jt.getTableHeader();
             jt.setRowHeight(23);
             jt.setCellSelectionEnabled(true);  
             select= jt.getSelectionModel();  
             select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
             sp=new JScrollPane(jt);
             sp.setBounds(550,140,600,300);
             jt.setBackground(Color.white);
             jth.setBackground(Color.gray);
             jth.setForeground(Color.white);
             jt.setFont(new Font("",Font.BOLD,15) {});
             jth.setFont(new Font("Arabic Typesetting",Font.BOLD,27) {});
             this.add(sp);
             this.add(jth);
/*********************************text area*************************************/
             area.setFont(new Font("Arabic Typesetting",Font.BOLD,17) {});

             sp1=new JScrollPane(area);
             sp1.setBounds(1190,140,260,500);
             this.add(sp1);
             area.setEditable(false);
//             area.setText("\n                        digital cashier v 1.1\n");
             area.setText("\n                          فاتورة مرتجعات البيع\n");
             area.setText(area.getText()+"==============================================\n");
             area.setText(area.getText()+" الاجمالي\tسعر الوحدة\tالكمية\tالاسم\n");
             area.setText(area.getText()+"==============================================\n");
/*******************************************************************************/
sp2=new JScrollPane(area2);
sp2.setBounds(130, 450, 200, 100);
this.add(sp2);

/*******************************************************************************/
        tf1.addKeyListener(a1);
        tf2.addKeyListener(a1);
        addKeyListener(a1);
        setFocusable(true);
        setFocusTraversalKeysEnabled(true);
/*******************************************************************************/
        combo.setBackground(Color.WHITE);
        combo.setFont(new Font("",Font.BOLD,20){});
        combo.setBounds(600,50,150, 30);
        this.add(combo);
         try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="select safe,money from safe"; 
          k=c.createStatement();
          rs=k.executeQuery(query);  
  while(rs.next()){
  combo.addItem(rs.getString("safe"));
  
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

class v implements ActionListener{
@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="select id , name , (1*"+tf2.getText()+") as quantity_n , price , (price*"+tf2.getText()+") as total from product where id ='"+tf1.getText()+"'"; 
          k=c.createStatement();
          rs=k.executeQuery(query); 
          
          while(rs.next()){
       z.add(new product(rs.getString("id"),rs.getString("name"),rs.getString("quantity_n"),rs.getString("price"),rs.getString("total")));
        dtm.addRow(new Object[]{z.get(i).id,z.get(i).name,z.get(i).quantity,z.get(i).price,z.get(i).total});
          }

            d=d+Float.valueOf(z.get(i).total);
            i++;
            tf3.setText(Float.toString(d));
            tf1.setText("");
            tf2.setText("1");


            } 
            
            catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"هذا الصنف غير مدرج في قاعدة البيانات");
            } 
            
            finally {
                try {
//            area.setText(area.getText()+"----------------------------------------------------------------------------\n");

                    c.close();
                    rs.close();
                } catch (Exception ex) {
               
                }
            }
        }
        
        
        if(e.getSource()==b2){
            try {
        selection=Float.parseFloat((String) jt.getValueAt(jt.getSelectedRow(),4));
        System.out.println(selection);
        d=d-selection;
        tf3.setText(Float.toString(d));
        dtm.removeRow(jt.getSelectedRow());
        z.remove(jt.getSelectedRow());

         
            } 
            catch (Exception ex) {

           }

        }
        
        
        if (e.getSource()==b3){
           if(prints==0){
           prints++;
//         menu m=new menu();
//         m.print();
           now=LocalDateTime.now();
           bill=rand.nextInt(99999);
           area.setText(area.getText()+"----------------------------------------------------------------------------\n");
           area.setText(area.getText()+now.format(f)+"\t\t\tالتاريخ"+"\n");
           area.setText(area.getText()+now.format(f1)+"\t\t\tالوقت"+"\n");
           area.setText(area.getText()+bill+"\t\t\tالفاتورة"+"\n");
           area.setText(area.getText()+bg.getSelection().getActionCommand()+"\t\t\tنوع الدفع"+"\n");
           area.setText(area.getText()+"----------------------------------------------------------------------------\n");
           area.setText(area.getText()+"\t"+area2.getText()+"\n");
           area.setText(area.getText()+"----------------------------------------------------------------------------\n");






     try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="select name , discreption , address , phone , registeration , tax_card , notice from account"; 
          k=c.createStatement();
          rs=k.executeQuery(query);  
  while(rs.next()){
           area.setText(area.getText()+rs.getString("name")+"\t\t\tاسم المحل"+"\n");
           area.setText(area.getText()+rs.getString("discreption")+"\t\t\tالوصف"+"\n");
           area.setText(area.getText()+rs.getString("address")+"\t\t\tالعنوان"+"\n");
           area.setText(area.getText()+rs.getString("phone")+"\t\t\tالتليفون"+"\n");
           area.setText(area.getText()+rs.getString("registeration")+"\t\t\tس.ت"+"\n");
           area.setText(area.getText()+rs.getString("tax_card")+"\t\t\tب.ض"+"\n");
           area.setText(area.getText()+rs.getString("notice")+"\t\t\tملاحظة"+"\n");


  }
     } catch (Exception ex) {
     } finally {
         try {
           c.close();
           rs.close();
         } catch (Exception ex) {
         }
     }





           

            try {
            area.print();
            }
            catch (Exception ex) {
            
            }
              for(index=0;index<jt.getRowCount();index++){
               String barcode=(String) jt.getValueAt(index,0);
               String quantity=(String) jt.getValueAt(index,2);
            try {

              c= DriverManager.getConnection("jdbc:sqlite:mina.db");    
              String query="update product set quantity=(quantity+"+quantity+") where id="+barcode;
              k=c.createStatement();
              rs=k.executeQuery(query);
              }
             catch (Exception ex) {
  
            }
            finally {
                try {
//            area.setText(area.getText()+"----------------------------------------------------------------------------\n");

                    c.close();
                    rs.close();
                } catch (Exception ex) {
               
                } 
                
                   
            }
            
            
            

         }
              
                try {
              c= DriverManager.getConnection("jdbc:sqlite:mina.db");    
              String query="insert into sales_return_history values('"+bill+"',"+d+","+in+","+out+",'"+now.format(f)+"','"+now.format(f1)+"')";
              k=c.createStatement();
              rs=k.executeQuery(query);                    
                }
                catch (Exception ex) {
                
                }
                
                finally {
                try {
//            area.setText(area.getText()+"----------------------------------------------------------------------------\n");

                    c.close();
                    rs.close();
                } catch (Exception ex) {
               
                }                 
                }
                
                
                
                
                
                
                
                
                try {

              c= DriverManager.getConnection("jdbc:sqlite:mina.db");    
              String query="update safe set money=(money-"+d+") where safe='"+combo.getSelectedItem()+"'";
              k=c.createStatement();
              rs=k.executeQuery(query);

              }
             catch (Exception ex) {
               
            }
            finally {
                try {
//            area.setText(area.getText()+"----------------------------------------------------------------------------\n");

                    c.close();
                    rs.close();
                } catch (Exception ex) {
               
                } 
                
                   
            }                  
           }
           
           
           
           else{
            try {
            area.print();
            }
            catch (Exception ex) {
            
            }               
           }       
                     
                
                
                
                
                
      }
        
        
        
        if (e.getSource()==b4){

            try {
         dtm.setRowCount(0);
         d=0;
         tf1.setText("");
         tf2.setText("1");
         tf3.setText("0.0");
         tf4.setText("");
         tf5.setText("0.0");
         sp.addNotify();
         

//             area.setText("\n                        digital cashier v 1.1\n");
             area.setText("\n                          فاتورة مرتجعات البيع\n");
             area.setText(area.getText()+"==============================================\n");
             area.setText(area.getText()+" الاجمالي\tسعر الوحدة\tالكمية\tالاسم\n");
             area.setText(area.getText()+"==============================================\n");         
         
             area2.setText("");
             prints=0;
             remainders=0;
         
            } 
            
            catch (Exception ex) {
             
           JOptionPane.showMessageDialog(null,"الجدول بالفعل فارغ");
            }
   
        }
        
        if(e.getSource()==b5){
         menu m=new menu();
         m.changetheme();
        }
                
        if(e.getSource()==b6){
         menu m=new menu();
         m.changefont();
        }
        
        if(e.getSource()==b7){
         menu m=new menu();
         m.addadmin();
        }
        
        if(e.getSource()==b8){
         menu m=new menu();
         m.deleteadmin();
        }        
        
        if(e.getSource()==b9){
         menu m=new menu();
         m.updateadmininfo();
        }        
        
        if(e.getSource()==b10){
         menu m=new menu();
         m.addproduct();
        }        
        
        if(e.getSource()==b11){
         menu m=new menu();
         m.deleteproduct();
        }
                
        if(e.getSource()==b12){
         menu m=new menu();
         m.updateproduct();
        }
        if(e.getSource()==b13){
        Login l=new Login();
        l.Login();
        }
   

        if(e.getSource()==b14){
         menu m=new menu();
         m.forproducts();
            
        }

        if(e.getSource()==b15){
         menu m=new menu();
         m.foradmin();
        }
        
        if(e.getSource()==b16){
         menu m=new menu();
         m.sales_history();
        }
        
        if(e.getSource()==b17){
         menu m=new menu();
         m.updatemanagerinfo();
        }
 
        if(e.getSource()==b18){
            if(remainders==0){
                try {
        for(int x=0;x<jt.getRowCount();x++){
        String name=(String) jt.getValueAt(x,1);    
        String quantity=(String) jt.getValueAt(x,2);    
        String price=(String) jt.getValueAt(x,3);    
        String cost=(String) jt.getValueAt(x,4);    
        area.setText(area.getText()+cost+"\t"+price+"\t"+quantity+"\t"+name+"\n");
        }            
         
                in=Float.valueOf(tf4.getText());
                out=in-d;
                tf5.setText(Float.toString(out));
                remainders++;
      area.setText(area.getText()+"======================================================\n");                         
      area.setText(area.getText()+d+"\t\t\tالاجمالي"+"\n");
      area.setText(area.getText()+in+"\t\t\tالمدفوع"+"\n");
      area.setText(area.getText()+out+"\t\t\tالباقي"+"\n");
                    } 
    
                catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"برجاء ادخال المبلغ اولا");
        
              }  
            }
            else {
     JOptionPane.showMessageDialog(null,"تم طرح الباقي");
            }
           }
        


        if (e.getSource()==b19){
        menu2 m=new menu2(); 
        m.addsupplier();
        }


        if (e.getSource()==b20){
        menu2 m=new menu2();
        m.deletesupplier();
        }
        
        
        if (e.getSource()==b21){
        menu2 m=new menu2();
        m.updatesupplier();
        }
        
        if (e.getSource()==b22){
        menu2 m=new menu2();
        m.viewsuppliers();
        }
        
        if(e.getSource()==b23)  {
          calculater calc=new calculater();


        }
        
        
        
        
        
        if(e.getSource()==b24){
        menu2 m=new menu2();
        m.contact();
        }
        
        
        
        if(e.getSource()==b25){
        
        form f=new form();
        f.form();
         } 
        
        
        
        
        
        if(e.getSource()==b26){
            menu m =new menu();
            m.sales();
        }
        
        if(e.getSource()==b27){
            menu m=new menu();
            m.sales_return();
        }
        
        if(e.getSource()==b28){
            safe s=new safe();
            s.safe_information();
            s.add_safe();
            s.delete_safe();
            s.move_money();
        }
        
        
        if(e.getSource()==b29){
          menu m=new menu();
          m.shortfalls();            
        }


        if(e.getSource()==b30){
          menu m=new menu();
          m.purchases_history();
        }
        

        if(e.getSource()==b31){
          menu m=new menu();
          m.purchases_return();
        }        
        
       }
    }



 class v1 implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
               if(e.getKeyCode()==KeyEvent.VK_ENTER){
                    
          b1.doClick();
            
            
            
        }
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
     
   }
  }
