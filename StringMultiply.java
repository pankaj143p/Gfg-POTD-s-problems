import java.math.BigInteger;
import java.util.Scanner;
import java.util.*;
class StringMultiply {
    public static String multiply(String num1, String num2) {
        BigInteger i1=new BigInteger(num1);
        BigInteger i2=new BigInteger(num2);
        return i1.multiply(i2).toString();
}
/**
 * @param args
 */
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String num1=sc.next();
    String num2=sc.next();
    System.out.println(multiply(num1,num2));
}
}
