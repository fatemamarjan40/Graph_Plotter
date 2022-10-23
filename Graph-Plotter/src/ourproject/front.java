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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class front extends JFrame{
    private Container c;
    private JTextField tf;
    private JTextField tf1;
    private JButton bt;
   // private JButton bt1;
    private String s1,s2;
    private int n1,n2;
    private Font f,f1;
    private JPanel login;
    private ImageIcon  background_image;
    private Image img;
    
    private ImageIcon icon;
    private JLabel userLabel1,name;
    private JLabel userLabel2;
    private JLabel userLabel3;
    private JLabel userLabel4,usrlbl;
    private JComboBox cb;
    private String str;
    //jcombobox list
    private String[] function = {"Select","sinx","cosx","tanx","parabola","y=mx","y=mx+c","cubic function",
   "sine + cosine","sin cube","cos cube function","sin^3+cos^3","sinc function","signum function"," x- letter generate"," ax^2+bx+c","x^3"};
   front()
   {
       
        f= new Font("Arial",Font.BOLD,19);
        f1= new Font("Arial",Font.BOLD,20);
    
      
       //Icon
       icon = new ImageIcon("src/icons/icon.jpg");
       this.setIconImage(icon.getImage());
               
      //login panel
      login=new JPanel();
      login.setLayout(null);
      login.setSize(500,450);
      login.setBackground(new Color(0,0,0,30));
      login.setBounds(150,75,600,350);
      
          
          tf = new JTextField();
          tf.setFont(f);
          tf.setBounds(60,70,150,50);
          tf.setBackground(new Color(210,180,140));
          login.add(tf);
          
          LabelDemo();
          
          
          tf1 = new JTextField();
          tf1.setFont(f);
          tf1.setBounds(60,200,150,50);
          tf1.setBackground(new Color(210,180,140));
          login.add(tf1);
               
          JcomboBoxDemo();
      
       //Background
       background_image= new ImageIcon("src/icons/bc.jpg");
       img= background_image.getImage();
       Image temp_img =img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
       background_image = new ImageIcon(temp_img);
       JLabel background= new JLabel("",background_image,JLabel.CENTER);
       
       background.add(login);
      //  background.add(heading);
        background.setBounds(0,0,900,600);
        add(background);
        
        
         //Frame
        setSize(900,600);
        setLayout(null);
        setTitle("Ghaph_plotter");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);  
        setLocation(450,180);
     
      submitButton();
        
        
       // setVisible(true);
                  
     
 
        
   }
  
       private void LabelDemo() {
           
           userLabel1 = new JLabel();
           userLabel1.setFont(f);
           userLabel1.setText("Enter the value of X:");
           userLabel1.setForeground(new Color(128,0,0));
           userLabel1.setBounds(37,18,250,50);
           login.add(userLabel1);
           
           
           userLabel2 = new JLabel();
           userLabel2.setFont(f);
           userLabel2.setText("Enter the value of Y:");
           userLabel2.setForeground(new Color(128,0,0));
           userLabel2.setBounds(37,150,250,50);
           login.add(userLabel2);
           
           userLabel3 = new JLabel();
           userLabel3.setFont(f);
           userLabel3.setText("Enter your desire function:");
           userLabel3.setForeground(new Color(128,0,0));
           userLabel3.setBounds(350,25,250,50);
           login.add(userLabel3);
           
          
           
        
    }
       private void submitButton()
       {
            bt = new JButton("Submit");
            bt.setBounds(270,280,110,50);
            bt.setFont(f1);
            bt.setBackground(new Color(160,182,45));
            login.add(bt);
                 bt.addActionListener(new ActionListener(){
                 @Override
                 public void actionPerformed(ActionEvent ae)  {
                   
                   str=cb.getSelectedItem().toString();
                  
                     
                       s1=tf.getText();
                       s2=tf1.getText();
                     
                     if(s1.isEmpty() || s1.isEmpty())
                       JOptionPane.showMessageDialog(null,"Please Enter valid value", "Error",JOptionPane.ERROR_MESSAGE);
                    
                       
                       n1=Integer.parseInt(s1);
                       n2=Integer.parseInt(s2);
                      System.out.println(""+n1+" "+n2);
                    if(str=="sinx")
                    {
                         GraphProject fr = new GraphProject("sinx",n1,n2);
                          fr.setVisible(true);
                    }
                     if(str=="cosx")
                    {
                         GraphProject fr = new GraphProject("cosx",n1,n2);
                          fr.setVisible(true);
                    }
                      if(str=="tanx")
                    {
                         GraphProject fr = new GraphProject("tanx",n1,n2);
                          fr.setVisible(true);
                    }
                       if(str=="parabola")
                    {
                         GraphProject fr = new GraphProject("parabola",n1,n2);
                          fr.setVisible(true);
                    }
                        if(str=="y=mx")
                    {
                         GraphProject fr = new GraphProject("y=mx",n1,n2);
                          fr.setVisible(true);
                    }
                         if(str=="y=mx+c")
                    {
                         GraphProject fr = new GraphProject("y=mx+c",n1,n2);
                          fr.setVisible(true);
                    }
                          if(str=="cubic function")
                    {
                         GraphProject fr = new GraphProject("cubic function",n1,n2);
                          fr.setVisible(true);
                    }
                           if(str=="sine + cosine")
                    {
                         GraphProject fr = new GraphProject("sine + cosine",n1,n2);
                          fr.setVisible(true);
                    }
                            if(str=="sin cube")
                    {
                         GraphProject fr = new GraphProject("sin cube",n1,n2);
                          fr.setVisible(true);
                    }
                             if(str=="cos cube function")
                    {
                         GraphProject fr = new GraphProject("cos cube function",n1,n2);
                          fr.setVisible(true);
                    }
                              if(str=="sin^3+cos^3")
                    {
                         GraphProject fr = new GraphProject("sin^3+cos^3",n1,n2);
                          fr.setVisible(true);
                    }
                              if(str=="sinc(x) function")
                    {
                         GraphProject fr = new GraphProject("sinc(x) function",n1,n2);
                          fr.setVisible(true);
                    }
                      if(str=="signum function")
                    {
                         GraphProject fr = new GraphProject("signum function",n1,n2);
                          fr.setVisible(true);
                    }
                      if(str==" x- letter generate")
                    {
                         GraphProject fr = new GraphProject(" x- letter generate",n1,n2);
                          fr.setVisible(true);
                    }
                      if(str=="ax^2+bx+c")
                    {
                         GraphProject fr = new GraphProject("ax^2+bx+c",n1,n2);
                          fr.setVisible(true);
                    }
                      if(str=="x^3")
                    {
                         GraphProject fr = new GraphProject("x^3",n1,n2);
                          fr.setVisible(true);
                    }
                       
                 }
                 
                });
       //      usrlbl.setText(""+n1+" "+n2);
       //  System.out.println(n1+"  "+n2);
              
       }
       private void JcomboBoxDemo()
       {
           cb  = new JComboBox(function);
          //cb.setEditable(true);
           cb.setBounds(400,80,150,70);
           cb.setBackground(new Color(210,180,140));
           login.add(cb);
           userLabel4= new JLabel();
           userLabel4.setBounds(580,500,150,50);
           login.add(userLabel4);
           cb.addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent ae) {
                   String s = cb.getSelectedItem().toString();
                    userLabel4.setText("You have selected :"+s);
               }
           
           });
       
       }
   
    
}
