import java.util.Scanner;
public class P7Ex4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num, sum, max, min, cont;
        double mitj = 0;
        boolean numdiff = true, first = true;
        sum = max = min = cont = 0;

        System.out.println("Dame numeros ");
        while(numdiff) {
            num = in.nextInt();
            if(first) {
                min = num;
                max = num;
                first = false;
            }
            if(num == 0) {
                numdiff = false;
                System.out.println("La suma total es " + sum);
                if(first){
                    mitj = sum/cont;
                }
                System.out.println("La media es " + mitj);
                System.out.println("El valor minimo es " + min);
                System.out.println("El valor maximo es " + max);

            }else {
                sum += num;
                cont++;
                if (max <= num) {
                    max = num;
                }
                if (min >= num) {
                    min = num;
                }
            }
            }
    }
}
