package h14;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.net.URL;

public class Opdr_Twee_DeelKaart extends Applet {
    private AudioClip sound;
    double getal;
    boolean duplicate = false;
    String card;
    int color, type;
    Button shuffle;
    String[] deck = new String [52];
    String[] cardColor = {"Schoppen", "Harten", "Klaveren", "Ruiten"};
    String[] cardType = {"Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven", "Acht", "Negen", "Tien", "Boer", "Vrouw", "Heer", "Aas"};

    public void init() {
        // Initialsieren en declareren
        setSize(500,400);
        URL pad = Opdr_Twee_DeelKaart.class.getResource("/recources/");
        sound = getAudioClip(pad, "137523215.wav");
        shuffle = new Button("Shuffle");
        shuffle.addActionListener(new ShuffleListener());
        add(shuffle);
    }

    public void paint(Graphics g) {
        int Y = 80;
        if(deck[deck.length - 1] != null) {
            // player 1 weergeven
            for (int i = 0; i < deck.length / 4; i++) {
                g.drawString(deck[i], 20, Y);
                Y += 25;
            }
            g.drawString("Player 1", 20, 50);
            Y = 80;
            // player 2 weergeven
            for (int i = 0; i < deck.length / 4; i++) {
                g.drawString(deck[i + deck.length / 4], 140, Y);
                Y += 25;
            }
            g.drawString("Player 2", 140, 50);
            Y = 80;
            // player 3 weergeven
            for (int i = 0; i < deck.length / 4; i++) {
                g.drawString(deck[i + deck.length / 2], 260, Y);
                Y += 25;
            }
            g.drawString("Player 3", 260, 50);
            Y = 80;
            // player 4 weergeven
            for (int i = 0; i < deck.length / 4; i++) {
                g.drawString(deck[i + (deck.length / 4) * 3], 380, Y);
                Y += 25;
            }
            g.drawString("Player 4", 380, 50);
        }
    }

    class ShuffleListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            int aantal = 0;
            // Reset de array "deck"
            Arrays.fill(deck, "");
            // genereer een deck
            generateDeck();
            repaint();
            sound.play();
            // Controlleerd op duplicatie's
            for (int i = 0; i < deck.length; i++) {
                for (int j = i + 1 ; j < deck.length; j++) {
                    if (deck[i].equals(deck[j])) {
                        aantal++;
                    }
                }
            }
            // Print de hoeveelheid duplicatie's
            System.out.println("Aantal duplicaten: " + aantal);
        }
    }

    public void generateCard(){
        // genereerd een random kaart
        getal = Math.random();
        color = (int) (getal * cardColor.length + 1);
        getal = Math.random();
        type = (int) (getal * cardType.length + 1);
        card = (cardColor[color - 1] + " " + cardType[type - 1]);
    }

    public void checkDuplicate() {
        // controlleerd voor duplicatie's
        for (String s : deck) {
            if (card.equals(s)) {
                duplicate = true;
                break;
            }
            else {
                duplicate = false;
            }
        }
    }

    public void generateDeck() {
        for(int teller = 0; teller < deck.length; teller++) {
            // eerst wordt er een random kaart gemaakt
            generateCard();
            // Het deck wordt gecontrolleerd op duplicatie's
            checkDuplicate();
            // Als er een duplicaat is gevonden wordt er opnieuw een kaart gemaakt tot dat er geen duplicaties meer zijn
            if(duplicate){
                while(duplicate){
                    generateCard();
                    checkDuplicate();
                    if (!duplicate){
                        deck[teller] = card;
                    }
                }
            }
            else {
                deck[teller] = card;
            }
        }
    }
}
