/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourproject;



import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.sin;
import javax.swing.JFrame;
import java.util.Scanner;
import javax.swing.ImageIcon;
public class GraphProject extends JFrame {
    int x,y;
    int ax,by;
    int ax1=300,by1=300;
    private ImageIcon icon;
    private final String s;
    private final int n1;
    private final int n2;
    int x1=300,x2=0,y1=300,y2=600;
    int X1=0,X2=300,Y1=600,Y2=300;
  

    public GraphProject(String s,int n1,int n2)
            {
                setTitle("Show Graph");
                setSize(600,600);
                setResizable(true);
                setVisible(true);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                 setLocation(450,180);
                  //Icon
                    icon = new ImageIcon("src/icons/icon.jpg");
                     this.setIconImage(icon.getImage());
                
                 
              
                this.s=s;
                this.n1=n1;
                this.n2=n2;
                x=0;
                y=300;
            }
    
    @Override
    public void paint(Graphics g){
        
       x=x+n1;
       y=y+n2;
        
   g.drawLine(x1, x2, y1, y2);//yaxis
   g.drawLine(X1,X2,Y1,Y2);
   g.setColor(Color.red);
   g.fillOval(x,y, 5, 5);
   repaint();
   if(s=="sinx")
   run();
    if(s=="cosx")
   run1();
     if(s=="tanx")
   run2();
      if(s=="parabola")
   run3();
       if(s=="y=mx")
   run4();
        if(s=="y=mx+c")
   run5();
         if(s=="cubic function")
   run6();
          if(s=="sine + cosine")
   run7();
           if(s=="sin cube")
   run8();
            if(s=="cos cube function")
   run9();
             if(s=="sin^3+cos^3")
   run10();
             if(s=="sinc function")
   run11();
               if(s=="signum function")
   run12();
                if(s==" x- letter generate")
   run13(); 
                 if(s=="ax^2+bx+c")
   run14();
                  if(s=="x^3")
   run15();
//   run1();//cosx
   //run2();//tanx
 //  run3();//parabola
 //run4();//y=mx
   //run5();//y=mx+c
  // run6(); //cubic function
  //run7(); // sine + cosine
 //run8(); //sin cube 
// run9();///cos cube function
//run10(); //sin^3+cos^3
//run11();//sinc

   
   }
        
    public void run() //sinx function
    {
        try{
            Thread.sleep(10);
            int ax,by;
            ax=x-200;
            by=y-300;
            
            by = (int)(100*Math.sin(.1*ax/3.14));
            x =ax+200;
            y = 300-by;
            x++;
        }catch(Exception e)
        {
            System.out.println("error!!");
        }
    }
  public void run1()
    {
        try{
            Thread.sleep(10);
            int ax,by;
            
            ax=x-ax1;
            
            by=y-by1;
            by = (int)(100*Math.cos(.1*ax/3.14));
            x =ax+ax1;
            y = by1-by;
            x++;
        }catch(Exception e)
        {
            System.out.println("error!!");
        }
    }
   public void run2() //tan function
    {
        try{
            Thread.sleep(10);
            int ax,by;
            ax=x-ax1;
            
            by=y-by1;
            by = (int)(100*Math.tan(.1*ax/3.14));
            x =ax+ax1;
            y = by1-by;
            x++;
        }catch(Exception e)
        {
            System.out.println("error!!");
        }
    }
    public void run3() ///parabola function
    {
        try{
            Thread.sleep(10);
            int ax,by;
            ax=x-ax1;
            
            by=y-by1;
            by =ax*ax/500; 
            x =ax+ax1;
            y = by1-by;
            x++;
        }catch(Exception e)
        {
            System.out.println("error!!");
        }
    }
     public void run4()
    {
        try{
            Thread.sleep(5);
            int ax,by;
            ax=x-ax1;
            
            by=y-by1;
            by =ax; 
            x =ax+ax1;
            y = by1-by;
            x++;
        }catch(Exception e)
        {
            System.out.println("error!!");
        }
    }
     public void run5()
    {
        try{
            Thread.sleep(10);
            int ax,by;
            ax=x-ax1;
            
            by=y-by1;
            by =ax+ax1; 
            x =ax+ax1;
            y = by1-by;
            x++;
        }catch(Exception e)
        {
            System.out.println("error!!");
        }
    }
     public void run6(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-ax1;
				 by = y-by1;
			         ax++;
				
			      by = (int) (2*Math.pow(ax,2)*ax/400+3*ax+1); //cubic function
				x=ax1+ax;
				y=by1-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
     public void run7(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-ax1;
				 by = y-by1;
			      ax++;
				
			      by = (int) ((40*Math.cos(.3*ax/3.14))+(40*Math.sin(.2*ax/3.14))); // sine + cosine
				x=ax1+ax;
				y=by1-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
     public void run8(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-ax1;
				 by = y-by1;
			      ax++;
				
			      by = (int) (40*Math.pow((Math.sin(.2*ax/3.14)),3)); //sin cube 
				x=ax1+ax;
				y=by1-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
     public void run9(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-ax1;
				 by = y-by1;
			      ax++;
				
			      by = (int) (40*Math.pow((Math.cos(.2*ax/3.14)),3)); //cos cube function
				x=ax1+ax;
				y=by1-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
     public void run10(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-ax1;
				 by = y-by1;
			      ax++;
				
			      by = (int) ((40*Math.pow((Math.cos(.3*ax/3.14)),3))+(40*Math.pow((Math.sin(.2*ax/3.14)),3))); //sin^3+cos^3
				x=ax1+ax;
				y=by1-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
     
     public void run11(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) (500*Math.sin(3.14*ax)); // x- letter generate 
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
     public void run12(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) (2*Math.pow(ax,2)*ax/400+3*ax+1); //cubic function
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
     public void run13(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) ((40*Math.cos(.5*ax/3.14))+(40*Math.sin(.2*ax/3.14))); // sine + cosine function beautiful when both are unequal amplitude;
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
     public void run14(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) (40*Math.pow((Math.sin(.2*ax/3.14)),3)); //sin cube beautiful 
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
     public void run15(){
		try{
			Thread.sleep(10);
			
			
			if(x<600&&y>30&&y!=600){
				
				 ax = x-300;
				 by = y-300;
			      ax++;
				
			      by = (int) (40*Math.pow((Math.cos(.2*ax/3.14)),3)); //cos cube function
				x=300+ax;
				y=300-by;
				
				
			}
			
			
			
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
    
    
    }

      
