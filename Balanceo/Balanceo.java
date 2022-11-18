
package balanceo;
 import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;

public class Balanceo {
 public static void main(String[] args) {
        String texto1 = "texto1.txt";
        String contenido = leerContenido(texto1);
        boolean balancerFile1 = cParentesis(contenido);
        System.out.println("Archivo " + texto1 +  " - Balanceo: " + balancerFile1);

        String texto2 = "texto2.txt";
        String contenido2 = leerContenido(texto2);
        boolean balancerFile2 = cParentesis(contenido2);
        System.out.println("Archivo " + texto2 + " - Balanceo: " + balancerFile2);
    }

    public static boolean cParentesis(String oracion) {
        Stack<Character>validacion  = new Stack<>();

        for (int i = 0; i < oracion.length(); i++) {
            char caracterActual = oracion.charAt(i);
            switch (caracterActual) {
                case '(':
                case '[': 
                case '{':
                    validacion.push(caracterActual);
                    break;

                case ')':
                case ']':
                case '}':
                    if (validacion.isEmpty())
                        return false;
                    else {
                        char caracterPila = validacion.pop();
                        if (caracterActual == ')' && caracterPila != '(')
                            return false;
                        else if (caracterActual == ']' && caracterPila != '[')
                            return false;
                        else if (caracterActual == '}' && caracterPila != '{')
                            return false;
                    }
                    break;

                default:
                    break;
            }
        }

        return validacion.isEmpty();
    }

    public static String leerContenido(String   nombreArchivo) {
        String renglon;
        String filaConten = "";
        try {
            FileReader fileReader = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((renglon = bufferedReader.readLine()) != null) {
                filaConten += renglon;
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
        return filaConten;
    }
}
