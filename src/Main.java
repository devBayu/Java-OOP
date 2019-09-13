import com.latihan.oop.Mobil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input coordinate x,y :");
        String coordinate = reader.readLine();
        String[] posts = coordinate.split(",") ;
        Mobil toyota = new Mobil(Integer.parseInt(posts[0]),Integer.parseInt(posts[1]));

        System.out.println("Isi Bensin");
        String bahanBakar = reader.readLine();
        toyota.setFuel(Integer.parseInt(bahanBakar));

        System.out.println("Masukkan Perintah :");
        String mskCommand = reader.readLine();
        toyota.setCommands(mskCommand);
        toyota.run();

        System.out.println(toyota.print());
    }
}
