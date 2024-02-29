import java.util.Scanner;
public class DivAndMod {
    public static void main(String[]args){
        int integer1;
        int integer2;
        int mod1;
        int div1;
        int mod2;
        int div2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter interger 1: ");
        integer1 = input.nextInt();
        System.out.print("Enter interger 2: ");
        integer2 = input.nextInt();
        input.close();
        mod1 = integer1%integer2;
        div1 = integer1/integer2;
        mod2 = integer2%integer1;
        div2 = integer2/integer1;
        System.out.println(integer1 + " / " + integer2 + " = "+div1);
        System.out.println(integer1 + " % " + integer2 + " = "+mod1 + "\n");
        System.out.println(integer2 + " % " + integer1 + " = "+mod2);
        System.out.println(integer2 + " % " + integer1 + " = "+div2);
    }
}
