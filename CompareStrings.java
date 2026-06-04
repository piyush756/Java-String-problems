import java.util.*;
class CompareStrings {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string 1 : ");
        String str1 = sc.nextLine();
        System.out.println("enter string 2 : ");
        String str2 = sc.nextLine();
        if(str1.compareTo(str2)==0) {
            System.out.println("strings are equal");
        }else if(str1.compareTo(str2)>0) {
            System.out.println("string 2 : "+str2+" is greater than string 1 : "+str1);

        }else if(str1.compareTo(str2)<0) {
            System.out.println("string 1 : "+str1+" is greater than string 2 : "+str2);
        }
        
    }
}