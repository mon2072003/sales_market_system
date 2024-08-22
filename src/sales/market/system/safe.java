
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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class safe extends JFrame {
    JTabbedPane p=new JTabbedPane();
    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    JPanel panel3=new JPanel();
    JPanel panel4=new JPanel();
    JLabel l1=new JLabel();
    JLabel l2=new JLabel();
    JLabel l3=new JLabel();
    JLabel l4=new JLabel();
    JLabel l5=new JLabel();
    JLabel l6=new JLabel();
    JLabel l7=new JLabel();
    JLabel l8=new JLabel();
    //************************************************
    JTextField tf1=new JTextField();
    JTextField tf2=new JTextField();
    JTextField tf3=new JTextField();
    //************************************************
    JLabel l9=new JLabel("الخزينة");
    JLabel l10=new JLabel("المبلغ");
    JLabel l11=new JLabel("اختار الخزينة");
    JLabel l12=new JLabel("من");
    JLabel l13=new JLabel("إلى");
    JLabel l14=new JLabel("اختار الخزينة");
    JLabel l15=new JLabel("المبلغ");
    //************************************************
    JButton b1=new JButton("اضافة");
    JButton b2=new JButton("حذف");
    JButton b3=new JButton("استعلام");
    JButton b4=new JButton("مسح");
    JButton b5=new JButton("سحب");
    JButton b6=new JButton("ايداع");
    
/*******************************************************************************/
    JTable jt;
    JTableHeader jth;
    JScrollPane sp;
    ListSelectionModel select;
    DefaultTableModel dtm=new DefaultTableModel();
//    String data[][]=new String[50][2];
//    String column[]={"الخزينة","المبلغ"};
    ArrayList<safe1> z=new ArrayList();
    int iterator;
    int indexer;
/*******************************************************************************/
    JComboBox combo=new JComboBox();
    JComboBox combo1=new JComboBox();
/*******************************************************************************/
    Connection c;
    Statement k;
    ResultSet rs;
/*******************************************************************************/
    actions act=new actions();
/*******************************************************************************/
ImageIcon add =new ImageIcon(this.getClass().getResource("/add.png"));
ImageIcon delete =new ImageIcon(this.getClass().getResource("/delete.png"));
ImageIcon update =new ImageIcon(this.getClass().getResource("/update.png"));
ImageIcon search =new ImageIcon(this.getClass().getResource("/search.png"));
ImageIcon clear =new ImageIcon(this.getClass().getResource("/clear.png"));
ImageIcon withdraw =new ImageIcon(this.getClass().getResource("/withdraw.png"));
ImageIcon deposit =new ImageIcon(this.getClass().getResource("/deposit.png"));
public safe(){
    Image ic=new ImageIcon(this.getClass().getResource("/product.png")).getImage();
    setIconImage(ic);
    setVisible(true);
    setResizable(false);
    setSize(500,500);
    setLocation(500,170);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setTitle("الخزينة");
/*******************************************************************************/
    add(p);
    p.setFont(new Font("Arabic Typesetting",Font.BOLD,20) {});
    panel1.setName("استعلام عن الخزينة");
    panel2.setName("اضافة خزينة");
    panel3.setName("حذف خزينة");
    panel4.setName("سحب و ايداع"); 
    p.add(panel1);
    p.add(panel2);
    p.add(panel3);
    p.add(panel4);
/*******************************************************************************/
panel1.setBackground(new Color(255,200,103));
panel2.setBackground(new Color(200,255,103));
panel3.setBackground(new Color(255,100,103));
panel4.setBackground(new Color(100,255,103));
panel1.setLayout(null);
panel2.setLayout(null);
panel3.setLayout(null);
panel4.setLayout(null);
/*******************************************************************************/
l1.setBounds(200,40, 300,70);
l2.setBounds(200,40, 300,70);
l3.setBounds(200,40, 300,70);
l4.setBounds(200,40, 300,70);
l9.setBounds(300,165, 300,70);
l10.setBounds(320,215, 300,70);
l11.setBounds(280, 200, 150, 30);
l14.setBounds(280, 200, 150, 30);
l15.setBounds(320,235, 300,70);
l1.setFont(new Font("Arabic Typesetting",Font.BOLD,50) {});
l2.setFont(new Font("Arabic Typesetting",Font.BOLD,50) {});
l3.setFont(new Font("Arabic Typesetting",Font.BOLD,50) {});
l4.setFont(new Font("Arabic Typesetting",Font.BOLD,50) {});
l9.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
l10.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
l11.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
l14.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
l15.setFont(new Font("Arabic Typesetting",Font.BOLD,45) {});
/*******************************************************************************/
tf1.setBounds(80,185, 150,30);
tf2.setBounds(80,235, 150,30);
tf3.setBounds(80,255, 150,30);
tf1.setFont(new Font("",Font.BOLD,20) {});
tf2.setFont(new Font("",Font.BOLD,20) {});
tf3.setFont(new Font("",Font.BOLD,20) {});
/*******************************************************************************/
b1.setBounds(80,330, 150,35);
b2.setBounds(170,340, 150,35);
b3.setBounds(170,340, 150,35);
b4.setBounds(270,330, 150,35);
b5.setBounds(80,330, 150,35);
b6.setBounds(270,330, 150,35);
b1.setBackground(Color.green);
b2.setBackground(Color.black);
b3.setBackground(Color.gray);
b4.setBackground(Color.red);
b5.setBackground(Color.red);
b6.setBackground(Color.green);
b2.setForeground(Color.white);
b3.setForeground(Color.white);
b4.setForeground(Color.white);
b5.setForeground(Color.white);
b1.setFont(new Font("Arabic Typesetting",Font.BOLD,30) {});
b2.setFont(new Font("Arabic Typesetting",Font.BOLD,30) {});
b3.setFont(new Font("Arabic Typesetting",Font.BOLD,30) {});
b4.setFont(new Font("Arabic Typesetting",Font.BOLD,30) {});
b5.setFont(new Font("Arabic Typesetting",Font.BOLD,30) {});
b6.setFont(new Font("Arabic Typesetting",Font.BOLD,30) {});
b1.addActionListener(act);
b2.addActionListener(act);
b3.addActionListener(act);
b4.addActionListener(act);
b5.addActionListener(act);
b6.addActionListener(act);
/*******************************************************************************/
             jt=new JTable(dtm);
             dtm.addColumn("الخزينة");
             dtm.addColumn("المبلغ");
             jth=jt.getTableHeader();
             jt.setRowHeight(23);
             jt.setCellSelectionEnabled(true);  
             select= jt.getSelectionModel();  
             select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
             sp=new JScrollPane(jt);
             sp.setBounds(90,170,300,150);
             jt.setBackground(Color.white);
             jth.setBackground(Color.gray);
             jth.setForeground(Color.white);
             jt.setFont(new Font("",Font.BOLD,15) {});
             jth.setFont(new Font("Arabic Typesetting",Font.BOLD,27) {});
}
public void safe_information(){
ImageIcon icon =new ImageIcon(this.getClass().getResource("/safe-box.png"));
l5.setBounds(20, -35, 265, 265);
l5.setIcon(icon);
l1.setText("استعلام عن الخزينة");
panel1.add(l1);  
panel1.add(l5); 
panel1.add(b3);
/*****************************************************************************/
             panel1.add(jth);
             panel1.add(sp);  
/******************************************************************************/
b3.setIcon(search);

}

public void add_safe(){
ImageIcon icon =new ImageIcon(this.getClass().getResource("/add-safe.png"));
l6.setBounds(20, -35, 265, 265);
l6.setIcon(icon);
l2.setText("اضافة خزينة");
panel2.add(l2); 
panel2.add(l6);
panel2.add(l9);
panel2.add(l10);
panel2.add(tf1);
panel2.add(tf2);
panel2.add(b1);
panel2.add(b4);
/*****************************************************************************/ 
b1.setIcon(add);
b4.setIcon(clear);
}


public void delete_safe(){
ImageIcon icon =new ImageIcon(this.getClass().getResource("/bin.png"));
l7.setBounds(20, -35, 265, 265);
l7.setIcon(icon);
l3.setText("حذف خزينة");
panel3.add(l3);  
panel3.add(l7);  
panel3.add(l11);  
panel3.add(b2);
b2.setIcon(delete);
/*****************************************************************************/
        combo.setBackground(Color.WHITE);
        combo.setFont(new Font("",Font.BOLD,20){});
        combo.setBounds(80,200,150, 30);
        panel3.add(combo);
        combo.addActionListener(act);
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


public void move_money(){
ImageIcon icon =new ImageIcon(this.getClass().getResource("/move-money.png"));
l8.setBounds(20, -35, 265, 265);
l8.setIcon(icon);
l4.setText("سحب و ايداع");
panel4.add(l4);  
panel4.add(l8);  
panel4.add(l15);  
panel4.add(l14); 
panel4.add(b5); 
panel4.add(b6); 
panel4.add(tf3); 
b5.setIcon(withdraw);
b6.setIcon(deposit);
/*****************************************************************************/    
        combo1.setBackground(Color.WHITE);
        combo1.setFont(new Font("",Font.BOLD,20){});
        combo1.setBounds(80,200,150, 30);
        panel4.add(combo1);
        combo1.addActionListener(act);
         try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="select safe,money from safe"; 
          k=c.createStatement();
          rs=k.executeQuery(query);  
  while(rs.next()){
  combo1.addItem(rs.getString("safe"));
  
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


class actions implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
   if(e.getSource()==b1){
        try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="insert into safe values ('"+tf1.getText()+"','"+tf2.getText()+"')"; 
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
          String query="delete from safe where safe='"+combo.getSelectedItem()+"'"; 
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
   
   
    
    
    
    
    if (e.getSource()==b3) {
//"select safe,money from safe"
            iterator=0;
            z.removeAll(z);
            dtm.setRowCount(0);
//            sp4.addNotify();
     try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="select safe,money from safe"; 
          k=c.createStatement();
          rs=k.executeQuery(query);  
     while(rs.next()){
       z.add(new safe1(rs.getString("safe"),rs.getString("money")));  
       dtm.addRow(new Object[]{z.get(iterator).safe,z.get(iterator).money});  
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
   
   
   
   
   if(e.getSource()==b4){
       tf1.setText("");
       tf2.setText("");
   }
            





  if(e.getSource()==b5){
        try {
          c= DriverManager.getConnection("jdbc:sqlite:mina.db");
          String query="update safe set money=(money-"+tf3.getText()+") where safe='"+combo1.getSelectedItem()+"'"; 
          k=c.createStatement();
          k.execute(query);
          JOptionPane.showMessageDialog(null,"تم السحب بنجاح");
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
          String query="update safe set money=(money+"+tf3.getText()+") where safe='"+combo1.getSelectedItem()+"'"; 
          k=c.createStatement();
          k.execute(query);
          JOptionPane.showMessageDialog(null,"تم الايداع بنجاح");
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

  
   
    
}
}
}