public class Calculadora {

    // Metodo Instancia (necesita objeto)
    public int sumar(int a, int b){
        return a + b;
    }

    public int resta(int a, int b){
        return a - b;
    }

    public int multiplicacion(int a, int b){
        return a * b;
    }

    public int divs(int a, int b){
        return a / b;
    }

    // Metodo Estatico (Se llama desde la Clase)

    public static double calcularAreaCirculo(double radio){
        return Math.PI * radio * radio;
    }

    // Metodo Privado (solo usable dentro de esta clase)

    private void metodoPrivado(){
        System.out.println("Solo visible dentro de la clase Calculadora");
    }
}
