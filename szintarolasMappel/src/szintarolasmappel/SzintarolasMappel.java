
package szintarolasmappel;

import java.io.RandomAccessFile;
import java.util.Map;
import java.util.TreeMap;

public class SzintarolasMappel {

     
     public static void main(String[] args) {
          Map <String, String> szinek = feltolt("kodok.txt");
          
          System.out.println(szinek.size());
          
          System.out.println(szinek);
     }

     private static Map<String, String> feltolt(String fileName) {
          Map<String, String> result= new TreeMap<>();
          try {
               RandomAccessFile bemenet = new RandomAccessFile(fileName, "r");
               
               while(bemenet.getFilePointer()<bemenet.length()){
                    String sor = bemenet.readLine();
                    String [] adatok = sor.split("\t");
       
                    if(!result.containsKey(adatok[1])){
                         result.put(adatok[1], adatok[0]);
                    }
                    
                    
                    
               }
               bemenet.close();
          } catch (Exception e) {
               System.out.println("Hiba: "+ e.getMessage());
          }
          return result;
          
     }
     
}
