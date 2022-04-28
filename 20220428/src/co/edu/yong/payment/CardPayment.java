package co.edu.yong.payment;

public class CardPayment implements Payment{

	public double cardRatio;
	
	
	
	
	
	
	public CardPayment(double cardRatio) {
		super();
		this.cardRatio = cardRatio;
	}

	@Override
	public int online(int price) {
		
		
		
		return 0;
	}

	@Override
	public int offline(int price) {
		
		
		return 0;
	}

	@Override
	public void showInfo() {
		
		
		
	}

	
	
	
	
	
}
