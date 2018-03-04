import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Podanie znaku 'k' zakończy wczytywanie");
        char znak;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        do{
            znak = (char) reader.read();
            System.out.println(znak);
        }while(znak!='k');
    }
}
