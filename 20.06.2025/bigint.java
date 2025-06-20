import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String a = sc.nextLine();
       String b = sc.nextLine();
       
       BigInteger x = new BigInteger(a);
       BigInteger y = new BigInteger(b);
       
       System.out.println(x.add(y));
       System.out.println(x.multiply(y));
   }
}
