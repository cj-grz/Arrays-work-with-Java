package modulo2;

import java.util.*;

public class Actividad3 {

    public static void main(final String[] args) {
        String a;

        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese una cifra para determinar si es un número capicúa ");
        a = in.nextLine();

        if (a == null || a.length() == 0) {
            System.out.print("Imposible determinar si es o no un número capicúa");
            System.exit(0);
        }

        boolean esNumero = a.chars().allMatch(Character::isDigit);

        if (esNumero) {

        } else {
            System.out.print("Imposible determinar si es o no un número capicúa");
            System.exit(0);
        }

        StringBuilder capicua = new StringBuilder();
        capicua.append(a);
        capicua.reverse();
        String capicua2 = capicua.toString();

        if (a.equals(capicua2)) {
            System.out.print("Sí es número capicúa");
        } else {
            System.out.print("No es número capicúa");

        }

    }

}
