import java.util.*;
public class ReverseString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string : ");
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        System.out.println("reverse string : ");
        for(int i=0;i<sb.length()/2;i++) {
            int front = i;
            int back = sb.length()-1-i;
            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);
            sb.setCharAt(front,backchar);
            sb.setCharAt(back,frontchar);
        }System.out.println(sb);
    }
}
