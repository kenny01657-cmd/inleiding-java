package h02;

// importeer de benodigde klassen uit de java bibliotheek
import java.applet.Applet;
import java.awt.*;

// een klasse met de naam FirstApplet van het type applet
public class SecondApplet extends Applet {

    // een (lege) methode die de applet initialiseert
    public void init() {
        setBackground(Color.white);
    }

    // een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Kenny", 50, 60);
        g.setColor(Color.red);
        g.drawString("Meijer", 50, 80);
    }
}