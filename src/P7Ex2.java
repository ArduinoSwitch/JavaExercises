import java.util.Scanner;
// Es el ejercicio 3.
public class P7Ex2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num, sum = 0;
        boolean numdiff = true;
        System.out.println("Dame un numero ");
        while(numdiff) {
            num = in.nextInt();
            if(num == 0) {
                numdiff = false;
                System.out.println("La suma total es " + sum);
            }else {
                sum += num;
            }

        }
    }

}
