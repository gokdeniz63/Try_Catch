import java.util.*;
import javax.swing.JOptionPane;
import java.lang.*;
import java.security.MessageDigest;

import static java.lang.System.in;
import static java.lang.System.out;

public class Try_Catch {

	static Scanner gir=new Scanner(System.in);
	public static void main(String[] args) {
		
		out.println("Sayı giriniz:");
		int i =tamsayıgir();
		out.println("Karesi:"+i*i);
	}
	public static int tamsayıgir()
	{
		while(true) {
		try {
			return gir.nextInt();			
		}
		catch(InputMismatchException e)
		{
			gir.next();
			out.print("Girilen tamsayı değil\n"+"tekrar deneyin: ");
			
		}
		}
		
	}

}