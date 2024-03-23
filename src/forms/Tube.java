package forms;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Tube {

	private int width;
    private int height;
    private int x;
    private int y;
    private Color color;
    final Color BLACK_SHADOW = new Color(0, 8, 5);
    final Color BRIGHTNESS = new Color(83,217,103);

    public Tube(int x, int y, int width, int height, Color color) {
        super();
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    void draw(Graphics2D g) {
    	final int topTubeWidth = (int) (width + (width*0.1));
    	final int topTubeHeight = (int) (height - (height*0.6));
    	final int topTubeX = (int) (x - ((topTubeWidth - width)/2 +1));
    	final int topTubeY = (int) (y - topTubeHeight +5);
    	
        g.setColor(color);
        g.fillRoundRect(x, y, width, height,5,5);
    	g.setColor(BLACK_SHADOW);
    	g.setStroke(new BasicStroke(2));
    	g.drawRoundRect(x, y, width, height, 5, 5);
    	g.setColor(color);
        g.fillRect(topTubeX, topTubeY, topTubeWidth, topTubeHeight);
        g.setColor(BLACK_SHADOW);
        g.setStroke(new BasicStroke(4));
        g.drawRect(topTubeX, topTubeY, topTubeWidth, topTubeHeight);
        
        //Shadows
        
        g.setColor(BLACK_SHADOW);
        g.fillRect(topTubeX + (topTubeWidth - 5), topTubeY, 5, topTubeHeight);
        g.fillRect(topTubeX + (topTubeWidth - 17), topTubeY, 10, topTubeHeight);
        g.fillRect(topTubeX + (topTubeWidth - 23), topTubeY, 2, topTubeHeight);
        g.fillRect(topTubeX + (topTubeWidth - 28), topTubeY, 4, topTubeHeight);
        
        g.fillRect(x + (width - 5), y +5, 5, height -6);
        g.fillRect(x + (width - 17), y +5, 10, height-6);
        g.fillRect(x + (width - 23), y +5, 2, height-6);
        g.fillRect(x + (width - 28), y +5, 4, height-6);
        
        //Brightness
        
        g.setColor(BRIGHTNESS);
        g.fillRect(topTubeX + 50, topTubeY+3, 2, topTubeHeight-4);
        g.fillRect(topTubeX + 27, topTubeY+3, 1, topTubeHeight-4);
        g.fillRect(topTubeX + 14, topTubeY+3, 8, topTubeHeight-4);
        g.fillRect(topTubeX + 7, topTubeY+3, 3, topTubeHeight-4);
        
        g.fillRect(x + 50, y +7, 2, height-8);
        g.fillRect(x + 27, y +7, 1, height-8);
        g.fillRect(x + 14, y +7, 8, height-8);
        g.fillRect(x + 7, y +7, 3, height-8);
        
       // g.setColor(BLACK_SHADOW);
        //g.fillOval(x+3, y+3, 10, 10);
       
    }
}
