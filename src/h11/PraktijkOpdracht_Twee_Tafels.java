package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class PraktijkOpdracht_Twee_Tafels extends Applet {
    Button knop;
    int tafel, tafel1, tafel2, tafel3, tafel4, tafel5, tafel6, tafel7, tafel8, tafel9, tafel10;
    int berekening1, berekening2, berekening3, berekening4, berekening5, berekening6, berekening7, berekening8, berekening9, berekening10;
    int X = 50;
    int Y = 80;
    int X1, X2, X3, X4, X5, X6, X7, X8, X9, X10;



    public void init() {
        setSize(1000,300);
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add(knop);
    }

    public void paint(Graphics g) {
        // tafel van 1
        if (tafel1 == 1) {
            Y = 80;
            g.drawString("Tafel: " + tafel1, X1, Y - 20);
            for (int teller1 = 1; teller1 < 11; teller1++) {
                berekening1 = teller1 * tafel1;
                g.drawString("" + teller1 + " x " + tafel1 + " = " + berekening1, X1, Y);
                Y += 20;
            }
        }
        // tafel van 2
        if (tafel2 == 2) {
            Y = 80;
            g.drawString("Tafel: " + tafel2, X2, Y - 20);
            for (int teller2 = 1; teller2 < 11; teller2++) {
                berekening2 = teller2 * tafel2;
                g.drawString("" + teller2 + " x " + tafel2 + " = " + berekening2, X2, Y);
                Y += 20;
            }
        }
        // tafel van 3
        if (tafel3 == 3) {
            Y = 80;
            g.drawString("Tafel: " + tafel3, X3, Y - 20);
            for (int teller3 = 1; teller3 < 11; teller3++) {
                berekening3 = teller3 * tafel3;
                g.drawString("" + teller3 + " x " + tafel3 + " = " + berekening3, X3, Y);
                Y += 20;
            }
        }
        // tafel van 4
        if (tafel4 == 4) {
            Y = 80;
            g.drawString("Tafel: " + tafel4, X4, Y - 20);
            for (int teller4 = 1; teller4 < 11; teller4++) {
                berekening4 = teller4 * tafel4;
                g.drawString("" + teller4 + " x " + tafel4 + " = " + berekening4, X4, Y);
                Y += 20;
            }
        }
        // tafel van 5
        if (tafel5 == 5) {
            Y = 80;
            g.drawString("Tafel: " + tafel5, X5, Y - 20);
            for (int teller5 = 1; teller5 < 11; teller5++) {
                berekening5 = teller5 * tafel5;
                g.drawString("" + teller5 + " x " + tafel5 + " = " + berekening5, X5, Y);
                Y += 20;
            }
        }
        // tafel van 6
        if (tafel6 == 6) {
            Y = 80;
            g.drawString("Tafel: " + tafel6, X6, Y - 20);
            for (int teller6 = 1; teller6 < 11; teller6++) {
                berekening6 = teller6 * tafel6;
                g.drawString("" + teller6 + " x " + tafel6 + " = " + berekening6, X6, Y);
                Y += 20;
            }
        }
        // tafel van 7
        if (tafel7 == 7) {
            Y = 80;
            g.drawString("Tafel: " + tafel7, X7, Y - 20);
            for (int teller7 = 1; teller7 < 11; teller7++) {
                berekening7 = teller7 * tafel7;
                g.drawString("" + teller7 + " x " + tafel7 + " = " + berekening7, X7, Y);
                Y += 20;
            }
        }
        // tafel van 8
        if (tafel8 == 8) {
            Y = 80;
            g.drawString("Tafel: " + tafel8, X8, Y - 20);
            for (int teller8 = 1; teller8 < 11; teller8++) {
                berekening8 = teller8 * tafel8;
                g.drawString("" + teller8 + " x " + tafel8 + " = " + berekening8, X8, Y);
                Y += 20;
            }
        }
        // tafel van 9
        if (tafel9 == 9) {
            Y = 80;
            g.drawString("Tafel: " + tafel9, X9, Y - 20);
            for (int teller9 = 1; teller9 < 11; teller9++) {
                berekening9 = teller9 * tafel9;
                g.drawString("" + teller9 + " x " + tafel9 + " = " + berekening9, X9, Y);
                Y += 20;
            }
        }
        // tafel van 10
        if (tafel10 == 10) {
            Y = 80;
            g.drawString("Tafel: " + tafel10, X10, Y - 20);
            for (int teller10 = 1; teller10 < 11; teller10++) {
                berekening10 = teller10 * tafel10;
                g.drawString("" + teller10 + " x " + tafel10 + " = " + berekening10, X10, Y);
                Y += 20;
            }
        }
    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            tafel++;
            switch(tafel){
                case 1:
                    X1 = X;
                    tafel1 = tafel;
                    break;
                case 2:
                    X2 = X + 40;
                    tafel2 = tafel;
                    X2 += 50;
                    break;
                case 3:
                    X3 = X2 + 40;
                    tafel3 = tafel;
                    X3 += 50;
                    break;
                case 4:
                    X4 = X3 + 40;
                    tafel4 = tafel;
                    X4 += 50;
                    break;
                case 5:
                    X5 = X4 + 40;
                    tafel5 = tafel;
                    X5 += 50;
                    break;
                case 6:
                    X6 = X5 + 40;
                    tafel6 = tafel;
                    X6 += 50;
                    break;
                case 7:
                    X7 = X6 + 40;
                    tafel7 = tafel;
                    X7 += 50;
                    break;
                case 8:
                    X8 = X7 + 40;
                    tafel8 = tafel;
                    X8 += 50;
                    break;
                case 9:
                    X9 = X8 + 40;
                    tafel9 = tafel;
                    X9 += 50;
                    break;
                case 10:
                    X10 = X9 + 40;
                    tafel10 = tafel;
                    X10 += 50;
                    break;
            }
            repaint();
        }
    }
}
