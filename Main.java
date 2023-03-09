import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        // ¿QUE QUEREMOS HACER?
        // 1. Crear una lista de enteros
        List<Integer> numeros = crearLista();
        System.out.println(numeros);
        // Quedarmoe solo con los pares
        List<Integer> pares = filtrarPares(numeros);
        System.out.println(pares);
        // Quedarmoe solo con los impares
        List<Integer> impares = filtrarImpares(numeros);
        System.out.println(impares);
        // Pasar cada numero al cuadrado
        List<Integer> cuadrados = obtenerCuadrados(numeros);
        System.out.println(cuadrados);
        // Obtener la sumatoria de los cuadrados y mostrala por pantalla
        int sumatoria = obtenerSumatoria(cuadrados);
        System.out.println("La sumatoria es: " + sumatoria);
    }

    private List<Integer> crearLista() {
        return List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144);
    }

    private List<Integer> filtrarPares(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();
        // Se recorre la lista y se agregan solo pares
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                resultado.add(numero);
            }
        }
        return resultado;
    }

    private List<Integer> filtrarImpares(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();
        // Se recorre la lista y se agregan solo pares
        for (Integer numero : numeros) {
            if (numero % 2 != 0) {
                resultado.add(numero);
            }
        }
        return resultado;
    }

    private List<Integer> obtenerCuadrados(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();
        // Se recorre la lista y se agregan solo pares
        for (Integer numero : numeros) {

            resultado.add(numero * numero);

        }
        return resultado;
    }

    private int obtenerSumatoria(List<Integer> numeros) {
        int resultado = 0;
        // Se recorre la lista y se agregan solo pares
        for (Integer numero : numeros) {

            resultado += numero;

        }
        return resultado;
    }
}