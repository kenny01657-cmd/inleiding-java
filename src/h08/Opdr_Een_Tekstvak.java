package h08;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdr_Een_Tekstvak extends Applet {
    TextField tekstvak;
    Label label;
    Button ok_Knop;
    String schermTekst;
    Button reset_Knop;

    public void init() {
        setSize(500,300);
        schermTekst = "";
        tekstvak = new TextField("",20);
        label = new Label("Type iets in het tekstvakje");
        ok_Knop = new Button("Ok");
        ok_Knop.addActionListener(new ok_KnopListener());
        reset_Knop = new Button("Reset");
        reset_Knop.addActionListener(new reset_KnopListener());
        add(label);
        add(tekstvak);
        add(ok_Knop);
        add(reset_Knop);
    }


    public void paint(Graphics g) {
        g.drawString(schermTekst,50,50);
    }

    class ok_KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            schermTekst = tekstvak.getText();
            repaint();
        }
    }

    class reset_KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            tekstvak.setText("");
            schermTekst = "";
            repaint();
        }
    }

}
