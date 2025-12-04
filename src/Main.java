import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int option;
        int num1;
        int num2;

        float numf1;
        float numf2;


        Calculadora calc = new Calculadora();
        CientificCalc casio = new CientificCalc();

        // Usamos el metodo del objeto

        Scanner numb1 = new Scanner(System.in);
        Scanner numb2 = new Scanner(System.in);
        Scanner opt   = new Scanner(System.in);
        Scanner intro = new Scanner(System.in);

        do {
            System.out.println("======================================");
            System.out.println("|     M E N U  D E  O P C I O N ES   | ");
            System.out.println("======================================");
            System.out.println("|      SELECCIONA UNA OPERACIÓN:     |");
            System.out.println("|          1.- Suma                  |");
            System.out.println("|          2.- Resta                 |");
            System.out.println("|          3.- Multiplicación        |");
            System.out.println("|          4.- División              |");
            System.out.println("|          0.- Salir                 |");
            System.out.println("======================================");

            System.out.print("Opción: ");
            option = Integer.parseInt(opt.nextLine());

            switch (option){
                case 1:

                    System.out.print("Numero 1: ");
                    //num1 = Integer.parseFloat(numb1.nextLine());
                    numf1 = Float.parseFloat(numb1.nextLine());

                    System.out.print("Numero 2: ");
                    //num2 = Integer.parseFloat(numb2.nextLine());
                    numf2 = Float.parseFloat(numb2.nextLine());

                    // int suma = calc.sumar(num1, num2);
                    double suma = casio.sumarDec(numf1, numf2);

                    System.out.println("Resultado: " + suma);
                    intro.nextLine();
                    System.out.flush();

                    break;

                case 2:

                    System.out.print("Numero 1: ");
                    num1 = Integer.parseInt(numb1.nextLine());

                    System.out.print("Numero 2: ");
                    num2 = Integer.parseInt(numb2.nextLine());

                    int resta = calc.resta(num1, num2);

                    System.out.println("Resultado: " + resta);
                    break;

                case 3:

                    System.out.print("Numero 1: ");
                    num1 = Integer.parseInt(numb1.nextLine());

                    System.out.print("Numero 2: ");
                    num2 = Integer.parseInt(numb2.nextLine());

                    int multp = calc.mult(num1, num2);

                    System.out.println("Resultado: " + multp);
                    break;

                case 4:

                    System.out.print("Numero 1: ");
                    num1 = Integer.parseInt(numb1.nextLine());

                    System.out.print("Numero 2: ");
                    num2 = Integer.parseInt(numb2.nextLine());

                    int divs = calc.divs(num1, num2);

                    System.out.println("Resultado: " + divs);
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Ingresa una opción Correcta");
            }

        }while (option != 0);

    }
}