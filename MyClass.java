import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the Fahrenheit temperature: ");
        int fahrenheit = keyboard.nextInt();

        float celsius = (fahrenheit - 32) * 5f / 9f;

        System.out.println("The Celsius = " + celsius);

        keyboard.close(); 
    }
}
