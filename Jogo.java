import java.util.Scanner; 
import java.util.Random; 

public class Jogo{

    int aleatorio;
    Scanner leitor;
    public Jogo(){
        Random gerador = new Random();
        this.aleatorio = gerador.nextInt(500)+1;
        this.leitor = new Scanner(System.in);
        System.out.println("\n" + "- Bem vindo ao jogo Quente ou Frio! -");
        System.out.println("\n" + "- Seu objetivo é acertar um número de 1 a 500 -" + "\n");
        System.out.println("- Você tem 10 tentativas! -" + "\n");
    }

    public void iniciar(){
        int palpite = 0;
        int tentativas = 10;
        while(palpite!= aleatorio || tentativas != 0){
            System.out.print("palpite: ");
            palpite = leitor.nextInt();
            tentativas--;
            if(tentativas<=0){
                break;
            }
            int distancia = palpite - aleatorio;
            if (distancia<0){
                distancia = distancia *(-1);
            }
            if(palpite == aleatorio){
                
            }else{
                String dicaRecebida=darDica(distancia);
                System.out.println(dicaRecebida);
            }
        }
        if(tentativas<=0){
            System.out.println("Suas tentativas acabaram!");
            return;
        }
        System.out.println("parabens, voce acertou o numero!!!");
        this.leitor.close();
    }
    public String darDica(int distancia){
        if(distancia >=400){
                return "ta congelando!";
            }else if(distancia >=300){
                return "ta muito frio!";
            }else if(distancia >=200){
                return "ta frio ainda!";
            }else if(distancia >=100){
                return "ta começando a esquentar!";
            }else if(distancia >=50){
                return "ta morno!";
            }else if(distancia >=25){
                return "ta quente!";
            }else if(distancia >=12){
                return "ta muito quente!";
            }else if(distancia >=6){
                return "ta pelando!";
            }else{
                return "Ta fervendo!!!!";
            }
    }
    public static void main(String[] args){
        Jogo meuJogo = new Jogo();
        meuJogo.iniciar();

    }
}