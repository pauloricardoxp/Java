import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num;
        int in = 0;
        int out = 0;

        System.out.println("Digite a quantidade de repetições do número:");
        num = sc.nextInt();

        for(int i = 0; i<num ; i++){
            System.out.println("Digite os números");
            int x = sc.nextInt();

            if(x >=10 && x <=20){
                in++;
            }
            else{
                out++;
            }
        }

        System.out.println("Está no intervalo : " + in);
        System.out.println(" Não está no intervalo : " + out);
        
    sc.close();
    }
}
