package operadores.controledefluxo;

import java.util.Scanner;

public class SwitchNumero {

    static void swiftchNumero() {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero de 1 a 5 : ");
        int numero = teclado.nextInt();

        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
            default:
                System.out.println("Valor indefinido");
                break;
        }
    }
}
