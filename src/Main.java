import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Bir sayi girin");
        int n = scanner.nextInt();

        for (int i=1; i<n;i*=4){
            System.out.println(i);
        }
        for (int i=1; i<n; i*=5) {
            System.out.println(i);
        }
    }
}