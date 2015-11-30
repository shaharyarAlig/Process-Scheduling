import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;


public class ProgessBar extends JPanel implements ActionListener{
	private Timer tm;
	JProgressBar b[];
	JLabel jb[];
	Process p,ptemp;
	public Queue<Process> JobQ,temp;
	int c[];
	public ProgessBar(int n,Queue<Process> Queue){ 
		tm=new Timer(950,this);
		b=new JProgressBar[n];
		jb=new JLabel[n];
		c=new int [n];
		JobQ=new LinkedList<Process>();
		temp=new LinkedList<Process>();
		JobQ.addAll(Queue);
		temp.addAll(Queue);
		for(int i=0;i<n;i++){
			p=temp.poll();
			if(i>0){
				c[i]=-1;
			}
			b[i]=new JProgressBar(0,p.getCpuBurst());
			jb[i]=new JLabel();
			jb[i].setText(Integer.toString(p.getId()+1));
			jb[i].setBounds(0, 10+i*50, 15, 50);
			// Progress Bar
			b[i].setValue(0);
			b[i].setBounds(15, 10+i*50, 150, 50);
			b[i].setBackground(Color.WHITE);
			b[i].setForeground(Color.GREEN);
			b[i].setStringPainted(true);
			this.add(jb[i]);
			this.add(b[i]);
		}
		tm.start();
		
	}
public void actionPerformed(ActionEvent e) {
	
	if(!JobQ.isEmpty()){
		 ptemp=JobQ.poll();
		    int id=ptemp.Id;
			c[id]++;
			
			if(c[id]<=ptemp.getCpuBurst()){
				b[id].setValue(c[id]);	
			}
		
	}
	
	    
	}

}
