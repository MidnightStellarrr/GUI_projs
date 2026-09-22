package snakeGame;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
    
    private int[] snakexlength = new int[750];
    private int[] snakeylength = new int[750];
    private int lengthOfSnake = 3;
    
    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;
    
    private int moves = 0;
    
    private ImageIcon snakeTitle = new ImageIcon(getClass().getResource("snaketitle.jpg"));
    GamePanel(){
        
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        g.setColor(Color.WHITE);
        g.drawRect(24, 10, 851, 55);
        g.drawRect(24, 74, 851, 576);
        
        snakeTitle.paintIcon(this, g, 25, 11);
        g.setColor(Color.black);
        g.fillRect(25, 75, 850, 575);
        
        if(moves == 0){
            snakexlength[0] = 100;
            snakexlength[1] = 75;
            snakexlength[2] = 50;
            
            snakeylength[0] = 100;
            snakeylength[1] = 100;
            snakeylength[2] = 100;
            moves++;
        }
        
        
    }
}
