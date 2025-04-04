import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A,B,C,triangulo,circulo,trapezio,quadrado,retangulo;

        System.out.println("Digite o primeiro número:");
        A = sc.nextDouble();
        System.out.println("Digite o segundo número:");
        B = sc.nextDouble();
        System.out.println("Digite o terceiro número:");
        C = sc.nextDouble();

        triangulo = A * C / 2.0;
        circulo = 3.14159 * C * C;
        trapezio = (A + B) / 2.0  * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("Triângulo: %.3f%n ", triangulo);
        System.out.printf("Círculo: %.3f%n ", circulo);
        System.out.printf("Trapézio: %.3f%n ", trapezio);
        System.out.printf("Quadrado: %.3f%n ", quadrado);
        System.out.printf("Retângulo: %.3f%n ", retangulo);
    
    sc.close();
    }
}
