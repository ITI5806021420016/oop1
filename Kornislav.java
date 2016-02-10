package homwork1;
import java.util.Scanner;
public class Kornislav {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,temp;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Value_1 : ");
		a=scan.nextInt();
		System.out.print("Input Value_2 : ");
		b=scan.nextInt();
		System.out.print("Input Value_3 : ");
		c=scan.nextInt();
		System.out.print("Input Value_4 : ");
		d=scan.nextInt();
		if(a>b){
		temp=a;
		a=b;
		b=temp;
		}
		if(a>c){
		temp=a;
		a=c;
		c=temp;
		}
		if(a>d){
		temp=a;
		a=d;
		d=temp;
		}
		if(b>c){
		temp=b;
		b=c;
		c=temp;
		}
		if(b>d){
		temp=b;
		b=d;
		d=temp;
		}
		if(c>d){
		temp=c;
		c=d;
		d=temp;
		}
		System.out.print("\nRectangle Area = : "+""+c+""+" * "+a+" = "+c*a);
	}

}
