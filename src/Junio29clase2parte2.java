import java.util.Scanner;

public class Junio29clase2parte2 {
    public static void main(String[] args){
        /*
        System.out.println(5+5);
        System.out.println(5%5);
        System.out.println(5/5);
        System.out.println(Math.pow(4,3));
        System.out.println(Math.sqrt(81));
        System.out.println(Math.abs(-5));
        */
        /*
        int contador=0;
        contador+=1;
        System.out.println(contador);
        */
        /*
        int numero=1;
        System.out.println(numero++);
        System.out.println(numero);
        System.out.println((++numero));
        */
        
        /*
        char caracter='x';
        System.out.println(++caracter);
        */
        /*
        String resultado=5>2 ? ":)" : ":C";
        System.out.println(resultado);
        */
        // and "&" XOR "^"
        /*
        String resultado=(5>3 & 4>6) ? ":)" : ":C";
        System.out.println(resultado);
        */
        /*
        String resultado=(5>3 || 4>6 || 7<9) ? ":)" : ":C";
        System.out.println(resultado);
        */

        //ejercicios

        Scanner scanner=new Scanner(System.in);
        System.out.println("ingrese el nombre");
        String nombre=scanner.nextLine();
        String mensaje=saludar(nombre);
        System.out.println(mensaje);

        /*
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digita un número");
        int numero=scanner.nextInt();
        System.out.println(contadorDigitos(numero));
        */
    }

    public static int contadorDigitos(int numero){
        int cifras=0;
        while(numero!=0){
            numero/=10;
            cifras++;
        }
        return cifras;
    }


    public static String saludar(String nombre){
        return "Hola "+nombre+" eres el mejor";
    }
}
