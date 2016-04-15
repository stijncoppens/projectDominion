package MainGame;

import java.util.ArrayList;

import javax.swing.Spring;

import MainGame.Functions.Card;

public class Player {
	
		ArrayList<Card> deck;
		ArrayList<Card> discarded;
		ArrayList<Card> hand;		
		private String name;
		private int actions;
		private int purchases;
		private int moneyTurn; //hoeveel dat persoon kan spenderen in 1 beurt
	
		public Player(String name){
			this.name = name;
			actions =1; 
			purchases =1 ;		
				
			
		}
		
		public int getActions(){
			
			return actions;
		};
		
		public int getPurchases(){
			
			return purchases;
		};
		
		
		public ArrayList<Card> getDeck() {
			return deck;
		}
		
		public void spelerNaam(String name) {
			this.name = name;
		}
		
		public void spelerAP(int Actions, int purchases){			
			this.actions += Actions;
			this.purchases += purchases;
		}
		
		public void moneyTurnIncrease(int money){
			
			this.moneyTurn +=money;
			
		};
		
		public ArrayList<Card> getHand(){
			
			return hand;
		}
		public ArrayList<Card> getDiscarded(){
			
			return discarded;
		}
		
		public void setDeck(ArrayList<Card> deck2){
			
			deck = deck2;	
		}
			
		
		public void setDiscarded(ArrayList<Card> newDiscarded){
			discarded = newDiscarded;
		}
		
	
		public void setHand(ArrayList<Card> newHand) {
			hand = newHand;
			
		}

		
		
		
	}; 	
	
	
	

