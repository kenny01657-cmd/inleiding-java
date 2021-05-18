package h05;

import java.awt.*;
import java.applet.Applet;

public class Opdr_Twee_StaafDiagram extends Applet {
    int GewichtValerie;
    int GewichtJeroen;
    int GewichtHans;

    int ValerieY;
    int JeroenY;
    int HansY;

    int GewichtV;
    int GewichtJ;
    int GewichtH;

    public void init() {
        GewichtValerie = 30;
        GewichtJeroen = 100;
        GewichtHans = 30;

        GewichtV = GewichtValerie*2;
        GewichtJ = GewichtJeroen*2;
        GewichtH = GewichtHans*2;

        ValerieY = 250 - GewichtV;
        JeroenY = 250 - GewichtJ;
        HansY = 250 - GewichtH;
    }

    public void paint(Graphics g){
        // diagram
        g.drawLine(50,50,50,250);
        g.drawLine(50,250,250,250);

        // 0 kg
        g.drawString("0", 30, 255);

        // 20 kg
        g.drawLine(45,210,55,210);
        g.drawString("20", 25,215);

        // 40 kg
        g.drawLine(45,170,55,170);
        g.drawString("40", 25,175);

        // 60 kg
        g.drawLine(45,130,55,130);
        g.drawString("60", 25,135);

        // 80 kg
        g.drawLine(45,90,55,90);
        g.drawString("80", 25,95);

        // 100 kg
        g.drawLine(45,50,55,50);
        g.drawString("100", 20,55);

        // kg
        g.drawString("kg",15,25);

        // Valerie
        g.drawString("Valerie",66,265);
        g.setColor(Color.blue);
        g.fillRect(72,ValerieY,20,GewichtV);

        // Jeroen
        g.setColor(Color.black);
        g.drawString("Jeroen",132,265);
        g.setColor(Color.green);
        g.fillRect(140,JeroenY,20,GewichtJ);

        // Hans
        g.setColor(Color.black);
        g.drawString("Hans",198,265);
        g.setColor(Color.red);
        g.fillRect(200,HansY,20,GewichtH);
    }

}
