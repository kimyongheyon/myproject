package co.edu.yong.card;

public class CardMain {

	public static void main(String[] args) {

		Card cd = new Card("5432-4567-9534-3657");
		cd.showCardInfo();
		
		TossCard sc = new TossCard("5432-4567-9534-3657", null, 0, "신빛용");
		sc.showCardInfo();
		
	}
	

}
