package operadores.controledefluxo;

import java.util.Scanner;

public class SwitchSemana {

    static void switchSemana(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do dia ex (Segunda):  ");
        String dia = teclado.next();

        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sabado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }
    }
}
