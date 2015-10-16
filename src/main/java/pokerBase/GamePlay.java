package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

public class GamePlay {

	
	@XmlElement
	private UUID GameID;
	@XmlElement
	private int MaxNbrOfPlayers;
	@XmlElement
	private int NbrOfCards;
	@XmlElement
	private int NbrOfJokers;
	@XmlElement
	private ArrayList<Card> WildCards = new ArrayList<Card>();
	
	public GamePlay(Rule rle)
	{
		this.GameID = UUID.randomUUID();
		
		this.NbrOfCards = rle.GetNumberOfCards();
		this.MaxNbrOfPlayers = rle.GetMaxNumberOfPlayers();
		this.NbrOfJokers = rle.GetNumberOfJokers();
		this.WildCards = rle.GetRuleCards();
		
	}
	
	public UUID GetGameID()
	{
		return this.GameID;
	}
		
	public int GetMaxNumberOfPlayers()
	{
		return MaxNbrOfPlayers;
	}
	
	public int GetNumberOfCards()
	{
		return NbrOfCards;
	}
	
	public int GetNumberOfJokers()
	{
		return NbrOfJokers;
	}
	
	public ArrayList<Card> GetWildCards()
	{
		return this.WildCards;
	}

}
