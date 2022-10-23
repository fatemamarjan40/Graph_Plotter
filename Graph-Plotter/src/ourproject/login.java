/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourproject;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Joti
 */
public class login extends JFrame{
     private ImageIcon background_image;
     private Image img;
     private ImageIcon icon;
     private JPanel heading,login;
     private JLabel name;
     private Font f,f1;
     private JTextField usrname;
     private JPasswordField ps;
     private JButton sup,log;
     private String str;
     
     private static Scanner x;


    login()
    {
      //font
       f=new Font("Serif",Font.BOLD,70);
       f1=new Font("Serif",Font.BOLD,19);
       
       //Icon
       icon = new ImageIcon("src/icons/icon.jpg");
       this.setIconImage(icon.getImage());
     
       //header
      heading = new JPanel();
      heading.setBackground(new Color(0,0,0,80));
      heading.setBounds(0,0,900,100);
      name=new JLabel("Login");
      name.setForeground(Color.WHITE);
      name.setBounds(200,25,400,50);
      name.setFont(f);
      heading.add(name);
      
      //login panel
      login=new JPanel();
      login.setLayout(null);
      login.setSize(400,350);
      login.setBackground(new Color(0,0,0,60));
      login.setBounds(250,175,400,350);
     
      usrname= new JTextField("Enter Username");
      usrname.setBounds(50,50,300,50);
      usrname.setBackground(new Color(210,180,140));
      login.add(usrname);
        
      ps=new JPasswordField("Enter Password ");
      ps.setBounds(50,150,300,50);
      ps.setBackground(new Color(210,180,140));
      login.add(ps);
     
      sup= new JButton("Sign UP");
      sup.setBounds(50,250,100,50);
       sup.setFont(f1);
      sup.setBackground(new Color(245,171,53));
      login.add(sup);
      
      log= new JButton("Login");
      log.setBounds(250,250,100,50);
      log.setFont(f1);
      log.setBackground(new Color(245,171,53));
      login.add(log);
      
      //Frame
        setSize(900,600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);     
         setLocation(450,180);
    //Background
       background_image= new ImageIcon("src/icons/bg.jpg");
       img= background_image.getImage();
       Image temp_img =img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
       background_image = new ImageIcon(temp_img);
        JLabel background= new JLabel("",background_image,JLabel.CENTER);
        
        background.add(login);
        background.add(heading);
        background.setBounds(0,0,900,600);
        add(background);
        
        
      
        signUpButton();
        loginButton();
        
       // setVisible(true);
    }
 
     private void signUpButton()
       {
           
            sup.addActionListener(new ActionListener(){
                 @Override
                 public void actionPerformed(ActionEvent ae) {
                  
                       //dispose();
                       regi l= new regi();
                       l.setVisible(true);
                 }
                });
              
       }
        private void loginButton()
       {
           
            log.addActionListener(new ActionListener(){
                 @Override
                 public void actionPerformed(ActionEvent ae) {
                     boolean found=false;
                     String username="";
                     String pass="";
                     try {
                         x= new Scanner(new File("userdata.txt"));
                         while(x.hasNext() && !found)
                         {
                             username=x.next();
                             pass=x.next();
                             
                             if(username.trim().equals(username.trim()) && pass.trim().equals(pass.trim()))
                             {
                                 found=true;
                             }
                         
                         }
                         x.close();
                        System.out.println(found);
                         if(found)
                         {
                              dispose();
                              front fn=new  front();
                              fn.setVisible(true);
                         }
                         else
                         {
                              JOptionPane.showMessageDialog(null,"Invalid Username / Password Combo", "Error",JOptionPane.ERROR_MESSAGE);
                         }
                     } catch (FileNotFoundException ex) {
                        
                     } catch (IOException ex) {
                         
                     }
                       
                 }
                });
              
       }
   
   
    
}

