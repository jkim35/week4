import java.util.Scanner;
public class GradeAvg {
    public static void main(String[]args){
        int grade1;
        int grade2;
        int grade3;
        int grade4;
        int grade5;
        double average;
        Scanner input = new Scanner(System.in);
        System.out.println("What was your 1st grade: ");
        grade1 = input.nextInt();
        System.out.println("What was your 2nd grade: ");
        grade2 = input.nextInt();
        System.out.println("What was your 3rd grade: ");
        grade3 = input.nextInt();
        System.out.println("What was your 4th grade: ");
        grade4 = input.nextInt();
        System.out.println("What was your 5th grade: ");
        grade5 = input.nextInt();
        average = (grade1+grade2+grade3+grade4+grade5)/5;
        System.out.println("Your average is: "+average);
    }
}
