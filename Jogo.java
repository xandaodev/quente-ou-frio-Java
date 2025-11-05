import java.util.Scanner; 
import java.util.Random; 

public class Jogo{
    public static void main(String[] args){
        Random gerador = new Random();
        int aleatorio = gerador.nextInt(500) +1;
        System.out.println("bem vindo ao jogo quente ou frio!");
        System.err.println("o numero aleatorio é : " + aleatorio);

        Scanner leitor = new Scanner(System.in);
        int palpite = 0;
    
        while(palpite!= aleatorio){
            palpite = leitor.nextInt();
            if (palpite == aleatorio){
                System.out.println("voce acertou o numero!");
            }else{
                System.out.println("ta errado paizao tenta de novo ai ");
            }

        }



    }
}