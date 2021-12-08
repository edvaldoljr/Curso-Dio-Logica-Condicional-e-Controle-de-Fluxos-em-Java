package operadores.relacionais;

public class Main {

    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 =  'x';
        char C2 = 'Y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Sicrano";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597L;
        long l2 = 8997L;
        byte y1 = 1;
        short h1 = 25;

        System.out.println("10 == 20 " + (f1 == i2));
        System.out.println("10 != 20 " + (i1 != i2));
        System.out.println("10 > 20 " + (i1 > i2));
        System.out.println("10 <= 20 " + (i1 <= i2));

        System.out.println("4.5f == 3.5f " + (f1 == f2));
        System.out.println("4.5f != 3.5f " + (f1 != f2));
        System.out.println("4.5f >= 3.5f " + (f1 >= f2));
        System.out.println("4.5f < 3.5f " + (f1 < f2));

        System.out.println("'x' == 'Y' " + (c1 == C2));
        System.out.println("'x' != 'Y' " + (c1 != C2));
        System.out.println("'x' > 'Y' " + (c1 > C2));
        System.out.println("'x' <= 'Y'" + (c1 <= C2));

        System.out.println("Fulano == Fulano " + (s1 == s2));
        System.out.println("Fulano == Sicrano " + (s1 == s3));
        System.out.println("Fulano != Fulano " + (s1 != s2));
        //System.out.println("Fulano >= Fulano" + (s1 >= s2));
        //System.out.println("Fulano < Fulano" + (s1 < s2));

        System.out.println("true == false " + (b1 == b2));
        System.out.println("true != false " + (b1 != b2));
        //System.out.println("true > false" + (b1 > b2));
        //System.out.println("true <= 10" + (b1 <= i1));

        System.out.println("20 > 4.5f " + (i2 > f1));
        System.out.println("59.6d == 25 " + (d1 == h1));
        //System.out.println("Fulano != 'x' " + (s2 != c1));
        //System.out.println("Sicrano != 10 " + (s3 != i1);


        System.out.println("1597L == 20 " + (l1 == i2));
        System.out.println("8997L >= 10 " + (l2 >= i1));
        System.out.println("1 != 25 " + (y1 != h1));
    }
}
