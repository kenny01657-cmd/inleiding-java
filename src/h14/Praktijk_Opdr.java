package h14;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Praktijk_Opdr extends Applet {
    // Declareren en initialiseren
    int computerNum;
    String Turn = "";
    String playerText, computerText;
    boolean gameStillGoing = true;
    boolean turn = true;
    int num = 0;
    int stones = 23;
    private Image image;
    TextField textField;
    Button button;
    Label label;

    public void init() {
        // Initialiseren
        setSize(600,400);
        playerText = "";
        computerText = "Computer played: ";
        URL path = Praktijk_Opdr.class.getResource("/recources/");
        image = getImage(path, "stone.jpg");
        textField = new TextField(10);
        button = new Button("Play");
        button.addActionListener(new ButtonListener());
        label = new Label("How many stones do you want (one, two or three)?");
        add(label);
        add(textField);
        add(button);
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            // Num updaten
            num = Integer.parseInt(textField.getText());
            repaint();
        }
    }

    public void paint(Graphics g) {
        // De main game
        if (gameStillGoing){
            stones(g);
            // Als het de beurt van player is:
            if (turn & num > 0) {
                stones(g);
                player();
                checkWin();
                if(!turn) {
                    repaint();
                }

                // Wanneer er een verkeerde input is gegeven wordt er een waarschuwing weergeven
                else {
                    g.drawString(playerText, 5,40);
                }
            }

            // Als het de beurt van de computer is:
            else if (!turn){
                stones(g);
                computer();
                checkWin();
                repaint();
            }

            if (turn){
                Turn = "Your turn";
            }

            // Weergeeft de hoeveelheid stenen en welke beurt het is
            g.drawString("Stone count: " + stones + "." + Turn,5,60);
            // Weergeeft wat de computer heeft gespeeld
            if(computerNum > 0 & playerText.equals("")) {
                g.drawString(computerText + computerNum, 5, 40);
            }
        }
        // Wanneer het spel over is:
        else {
            // Wanneer de speler heeft gewonnen
            if(turn){
                g.drawString("congratulations You won!!!", 20, 60);
            }
            // Wanneer de computer heeft gewonnen
            else if(!turn){
                g.drawString("Better luck next time:( ", 20, 60);
            }
        }
    }

    void player(){
        int input;
        input = num;
        // Als er een nummer tussen één en drie wordt gegeven
        if (input < 4 & input > 0){
            // Reset playerText
            playerText = "";
            // Vermindert de hoeveelheid stenen met het ingevoerde nummer
            stones -= input;
            // Geeft de beurt aan de computer
            turn = false;
            // Reset het opgegeven nummer
            num = 0;
        }
        // Als de speler een ongelding nummer invoerd
        else if(input > 3 || input < 0){
            playerText = "This number is invalid. Please enter (one, two or three)";
        }
    }

    void computer(){
        // De strategie van de computer
        if (stones >= 21) {
            computerNum = stones - 21;
        }
        else if (stones >= 17) {
            computerNum = stones - 17;
        }
        else if (stones >= 13) {
            computerNum = stones - 13;
        }
        else if (stones >= 9) {
            computerNum = stones - 9;
        }
        else if (stones >= 5) {
            computerNum = stones - 5;
        }
        // Vermindert de stenen met het nummer van de computer
        stones -= computerNum;
        // Geeft de beurt aan de player
        turn = true;
    }

    void stones(Graphics g){
        // Declareren en initialiseren van de coördinaten en de grootte van de stenen
        int X, Xprev, Y, width, height;
        X = 50;
        Xprev = X;
        Y = 80;
        width = 20;
        height = 20;

        // De hoeveelheid stenen tekenen
        for(int i = 0; i < stones; i++) {
            g.drawImage(image, X, Y, width, height, this);
            X += 50;

            if(X == Xprev*6){
                Y += 50;
                X = Xprev;
            }
        }
    }

    void checkWin(){
        // Controlleren of er een winnaar is
        if (stones < 1){
            gameStillGoing = false;
            if (stones < 0 ) {
                stones = 0;
            }
        }
    }

}