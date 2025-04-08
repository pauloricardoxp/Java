import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double cod, quant, preco;

        System.out.println("Digite o código de 1 a 5:");
        cod = sc.nextInt();
        System.out.println("Digite a quantidade:");
        quant = sc.nextInt();

        if(cod == 1 ){
            preco = quant * 4.00;
        }
        else if(cod == 2){
            preco = quant * 4.50;
        }
        else if(cod == 3){
            preco = quant * 5.00;
        }
        else if(cod == 4){
            preco = quant * 2.50;
        }
        else{
            preco = quant * 1.50;
        }

        System.out.printf("Total: R$ %.2f%n", preco);
        
    }
}
