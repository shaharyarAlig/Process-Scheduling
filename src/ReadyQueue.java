import java.awt.Color;
import java.util.LinkedList;
import java.util.Queue;


public class ReadyQueue {
	
	Queue<Process> readyqueue,temprq;
	public ReadyQueue(){
		readyqueue=new LinkedList<Process>();
		temprq=new LinkedList<Process>();	
	}
	public void InsertJob(Process p){
		readyqueue.add(p);
		temprq.add(p);
	}

}
