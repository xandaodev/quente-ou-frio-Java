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
            int distancia = palpite - aleatorio;
            if (distancia<0){
                distancia = distancia *(-1);
            }
            if(distancia >400){
                System.out.println("ta congelando!");
            }
            if(distancia >300 && distancia<400){
                System.out.println("ta muito frio!");
            }
            if(distancia >200 && distancia<300){
                System.out.println("ta frio ainda!");
            }
            if(distancia >100 && distancia<200){
                System.out.println("ta começando a esquentar!");
            }
            if(distancia >50 && distancia<100){
                System.out.println("ta morno!");
            }
            if(distancia >25 && distancia<50){
                System.out.println("ta quente!");
            }
            if(distancia >12 && distancia<25){
                System.out.println("ta muito quente!");
            }
            if(distancia >6 && distancia<12){
                System.out.println("ta pelando!");
            }

        }
        System.out.println("parabens paizao voce certou o numero!");

        leitor.close();



    }
}