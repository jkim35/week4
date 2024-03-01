import java.util.Scanner;
public class TempConverter {
    public static void main(String[]args){
        int temp;
        double outTemp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        temp = input.nextInt();
        outTemp = ((temp - 32.0)*(5.0/9.0));
        System.out.println("The temperature in Celcius is "+ outTemp );
    }
}
