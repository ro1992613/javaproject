import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Tank{
	
	
	
	private int xseat;
	private int yseat;
	
	private int speed=2;
	
	private String fx="d";
	
	private int height=20;
	private int width=20;
	
	
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	
	public int getXseat() {
		return xseat;
	}
	public void setXseat(int xseat) {
		this.xseat = xseat;
	}
	public int getYseat() {
		return yseat;
	}
	public void setYseat(int yseat) {
		this.yseat = yseat;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getFx() {
		return fx;
	}
	public void setFx(String fx) {
		this.fx = fx;
	}
	public void move(){
		if(fx.equals("d")){
			if(yseat<=500){
				yseat=yseat+speed;
			}			
		}
		if(fx.equals("u")){
			if(yseat>=0){
				yseat=yseat-speed;
			}
		}
		if(fx.equals("l")){
			if(xseat>=0){
				xseat=xseat-speed;
			}
		}
		if(fx.equals("r")){
			if(xseat<=500){
				xseat=xseat+speed;
			}
		}
		
	}
	
}
