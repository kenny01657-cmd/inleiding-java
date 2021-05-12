package h05;

import java.awt.*;
import java.applet.*;

public class ShapesWithVariables extends Applet {
    // declaratie
    // kleur
    Color opvulkleur;
    Color lijnkleur;
    // breedte en hoogte
    int breedte;
    int hoogte;
    // lijn coördinaten
    int LijnX1;
    int LijnY1;
    int LijnX2;
    int LijnY2;
    // lijn string coördinaten
    int LijnStringX;
    int LijnStringY;
    // rechthoek coördinaten
    int RHX;
    int RHY;
    // rechthoek string coördinaten
    int RHSX;
    int RHSY;



    public void init() {
        // initialiseren
        // kleur
        opvulkleur = Color.magenta;
        lijnkleur = Color.black;
        // hoogte en breedte
        breedte = 200;
        hoogte = 100;
        // lijn coördinaten
        LijnX1 = 10;
        LijnY1 = 10;
        LijnX2 = 200;
        LijnY2 = 10;
        // lijn string coördinaten
        LijnStringX = 85;
        LijnStringY = 23;
        // rechthoek coördinaten
        RHX = 10;
        RHY = 50;
        // rechthoek string coördinaten
        RHSX = 75;
        RHSY = 165;
    }




    public void paint(Graphics g) {
        // Lijn
        g.drawLine(LijnX1,LijnY1,LijnX2,LijnY2);
        g.drawString("Lijn",LijnStringX,LijnStringY);

        // Rechthoek
        g.drawRect(RHX,RHY,breedte,hoogte);
        g.drawString("Rechthoek",RHSX,RHSY);

        // Gevulde rechthoek met ovaal
        g.setColor(opvulkleur);
        g.fillRect(250,50,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawOval(250,50,breedte,hoogte);
        g.drawString("Gevulde rechthoek met ovaal",280,165);

        // Taartpunt met ovaal eromheen
        g.drawOval(480,50,breedte,hoogte);
        g.setColor(opvulkleur);
        g.fillArc(480,50,breedte,hoogte,0,45);
        g.setColor(lijnkleur);
        g.drawString("Taartpunt met ovaal eromheen",500,165);

        // Afgeronde rechthoek
        g.drawRoundRect(10,200,breedte,hoogte,30,30);
        g.drawString("Afgeronde rechthoek",50,315);

        // Gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(250,200,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal", 315,315);

        // Cirkel
        g.drawOval(525,200,hoogte,hoogte);
        g.drawString("Cirkel",560,315);
    }
}
