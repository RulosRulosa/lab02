import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Taller02UnitTesting {
    /*- Se quiere analizar el contenido de un archivo de texto llamado cadenas.txt, que contiene una cadena de
        texto por cada línea. Luego, si el archivo tiene N líneas, son N cadenas de texto, una por línea.

      - Se debe abrir, leer y analizar el contenidfo del archivo.

      - Para efectos de este taller se considera el archivo cadenas.txt para su análisis.*/

    public static void main(String[] args) {

    }

    public static void LeerArchivo() {
        String ruta = "C:\\Users\\Yumik\\IdeaProjects\\lab02\\cadenas.txt";
        Path archivo = Paths.get(ruta);
        String texto = "";

        try {

            texto = new String(Files.readAllBytes(archivo));
            System.out.println(texto);

        } catch (IOException e) {

            System.out.println("El archivo no pudo ser leido");

        }
    }

    public static String formatPalb(String Palb) {
        String[] quitar = {" ", ",", "."};
        Palb = Palb.toLowerCase();
        for (int i = 0; i < quitar.length; i++) {
            Palb = Palb.replace(quitar[i], "");
        }
        return Palb;
    }

    public static boolean validarPalb(String palb) {
        palb = formatPalb(palb);
        String palindromo = new StringBuilder(palb).reverse().toString();
        if (palb.equals(palindromo)) {
            System.out.println("Es palindromo");
            return true;

        } else {
            System.err.println("No es palindromo");
            return false;
        }
    }


}
