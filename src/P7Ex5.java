import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P7Ex5 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Esto es una calculadora ");
        double result = 0;
        boolean calc = true;
        boolean inf = false;
        String no = "no";
        while (calc) {
            System.out.println("Dame el primer numero");
            String linea =  br.readLine();
            int firstNum = Integer.parseInt(linea);
            System.out.println("Elige una operacion (+,-,*,/) ");
            String op = br.readLine();
            System.out.println("Dame el segundo numero");
            linea = br.readLine();
            int secondNum = Integer.parseInt(linea);
            switch (op) {
                case "+" : result = firstNum + secondNum;
                        break;
                case "-" : result = firstNum - secondNum;
                        break;
                case "*" : result = firstNum*secondNum;
                        break;
                case "/" : if (secondNum == 0) {
                        System.out.println("Error: Estas dividiendo entre 0 ");
                        inf = true;
                        }else {
                         result = firstNum/secondNum;
                         }
                         break;
                default: System.out.println("No es una operacion");


            }
            /*if (op == "+"){
                result = firstNum + secondNum;
            }else if(op == "-") {
                result = firstNum - secondNum;
            }else if (op == "*") {
                result = firstNum*secondNum;
            }else if (op == "/") {
                if (secondNum == 0) {
                    System.out.println("Error: Estas dividiendo entre 0 ");
                }else {
                    result = firstNum/secondNum;
                }
            }else {
                System.out.println("no es una operacion");
            }*/
            if (!inf) {
                System.out.println("El resultado de " + firstNum + " " + op + " " + secondNum + " = " + result);
            }
            System.out.println("Deseas continuar? (si/no)");
            linea = br.readLine();
            if(linea.equalsIgnoreCase(no)) {
                calc = false;
            }
        }


    }
}
