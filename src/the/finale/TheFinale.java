/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.finale;

/**
 *
 * @author coop6470
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics; //used for drawing basic graphics
import java.awt.Graphics2D; //used for drawing slightly more advanced 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//USED FOR IMAGE DRAWING
import java.awt.Image;
import java.io.File; 
import java.io.IOException;
import javax.imageio.ImageIO;

import javax.swing.JFrame; //allows us to create forms
import javax.swing.JPanel; // allows us to create panels (drawing surfaces on the form)
import javax.swing.Timer;

public class TheFinale extends JPanel {
    public static int xPos =0; 
    public static int yPos =0;
    
    public void paint(Graphics g) { //this method is used to draw our lines
        Graphics2D g2 = (Graphics2D) g; //the graphics "engine"
        //or a class that has all of our built in tools as methods
        g2.clearRect(0, 0, 300, 300); //clears the last images out so we only see one at a time.
        //COLOUR DATABASE
        Color custom_color = new Color(255,255,0);
        Color BLACK = Color.BLACK;
        Color WHITE = Color.WHITE;
        Color RED = Color.RED;
        Color GREEN = Color.GREEN;
        Color BLUE = Color.BLUE;
        Image startImage = null;
        try { 
            startImage = ImageIO.read(new File("Start.png")); 
        } catch (IOException e) {
            System.out.println("File not found!");
        }
        int newWidth = 785;
        int newHeight = 600;
        Image scaledStart = startImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        g2.drawImage(scaledStart, //the image we are drawing
                    xPos, // the left side of the image
                    yPos, // the top of the image
                    null);
    }
    public static void main(String[] args) {
        JFrame frmMain = new JFrame(); 
        frmMain.setTitle("The Finale");
        frmMain.setSize(800, 600); //default size will be 300 x 300 pixels
        frmMain.add(new TheFinale());
        frmMain.setLocationRelativeTo(null);
        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMain.setVisible(true);
    }
}
