package h04;

import java.awt.*;
import java.applet.*;

public class Shapes extends Applet {

    public void init() {
    }


    public void paint(Graphics g) {
        // Lijn
        g.drawLine(10,10,200,10);
        g.drawString("Lijn",85,23);

        // Rechthoek
        g.drawRect(10,50,200,100);
        g.drawString("Rechthoek",75,165);

        // Gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(250,50,200,100);
        g.setColor(Color.black);
        g.drawOval(250,50,200,100);
        g.drawString("Gevulde rechthoek met ovaal",280,165);

        // Taartpunt met ovaal eromheen
        g.drawOval(480,50,200,100);
        g.setColor(Color.magenta);
        g.fillArc(480,50,200,100,0,45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen",500,165);

        // Afgeronde rechthoek
        g.drawRoundRect(10,200,200,100,30,30);
        g.drawString("Afgeronde rechthoek",50,315);

        // Gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(250,200,200,100);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 315,315);

        // Cirkel
        g.drawOval(525,200,100,100);
        g.drawString("Cirkel",560,315);
    }
}
