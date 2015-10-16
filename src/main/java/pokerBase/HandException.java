package pokerBase;

public class HandException extends Exception {
	private Hand exHand;
	
	public HandException(pokerBase.Hand Hand) {
		this.exHand = exHand;
	}

	public pokerBase.Hand getexHand() {
		return exHand;
	}
}
