import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    /**
     * Ejemplo basico de una entrada por terminal con un try catch y salida por terminal
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce un numero -> ");
        String linea =  br.readLine();
        try {
            int x = Integer.parseInt(linea);
            x = x + 30;
            System.out.println("aqui la x -> " + x);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("lo que haz introducido esta mal");
        }
    }
}
