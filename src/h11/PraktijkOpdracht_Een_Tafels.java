package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class PraktijkOpdracht_Een_Tafels extends Applet {
    // Declareren en Initialiseren
    TextField tekstvak;
    Label label;
    Button knop;
    int tafel;
    int Y = 60;
    int X = 50;
    int berekening;
    int teller;


    public void init() {
        // Applet
        tekstvak = new TextField("",10);
        label = new Label("Voer hier een nummer in ");
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add(label);
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g){
        // berekenen en weergeven van tafels
        if(tafel > 0) {
            for (teller = 1; teller < 11; teller++) {
                berekening = teller * tafel;
                g.drawString("" + teller + " x " + tafel + " = " + berekening, X, Y);
                Y += 20;
            }
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            // tafel een waarde geven
            tafel = Integer.parseInt(tekstvak.getText());
            Y = 60;
            repaint();
        }
    }

}
