package pokerEnums;

public enum eHandStrength {

	FiveOfAKind(110){
		public String toString()
		{
			return "Five of a Kind";
		}
	},
	NaturalRoyalFlush(100){
		public String toString()
		{
			return "Natural Royal Flush";
		}
	},
	RoyalFlush(100){
		public String toString()
		{
			return "Royal Flush";
		}
	},
	StraightFlush(90){
		public String toString()
		{
			return "Straight Flush";
		}
	},
	FourOfAKind(80){
		public String toString()
		{
			return "Four of a Kind";
		}
	},
	FullHouse(70){
		public String toString()
		{
			return "Full House";
		}
	},
	Flush(60){
		public String toString()
		{
			return "Flush";
		}
	},
	Straight(50){
		public String toString()
		{
			return "Straight";
		}
	},
	ThreeOfAKind(40){
		public String toString()
		{
			return "Three of a Kind";
		}
	},
	TwoPair(30){
		public String toString()
		{
			return "Two Pairs";
		}
	},
	
	Pair(20){
		public String toString()
		{
			return "One Pair";
		}
	},
	HighCard(10){
		public String toString()
		{
			return "High Card";
		}
	};
	
	private eHandStrength(final int handstrength){
		this.iHandStrength = handstrength;
	}

	private int iHandStrength;
	
	public int getHandStrength(){
		return iHandStrength;
	}
}
