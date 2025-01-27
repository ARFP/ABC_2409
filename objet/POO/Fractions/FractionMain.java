
import java.util.Scanner;

public class FractionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("\nVotre numérateur :");
            int numerateur = scanner.nextInt();

            System.out.println("\nVotre dénominateur :");
            int denominateur = scanner.nextInt();


            Fraction f1 = new Fraction(numerateur, denominateur);
            System.out.println("\nVotre fraction : " + f1);

            Fraction f2 = new Fraction();
            System.out.println("\nFraction par défaut : " + f2);

            Fraction f3 = new Fraction(numerateur);
            System.out.println("\nFraction avec seulement le numérateur : " + f3);

            f1.oppose();
            System.out.println("\nL'opposé de votre fraction : " + f1);

            f1.inverse();
            System.out.println("\nL'inverse de votre fraction : " + f1);

            Fraction f4 = new Fraction(24, 16);
            System.out.println("\nDeuxième fraction : " + f4);
            System.out.println("PGCD de la deuxième fraction : " + f4.getPgcd());

            System.out.println("\n" + f4 + " est-il supérieur à " + f1 + " ? " + f4.superieurA(f1));
            System.out.println("\n" + f4 + " est-il égal à " + f1 + " ? " + f4.egalA(f1));


            System.out.println("\nAddition des fractions : " + f4+" + "+f1+" = ");
            f4.addition(f1);
            System.out.print(f4);

            System.out.println("\nSoustraction des fractions : " + f4+" - "+f1+" = ");
            f4.soustraction(f1);
            System.out.print(f4);


            System.out.println("\nMultiplication des fractions : " + f4+" * "+f1+" = ");
            f4.multiplication(f1);
            System.out.print(f4);

            System.out.println("\nDivision des fractions : " + f4+" / "+f1+" = ");
            f4.division(f1);
            System.out.print(f4);

            scanner.close();
        
    }
}
