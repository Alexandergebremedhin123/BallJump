/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balljump;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class BallJump extends JApplet implements Runnable{
    Image pic;
Image pic2;
   Thread t;
   int a=100, b=365, c,d,e, f,n;
 JButton button1,button2;
     public void init(){
         t=new Thread(this);
        t.start();
       pic=Toolkit.getDefaultToolkit().getImage("tennis2.png");
       /*pic2=getImage(getDocumentBase(),);*/
               setSize(1000, 500);
       button1=new JButton("up");
   button2=new JButton("right");    
      add(button1);
    add(button2); 

     
               
             button1.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
        up(); 
    
       }
   });
      button2.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
     
          
           right();
           
       }
   });
         setLayout(new FlowLayout());        
      
        }

      public void up(){
       b-=200;   
      }
     public void right(){
          a+=150; 
      }  
       public void paint(Graphics g) { 
          super.paint(g);
     
  Graphics2D g2=(Graphics2D) g;
      g2.setStroke(new BasicStroke(5));
    g2.drawImage(pic, a, b, this);
 Graphics2D g3=(Graphics2D) g;
      g3.setStroke(new BasicStroke(15));
      g3.drawLine(70, 420, 180,420);
 
 Graphics2D g4=(Graphics2D) g;
      g4.setStroke(new BasicStroke(15));
      g4.drawLine(240, 340, 350,340);
Graphics2D g5=(Graphics2D) g;
      g5.setStroke(new BasicStroke(15));
      g5.drawLine(410,260,520,260);
Graphics2D g6=(Graphics2D) g;
      g6.setStroke(new BasicStroke(15));
      
      g6.drawLine(580, 180, 690,180);
Graphics2D g7=(Graphics2D) g;
      g7.setStroke(new BasicStroke(15));
      g7.drawLine(750, 100, 860,100);
      
}

 
  
       @Override
    public void run() {
    
    while(true){
    try {
    t.sleep(500);
    } catch (InterruptedException ex) {
    Logger.getLogger(BallJump.class.getName()).log(Level.SEVERE, null, ex);
    }
   
     if(b<365){
     
        b+=50;
        if(a>100&&b>275){
        b=285;
        }
        if(a>250&&b>185){
        b=205;
        }
        if(a>400&&b>115){
        b=135;
        }
         if(a>550&&b>35){
        b=55;
        }
          if(a>700&&b>35){
        b=35;
        }
          if(a>800){
          a=900;b=350;
          }
      

    } 
    
    
        /*
    else if(b==320){
    b=300;
    }*/
 repaint();
    }
     
    }

 

    
}
