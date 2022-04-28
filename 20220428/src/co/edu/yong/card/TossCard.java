package co.edu.yong.card;

public class TossCard extends Card{

	public String cardsaff;
	public String company = "Toss";
	
	
	
	public TossCard(String cardNo, String validDate, int cvc,String cardsaff) {
		super(cardNo, validDate, cvc);
		this.cardsaff = cardsaff;
	}

	

    public void showCardInfo() {
    	System.out.println("담당직원"+cardsaff+company);
    }
	
	






	

}
