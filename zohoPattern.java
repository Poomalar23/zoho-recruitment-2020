/**
 * @author Poomalar 
 * Email:reniflower23@gmail.com
 * Date: DEC 23, 2021
 *
 * --------------------------------------------------------------------
 * Pattern Program
 * --------------------------------------------------------------------
 * 
 * example:-------------------------------------------------------------
 * String Input = Welcome
 * ---------------------------------------------------------------------
 * Output:
 *								
 *							C
 *						C	O
 *					C	O	M
 *				C	O	M	E
 *			C	O	M	E	W
 *		C	O	M	E	W	E
 *	C	O	M	E	W	E	L
 *-----------------------------------------------------------------------
 */
import java.util.Scanner;

class zohoPattern {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String to print pattern :\t");
		String word=sc.nextLine();
		int len = word.length();
		int i=0;
		int j=0;
		int middle = len / 2;
		//Store String as Character array.
		char []ch = word.toUpperCase().toCharArray();
		char newChar[] = new char[len];
		
		for( j=middle;j<len;j++) {
			newChar[i]=ch[j];
			i++;
		}
		for( j=0;j<middle;j++) {
			newChar[i]=ch[j];
			i++;
		}
		
		for( i=0; i<len; i++) {
			for( j=0; j<len-i; j++) {
				System.out.print(" "); 
			}
			for( j=0; j<=i; j++) {
				System.out.print(newChar[j]); 
			}
			System.out.println(); 
		}
	}
}
