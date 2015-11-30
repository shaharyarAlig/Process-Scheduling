import java.awt.*;


public class Process {
	public int Id=0;
	private int ATime,CpuBurst,RTime,WTime,LstRTime,IstRTime; // ArrivalTime<---ATime , RemainingTime<---RTime
	private  Color color;
	private int lastCpuburst;
	public int pb=0; // for progress bar;
	public Process(int id,int atime,int cputime,Color c){
		Id=id;
		ATime=atime;
		CpuBurst=cputime;
		color=c;
		RTime=cputime;
		lastCpuburst=0;
	}
	public int getId(){
		return Id;
	}
	public int getArrivalTime(){
		return ATime;
	}
	public int getCpuBurst(){
		return CpuBurst;
	}
	public Color getColor(){
		return color;
	}
	public int getRemainingTime(){
		return RTime;
	}
	public int getIstResponseTime(){
		return IstRTime;
	}
	public int getLastResponseTime(){
		return LstRTime;
	}
	public int getwaitingTime(){
		return WTime;
	}
	public void Decrement(){
		RTime--;
		pb++;
	}
	public void setIstResponseTime(int t){
		IstRTime=t;
	}
    public void setLastResponseTime(int t){
    	LstRTime=t;
	}
    public void setWaitTime(int t){
    	WTime=t+1-CpuBurst-ATime;
	}
	public void setLastCpuBurst(int t){
		lastCpuburst=lastCpuburst+t;
	}
	public int getLastCpuBurst(){
		return lastCpuburst;
	}
	public void newsetWaitTime(int t){
    	WTime=t+1-CpuBurst-ATime;
    	
	}

}
