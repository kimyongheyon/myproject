package co.edu.yong.gender;

public class Gender {

	public static void main(String[] args) {

		String[] arr = {"010102-4","991012-1","960304-1","881012-2","040403-3"};
		
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].charAt(7) == 1 || arr[i].charAt(7) == 3) {
				System.out.println("남자입니다.");
			}
			else if(arr[i].charAt(7) == 2 || arr[i].charAt(7) == 4) {
				System.out.println("여자입니다.");
			}
		}
		
		
	}
	
	

	private static int Charat(int i) {
		return 0;
	}

}
