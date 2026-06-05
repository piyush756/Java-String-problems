import java.util.*;
class SpiralMatrix {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of rows : ");
        int r = sc.nextInt();
        System.out.println("enter number of coloumn : ");
        int c = sc.nextInt();
        int array[][]=new int[r][c];
        System.out.println("enter data........");
        for(int i =0;i<r;i++) {
            for(int j=0;j<c;j++) {
                array[i][j]=sc.nextInt();
            }
        }int row_start = 0;
        int row_end=r-1;
        int colm_start= 0;
        int colm_end=c-1;
        while(row_start<=row_end && colm_start<=colm_end) {
            for(int col = colm_start;col<=colm_end;col++) {
                System.out.print(array[row_start][col]+" ");
            }row_start++;
            for(int i=row_start;i<=row_end;i++) {
                System.out.print(array[i][colm_end]+" ");
            }colm_end--;
            if(row_start<=row_end) {
                for(int i =colm_end;i>=colm_start;i--) {
                    System.out.print(array[row_end][i]+" ");
                }row_end--;
            }
            if(colm_start<=colm_end) {
                for(int i=row_end;i>=row_start;i--) {
                    System.out.print(array[i][colm_start]+" ");
                }colm_start++;
            }
            
        }System.out.println();
    }
}