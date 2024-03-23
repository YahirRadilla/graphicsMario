package forms;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Platform {

		private int width;
	    private int height;
	    private int x;
	    private int y;
	    private Color color;
	    final Color BLACK_SHADOW = new Color(33,33,33);

	    public Platform(int x, int y, int width, int height, Color color) {
	        super();
	        this.width = width;
	        this.height = height;
	        this.x = x;
	        this.y = y;
	        this.color = color; 	
	    }

	    public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public Color getColor() {
			return color;
		}

		public void setColor(Color color) {
			this.color = color;
		}

		void draw(Graphics2D g) {
	    	g.setColor(BLACK_SHADOW);
		    g.fillRoundRect(x+15, y+10, width, height-9,5,5);
	        g.setColor(color);
	        g.fillRoundRect(x, y, width, height,5,5);
	        g.setColor(color.brighter());
	        g.fillRoundRect(x, y, width-4, height-4,5,5);
	    	g.setColor(BLACK_SHADOW);
	    	g.setStroke(new BasicStroke(2));
	    	g.drawRoundRect(x, y, width, height, 5, 5);
	    	
	    	Bolt boltUpperLeft = new Bolt(x+5,y+5, 5);
	    	Bolt boltUpperRight = new Bolt(x+width-20,y+5, 5);
	    	Bolt boltBottomLeft = new Bolt(x+5,y+height-16, 5);
	    	Bolt boltBottomRight = new Bolt(x+width-20,y+height-16, 5
	    			);


	    	

	    	
	    	boltUpperLeft.draw(g);
	    	boltUpperRight.draw(g);
	    	boltBottomLeft.draw(g);
	    	boltBottomRight.draw(g);
	    	
	    	


	       // g.setColor(BLACK_SHADOW);
	        //g.fillOval(x+3, y+3, 10, 10);
	       
	    }
}
