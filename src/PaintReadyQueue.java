import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

public class PaintReadyQueue extends JPanel implements ActionListener{
	private Timer tm;
	public Process p;
	public Queue<Process> ReadyQueue,temp,all;
	int x=10;
	int c=0;
	int array[];
	int totalTime;
	public PaintReadyQueue(int t){
		tm=new Timer(1000,this);	
		ReadyQueue=new LinkedList<Process>();
		temp=new LinkedList<Process>();
		all=new LinkedList<Process>();
		array=new int[100];
		totalTime=t;
		tm.start();
	}
	

	public void actionPerformed(ActionEvent e) {
		int len=array[c];
		if(c<totalTime){
			temp.clear();
		}

		//temp.clear();
		for(int i=0;i<len;i++){
			temp.add(all.remove());
		}
		x=10;
	    c++;
	    if(c>=100){
	    	c=99;
	    }
	    repaint();
	}
	public void paint(Graphics g){
		super.paint(g);
			for(int i=0;i<temp.size();i++){
				g.setColor(temp.peek().getColor());
				g.fillRect(x, 10, 25,60);
				g.setColor(Color.WHITE);
				g.drawString(Integer.toString(1+temp.peek().getId()), x, 25);
				x+=30;
				p=temp.poll();
				temp.add(p);
		}
	}

}
