package pokerBase;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import pokerEnums.eRank;
import pokerEnums.eSuit;

@XmlRootElement
public class Deck {
	
	@XmlElement (name="Remaining Card")
	private ArrayList<Card> cards;

	public Deck() {

		//	Create an ArrayList of Cards, add each card
		ArrayList<Card> MakingDeck = new ArrayList<Card>();
		for (short i = 0; i <= 3; i++) {
			eSuit SuitValue = eSuit.values()[i];			
			for (short j = 0; j <= 12; j++) {
				eRank RankValue = eRank.values()[j];				
				Card NewCard = new Card(SuitValue,RankValue, (13 * i) + j+1);
				MakingDeck.add(NewCard);
			}
		}
		//	Set the instance variable
		cards = MakingDeck;
		ShuffleCards();

	}
	
	public Deck(int NbrOfJokers) {

		this();
		
		for (short i = 1; i <= NbrOfJokers; i++) {
			cards.add(new Card(eSuit.JOKER,eRank.JOKER,53));
		}
		ShuffleCards();
	}
	
	public Deck(int NbrOfJokers, ArrayList<Card> WildCards) {

		this(NbrOfJokers);
		
		
		for (Card deckCard : cards)
		{
			for (Card WildCard: WildCards)
			{
				if ((deckCard.getSuit() == WildCard.getSuit()) &&
						(deckCard.getRank() == WildCard.getRank()))
						{
							deckCard.setWild();
						}					
			}
		}
		ShuffleCards();
	}
	
	private void ShuffleCards()
	{
		//	Shuffle the cards
		Collections.shuffle(cards);
	}

	public Card drawFromDeck() {
		// Removes the first card from the deck and return the card
		Card FirstCard = cards.get(0);
		cards.remove(0);
		return FirstCard;
	}

	public int getTotalCards() {
		// Returns the total number of cards still in the deck
		return cards.size();
	}
	
	public ArrayList<Card> getCards()
	{
		return this.cards;
	}
	
	public StringWriter SerializeMe()
	{
	    StringWriter sw = new StringWriter();
		try
		{
		    //Write it
		    JAXBContext ctx = JAXBContext.newInstance(Deck.class);
		    Marshaller m = ctx.createMarshaller();
		    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    m.marshal(this, sw);
		    sw.close();			
		}
		catch (Exception ex)
		{
			
		}
    
    return sw;
	}
}