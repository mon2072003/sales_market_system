
package sales.market.system;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;


public class cash extends JFrame implements ActionListener{
JTabbedPane pages=new JTabbedPane();
Sales cshp=new Sales();
Sales_returns cshp1=new Sales_returns();
purchases cshp2=new purchases();
purchases_returns cshp3=new purchases_returns();
//Login l=new Login();
public void cash(){
Image ic =new ImageIcon(this.getClass().getResource("/product.png")).getImage();
this.setTitle("digital cashier V 2.0");
this.setSize(1500,770);
this.setMinimumSize(getSize());
this.setResizable(true);
this.setLocation(20,37);
this.setVisible(true);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setIconImage(ic);
this.add(pages);
pages.setFont(new Font("Arabic Typesetting",Font.BOLD,20) {});
pages.add(cshp);
pages.add(cshp1);
pages.add(cshp2);
pages.add(cshp3);
cshp.b13.addActionListener(this);
cshp1.b13.addActionListener(this);
cshp2.b13.addActionListener(this);
cshp3.b13.addActionListener(this);
}

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==cshp.b13||e.getSource()==cshp1.b13||e.getSource()==cshp2.b13||e.getSource()==cshp3.b13){
    this.dispose();
    }
    
    
    
    

    }

}
