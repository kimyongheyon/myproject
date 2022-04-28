package co.edu.yong.card;


public class Card {

	private String cardNo;
	
	private String validDate;
	
	private int  cvc;

	

	
	public Card(String cardNo) {
		this.cardNo = cardNo;
	}

	public Card(String cardNo, String validDate, int cvc) {
		super();
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.cvc = cvc;
	}

	public String getCardNo() {
		return cardNo;
	}

	public String getValidDate() {
		return validDate;
	}

	public int getCvc() {
		return cvc;
	}
	
	
	public void showCardInfo() {
		System.out.println(" Card NO :"+cardNo);
		
		
	}
	
	
}
