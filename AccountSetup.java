import java.util.Scanner;
public class AccountSetup {
    public static void main(String[]args){
        String name;
        String password;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your mame: \t");
        name = input.next();
        System.out.print("Enter your password: \t");
        password = input.next();
        System.out.println("Your name is: "+name);
        System.out.println("Your password is: "+password);


    }
}
