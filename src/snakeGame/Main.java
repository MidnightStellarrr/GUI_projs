package snakeGame;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
    JFrame frame = new JFrame("Snake Game");
    frame.setBounds(10,10,905,70);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    }
}
