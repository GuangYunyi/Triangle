import java.util.Scanner;
public class Triangle
{
	public static void main(String[] args) {
		
		// Input N
		Scanner num = new Scanner(System.in);
		System.out.println(" N=");
		int N = num.nextInt();
		
		// Display
		int i , sum =0;
		for(sum=1;sum<N+1;sum++) {
			for(i=0;i<2*sum-1;i++) 
				System.out.print("*");
			System.out.println("*");
		}
		for(i=0;i<2*sum-1;i++)
			System.out.print("*");
		System.out.println();
		for(sum=sum-1;sum>0;sum--) {
			for(i=0;i<2*sum;i++)
				System.out.print("*");
			System.out.println();
		}
	}
}