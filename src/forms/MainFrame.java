package forms;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
    private JPanel canvas;


    public MainFrame() {
        setTitle("Super Mario Bros 3");
        setSize(1024, 645);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Dimension screenSize = toolkit.getScreenSize();
		 
		 	int screenWidth = screenSize.width;
		 	int screenHeight = screenSize.height;

        canvas = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                
                try {
                	BufferedImage bi = ImageIO.read(this.getClass().getResource("ground_texture.jpg"));
                	TexturePaint textura = new TexturePaint(bi, new Rectangle(0,7,20,20));
                	
                	g2d.setPaint(textura);
                	g2d.fillRect(50, 585, screenWidth, 60);
				} catch (IOException ex) {
					// TODO: handle exception
					System.out.println(ex.toString());
				}

                
                
                // Crear e instanciar las figuras
                MisteryBox m1 = new MisteryBox(150,310,40,40, new Color(253,144,101));
                MisteryBox m2 = new MisteryBox(190,310,40,40, new Color(253,144,101));
                MisteryBox m3 = new MisteryBox(870,320,40,40, new Color(253,144,101));
                MisteryBox m4 = new MisteryBox(50,410,40,40, new Color(253,144,101));
                Platform p1 = new Platform(350,370,100,200, new Color(37,144,222));
                Platform p2 = new Platform(300,470,100,100, new Color(240,148,105));
                Platform p3 = new Platform(800,450,250,120, new Color(82,217,108));
                Tube t1 = new Tube(650,480,80,90, new Color(27,133,27));
                
                // Dibujar las figuras
                m1.draw(g2d);
                m2.draw(g2d);
                m3.draw(g2d);
                m4.draw(g2d);
                p1.draw(g2d);
                p2.draw(g2d);
                p3.draw(g2d);
                t1.draw(g2d);
                
                
                
                
                
                g2d.setColor(new Color(33,33,33));
    	    	g2d.setStroke(new BasicStroke(3));
    	    	g2d.drawRect(50, 570, screenWidth, 15);
                g2d.setColor(new Color(251,198,182));
                g2d.fillRect(50, 570, screenWidth, 15);

  
               
            }
        };

        canvas.setBackground(new Color(179,238,254));
        add(canvas);
    }
  }
;