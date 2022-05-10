import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe seu peso: ");
        double peso = entrada.nextDouble();
        System.out.println("informe sua altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura*altura);

        System.out.println("seu indice de massa corporal é:" + imc);

        if(imc <= 20.7){
            System.out.println("abaixo do peso");
        }else if(imc > 20.7 && imc <= 26.4){
            System.out.println("no peso ideal");
        }else if(imc >= 26.5 && imc <= 27.8){
            System.out.println("um pouco acima do peso");
        }else if(imc >= 27.9 && imc < 31.1 ){
            System.out.println("acima do peso ideal");
        }else if(imc > 31.1){
            System.out.println("obeso");
        }


        }
    
    }
    

