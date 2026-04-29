import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo extends Frame implements KeyListener {

    String message = "";
    int x = 50, y = 100;

    public KeyEventDemo() {
        // Set frame properties
        setTitle("AWT Key Event Demo");
        setSize(400, 200);
        setVisible(true);

        // Add KeyListener to Frame
        addKeyListener(this);

        // Add window close functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Override keyPressed
    public void keyPressed(KeyEvent ke) {
        message = "Key Pressed: " + ke.getKeyChar();
        repaint();
    }

    //Override keyReleased
    public void keyReleased(KeyEvent ke) {
        message = "Key Released: " + ke.getKeyChar();
        repaint();
    }

    // Override keyTyped
    public void keyTyped(KeyEvent ke) {
        message = "Key Typed: " + ke.getKeyChar();
        repaint();
    }

    // Override paint method to display message
    public void paint(Graphics g) {
        g.drawString(message, x, y);
    }

    // Main method
    public static void main(String[] args) {
        new KeyEventDemo();
    }
}