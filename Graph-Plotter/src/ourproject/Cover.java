
package ourproject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Cover extends JFrame{
    
    private Font f,f1;
    private JPanel heading;
    private JLabel name;
    private Container c;
    private JButton entr;
    private Image img;
    private ImageIcon background_image;
    private ImageIcon icon;
    Cover()
    {
      f=new Font("Serif",Font.BOLD+Font.ITALIC,55);
      f1= new Font("Arial",Font.BOLD,30);
     
       c = this.getContentPane();
       c.setLayout(null);
      
      name=new JLabel("Graph Plotter");
      name.setForeground(Color.WHITE);
      name.setBounds(300,110,400,50);
      name.setFont(f);
      c.add(name);
      
       entr= new JButton("Enter");
       entr.setBounds(350,350,200,50);
       entr.setFont(f1);
       entr.setBackground(new Color(63,173,205));
       c.add( entr);
       
        //Frame
        setSize(900,600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
         setLocation(450,180);
        

        //Icon
       icon = new ImageIcon("src/icons/icon.jpg");
       this.setIconImage(icon.getImage());
           
    //Background
       background_image= new ImageIcon("src/icons/cover.jpg");
       img= background_image.getImage();
       Image temp_img =img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
       background_image = new ImageIcon(temp_img);
       JLabel background= new JLabel("",background_image,JLabel.CENTER);
        
       // background.add(login);
        //background.add(heading);
        background.setBounds(0,0,900,600);
        add(background);
        
        enterButton();
        setVisible(true);
      
      
    }
    
      private void enterButton()
       {
           
            entr.addActionListener(new ActionListener(){
                 @Override
                 public void actionPerformed(ActionEvent ae) {
                  
                       dispose();
                       login ll= new login();
                       ll.setVisible(true);
                 }
                });
              
       }
    
     public static void main(String[] args) {
      Cover c=new Cover();
    
    }
}

