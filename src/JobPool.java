import java.awt.Color;
import java.util.LinkedList;
import java.util.Queue;


public class JobPool {
	public Queue<Process> JobQueue,T,ReadQUeue,tempReadQUeue; // Job Queue to hold all job
	PaintReadyQueue object;
	public JobPool(){
		JobQueue=new LinkedList<Process>();
		 T=new LinkedList<Process>();
		 ReadQUeue=new LinkedList<Process>();
		 tempReadQUeue=new LinkedList<Process>();
	}
	public void InsertJob(int id,int atime,int cputime,Color c){
		JobQueue.add(new Process(id,atime,cputime,c));
		T.add(new Process(id,atime,cputime,c));
		
	}
	public void insertReady(Process p){
		ReadQUeue.add(p);
		tempReadQUeue.add(p);
	}

}
