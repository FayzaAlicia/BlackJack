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
public class Deck {
    public card[] card;
    
    public Deck(){
        card deck[] = new card[312];
        this.card = deck;
    }

    public void addDeck(card card, card[] deck){
        for (int i = 0; i < deck.length; i++){//adds drawn card to deck
            if (deck[i] == null){
                deck[i] = card;
                break;
            }
        }
    }
    
    public card checkDeck(card card, card[] deck){
        boolean check = true;
        int counter = 0;
        while (check){
            check = false;
            for (int i = 0; i < deck.length; i++){
                if ((deck[i] != null) && (card.checkEquals(deck[i]))){
                    counter++;
                }
                if (counter == 4){
                    card = new card();
                    check = true;
                    break;
                }
            }
        
        }
        return card;
    }

}
