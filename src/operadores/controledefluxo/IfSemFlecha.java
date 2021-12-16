package operadores.controledefluxo;

import java.util.Scanner;

public class IfSemFlecha {
    /**
     * Nesse código melhoramos o caso do código anterior que tinha um efeito flecha deixando uma má visibilidade,
     * e leitura do código.
     */
    static void ifSemFlecha() {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um mes do ano em numero: ");
        int mes = teclado.nextInt();
        if (mes == 1) {
            System.out.println("Jaeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("NÃO IDENTIFICADO");
        }
    }
}
