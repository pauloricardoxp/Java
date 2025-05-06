package application;

import entities.Students;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Students stu = new Students();

        stu.name = sc.nextLine();
        stu.grade1 = sc.nextDouble();
        stu.grade2 = sc.nextDouble();
        stu.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n" , stu.finalNota());
        if(stu.finalNota()< 60.00){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f%n POINTS" , stu.missingNota());
        }else{
            System.out.println("PASS");
        }
    sc.close();
    }

}
