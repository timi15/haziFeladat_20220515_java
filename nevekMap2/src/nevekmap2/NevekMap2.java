package nevekmap2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class NevekMap2 {

     public static void main(String[] args) {

          HashMap<String, List<String>> nevnapok = new HashMap();
          final String fileURL = "nevek.txt";
          final String readMode = "r";

          try {
               RandomAccessFile raf = new RandomAccessFile(fileURL, readMode);

               for (String sor = raf.readLine(); sor != null; sor = raf.readLine()) {

                    String[] reszek = sor.split(" ");
                    String nev = reszek[0];

                    for (int i = 1; i < reszek.length; i++) {
                         if (nevnapok.containsKey(reszek[i])) {
                              nevnapok.get(reszek[i]).add(nev);
                         } else {
                              List<String> tmp = new ArrayList();
                              tmp.add(nev);
                              nevnapok.put(reszek[i], tmp);
                         }
                    }
               }
               System.out.println(nevnapok);

          } catch (IOException e) {
               e.printStackTrace();
          }

          Scanner scNev = new Scanner(System.in);
          System.out.print("Irj be egy nevet: ");
          String nev = scNev.nextLine();

          for (String key : nevnapok.keySet()) {
               List<String> tmp = nevnapok.get(key);
               if (tmp.contains(nev)) {
                    System.out.print(key + " ");
               }
          }
          System.out.println();

          Scanner scDatum = new Scanner(System.in);
          System.out.print("Irj be egy datumot: ");
          String datum = scDatum.nextLine();
          if (nevnapok.containsKey(datum)) {
               System.out.println(nevnapok.get(datum));
          }
     }
}
