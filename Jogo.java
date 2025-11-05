import java.util.Scanner; 
import java.util.Random; 

public class Jogo{
    public static void main(String[] args){
        Random gerador = new Random();
        int aleatorio = gerador.nextInt(500) +1;
        System.out.println("bem vindo ao jogo quente ou frio!");
        System.err.println("o numero aleatorio é : " + aleatorio);


    }
}