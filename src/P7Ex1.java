import java.util.Scanner;

public class P7Ex1 {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        double num;
        boolean numdiff = true;
        while(numdiff) {
            System.out.println("Dame un numero positivo:");
            num = in.nextDouble();
            if(num >= 0) {
                numdiff = false;
                num = Math.sqrt(num);
                System.out.println("Su raiz cuadrada es " + num);
            }else {
                System.out.println("Error: lo que has introducido no es un numero positivo");
            }

        }
    }
}
