package forms;

import java.awt.Color;
import java.awt.Graphics2D;

public class Bolt {
	
    private int x;
    private int y;
    final Color BLACK_SHADOW = new Color(33,33,33);
    final Color BOLT_COLOR = new Color(239,244,249);
    private int radius = 5;    
    

    
    public Bolt(int x, int y, int radius) {
        super(); 
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    void draw(Graphics2D g) {   
    	
     	double angle = Math.toRadians(135); 
        int x1 = x+radius - (int) (radius * Math.cos(angle)); 
        int y1 = y+radius - (int) (radius * Math.sin(angle)); 
        int x2 = x+radius + (int) (radius * Math.cos(angle)); 
        int y2 = y+radius + (int) (radius * Math.sin(angle)); 
    	
    	g.setColor(BOLT_COLOR.darker());
    	g.fillOval(x, y, radius * 2, radius * 2);
    	g.setColor(BOLT_COLOR);
    	g.fillOval(x, y, (radius-1) * 2, (radius-1) * 2);
    	g.setColor(BLACK_SHADOW);
    	g.drawOval(x, y, radius * 2, radius * 2);
   
        g.drawLine(x1, y1, x2, y2);

    	
    	
    }
}
