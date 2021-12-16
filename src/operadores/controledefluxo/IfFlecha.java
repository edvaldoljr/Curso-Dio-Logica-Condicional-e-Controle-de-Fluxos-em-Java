package operadores.controledefluxo;

import java.util.Scanner;

public class IfFlecha {
    /**
     * if com um efeito flecha não é uma boa prática porque mostra que temos muitos if um dentro do outro assim
     * vamos ter um grande crescimento do nosso código para o lado ESQUERDO,
     * deixando de termos uma boa visibilidade e leitura do código então,
     * vamos ver que esse código pode ter como melhorar.
     */
    static void ifFlecha() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um mes do ano em numero: ");
        int mes = teclado.nextInt();
        if (mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("Maio");
                        } else {
                            if (mes == 6) {
                                System.out.println("Junho");
                            } else {
                                if (mes == 7) {
                                    System.out.println("Julho");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mes == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10) {
                                                System.out.println("Outubro");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println("Novembro");
                                                } else {
                                                    if (mes == 12) {
                                                        System.out.println("Dezembro");
                                                    } else {
                                                        System.out.println("NÃO IDENTIFICADO");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}