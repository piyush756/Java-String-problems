import java.util.*;
public class LengthOfAllStringEntered {
    public static void main(String args[]) {
        System.out.println("enter number of records you want to enter : ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();
        String aray[]=new String[choice];
        System.out.println("enter data : ");
        int length=0;
        for(int i=0;i<choice;i++) {
            aray[i]=sc.nextLine();
            length=length+aray[i].length();
        }
        System.out.println("length of all strings : "+length);

    }
}
