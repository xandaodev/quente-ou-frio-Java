import java.util.Scanner; 
import java.util.Random; 

public class Jogo{
    public static void main(String[] args){
        Random gerador = new Random();
        int aleatorio = gerador.nextInt(500) +1;
        System.out.println("\n" + "- Bem vindo ao jogo Quente ou Frio! -");
        System.out.println("\n" + "- Seu objetivo é acertar um número de 1 a 500 -" + "\n");

        Scanner leitor = new Scanner(System.in);
        int palpite = 0;
        while(palpite!= aleatorio){
            System.out.print("palpite: ");
            palpite = leitor.nextInt();
            int distancia = palpite - aleatorio;
            if (distancia<0){
                distancia = distancia *(-1);
            }

            if(palpite == aleatorio){

            }else if(distancia >=400){
                System.out.println("ta congelando!");
            }else if(distancia >=300){
                System.out.println("ta muito frio!");
            }else if(distancia >=200){
                System.out.println("ta frio ainda!");
            }else if(distancia >=100){
                System.out.println("ta começando a esquentar!");
            }else if(distancia >=50){
                System.out.println("ta morno!");
            }else if(distancia >=25){
                System.out.println("ta quente!");
            }else if(distancia >=12){
                System.out.println("ta muito quente!");
            }else if(distancia >=6){
                System.out.println("ta pelando!");
            }else{
                System.out.println("Ta fervendo!!!!");
            }

        }
        System.out.println("parabens paizao voce acertou o numero!");
        leitor.close();
    }
}