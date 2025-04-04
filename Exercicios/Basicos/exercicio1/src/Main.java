import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num1, num2, soma;

        System.out.println("Digite o primeiro número:");
        num1 = sc.nextInt();

        System.out.println("Digite o primeiro número:");
        num2 = sc.nextInt();

        soma = num1 + num2;

        System.out.printf("A Soma entre %d e %d = %d", num1,num2,soma);

        sc.close();
    }
}
