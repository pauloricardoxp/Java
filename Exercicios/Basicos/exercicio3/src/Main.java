import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int A,B,C,D, dif;

        System.out.println("Digite o primeiro número:");
        A = sc.nextInt();
        System.out.println("Digite o segundo número:");
        B = sc.nextInt();
        System.out.println("Digite o terceiro número:");
        C = sc.nextInt();
        System.out.println("Digite o quarto número:");
        D = sc.nextInt();

        dif = (A * B - C * D);

        System.out.printf("A diferença entre %d x %d - %d x %d = %d", A,B,C,D,dif);

    sc.close();
    }
}
