/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourproject;




import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


public class regi  extends JFrame{
    private JLabel userlbl,passlbl,cps,name,gotolog;
    private JTextField tf;
    private JPasswordField pf,cpf;
    private JButton sbmt,clr;
    private Font f,f1;
    private Container c;
    
    private ImageIcon  background_image,icon;
    private Image img;
    private JPanel heading,reg;
    
    String userfld,passfld,conpass;
   regi()
   {
        f= new Font("Arial",Font.BOLD,20);
        f1= new Font("Serif",Font.BOLD,70);
        
         //header
      heading = new JPanel();
      heading.setBackground(new Color(0,0,0,80));
      heading.setBounds(0,0,900,100);
      name=new JLabel("Registration");
      name.setForeground(Color.WHITE);
      name.setBounds(200,25,400,50);
      name.setFont(f1);
      heading.add(name);
      
      //Icon
       icon = new ImageIcon("src/icons/icon.jpg");
       this.setIconImage(icon.getImage());
      
      
      //registration panel
      reg=new JPanel();
      reg.setLayout(null);
      reg.setSize(400,350);
      reg.setBackground(new Color(0,0,0,60));
      reg.setBounds(250,175,400,350);
            
       userlbl = new JLabel("Username : ");
       userlbl.setBounds(50,50,300,50);
       userlbl.setForeground(new Color(240,240,240));
       userlbl.setFont(f);
       reg.add(userlbl);
       
       
       tf = new JTextField();
       tf.setFont(f);
       tf.setBounds(170,50,200,50);
       tf.setBackground(new Color(210,180,140));
       reg.add(tf);
       
       
       passlbl = new JLabel("Password : ");
       passlbl.setBounds(50,120,150,50);
       passlbl.setForeground(new Color(240,240,240));
       passlbl.setFont(f);
       reg.add(passlbl);
       
       pf = new JPasswordField();
       pf.setFont(f);
       pf.setEchoChar('*');
       pf.setBounds(170,120,200,50);
       pf.setBackground(new Color(210,180,140));
       reg.add(pf);
       
       cps = new JLabel("Confirm : ");
       cps.setBounds(50,190,150,50);
       cps.setForeground(new Color(240,240,240));
       cps.setFont(f);
       reg.add(cps);
       
       cpf = new JPasswordField();
       cpf.setFont(f);
       cpf.setEchoChar('*');
       cpf.setBounds(170,190,200,50);
       cpf.setBackground(new Color(210,180,140));
       reg.add(cpf);
       
        
       sbmt = new JButton("submit");
       sbmt.setBounds(50,280,100,50);
       sbmt.setBackground(new Color(245,171,53));
       sbmt.setFont(f);
       reg.add(sbmt);
       
       clr = new JButton("Clear");
       clr.setBounds(250,280,100,50);
       clr.setBackground(new Color(245,171,53));
       clr.setFont(f);
       reg.add(clr);
       
        
       //frame
        setSize(900,600);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);   
       
        
       //Background
       background_image= new ImageIcon("src/icons/bg.jpg");
       img= background_image.getImage();
       Image temp_img =img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
       background_image = new ImageIcon(temp_img);
       JLabel background= new JLabel("",background_image,JLabel.CENTER);
        
        background.add(reg);
        background.add(heading);
        background.setBounds(0,0,900,600);
        add(background);
        loginButton();
        submitButton();
        
        setVisible(true);
   }
    private void loginButton()
       {
           
            clr.addActionListener(new ActionListener(){
                 @Override
                 public void actionPerformed(ActionEvent ae) {
                    
                   tf.setText(null);
                   pf.setText(null);
                   cpf.setText(null);
                 
            }
                });
              
       }

   
     private void submitButton()
       {
           
            sbmt.addActionListener(new ActionListener(){
                 @Override
                 public void actionPerformed(ActionEvent ae) {
                  // File input=new File("userdata.txt");
                   userfld=tf.getText();
                   passfld=pf.getText();
                   conpass=cpf.getText();
                   System.out.println(userfld+" "+passfld+" "+conpass);
                   try{
                       FileWriter fw=new FileWriter("userdata.txt");
                       PrintWriter pw=new PrintWriter(fw);
       
                       pw.println(userfld);
                       pw.println(passfld);
                       pw.println(conpass);
                       pw.close();
                   
                   }
                    catch (IOException ex) {
                         JOptionPane.showMessageDialog(null,"User Database Not Found", "Error", JOptionPane.ERROR_MESSAGE);
                     }
                       
                 }
                });
              
       }
   
    
}

