import java.util.Scanner;
public class Pyramid{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer n:");
        int n = scanner .nextInt();
        scanner .close();
        for (int i = n; i <=1; i++){
            for (int j = i; j <=1; j++)
            {
                System.out.print(j + "");
            }
            System.out.println();
        }
    }
}