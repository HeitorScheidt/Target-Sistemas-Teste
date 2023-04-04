import java.io.*;

public class questaoDois {

    
    private static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

    static boolean fibonacci(int value){

        int a = 0, b = 1, c = 1;
        while(c < value){
            c = a + b;
            a = b;
            b = c;
        }

        return c == value;
        
    }

    public static void main(String[] args) {

        int value =0;
        try {
            System.out.printf("Informe um valor inteiro: ");
            value = Integer.parseInt(teclado.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        boolean pertence = fibonacci(value);  
        if(pertence){
            System.out.println("o Valor Digitado Pertence a Sequencia Fibonacci");
        }else{
            System.out.println("o Valor Digitado Não Pertence a Sequencia Fibonacci");
        }
        
    }
}
