package operadores.controledefluxo;

public class IfFerias {

    /**
     * Nesse código nao é utilizado Boas Práticas de código porque como podemos ter muitas opções de
     * escolha vemos que assim a expressão vai ficando muito grande então podemos utilizar um Switch
     */
    static void ifFerias() {

        String mes = "julho";
        if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
            System.out.println("Férias");
        }
    }

    /**
     * Melhorando o código utilizando switch
     */
    static void switchFerias() {

        String mes = "dezembro";
        switch (mes) {
            case "dezembro":
            case "julho":
            case "janeiro":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Mês Indefinido");
                break;
        }
    }
}
