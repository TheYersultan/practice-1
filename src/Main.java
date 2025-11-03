import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String text = System.getenv("S_TEXT");
        System.out.println("Value in the env file: "+ text);
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();



        System.out.println(a+b);


        System.out.println("STEP 1");

        System.out.println("STEP 2");

        System.out.println("STEP 3");


    }
}