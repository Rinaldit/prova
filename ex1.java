import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe o valor do produto: ");
        double valor = entrada.nextDouble();  
        System.out.println("informe para qual estado esse produto vai ser enviado");
        String estado = entrada.next(); 

        switch (estado) {
            case "MG":
            //VALOR = VALOR + 
                valor += (valor * ( (double) 7 / 100));
                break;
            
            case "MT":
                valor = valor + valor * ((double) 12 / 100);
                break;

            case "RJ":
                valor = valor + valor * ((double) 15 / 100);
                break;

            case "MS":
                valor = valor + valor * ((double) 8 / 100);
                break;
            
            case "PA":
                valor = valor + valor * ((double) 9 / 100);
                break;

            case "PR": 
                valor = valor + valor * ((double) 10 / 100);
                break;
            
            default:
                System.out.println("estado inexistente");
                break;
        
        }
        System.out.println("O valor do produto calculado com o imposto foi: " + valor);
    }
    
}