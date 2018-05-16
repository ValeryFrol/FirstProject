import java.util.Scanner;

public class weight {

	public static void main(String[] args) {
		
		System.out.println("Male or Female? Press 1 for Male, press 2 for Female");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println("Enter your height");
		int height = sc.nextInt();
		
		if(i==1){
			double idealWeight = (height-100)*1.15;
			System.out.println("Your ideal weight - "+idealWeight);
		}
		else{
			double idealWeight = (height-110)*1.15;
			System.out.println("Your ideal weight - "+idealWeight);
		}
		
		
		
		
	}

}
