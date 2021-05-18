package h04;

import java.awt.*;
import java.applet.*;

public class TrafficLight extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        // Traffic Light
        g.fillRect(160,80,50,100);

        // red light
        g.setColor(Color.red);
        g.fillOval(175,92,20,20);

        // orange light
        g.setColor(Color.orange);
        g.fillOval(175,122,20,20);

        // green light
        g.setColor(Color.green);
        g.fillOval(175,152,20,20);

        // traffic light pole
        g.setColor(Color.black);
        g.fillRect(183,180,5,100);
    }
}
