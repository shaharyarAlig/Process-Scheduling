import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;
public class CpuProcess extends JPanel implements ActionListener{
	
	private Timer tm;
	int time;
	int n;
	int x;
	int c=0;
	public Process p=null;
	public Queue<Process> JobQ,temp;
	public CpuProcess(int t){
		JobQ=new LinkedList<Process>();
		temp=new LinkedList<Process>();
		tm=new Timer(1000,this);
		n=0;
		x=5;
		time=t;
		tm.start();
	}
	public void actionPerformed(ActionEvent e) {
		p=JobQ.remove();
	    repaint();
	    n++;
	    if(n>=time){
	    	tm.stop();
	    }
	}
	public void paint(Graphics g){
		if(p!=null){
			g.setColor(p.getColor());
			g.fillRect(10, 10, 100,70);
			g.setColor(Color.WHITE);
			g.drawString(Integer.toString(1+p.getId()), 30, 25);
		}
		
	}

}
