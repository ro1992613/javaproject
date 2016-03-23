import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Battle extends JFrame{

	
	
	public Battle() {
		// TODO Auto-generated constructor stub
		setSize(500, 500);
		add(new Map());
		add(new TankPanel());

	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		//g.drawLine(0, 0, 500, 500);			
	}
	
	
	
	
	
	
}
