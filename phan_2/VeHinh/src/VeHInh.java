// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class VeHInh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Ve hinh tam giac vuong: ");
            for (int i=1;i<=n;i++){
                for (int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        System.out.println("ve hinh tam giac vuong nguoc:");
            for (int i=n;i>=1;i--){
                for (int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        System.out.println("Ve hinh tam giac can: ");
            for (int i=1;i<=n;i++){
                for (int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for (int k=1;k<= 2*i -1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}