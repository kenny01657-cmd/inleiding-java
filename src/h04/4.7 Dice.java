package h04;

import java.awt.*;
import java.applet.*;

public class Dice extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRoundRect(140,100,100,100,10,10);
        g.fillOval(160,120,15,15);
        g.fillOval(205,120,15,15);
        g.fillOval(160,165,15,15);
        g.fillOval(205,165,15,15);
    }
}
