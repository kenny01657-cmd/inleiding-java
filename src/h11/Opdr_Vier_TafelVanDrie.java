package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr_Vier_TafelVanDrie extends Applet {


    public void init() {
    }

    public void paint(Graphics g){
        int teller;
        int X = 50;
        int Y = 60;
        int Tafel = 3;
        int berekening;


        for (teller = 1; teller < 11; teller++){
            Y += 20;
            berekening = teller * Tafel;
            g.drawString("" + teller + " * " + Tafel + " = " + berekening,X,Y);
        }
    }

}
