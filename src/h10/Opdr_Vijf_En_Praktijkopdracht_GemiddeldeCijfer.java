package h10;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdr_Vijf_En_Praktijkopdracht_GemiddeldeCijfer extends Applet {
    // Declareren
    TextField tekstvak;
    Label label;
    Button knop;
    double cijfer;
    double cijfer1,cijfer2,cijfer3,cijfer4,cijfer5;
    int aantalCijfers;
    String beoordeling1, beoordeling2, beoordeling3, beoordeling4, beoordeling5, beoordeling6;
    double gemiddeldeCijfer;
    String tekst;
    int X;
    int Y;


    public void init() {
        // Initialiseren
        X = 50;
        Y = 60;
        tekst = "";
        tekstvak = new TextField("",10);
        label = new Label("Type hier uw cijfer");
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add(label);
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g){
        // Cijfers met beoordeling
        if (cijfer1 > 0) {
            g.drawString("" + cijfer1 + " " + beoordeling1, X, Y);
        }
        if(cijfer2 > 0) {
            g.drawString("" + cijfer2 + " " + beoordeling2, X, Y+20);
        }
        if (cijfer3 > 0) {
            g.drawString("" + cijfer3 + " " + beoordeling3, X, Y+40);
        }
        if (cijfer4 > 0) {
            g.drawString("" + cijfer4 + " " + beoordeling4, X, Y+60);
        }
        if (cijfer5 > 0) {
            g.drawString("" + cijfer5 + " " + beoordeling5, X, Y+80);
        }
        // Waarschuwing tekst
        g.drawString(tekst,X+50,Y+150);
        // Gemiddelde cijfer en beoordeling weergeven
        g.drawString("Je gemiddelde cijfer is: " + gemiddeldeCijfer + " " + beoordeling6, X+100, Y+190);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            cijfer = Double.parseDouble(tekstvak.getText());
            if (cijfer >= 0 && cijfer <= 10) {
                tekst = "";
                aantalCijfers++;
                switch (aantalCijfers) {
                    // beoordeling voor cijfer 1
                    case 1:
                        cijfer1 = cijfer;
                        if (cijfer1 < 4) {
                            beoordeling1 = "Slecht";
                        }
                        if (cijfer1 >= 4 && cijfer1 <= 4.9) {
                            beoordeling1 = "Onvoldoende";
                        }
                        if (cijfer1 >= 5 && cijfer1 <= 5.9) {
                            beoordeling1 = "Matig";
                        }
                        if (cijfer1 >= 6 && cijfer1 <= 7.9) {
                            beoordeling1 = "voldoende";
                        }
                        if (cijfer1 >= 8 && cijfer1 <= 10) {
                            beoordeling1 = "goed";
                        }
                        break;

                    // beoordeling voor cijfer 2
                    case 2:
                        cijfer2 = cijfer;
                        if (cijfer2 < 4) {
                            beoordeling2 = "Slecht";
                        }
                        if (cijfer2 >= 4 && cijfer2 <= 4.9) {
                            beoordeling2 = "Onvoldoende";
                        }
                        if (cijfer2 >= 5 && cijfer2 <= 5.9) {
                            beoordeling2 = "Matig";
                        }
                        if (cijfer2 >= 6 && cijfer2 <= 7.9) {
                            beoordeling2 = "voldoende";
                        }
                        if (cijfer2 >= 8 && cijfer2 <= 10) {
                            beoordeling2 = "goed";
                        }
                        break;

                    // beoordeling voor cijfer 3
                    case 3:
                        cijfer3 = cijfer;
                        if (cijfer3 < 4) {
                            beoordeling3 = "Slecht";
                        }
                        if (cijfer3 >= 4 && cijfer3 <= 4.9) {
                            beoordeling3 = "Onvoldoende";
                        }
                        if (cijfer3 >= 5 && cijfer3 <= 5.9) {
                            beoordeling3 = "Matig";
                        }
                        if (cijfer3 >= 6 && cijfer3 <= 7.9) {
                            beoordeling3 = "voldoende";
                        }
                        if (cijfer3 >= 8 && cijfer3 <= 10) {
                            beoordeling3 = "goed";
                        }
                        break;

                    // beoordeling voor cijfer 4
                    case 4:
                        cijfer4 = cijfer;
                        if (cijfer4 < 4) {
                            beoordeling4 = "Slecht";
                        }
                        if (cijfer4 >= 4 && cijfer4 <= 4.9) {
                            beoordeling4 = "Onvoldoende";
                        }
                        if (cijfer4 >= 5 && cijfer4 <= 5.9) {
                            beoordeling4 = "Matig";
                        }
                        if (cijfer4 >= 6 && cijfer4 <= 7.9) {
                            beoordeling4 = "voldoende";
                        }
                        if (cijfer4 >= 8 && cijfer4 <= 10) {
                            beoordeling4 = "goed";
                        }
                        break;

                    // beoordeling voor cijfer 5
                    case 5:
                        cijfer5 = cijfer;
                        if (cijfer5 < 4) {
                            beoordeling5 = "Slecht";
                        }
                        if (cijfer5 >= 4 && cijfer5 <= 4.9) {
                            beoordeling5 = "Onvoldoende";
                        }
                        if (cijfer5 >= 5 && cijfer5 <= 5.9) {
                            beoordeling5 = "Matig";
                        }
                        if (cijfer5 >= 6 && cijfer5 <= 7.9) {
                            beoordeling5 = "voldoende";
                        }
                        if (cijfer5 >= 8 && cijfer5 <= 10) {
                            beoordeling5 = "goed";
                        }
                        break;

                }
            }

            else {
                tekst = "Dit is geen geldig nummer";
            }
            // berekening van gemiddelde cijfer
            if (aantalCijfers == 5) {
                gemiddeldeCijfer = ((cijfer1 + cijfer2 + cijfer3 + cijfer4 + cijfer5)/aantalCijfers)*10;
                gemiddeldeCijfer = (int) gemiddeldeCijfer;
                gemiddeldeCijfer = gemiddeldeCijfer/10;

                // beoordeling voor gemiddelde cijfer
                if (gemiddeldeCijfer < 4) {
                    beoordeling6 = "Slecht";
                }
                if (gemiddeldeCijfer >= 4 && gemiddeldeCijfer <= 4.9) {
                    beoordeling6 = "Onvoldoende";
                }
                if (gemiddeldeCijfer >= 5 && gemiddeldeCijfer <= 5.9) {
                    beoordeling6 = "Matig";
                }
                if (gemiddeldeCijfer >= 6 && gemiddeldeCijfer <= 7.9) {
                    beoordeling6 = "voldoende";
                }
                if (gemiddeldeCijfer >= 8 && gemiddeldeCijfer <= 10) {
                    beoordeling6 = "goed";
                }

            }
            tekstvak.setText("");
            repaint();
        }
    }




}
