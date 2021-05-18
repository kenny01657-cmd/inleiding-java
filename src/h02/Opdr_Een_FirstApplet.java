package h02;

// importeer de benodigde klassen uit de java bibliotheek
import java.applet.Applet;
import java.awt.*;

// een klasse met de naam FirstApplet van het type applet
public class Opdr_Een_FirstApplet extends Applet {

    // een (lege) methode die de applet initialiseert
    public void init() {
        setBackground(Color.blue);
    }

    // een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Kenny Meijer", 50, 60);
    }
}
