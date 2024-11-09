import java.util.Scanner;
public class PrimeNumbersInArray {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter 10 integers:");
        for(int i = 0; i < 10; i++){
            numbers[i] = scanner.nextInt();
        }
        System.out.print("\nPrime numbers:");
        for (int num : numbers){
            if (isPrime(num)){
                System.out.println(num);

            }
        }
    }
    public static boolean isPrime(int num){
        if (num < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
