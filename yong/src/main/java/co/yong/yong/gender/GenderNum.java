package co.yong.yong.gender;

public class GenderNum {

	public static void main(String[] args) {

		String[] arr = {"010102-4","991012-1","960304-1","881012-2","040403-3"};
		System.out.println("#반환 성공");
		for(int i=0; i<arr.length; i++) {
			if(arr[i].substring(7).equals("1")){
			String newarr =	arr[i].substring(0,7)+'2'+arr[i].substring(7+1);
			System.out.println(newarr);
			}
			else if(arr[i].substring(7).equals("2")) {
				String newarr =	arr[i].substring(0,7)+'1'+arr[i].substring(7+1);
				System.out.println(newarr);
			}
			else if(arr[i].substring(7).equals("3")) {
				String newarr =	arr[i].substring(0,7)+'4'+arr[i].substring(7+1);
				System.out.println(newarr);
			}
			else if(arr[i].substring(7).equals("4")) {
				String newarr =	arr[i].substring(0,7)+'3'+arr[i].substring(7+1);
				System.out.println(newarr);
			}
		}
	}
		
	}


