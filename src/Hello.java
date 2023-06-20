
public class Hello {

	
	public static int showStar(int num) {
		
		
		for(int i = 1; i <= num; i+=2) {
			for(int j = num-1; j > i; j-=2) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
		return num;
	}
	
	public static void main(String[] args) {
		
		
		showStar(10);
	}

}
