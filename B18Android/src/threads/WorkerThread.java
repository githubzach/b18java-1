package threads;
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
class WorkerThread implements Runnable {  
	private String message;  
	public WorkerThread(String s){  
		this.message=s;  
	}  
	public void run() {  
		System.out.println(Thread.currentThread().getName()+" (Starting a job) message = "+message);  
		processmessage();//call processmessage method that sleeps the thread for 2 seconds  
		System.out.println(Thread.currentThread().getName()+" (Ending the job)");//prints thread name  
	}  
	private void processmessage() {  
		try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }  
	}  
}