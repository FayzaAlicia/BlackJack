/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.finale;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author fayz9410
 */
public class Plays {
    public static int Plays(card[] hand, int cardNum, JLabel card, JButton button1, JButton button2, int handTotal){
        card.setIcon (hand[cardNum].cardImage);//makes the card slots fill with a random card
        card.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));

        card.setIcon (hand[cardNum].cardImage);//makes the card slots fill with a random card
        card.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));
        if ("ace".equals(hand[cardNum].value)){//let user choose if ace count for a 1 or 11
            button1.setVisible(true);
            button2.setVisible(true);
        } else{
            handTotal = hand[cardNum].suitInt + handTotal;
        }
        return handTotal;
    }

    public static int Plays(card[] hand, int cardNum, JLabel card, int handTotal){
        card.setIcon (hand[cardNum].cardImage);//makes the card slots fill with a random card
        card.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));

        card.setIcon (hand[cardNum].cardImage);//makes the card slots fill with a random card
        card.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));
        return handTotal;
    }

    public static int aceButton (JButton button1, JButton button2, boolean visibility, int playerTotal, int value){
        button1.setVisible(visibility);
        button2.setVisible(visibility);
        playerTotal = playerTotal + value;

        return playerTotal;
    }

    public static int chipCalculation(int gambledChips, int totalChips, double pos, JLabel chips){
        gambledChips = (int) (totalChips / (200/pos));
        chips.setText(String.valueOf(gambledChips));

        return gambledChips;
    }

    public static char determineWinner (int playerHand, int dealerHand, char outcome){
        if (playerHand > 21){
            outcome = 'L';
        } else if (playerHand > dealerHand){
            outcome = 'W';
        } else if (playerHand == dealerHand){
            outcome = 'D';
        } else if (dealerHand > 21){
            outcome = 'W';
        } else{
            outcome = 'L';
        }//end of if
        return outcome;
    }
    // public void playerPlayer(Card k){

    //}
}
