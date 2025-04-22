import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num,par1,par2;
        double div;

        System.out.println("Digite a quantidade de repetição da divisão:");
        num = sc.nextInt();

        for(int i = 0; i<num; i++){
            System.out.println("Digite o primeiro número:");
            par1 = sc.nextInt();
            System.out.println("Digite o segundo número:");
            par2 = sc.nextInt();

            if(par2 == 0){
                System.out.println("Divisão ímpossivel");
            }
            else{
                div = par1 / par2;
                System.out.printf("O resultado da divisão foi: %.2f%n", div);
            }
        }
    sc.close();
    }
}
