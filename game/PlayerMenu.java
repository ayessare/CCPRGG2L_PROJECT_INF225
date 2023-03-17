package game;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PlayerMenu extends JFrame{

    JTextField textField;

    PlayerMenu(){
        super("TETRIS!");
        this.setLayout(new FlowLayout());
        //JLabel
        JLabel imageLabel = new JLabel();
        //image download from internet
        ImageIcon playerImage= new ImageIcon("player.gif");
        //Set image to label
        imageLabel.setIcon(playerImage);


       // JLabel
       JLabel label = new JLabel();
       label.setText("Enter");
       label.setFont(new Font("Gill sans", Font.BOLD, 25));
       JLabel label2 = new JLabel();
       label2.setText("User: ");
       label2.setFont(new Font("Gill sans", Font.BOLD, 25));

       // JTextField
       textField = new JTextField(12);
       // Adds event to textfield
       EventHandler handler = new EventHandler();
       textField.addKeyListener(handler);

       // Add components to frame
       this.add(label);
       this.add(label2);
       this.add(textField);
       this.add(imageLabel);

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

   private class EventHandler implements KeyListener {

       public void keyPressed(KeyEvent event) {


           // If ENTER button is pressed, do this
           if (event.getKeyCode() == KeyEvent.VK_ENTER) {

               Board.playerName = textField.getText();
               TryAgain.playerName = textField.getText();

               // Close playermenu frame
               dispose();

               // Go to game frame
               new DifficultyMenu();
           }
       }

       public void keyTyped(KeyEvent event) {
           //
       }

       public void keyReleased(KeyEvent event) {
           //
       }
   }
}