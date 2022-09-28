
package hilos_1;

public class Hilos_1 {

    public static void main(String[] args) {
        
         for( String s: args) {
            int n = Integer.parseInt(s);
            Thread t = new Thread( new funcion(n) );
            t.start();
        }
    }
}