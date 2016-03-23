package others;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final F f=new F();
		for (int i = 0; i < 10000; i++) {
			new Thread(){
				@Override
				public void run() {
					// TODO Auto-generated method stub					
					f.f();
				}
			}.start();
		}
	}

}
class F{
	static int num=1;
	public void f(){
		int i=num+1;
		num=i;
		System.out.println(num);
	}
}
//class F{
//	static int num=1;
//	private Lock lock=new ReentrantLock();
//	public void f(){
//		lock.lock();
//		try{
//			int i=num+1;
//			num=i;
//			System.out.println(num);
//		}finally{
//			lock.unlock();
//		}
//	}
//}