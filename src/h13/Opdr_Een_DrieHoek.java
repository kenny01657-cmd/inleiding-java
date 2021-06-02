package h13;

import java.awt.*;
import java.applet.*;

public class Opdr_Een_DrieHoek extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        tekenDriehoek(g,50,100,100,30,150,100);
    }

    void tekenDriehoek(Graphics g, int X1, int Y1 , int X2, int Y2, int X3, int Y3){
        // Driehoek
        g.drawLine(X1,Y1,X2,Y2);
        g.drawLine(X2,Y2,X3,Y3);
        g.drawLine(X3,Y3,X1,Y1);
    }

}