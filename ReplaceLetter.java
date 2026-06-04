import java.util.*;
public class ReplaceLetter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string : ");
        String data = sc.nextLine();
        System.out.println("enter the character you want to replace : ");
        char c = sc.next().charAt(0);
        System.out.println("enter character you need as replacement : ");
        char r = sc.next().charAt(0);
        char newdata[]=new char[data.length()];
        for(int i=0;i<data.length();i++) {
            newdata[i]=data.charAt(i);
        }for(int i=0;i<newdata.length;i++) {
            if(newdata[i]==c) {
                newdata[i]=r;
            }
        }System.out.println("new data : "+String.valueOf(newdata));
    }
}
