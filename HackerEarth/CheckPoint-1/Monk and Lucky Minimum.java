import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MonkAndLuckyMinimum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		MonkAndLuckyMinimum m=new MonkAndLuckyMinimum();
		int n= sc.nextInt();
		String y[]=new String[n];
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			int x[]=new int[a];
			for(int j=0;j<a;j++)
			{
				x[j]=sc.nextInt();
			}
			y[i]=m.findMin(x);
		}
		m.printMin(y);
	}

	public String findMin(int[] x) {
		Arrays.sort(x);
		int count=1,b=x[0];
		
		for(int i=1;i<x.length;++i)
		{
			if(b==x[i])
			{
				count++;
			}
			else
				break;
		}
		if(count%2==0)
		{
			return "Unlucky";
		}
		else
		{
			return "Lucky";
		}
	}
	
	
	private void printMin(String[] y) {
		for(int i=0;i<y.length;i++)
		{
			System.out.println(y[i]);
		}
	}
}
