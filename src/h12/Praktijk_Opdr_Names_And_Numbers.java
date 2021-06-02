package h12;

import javax.xml.soap.Text;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijk_Opdr_Names_And_Numbers extends Applet {
    // Declareren
    TextField naamVak;
    TextField telNummerVak;
    String[] Naam;
    int[] telNummer;
    Button knop;
    int aantal;
    int i;

    public void init() {
        // Initialiseren
        telNummer = new int[10];
        Naam = new String[10];
        naamVak = new TextField("Naam",20);
        knop = new Button("Ok");
        telNummerVak = new TextField("Telefoon nummer",20);
        knop.addActionListener(new KnopListener());
        add(naamVak);
        add(telNummerVak);
        add(knop);
    }

    public void paint(Graphics g) {
        // Naam en telefoon nummer weergeven
        int y;
        y = 50;
        for(i = 0; i < aantal; i++) {
            g.drawString(i + 1 + " " + Naam[i], 30, y);
            g.drawString("" + telNummer[i], 190, y);
            y += 20;
        }
    }

    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            // De ingevoerde waardes toegevoegt
            Naam[i] = naamVak.getText();
            telNummer[i] = Integer.parseInt(telNummerVak.getText());
            aantal++;
            repaint();
        }
    }

}
