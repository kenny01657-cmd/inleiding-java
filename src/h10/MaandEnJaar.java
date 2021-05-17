package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MaandEnJaar extends Applet {
    TextField tekstvak,jaarVak;
    Label label, label2;
    String maandNaam;
    int maand;
    Button knop;
    int jaartal;

    public void init() {
        jaarVak = new TextField("",20);
        tekstvak = new TextField("",20);
        label2 = new Label("Type het jaarnummer");
        label = new Label("Type het maandnummer");
        knop = new Button("Ok");
        knop.addActionListener(new knopListener());
        maandNaam = "";
        add(label);
        add(tekstvak);
        add(label2);
        add(jaarVak);
        add(knop);
    }

    public void paint(Graphics g){
        g.drawString(maandNaam,50,90);

    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            jaartal = Integer.parseInt(jaarVak.getText());
            maand = Integer.parseInt(tekstvak.getText());
            switch(maand){
                case 1:
                    maandNaam = "Januari, 31 dagen";
                    break;
                case 2:
                    if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) || jaartal % 400 == 0){
                    maandNaam = "Februari, 29 dagen";
                    }
                    else {
                        maandNaam = "Februari, 28 dagen";
                    }
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
            repaint();
        }
    }

}

