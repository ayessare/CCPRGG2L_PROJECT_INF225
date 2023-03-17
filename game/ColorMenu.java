package game;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;

public class ColorMenu extends JFrame{

    // Color name array
    private String[] colorNameArray = {"CYAN", "DARK GRAY", "BLUE", "BLACK"};
    // Color list array
    private Color[] colorListArray = {Color.CYAN, Color.DARK_GRAY, Color.BLUE, Color.BLACK};
    // JList
    JList colorList;

    ColorMenu(){

        // JLabel
        JLabel label = new JLabel();
        label.setText("Choose");
        label.setFont(new Font("Times new roman", Font.BOLD, 25));
        this.add(label);
        JLabel label2 = new JLabel();
        label2.setText("Background color: ");
        label2.setFont(new Font("Times new roman", Font.BOLD, 25));
        this.add(label2);

        // JList
        colorList = new JList(colorNameArray);
        colorList.setFont(new Font("Comic sans", Font.BOLD, 20));
        // Allows only one selection in the list
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add event
        EventHandler handler = new EventHandler();
        colorList.addListSelectionListener(handler);

        // to add list to frame
        this.add(colorList);

        // Frame Layout
        this.setLayout(new FlowLayout());
        // Frame title
        this.setTitle("TETRIS!");
        // Terminates java program on close
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Frame size
        this.setSize(250, 500);
        // Puts frame in the middle
        this.setLocationRelativeTo(null);
        // Make frame appear
        this.setVisible(true);
        // Disable resize
        this.setResizable(false);
        // Set background color
        this.getContentPane().setBackground(Color.cyan);
    }
    
    private class EventHandler implements ListSelectionListener{

        public void valueChanged(ListSelectionEvent event){
        
            Board.gameBGcolor = colorListArray[colorList.getSelectedIndex()];

            // open game frame
            new Tetris();
            // Close color menu frame
            dispose();
        }
    }

}
