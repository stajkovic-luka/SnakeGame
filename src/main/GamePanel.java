package main;

import java.awt.*;
import java.awt.event.*; 
import javax.swing.JPanel;
import javax.swing.*;
import java.util.Random;

// Panel where the game is played
public class GamePanel extends JPanel implements ActionListener{
    private static final int SCREEN_WIDTH = 600;
    private static final int SCREEN_HEGHT = 600;
    private static final int UNIT_SIZE = 25;
    private static final int UNIT_AMOUNT = (SCREEN_HEGHT*SCREEN_WIDTH)/UNIT_SIZE;
    private static final int DELAY = 75;
    private final int[] x = new int[UNIT_AMOUNT];
    private final int[] y = new int[UNIT_AMOUNT];
    private int bodyParts = 6;
    private int points = 0;
    private int appleX;
    private int appleY;
    private char direction = 'D'; // game starts with snake going down
    private boolean running = false;
    private Timer timer;
    private Random random;

    public GamePanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEGHT));
        this.setBackground(new Color(144, 238, 144));
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }
    
    public void startGame(){
        spawnApple();
        running = true;
        timer = new Timer(DELAY, this);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
        
    }
    
    public void draw(Graphics g){
        g.setColor(new Color(0,100,0));
        
        for(int i = 0; i < SCREEN_HEGHT/UNIT_SIZE; i++){
            g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEGHT);
            g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
        }
        
        
    }
    
    public void spawnApple(){
        
    }
    
    public void move(){
        
    }
    
    public void checkApple(){
        
    }
    
    public void checkCollisions(){
        
    }
    
    public void endGame(Graphics g){
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    // Handling game controlls
    public class MyKeyAdapter extends KeyAdapter{

        @Override
        public void keyPressed(KeyEvent e) {
            
        }
        
    }
}
