package operadores.logicos;

/**
 * Classe de exemplo para o exercício da aula 2 de Operadores lógicos e relacionais, Controle de fluxo e Blocos.
 */
public class Main {

    public static void main(String[] args) {

        /**
         * Nesse primeiro exemplo utilizamos apenas operadores lógicos && || ^ !
         */

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("true && false = " + (b1 && b2));
        System.out.println("true && true = " + (b1 && b3));

        System.out.println("false || true = " + (b2 || b3));
        System.out.println("false || false = " + (b2 || b4));

        System.out.println("true ^ true = " + (b1 ^ b3));
        System.out.println("false ^ true = " + (b4 ^ b1));

        System.out.println("true " + !b1);
        System.out.println("false " + !b2);

        /**
         * Neste exemplo já não utilizamos apenas operadores lógicos utilizamos também,
         * operadores aritméticos e relacionais mais que também resultará num resultado boolean (true || false).
         */

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("((10 + 5) < ( 50 - 20)) && true " + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("(i1 > i2) || (f2 < f1) " + ((i1 > i2) || (f2 < f1)));

        /**
         * Aqui utilizamos a ideia de boas práticas, que se baseia em criar variáveis intermediarias para facilitar
         * o entendimento do código e até o reuso dos resultados.
         */

        double salarioMensal = 10500d ;
        double mediaSalario = 11893.58d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

        boolean funcionario = true;

        if (funcionario && recebeAuxilio){
            System.out.println("Tem direito ao Auxilio");
        }else {
            System.out.println("Não tem direito ao Auxilio");
        }
    }

}
