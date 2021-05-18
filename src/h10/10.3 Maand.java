package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Maand extends Applet {
    TextField tekstvak;
    Label label;
    String maandNaam;
    int maand;

    public void init() {
        tekstvak = new TextField("",20);
        label = new Label("Type het maandnummer en druk op enter");
        tekstvak.addActionListener(new TekstVakListener());
        maandNaam = "";
        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g){
        g.drawString(maandNaam,50,90);

    }

    class TekstVakListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            maand = Integer.parseInt(tekstvak.getText());
            switch(maand){
                case 1:
                    maandNaam = "Januari, 31 dagen";
                    break;
                case 2:
                    maandNaam = "Februari, 28 dagen";
                    break;
                case 3:
                    maandNaam = "Maart, 31 dagen";
                    break;
                case 4:
                    maandNaam = "April, 30 dagen";
                    break;
                case 5:
                    maandNaam = "Mei, 31 dagen";
                    break;
                case 6:
                    maandNaam = "Juni, 30 dagen";
                    break;
                case 7:
                    maandNaam = "Juli, 31 dagen";
                    break;
                case 8:
                    maandNaam = "Augustus, 30 dagen";
                    break;
                case 9:
                    maandNaam = "September, 31 dagen";
                    break;
                case 10:
                    maandNaam = "Oktober, 30 dagen";
                    break;
                case 11:
                    maandNaam = "November, 31 dagen";
                    break;
                case 12:
                    maandNaam = "December, 30 dagen";
                    break;
            }
            tekstvak.setText("");
            repaint();
        }
    }

}
