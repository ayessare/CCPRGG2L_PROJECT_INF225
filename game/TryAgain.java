package game;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TryAgain extends JFrame {

    static String playerName;
    
    TryAgain() {
        super("TETRIS!");
        this.setLayout(new FlowLayout());

        JLabel text = new JLabel("Nice try, " + playerName + " ! ");
        text.setFont(new Font("Gill sans bold", Font.BOLD, 20));


        JButton tryAgainButton = new JButton();
        tryAgainButton.setText("PLAY AGAIN?");
        tryAgainButton.setFont(new Font("Gill sans bold", Font.ITALIC, 30));
        // Add event to try again button
        TryAgainEventHandler tryHandler = new TryAgainEventHandler();
        tryAgainButton.addActionListener(tryHandler);

        JButton exitButton = new JButton();
        exitButton.setText("EXIT !");
        exitButton.setFont(new Font("Gill sans", Font.ITALIC, 30));
        // Add event to exit button
        ExitEventHandler exitHandler = new ExitEventHandler();
        exitButton.addActionListener(exitHandler);

        //JLabel
        JLabel imageLabel = new JLabel();
        //pepe image download from internet
        ImageIcon sadImage= new ImageIcon("notlikethis.png");
        //Set image to label
        imageLabel.setIcon(sadImage);

        
        add(text);
        add(tryAgainButton);
        add(exitButton);
        add(imageLabel);
    
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

    private class TryAgainEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            new MainMenu();

            dispose();
        }
    }

    private class ExitEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            dispose();
        }
    }
}