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

    // lijn
    int LijnX1;
    int LijnY1;
    int LijnX2;
    int LijnY2;
    int LijnStringX;
    int LijnStringY;

    // rechthoek
    int RHX;
    int RHY;
    int RHSX;
    int RHSY;

    // gevulde rechtgoek met ovaal
    int GRX;
    int GRY;
    int OvalX;
    int OvalY;
    int StringX;
    int StringY;

    // Taartpunt met ovaal eromheen
    int OvaalX;
    int OvaalY;
    int TaartPuntX;
    int TaartPuntY;
    int TPStartAngle;
    int TPArcAngle;
    int TPStringX;
    int TPstringY;

    // Afgeronde rechthoek
    int ARX;
    int ARY;
    int ArcWidth;
    int ArcHeight;
    int StrX;
    int StrY;

    // Gevulde ovaal
    int GevuldeOvaalX;
    int GevuldeOvaalY;
    int StrX1;
    int StrY1;

    // Cirkel
    int CirkelX;
    int CirkelY;
    int CirkelStringX;
    int CirkelStringY;



    public void init() {
        // initialiseren

        // kleur
        opvulkleur = Color.magenta;
        lijnkleur = Color.black;

        // hoogte en breedte
        breedte = 200;
        hoogte = 100;

        // lijn
        LijnX1 = 10;
        LijnY1 = 10;
        LijnX2 = 200;
        LijnY2 = 10;
        LijnStringX = 90;
        LijnStringY = 23;

        // rechthoek
        RHX = 10;
        RHY = 50;
        RHSX = 75;
        RHSY = 165;

        // gevulde rechtgoek met ovaal
        GRX = 250;
        GRY = 50;
        OvalX = 250;
        OvalY = 50;
        StringX = 280;
        StringY = 165;

        // Taartpunt met ovaal eromheen
        OvaalX = 480;
        OvaalY = 50;
        TaartPuntX = 480;
        TaartPuntY = 50;
        TPStartAngle = 0;
        TPArcAngle = 45;
        TPStringX = 500;
        TPstringY = 165;

        // Afgeronde rechthoek
        ARX = 10;
        ARY = 200;
        ArcWidth = 30;
        ArcHeight = 30;
        StrX = 50;
        StrY = 315;

        // Gevulde ovaal
        GevuldeOvaalX = 250;
        GevuldeOvaalY = 200;
        StrX1 = 315;
        StrY1 = 315;

        // Cirkel
        CirkelX = 525;
        CirkelY = 200;
        CirkelStringX = 560;
        CirkelStringY = 315;

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
        g.fillRect(GRX,GRY,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawOval(OvalX,OvalY,breedte,hoogte);
        g.drawString("Gevulde rechthoek met ovaal",StringX,StringY);

        // Taartpunt met ovaal eromheen
        g.drawOval(OvaalX,OvaalY,breedte,hoogte);
        g.setColor(opvulkleur);
        g.fillArc(TaartPuntX,TaartPuntY,breedte,hoogte,TPStartAngle,TPArcAngle);
        g.setColor(lijnkleur);
        g.drawString("Taartpunt met ovaal eromheen",TPStringX,TPstringY);

        // Afgeronde rechthoek
        g.drawRoundRect(ARX,ARY,breedte,hoogte,ArcWidth,ArcHeight);
        g.drawString("Afgeronde rechthoek",StrX,StrY);

        // Gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(GevuldeOvaalX,GevuldeOvaalY,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal", StrX1,StrY1);

        // Cirkel
        g.drawOval(CirkelX,CirkelY,hoogte,hoogte);
        g.drawString("Cirkel",CirkelStringX,CirkelStringY);
    }
}
