package threadsLesson3;


public class Demo3 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() 
		{

			@Override
			public void run() {
				
				for(int i=0;i<10;i++){
					System.out.println("run - Current Thread ID is:" + Thread.currentThread().getId() +"   And The Value IS:" + i);
				}		
			
		}});		
				
		t1.start();

	}

}


