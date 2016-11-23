package threadsLesson2;

class MyClass implements Runnable {
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++){
			System.out.println("run - Current Thread ID is:" + Thread.currentThread().getId() +"   And The Value IS:" + i);
		}
		
	}
	
}

public class Demo2 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyClass());
		Thread t2 = new Thread(new MyClass());
		t1.start();
		t2.start();

	}

}


