package h06;

import java.awt.*;
import java.applet.*;


public class Karwei extends Applet {
    // Declareren
    double totaalBedrag;
    double bedragJan;
    double bedragAli;
    double bedragJeannette;
    double bedragKenny;
    int aantalPersonen;

    int X;
    int Y;
    int Y1;
    int Y2;
    int Y3;
    int Y4;


    public void init() {
        // Initialiseren
        aantalPersonen = 4;
        totaalBedrag = 113;
        bedragJan = totaalBedrag/aantalPersonen;
        bedragAli = totaalBedrag/aantalPersonen;
        bedragJeannette = totaalBedrag/aantalPersonen;
        bedragKenny = totaalBedrag/aantalPersonen;

        X = 20;
        Y = 20;
        Y1 = 40;
        Y2 = 55;
        Y3 = 70;
        Y4 = 85;
    }

    public void paint(Graphics g) {
        // Applet
        g.drawString("Het totaal bedrag is: " + totaalBedrag + " euro",X,Y);
        g.drawString("Jan krijgt: " + bedragJan + " euro",X,Y1);
        g.drawString("Ali krijgt: " + bedragAli + " euro",X,Y2);
        g.drawString("Jeannette krijgt: " + bedragJeannette + " euro",X,Y3);
        g.drawString("Kenny krijgt: " + bedragKenny + " euro",X,Y4);
    }
}
