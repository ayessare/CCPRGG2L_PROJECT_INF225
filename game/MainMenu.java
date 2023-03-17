package game;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;;


public class MainMenu extends JFrame{
    MainMenu(){

        //JLabel
        JLabel imageLabel = new JLabel();
        //image download from internet
        ImageIcon tetrisImage= new ImageIcon("tetris.gif");
        //Set image to label
        imageLabel.setIcon(tetrisImage);

    

        //JButton
        JButton startButton = new JButton();
        startButton.setText("START GAME");
        startButton.setFont(new Font("Times new roman", Font.BOLD, 25));

        // JLabel
        JLabel label = new JLabel();
        label.setText("Alfred Ricafort, Carlos III Regodon");
        label.setFont(new Font("Times new roman", Font.BOLD, 12));
        
        // JLabel
        JLabel label2 = new JLabel();
        label2.setText("Eljay Pecante, Joebert Ebias");
        label2.setFont(new Font("Times new roman", Font.BOLD, 12));
 
        //JLabel
        JLabel label3 = new JLabel();
        label3.setText("Lord Kechin Mendez");
        label3.setFont(new Font("Times new roman", Font.BOLD, 12));

        //add event to start button
        EventHandler handler = new EventHandler();
        startButton.addActionListener(handler);

        //Add label to frame
        add(imageLabel);
        add(startButton);
        add(label);
        add(label2);
        add(label3);
       
        //Frame Layout
        this.setLayout(new FlowLayout());
        //Frame Title
        this.setTitle("TETRIS!");
        //terminates java program on close
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Frame Size
        this.setSize(250,500);
        //puts frame in the middle
        this.setLocationRelativeTo(null);
        //make frame appear
        this.setVisible(true);
        //disable resize
        this.setResizable(false);
        //set bg color
        this.getContentPane().setBackground(Color.CYAN);

    }
    //Event Handler
    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            //goes to color menu
            new PlayerMenu();
            //closes frame
            dispose();



        }
    }
}
