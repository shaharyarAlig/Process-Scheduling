import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.*;


public class Animation extends JPanel implements ActionListener{
	private Timer tm;
	Toolkit t; 
	Image image[];
	int c;
	public Animation(){
		tm=new Timer(10,this);
		t=Toolkit.getDefaultToolkit(); 
		image=new Image[8];
		c=0;
		image[0]=t.getImage("icon//animation//0.png");
		image[1]=t.getImage("icon//animation//1.png");
		image[2]=t.getImage("icon//animation//2.png");
		image[3]=t.getImage("icon//animation//3.png");
		image[4]=t.getImage("icon//animation//4.png");
		image[5]=t.getImage("icon//animation//5.png");
		image[6]=t.getImage("icon//animation//6.png");
		image[7]=t.getImage("icon//animation//7.png");
		tm.start();
	}
	
	public void actionPerformed(ActionEvent e) {
		 c++;
		 if(c>7){
			 c=0;
		 }
		
	    repaint();
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.drawImage(image[c],0 , 10, 115, 93, null);
	}
	

}
