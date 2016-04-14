package MainGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Functions {
	
	ArrayList<Card> deck;
	ArrayList<Card> discarded;
	ArrayList<Card> hand;
	Player p = new Player();
	
	

	
/**	public static void main(String[] args) {
		
		
		
			Functions f = new Functions();
			f.setup();
			f.turnGoTrough();
			
			
		};
		**/
				
		
	public class Card {
			private String name;
			private int value;
			private int price;
			private String type;
			
			
			public Card(String name) {
				this.name = name;
			}
			
			
		};
		
	public void setup() {
		
		deck = new ArrayList<>();
			for(int i =0; i<7;i++){
				
				deck.add(new Card("Koper"));
				
				
			}
			for(int i =0; i<3;i++){
				
				deck.add(new Card("Estate"));
				
				
			};
		hand = new ArrayList<>();
		discarded = new ArrayList<>();
		Collections.shuffle(deck);
		p.setupPlayer();
			
				
	}
	
	public void drawCards(int AantalDraw){
		
		System.out.println("draw cards");
		for(int i = 0; i<AantalDraw; i++){
			
			Card kaart = deck.get(i);
			hand.add(kaart);
			deck.remove(i);

	        System.out.println(kaart.name);
	      


	        
	        
															
		};	
		//DiscardHand();
		
	};
			
	public void discardHand(){
	
	System.out.println("DiscardedHand");
	
	for(int i= 0; i<hand.size(); i++){
		
		Card kaart = hand.get(i);
		discarded.add(kaart);
		
	};
	hand.clear();
				
	};
	
	
	public void newDeck(){
	
		//Kijken of aantal kaarten in deck <5
		int totaalAantal = deck.size();			
		if(totaalAantal<5){
			
			System.out.println("Discard word deck"); 	
				
		
			deck =discarded;
			discarded.clear();
			Collections.shuffle(deck);			  		
		}

		else{
			System.out.println("Deck is groot genoeg");
			drawCards(5);
		}
			
		
		
		System.out.println("Discarded size");
		System.out.println(discarded.size());
		System.out.println(deck.size());
		
	};	
	
	
	public void koperBuy(){
	    	
	    	deck.add(new Card("koper"));
	    	
	    	
	    };
   

	public void turnGoTrough(){
		
		System.out.println("TurnStart");
		System.out.println("DrawPhase");
		
		drawCards(5);
		
		System.out.println("ActionPhase, next = n");
		
		int AantalActions = p.getActions();
		System.out.println("U hebt "+ AantalActions +" actions");
		
		
		Scanner input = new Scanner(System.in);
		String next = input.nextLine();
		
		if(next != null){
			
			System.out.println("Purchase Phase");
			
			int AantalPurchases = p.getPurchases();
			System.out.println(AantalPurchases);
			
			System.out.println("Press P for koper, else press any key");
			
			String keuze = input.nextLine(); 
			
			if(keuze.equals("p")){
				
				koperBuy();
				p.spelerAP(0,-1);
				int AantalPurchases2 = p.getPurchases();
				System.out.println("U hebt nog "+AantalPurchases2 + " buys over");
				
		
			}
			else{
				System.out.println("End turn?");
				String end = input.nextLine();
				if(end != null){
					
					discardHand();
					
				};
			
				
			};

			
			System.out.println("End turn?");
			String end = input.nextLine();
			if(end != null){
				
				discardHand();		
			
			};
			
		System.out.println("Turn finished");
		
		}					
	};	
}


