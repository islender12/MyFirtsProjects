import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int option;
        int num1;
        int num2;

        float numf1;
        float numf2;
        float suma = 0;
        float areaCircle = 0;

        String respM;

        Calculadora calc = new Calculadora();
        Cientific casio = new Cientific();

        // Usamos el metodo del objeto

        Scanner numb1 = new Scanner(System.in);
        Scanner numb2 = new Scanner(System.in);
        Scanner opt   = new Scanner(System.in);
        Scanner intro = new Scanner(System.in);

        do {
            System.out.println("|====================================|");
            System.out.println("|     M E N U  D E  O P C I O N ES   | ");
            System.out.println("|====================================|");
            System.out.println("|      SELECCIONA UNA OPERACIÓN:     |");
            System.out.println("|          1.- Suma                  |");
            System.out.println("|          2.- Resta                 |");
            System.out.println("|          3.- Multiplicación        |");
            System.out.println("|          4.- División              |");
            System.out.println("|          5.- Area Circulo5         |");
            System.out.println("|          0.- Salir                 |");
            System.out.println("|====================================|");

            System.out.print("Option: ");
            option = opt.nextInt();

            switch (option){
                case 1:

                    System.out.print("Number 1: ");

                    float numd1 = numb1.nextFloat();

                    System.out.print("Number 2: ");

                    double numd2 = numb2.nextDouble();

                    if (isInteger(numd1) && isInteger(numd2)){
                        num1 = (int) numd1;
                        num2 = (int) numd2;
                        suma = (int) calc.sumar(num1, num2);
                        System.out.println("Resultant: " + (int) suma);
                    }else{
                        numf1 = (float) numd1;
                        numf2 = (float) numd2;
                        suma = (float) casio.sumarDecimales(numf1, numf2);
                        System.out.println("Resultant: " + suma);
                    }

                    intro.nextLine();
                    System.out.flush();

                    break;

                case 2:

                    System.out.print("Number 1: ");
                    num1 = Integer.parseInt(numb1.nextLine());

                    System.out.print("Number 2: ");
                    num2 = Integer.parseInt(numb2.nextLine());

                    int resta = calc.resta(num1, num2);

                    System.out.println("Resultant: " + resta);

                    intro.nextLine();
                    System.out.flush();

                    break;

                case 3:

                    System.out.print("Number 1: ");
                    num1 = Integer.parseInt(numb1.nextLine());

                    System.out.print("Number 2: ");
                    num2 = Integer.parseInt(numb2.nextLine());

                    int multp = calc.multiplicacion(num1, num2);

                    System.out.println("Resultant: " + multp);

                    intro.nextLine();
                    System.out.flush();

                    break;

                case 4:

                    System.out.print("Number 1: ");
                    num1 = Integer.parseInt(numb1.nextLine());

                    System.out.print("Number 2: ");
                    num2 = Integer.parseInt(numb2.nextLine());

                    int divs = calc.divs(num1, num2);

                    System.out.println("Resultant: " + divs);

                    intro.nextLine();
                    System.out.flush();

                    break;
                case 5:
                    System.out.print("Size Circle: ");
                    numd1 = numb1.nextFloat();
                    areaCircle = (float) calc.calcularAreaCirculo((double) numd1);
                    System.out.println("Resultant: " + areaCircle);

                    intro.nextLine();
                    System.out.flush();
                case 0:
                    break;
                default:
                    System.out.println("Ingress a option Correct");
                    intro.nextLine();
                    System.out.flush();
            }

        }while (option != 0);

    }

    public static boolean isInteger(double number){
        return Math.abs(number - Math.round(number)) < 0.000001;
    }

}