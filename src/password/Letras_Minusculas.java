package password;

import java.util.concurrent.ThreadLocalRandom;


public class Letras_Minusculas {
    public static String Minusculas(int longitud) {

        String banco = "abcdefghijklmnopqrstuvwxyzñ";
        String cadena = "";
        for (int x = 0; x < longitud; x++) {
            int indiceAleatorio = numeroAleatorioEnRango(0, banco.length() - 1);
            char caracterAleatorio = banco.charAt(indiceAleatorio);
            cadena += caracterAleatorio;
        }
        return cadena;
    }

    public static int numeroAleatorioEnRango(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
}
