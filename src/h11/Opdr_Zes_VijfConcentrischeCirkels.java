package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr_Zes_VijfConcentrischeCirkels extends Applet {

    public void init() {
    }

    public void paint(Graphics g){
        // Declareren en Initialiseren
        int X = 70;
        int Y = 70;
        int width = 5;
        int height = 5;

        // Vijf cirkels
        for(int teller = 0; teller < 5; teller++){
            width += 20;
            height += 20;
            X -= 10;
            Y -= 10;
            g.drawOval(X,Y,width,height);
        }
    }

}
