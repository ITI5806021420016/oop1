package homwork1;
import java.util.Scanner;
public class Trik {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l=1,c=0,r=0,tmp;
		Scanner scan = new Scanner(System.in);
		String word;
		do{
		System.out.print("Enter swarp : ");
		word = scan.nextLine();
		}while(word.length() < 1 || word.length()>50 || word.length()==0 || (word.charAt(0)!='A'&&
		word.charAt(0)!='B'&&
		word.charAt(0)!='C'&&
		word.charAt(0)!='a'&&
		word.charAt(0)!='b'&&
		word.charAt(0)!='c'));
		for(int i=0;i<word.length();i++){
		if(word.charAt(i)=='A'||word.charAt(i)=='a'){
		tmp=l;
		l=c;
		c=tmp;
		}else if(word.charAt(i)=='B'||word.charAt(i)=='b'){
		tmp=c;
		c=r;
		r=tmp;
		}else{
		tmp=l;
		l=r;
		r=tmp;
		}
		}
		System.out.println("L = "+l);
		System.out.println("C = "+c);
		System.out.println("R = "+r);
	}

}
