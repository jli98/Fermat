/* should write with BigInteger, when a^(p-1) > Int, it cannot run correctly */
import java.util.*;
public class Fermat {
	
public static boolean Fermat(int p, int times){
	for(int i = 1; i <= times; i++){
		int a = (int)(2+Math.random()*(p-1-2+1));
		System.out.println(a);
		if (Math.pow(a, p-1) % p != 1)
			return false;}
	return true;
	}
	


public static void main(String[] a){
	boolean b = Fermat(7,50000);
	System.out.println(b);
}
}
