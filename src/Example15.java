import java.util.Scanner;

public class Example15 {
    public static void main(String[] argv) {
        int nota;
        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Escribe la nota");
        nota = inputValue.nextInt();

        if(nota >= 0 && nota <= 3) {
            System.out.println("Muy deficiente");
        }
        if(nota >3 && nota <5) {
            System.out.println("Insuficiente");
        }
        if(nota >= 5 && nota <= 6) {
            System.out.println("Suficiente");
        }
        if(nota > 6 && nota <= 7) {
            System.out.println("Bien");
        }
        if(nota > 7 && nota <= 8 ) {
            System.out.println("notable");
        }
        if(nota >= 9) {
            System.out.println("Sobresaliente");
        }


    }
}
