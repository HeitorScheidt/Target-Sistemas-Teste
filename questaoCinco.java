import java.io.*;

public class questaoCinco {
    
    static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        try {
            System.out.printf("Digite uma Palavra: ");
            String input = teclado.readLine();
            String output = "";

            for(int i = input.length() - 1; i>=0; i--){
                output += input.charAt(i);
            }

            System.out.println(output);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
