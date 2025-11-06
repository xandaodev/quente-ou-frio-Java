import java.util.Scanner; 
import java.util.Random; 

public class Jogo{

    int aleatorio;
    Scanner leitor;
    int numeroMax;
    int tentativas;
    public Jogo(Scanner leitorExterno, int nivel){
        this.leitor = leitorExterno;
        switch(nivel){
            case 1:
                this.numeroMax = 500;
                this.tentativas = 15;
                break;
            case 2:
                this.numeroMax = 500;
                this.tentativas = 10;
                break;
            case 3:
                this.numeroMax = 800;
                this.tentativas = 10;
                break;
        }
        Random gerador = new Random();
        this.aleatorio = gerador.nextInt(this.numeroMax) +1;
        System.out.println("\n" + "- Seu objetivo é acertar um número de 1 a "+ this.numeroMax +" -" + "\n");
        System.out.println("- Você tem " + this.tentativas  + " tentativas!");
    }

    public void iniciar(){
        int palpite = 0;
        while(palpite!= aleatorio && this.tentativas > 0){
            System.out.print("palpite: ");
            palpite = leitor.nextInt();
            this.tentativas--;
            if(this.tentativas<=0){
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
        if(this.tentativas<=0){
            System.out.println("Suas tentativas acabaram!");
            return;
        }
        System.out.println("parabens, voce acertou o numero!!!");
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
        Scanner leitorPrincipal = new Scanner(System.in);
        String jogarNovamente = "";
        do{
            System.out.println("\n" + "- Bem vindo ao jogo Quente ou Frio! -");
            System.out.println("\n" + "Escolha o nivel de dificuldade: ");
            System.out.println("(1) Fácil (1 a 500) - 15 tentativas");
            System.out.println("(2) Médio (1 a 500) - 10 tentativas");
            System.out.println("(3) Difícil (1 a 800) - 10 tentativas");
            System.out.print("Sua escolha: ");
            int dificuldade = leitorPrincipal.nextInt();
            Jogo meuJogo = new Jogo(leitorPrincipal, dificuldade);
            meuJogo.iniciar();
            System.out.println("------------------------------------");
            System.out.print("Deseja jogar novamente? (s/n): ");
            jogarNovamente = leitorPrincipal.next();
        }while(jogarNovamente.equalsIgnoreCase("s"));
        System.out.println("\n" + "Obrigado por jogar!" + "\n");
        leitorPrincipal.close();
    }
}