import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumerosPares {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha =  br.readLine();
        int numero=Integer.parseInt(linha);

        for(int i=2;i<=numero;i++){
            if((i%2==0)) {
                System.out.println(i);
            }
            }
    }
}
