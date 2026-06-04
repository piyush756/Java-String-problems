import java.util.*;
public class UsernameFromEmail {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your gmail : ");
        String gmail = sc.next();
        int index = 0;
        for(int i=0;i<gmail.length();i++) {
            if(gmail.charAt(i)=='@') {
                index=i;
            }
        }
        System.out.println("username : "+gmail.substring(0,index));
    }
}
