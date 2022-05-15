
package szintarolaslistaval;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;


public class SzintarolasListaval {


     public static void main(String[] args) {
          
          List<String> szinek = feltolt("kodok.txt");
          System.out.println("Szinek száma: "+ szinek.size());
                  
     }

     private static List<String> feltolt(String fileName) {
          List<String> result = new ArrayList<>();
          try {
               RandomAccessFile bemenet = new RandomAccessFile(fileName, "r");
               
               while(bemenet.getFilePointer()<bemenet.length()){
                    String sor= bemenet.readLine();
                    String[] adatok = sor.split("\t");
                    String szinnev= adatok[1];
                    
                    if(!result.contains(szinnev)){
                         result.add(szinnev);
                    }
                    Szin ujSzin = new Szin(adatok[0], adatok[1]);
                    
               }
               
               bemenet.close();
          } catch (IOException e) {
               System.out.println("Hiba: " + e.getMessage());
          }
          
          return result;
          
     }
     
}
