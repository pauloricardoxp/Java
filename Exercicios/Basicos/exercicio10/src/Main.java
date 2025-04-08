import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int horaInicial,horaFinal, duracao;

        System.out.println("Digite a hora inicial:");
        horaInicial = sc.nextInt();
        System.out.println("Digite a hora final:");
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaInicial - horaFinal;
            
        }
        else{
            duracao = (24 - horaInicial) + horaFinal;
        }
        
        System.out.println("O jogo durou:" + duracao + "hora(s)");

    sc.close();
    }
    
}
