

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class TankPanel  extends JPanel{

private ArrayList<Tank> list;
	

	public TankPanel() {
		// TODO Auto-generated constructor stub
		list=addTank();
		while(true){
			new Thread(){
				@Override
				public synchronized void run() {
					// TODO Auto-generated method stub
					super.run();
					tankMove();
					drawTank(getGraphics(), list);
				}
			}.start();
		}
		
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		
		
	}
	public void drawTank(Graphics g,ArrayList<Tank> list){
		for(int i=0;i<list.size();i++){

			g.drawRect(list.get(i).getXseat(), list.get(i).getYseat(), list.get(i).getWidth(), list.get(i).getHeight());
			
			System.out.println("*--*************------------>>>>>>>>>>>");
		}		
	}
	
	public ArrayList<Tank> addTank(){
		ArrayList<Tank> list=new ArrayList<Tank>();
		for(int i=1;i<=5;i++){
			Tank tank=new Tank();
			tank.setXseat(i*50);
			tank.setYseat(50);
			list.add(tank);
		}
		return list;
	}
	
	public void tankMove(){
		
		for(int i=0;i<list.size();i++){
			Tank tank=list.get(i);
			if(tank.getXseat()==0){
				tank.setFx("r");
			}
			if(tank.getXseat()==500){
				tank.setFx("l");
			}
			if(tank.getYseat()==0){
				tank.setFx("d");
			}
			if(tank.getXseat()==500){
				tank.setFx("u");
			}
			tank.move();
			
		}
	}
}
