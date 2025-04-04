import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1,cod2, qntd1, qntd2;
        double preco1, preco2 , total;

        System.out.println("Digite o código da primeira peça :");
        cod1 = sc.nextInt();
        System.out.println("Digite o quantidade da primeira peça:");
        qntd1 = sc.nextInt();
        System.out.println("Digite o preço únitario da primeira peça:");
        preco1 = sc.nextDouble();

        System.out.println("Digite o código da segunda peça :");
        cod2 = sc.nextInt();
        System.out.println("Digite o quantidade da segunda peça:");
        qntd2 = sc.nextInt();
        System.out.println("Digite o preço únitario da segunda peça:");
        preco2 = sc.nextDouble();

        total = (preco1 * qntd1 + preco2 *qntd2);

        System.out.printf("O valor total a pagar: R$ %.2f%n", total);

    sc.close();
    }
}
