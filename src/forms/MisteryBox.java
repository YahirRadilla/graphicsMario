package forms;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MisteryBox extends Platform{
	
	public MisteryBox(int x, int y, int width, int height, Color color) {
		super(x, y, width, height, color);
	}

	@Override
	void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		final int x = super.getX();
		final int y = super.getY();
		final int width = super.getWidth();
		final int height = super.getHeight();
		final Color color = super.getColor();
		final Color BLACK_SHADOW = super.BLACK_SHADOW;
		final int boltX = (int) (x+(width * 0.1));
		final int boltY = (int) (y+(height * 0.1));
		
   
        g.setColor(color);
        g.fillRoundRect(x, y, width, height,5,5);
        g.setColor(BLACK_SHADOW);
        g.setStroke(new BasicStroke(2));
        g.drawRoundRect(x, y, width, height,5,5);
        
        Bolt boltUpperLeft = new Bolt(boltX,boltY, 1);
    	Bolt boltUpperRight = new Bolt((int) (x+width - (width * 0.2)),boltY, 1);
    	Bolt boltBottomLeft = new Bolt(boltX,(int) (y+height - (height * 0.2)), 1);
    	Bolt boltBottomRight = new Bolt((int) (x+width - (width * 0.2)),(int) (y+height - (height * 0.2)), 1);
    	
    	
    	boltUpperLeft.draw(g);
    	boltUpperRight.draw(g);
    	boltBottomLeft.draw(g);
    	boltBottomRight.draw(g);
        
	}
	
	
}
