package game;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DifficultyMenu extends JFrame {
    DifficultyMenu() {
        super("TETRIS!");
        this.setLayout(new FlowLayout());

        JLabel text = new JLabel("Choose");
        text.setFont(new Font("Times new roman", Font.BOLD, 30));
        JLabel text2 = new JLabel("Difficulty :");
        text2.setFont(new Font("Times new roman", Font.BOLD, 30));

        //add JButton
        JButton easyButton = new JButton();
        easyButton.setText("RELAXED");
        easyButton.setFont(new Font("Gill sans", Font.BOLD, 25));
        // Add event to easy button
        EventHandler easyHandler = new EventHandler(250);
        easyButton.addActionListener(easyHandler);

        //add JButton
        JButton mediumButton = new JButton();
        mediumButton.setText("FAIR");
        mediumButton.setFont(new Font("Gill sans", Font.BOLD, 25));
        // Add event to easy button
        EventHandler mediumHandler = new EventHandler(130);
        mediumButton.addActionListener(mediumHandler);

        //add JButton
        JButton hardButton = new JButton();
        hardButton.setText("FRENZY");
        hardButton.setFont(new Font("Gill sans", Font.BOLD, 25));
        // Add event to easy button
        EventHandler hardHandler = new EventHandler(80);
        hardButton.addActionListener(hardHandler);
        
        //add JButton
        JButton impossibleButton = new JButton();
        impossibleButton.setText("IMPOSSIBLE");
        impossibleButton.setFont(new Font("Gill sans", Font.BOLD, 25));
        // Add event to easy button
        EventHandler impossibleHandler = new EventHandler(30);
        impossibleButton.addActionListener(impossibleHandler);


        
        add(text);
        add(text2);
        add(easyButton);
        add(mediumButton);
        add(hardButton);
        add(impossibleButton);

        // Close java program when closing window
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // dimension of frame
        this.setSize(250, 500);
        // makes frame appear
        this.setVisible(true);
        // set frame to center
        this.setLocationRelativeTo(null);
        // background color of frame
        this.getContentPane().setBackground(Color.CYAN);
    }

    private class EventHandler implements ActionListener {

        int tetrisSpeed;

        // Constructor
        EventHandler(int speed) {
            this.tetrisSpeed = speed;
        }

        public void actionPerformed(ActionEvent event) {
            
            Board.DELAY = tetrisSpeed;

            // Goes to Board frame
            new ColorMenu();

            // Closes difficulty menu frame
            dispose();
        }
    }
}