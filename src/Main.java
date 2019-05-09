import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            int number = scanner.nextInt();
        int min = number;
        int max = number;


        while(true) {

            System.out.println("Enter number");
        }
        scanner.close();
        System.out.println(min);
        System.out.print(max);

    }
    }

}
