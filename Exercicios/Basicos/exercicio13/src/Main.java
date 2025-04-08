import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x,y;
        System.out.println("Digite o primeiro valor:");
        x = sc.nextDouble();
        System.out.println("Digite o segundo valor:");
        y = sc.nextDouble();

        if(x == 0.0 && y == 0.0){
            System.out.println("Origem");
        }
        else if(x == 0.0){
            System.out.println("Eixo Y");
        }
        else if(y == 0.0){
            System.out.println("Eixo X");
        }
        else if(x > 0.0 && y > 0.0){
            System.out.println("Quadrante 1");
        }
        else if(x < 0.0 && y > 0.0 ){
            System.out.println("Quadrante 2");
        }
        else if(x < 0.0 && y < 0.0){
            System.out.println("Quadrante 3");
        }
        else{
            System.out.println("Quadrante 4");
        }
        
    sc.close();
    }
}
