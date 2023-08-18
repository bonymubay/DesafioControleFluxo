import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws ArithmeticException {

        Scanner input= new Scanner(System.in);



        int num1, num2;

        try {

            System.out.println("Introduza 0 primeiro numero inteiro:");
            num1 = input.nextInt();

            System.out.println("Introduza o segundo numero inteiro:");
            num2 = input.nextInt();
            contar(num1, num2);
            
        }catch
        (Exception t) {

            System.out.println("Introduza apenas numeros inteiros!");

        }

    }

    public static void contar(int num1, int num2) throws ParametrosInvalidosException{

        if(num1> num2){
            throw new ParametrosInvalidosException("O Segundo numero deve ser maior que o Primeiro");


        }
        else {
            for (int i = 0; i <=num2-num1; i++) {
                System.out.println("i = " + (++i));
            }
        }
        }

}