import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class reg implements ActionListener
{
Connection conn;
PreparedStatement pst;
Frame fr;
ImageIcon img;
Color c;
Panel p;
TextField t1,t3,t6,t7;
JPasswordField t2;
JLabel l4;
Label l1,l2,l3,l5,l6,l7;
Button b1,b2;
Font f,f1;
reg()
{
try
{
c = Color.yellow;
img=new ImageIcon("stu.png");
f= new Font("Courier", Font.PLAIN, 20);  
f1= new Font("Courier", Font.PLAIN, 30);  
fr=new Frame();
p=new Panel();
l5=new Label("Welcome To Student Registration Form");
l5.setFont(f1);
l5.setBounds(300,50,1000,40);
fr.add(l5);
fr.setBackground(c);
p.setBounds(300,110,700,180);
p.setLayout(new GridLayout(5,2));
l4=new JLabel();
l4.setIcon(img);
l4.setBounds(250,300,500,700);
fr.add(l4);
l1=new Label("USERNAME");
l1.setFont(f);
l2=new Label("PASSWORD");
l2.setFont(f);
l6=new Label("MOBILE NO");
l6.setFont(f);
l7=new Label("COURSE");
l7.setFont(f);
t1=new TextField();
t6=new TextField();
t7=new TextField();
t2=new JPasswordField();
t1.setFont(f);
t7.setFont(f);
t2.setFont(f);
b1=new Button("RESET");
b2=new Button("REGISTER");
b1.setFont(f);
b2.setFont(f);

p.add(l1);
p.add(t1);

p.add(l6);
p.add(t6);

p.add(l2);
p.add(t2);

p.add(l7);
p.add(t7);

p.add(b1);
p.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);




fr.add(p);
fr.setBounds(0,0,1800,1800);
fr.setLayout(null);
fr.setVisible(true);
}
catch(Exception obj)
{
System.out.println(obj);
}
}
public void actionPerformed(ActionEvent obj)
{
if(obj.getSource()==b1)
{
}
if(obj.getSource()==b2)
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
conn=DriverManager.getConnection("jdb:oracle:thin:@localhost:1521:xe","system","S");
pst=conn.prepareStatement("insert into reg values(?,?,?,?)");
pst.setString(1,t1.getText());
pst.setString(2,t6.getText());
pst.setString(3,t2.getText());
pst.setString(4,t7.getText());

pst.executeUpdate();
JOptionPane.showMessageDialog(null,"YOR  ARE REGISTERED!!!");
conn.close();
pst.close();
System.out.println("DATA SAVE");
}
catch(Exception obj1)
{
JOptionPane.showMessageDialog(null,"Failed:"+obj1);
}
}
}
}



