
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex3  
{
        JFrame f1;
        JPanel main, sub;
       
        JButton b1,b2;
        
        
    public Ex3() 
    { 
      
      
       
        f1 = new JFrame("Graphics Example");
          f1.setSize(700,700);
          f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
          
        Container c1 = f1.getContentPane();
          
       
         main = new JPanel(); 
          
          
        
        b1 =  new JButton("Start");
         
         b2 =  new JButton("End");
          
         
        sub = new JPanel(); 
          sub.add(b1);
          sub.add(b2);
                     
       main.add(sub); 
        
        c1.add(main);
        f1.show(); 
    
    }
    
    
}