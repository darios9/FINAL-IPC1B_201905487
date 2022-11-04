package examane_finali_pc1b;

import java.util.Scanner;

public class Examane_FinalI_PC1B {

    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        int Opcion = 0;
        int num1 = 0;
        int num2 = 0;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("    MENU PRINCIPAL   ");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Salir ");
            System.out.println("Ingrese el numero de la opcion a realizar");
            Opcion = leer.nextInt();

            if (Opcion != 4) {

                switch (Opcion) {
                    case 1:
                        System.out.println("ingrese el primer numero");
                        num1 = leer.nextInt();
                        System.out.println("ingrese el segundo numero");
                        num2 = leer.nextInt();
                        System.out.println("-----------------------");
                        Ejercicio1(num1, num2);
                        System.out.println("-----------------------");
                        break;
                    case 2:
                        System.out.println("ingrese el numero");
                        int numero3 = leer.nextInt();
                        System.out.println("----------------------");
                        ejercicio2(numero3);
                        System.out.println("----------------------");
                        break;
                    case 3:

                        break;

                }
            }
        } while (Opcion != 4);
        {

        }
    }

    public static void Ejercicio1(int a, int b) {
        if (a > b) {
            System.out.println("el numero mayor es:" + a);
        } else {
            System.out.println("el numero mayor es:" + b);
        }
    }

    public static void ejercicio2(int numero) {
        int fila = numero;
        int a = 0;
        if (numero == 5) {
            a = 2;
        } else {
            if (numero == 3) {
                a = 0;
            } else {
                if (numero == 7) {
                    a = 4;
                } else {
                    if (numero == 9) {
                        a = 6;
                    }
                }
            }

        }
        for (int i = 0; i < fila; i++) {
            for (int j = 1; j <= fila - i; j++) {
                System.out.print(" ");
            }
            for (int figura = 1; figura < (i * 2) - a; figura++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
