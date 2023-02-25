import java.io.IOException;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;
        int total = entrada*mesada;
        
        System.out.printf("Voce tera %d reais",total);
        //Calculadora.abrirMenu();


    }
}
