package xuliehua;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Xuliehua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xuliehua xuliehua=new Xuliehua();
		xuliehua.write();
		xuliehua.read();
	}

	public void read(){
		int times=1;
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("d:/1.txt"));
			System.out.println("size="+in.available());
			C1 c1=(C1) in.readObject();
			System.out.println("size="+in.available());
			C2 c2=(C2) in.readObject();
			System.out.println("size="+in.available());
			System.out.println("---->>>>c1="+c1.getT1()+"----->>>>>>c1="+c1.getT2());
			System.out.println("----->>>c2="+c2.getT1()+"--------->>>>c2="+c2.getT2()+"------>c2="+c2.getT3());
			
//			ObjectInputStream in=new ObjectInputStream(new FileInputStream("d:/1.txt"));
//			
//			while(true){
//				System.out.println("times="+times);
//				times++;
//				C1 c1=(C1) in.readObject();
//			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("1times="+times);
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("2times="+times);
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("3times="+times);
			e.printStackTrace();
		}
		
	}
	public void write(){
		C1 c1=new C1();
		c1.setT1(1);
		c1.setT2("2");
		C2 c2=new C2();
		c2.setT1(3);
		c2.setT2("4");
		c2.setT3(5);
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("d:/1.txt"));
			out.writeObject(c1);
			out.writeObject(c2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


class C1 implements Serializable{
	private int t1;
	private String t2;
	public int getT1() {
		return t1;
	}
	public void setT1(int t1) {
		this.t1 = t1;
	}
	public String getT2() {
		return t2;
	}
	public void setT2(String t2) {
		this.t2 = t2;
	}
	
}

class C2 extends C1{
	private int t3;

	public int getT3() {
		return t3;
	}

	public void setT3(int t3) {
		this.t3 = t3;
	}
	
}