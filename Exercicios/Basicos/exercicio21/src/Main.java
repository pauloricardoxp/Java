import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;
        

        System.out.println("Digite um número");
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            System.out.println("Digite os valores para calcular a média ponderada");
            double A = sc.nextDouble();
            double B = sc.nextDouble();
            double C = sc.nextDouble();

             double media = (A * 2.0 + B * 3.0 + C * 5.0)/10;

             System.out.printf("A média ponderada é : %.1f%n", media);
        }
    sc.close();
    }
}
