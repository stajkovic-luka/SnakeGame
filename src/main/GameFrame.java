package main;

import java.awt.event.ActionListener;
import javax.swing.JFrame;

// Main menu of the game
public class GameFrame extends JFrame{

    public GameFrame() {
        this.add(new GamePanel());
        this.setTitle("Retro Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
    }
    
}
