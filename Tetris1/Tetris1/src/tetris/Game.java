/** Math2670 Homework 6
 * @author Subodh Khanal
 * @author Christiaan Masucci
 * File: game.java
 * This is the
 */

package tetris;

import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class Game extends KeyAdapter implements MouseListener, MouseMotionListener
{
    private Main game;


    public boolean[] buttons = new boolean[300];   //array of keys that could be pressed


    public Game(Main game)
    {
        this.game = game;
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        this.buttons[keyCode] = true;
    }

    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        this.buttons[keyCode] = false;
    }

    public void mouseClicked(MouseEvent event) {}

    public void mouseEntered(MouseEvent event) {}

    public void mouseExited(MouseEvent event) {}

    public void mousePressed(MouseEvent event) {}

    public void mouseDragged(MouseEvent event) {}

    public void mouseMoved(MouseEvent event) {
        Point pos = event.getPoint();
    }



    public void mouseReleased(MouseEvent e) {}
}
