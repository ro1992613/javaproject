import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Map extends JPanel{
	
	public static Wall wall=new Wall(50,50,90,90);
	public static Wall wall2=new Wall(100,100,150,150);
	
	public Map() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(Color.gray);
		g.drawRect(wall.getX1(), wall.getY1(), wall.getX2()-wall.getX1(), wall.getY2()-wall.getY1());
		g.drawRect(wall2.getX1(), wall2.getY1(), wall2.getX2()-wall2.getX1(), wall2.getY2()-wall2.getY1());
	}
}
