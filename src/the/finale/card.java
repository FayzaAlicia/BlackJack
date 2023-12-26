/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.finale;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author coop6470
 */
public class card {
    
    public String value;
    public String suit;
    public int suitInt;
    public ImageIcon cardImage;
   
    private static String[] suits = {"clubs","diamonds","hearts","spades"};
    private static String[] values = {"ace","2","3","4","5","6","7","8","9","10","jack","queen","king"};
    private static int[] suitValues = {1,2,3,4,5,6,7,8,9,10,10,10,10};
    
    public card(String newValue, String newSuit, ImageIcon newCardImage){
    
        this.value = newValue;
        this.suit = newSuit;
        this.cardImage = newCardImage;
        
    }
    public boolean checkEquals(card check){
        if (this.value.equals(check.value) && this.suit.equals(check.suit)){
            return true;
        }else{
            return false;        
        }
    }

    //this is an overloaded constructor allows us to create Card objects with 
    //random values using the methods below
    public card(){
        randomCard();
    }
    public card(String newSuit){
        randomCard(newSuit);
    }
    //Classes can also have methods that each class object would possess.
    //This method will display the value of the card.
    public void showCard(){
        System.out.println(this.value + " of " + this.suit);
    }
    
    //This method is a demo for private vs public 
   
    //This method will change a card into a new random card. It is overloaded to 
    // allow for picking a suit or not
    public void randomCard(String newSuit){
        int randomValue = (int)(Math.random() * values.length);
        this.suit = newSuit;
        this.value = values[randomValue];
        this.suitInt = suitValues[randomValue];

    }
    
    public void randomCard(){
        int randomValue = (int)(Math.random() * values.length);
        int randomSuit = (int)(Math.random() * suits.length);
        this.suit = suits[randomSuit];
        this.value = values[randomValue];
        this.suitInt = suitValues[randomValue];
        
        try { 
            Image temp = ImageIO.read(new File(this.value + "_of_" + this.suit + ".png"));
            temp = temp.getScaledInstance(48, 60, Image.SCALE_SMOOTH);
           this.cardImage = new ImageIcon(temp); 
        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }
    public static card[] insertionSort(card array[] ){
        
        for (int i =1;i<array.length;i++){ //loops through each element (left to right)
            
            card target = array[i]; //target to be placed in sorted postion.
            int left = i -1; //elements left of the target
            while (left>=0 && array[left].suitInt > target.suitInt){
                
                //while the target is not in left most sorted postion
                array[left+1] = array[left];// swaps elements to the right.
                left--;
            }
            array[left+1] = target; 
        }
        
        return array;
    }
}
