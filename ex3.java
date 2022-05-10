import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe um numero: ");
        int valor1 = entrada.nextInt();
        System.out.println("informe um outro numero: ");
        int valor2 = entrada.nextInt();
        System.out.println("informe um outro numero: ");
        int valor3 = entrada.nextInt();

        if(valor1 > valor2 && valor1 > valor3){
            System.out.println("o maior valor é: " + valor1);
        }else if(valor2 > valor1 && valor2 > valor3){
            System.out.println("o maior valor é: " + valor2); 
        }else if(valor3 > valor2 && valor3 > valor1){
            System.out.println("o maior valor é: " + valor3);
        }else if(valor1 == valor2 && valor1 == valor3){
            System.out.println("valores iguais");
        }
        
        

    }
    
}
