import java.util.Scanner;

public class Arms {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int d,sum=0,n=num;
		while(num>0)
		{
			d=num%10;
			sum+=(d*d*d);
			num=num/10;
		}
		if(n==sum)System.out.println("Its a armstrong number");
		else System.out.println("Its not a armstrong number");
		sc.close();
	}

}
