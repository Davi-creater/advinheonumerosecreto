import java.lang.invoke.SwitchPoint;
import java.util.Random;
import java.util.Scanner;

public class advinheOJogo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(10);
        int numeroDeTentativas = 0;
        int chute = 0;

        while (numeroDeTentativas < 5){
            System.out.println("Digite um numero entre 0 e 10");
            chute = leitura.nextInt();
            numeroDeTentativas++;
            if (chute == numeroSecreto){
                System.out.println("Parabens! voce acertou o numero secreto");
                System.out.println(numeroSecreto);
                break;
            } else if (chute < numeroSecreto) {
                System.out.println("O numero secreto é maior que "+chute);
            } else{
                System.out.println("O numero secreto é menor que "+chute);
            }
        }
        if (numeroDeTentativas > 4 && chute != numeroSecreto){
            System.out.println("A quantidade de tentativas acabadou!");
            System.out.println("O numero secreto era "+numeroSecreto);
        }


    }
}
