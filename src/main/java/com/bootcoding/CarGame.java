package com.bootcoding;

    import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

    public class CarGame extends JFrame implements KeyListener {
        private int carX = 250;  // Initial x-coordinate of the car
        private int carY = 250;  // Initial y-coordinate of the car

        public CarGame() {
            setTitle("Car Game");
            setSize(600, 600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(false);
            setVisible(true);
            addKeyListener(this);
        }

        public void paint(Graphics g) {
            super.paint(g);
            g.setColor(Color.RED);
            g.fillRect(carX, carY, 50, 100);
        }

        public void moveCar(int dx, int dy) {
            carX += dx;
            carY += dy;
            repaint();
        }

        @Override
        public void keyTyped(KeyEvent e) {
            // Not used
        }

        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_LEFT:
                    moveCar(-10, 0);  // Move the car to the left
                    break;
                case KeyEvent.VK_RIGHT:
                    moveCar(10, 0);  // Move the car to the right
                    break;
                case KeyEvent.VK_UP:
                    moveCar(0, -10);  // Move the car up
                    break;
                case KeyEvent.VK_DOWN:
                    moveCar(0, 10);  // Move the car down
                    break;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            // Not used
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(CarGame::new);
        }
    }

