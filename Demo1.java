package threadsLesson1;

 class myclass extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("run - Current Thread ID is:" + Thread.currentThread().getId() +"   And The Value IS:" + i);
		}
		try {
			Thread.sleep(1009);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


}	
	
	public class Demo1 {
		
	  public static void main(String[] args) {
		  myclass f1 = new myclass();
		f1.start();
	  myclass f2 = new myclass();
	  f2.start();
	}

	
	
	}