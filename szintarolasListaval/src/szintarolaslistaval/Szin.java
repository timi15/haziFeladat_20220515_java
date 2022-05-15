
package szintarolaslistaval;

import java.util.Objects;


public class Szin {
     private String szinKod;
     private String szinNev;

     public Szin(String szinKod, String szinNev) {
          this.szinKod = szinKod;
          this.szinNev = szinNev;
     }

     public String getSzinKod() {
          return szinKod;
     }

     public void setSzinKod(String szinKod) {
          this.szinKod = szinKod;
     }

     public String getSzinNev() {
          return szinNev;
     }

     public void setSzinNev(String szinNev) {
          this.szinNev = szinNev;
     }

     @Override
     public int hashCode() {
          int hash = 7;
          hash = 83 * hash + Objects.hashCode(this.szinNev);
          return hash;
     }

     @Override
     public boolean equals(Object obj) {
          if (this == obj) {
               return true;
          }
          if (obj == null) {
               return false;
          }
          if (getClass() != obj.getClass()) {
               return false;
          }
          final Szin other = (Szin) obj;
          return Objects.equals(this.szinNev, other.szinNev);
     }

     @Override
     public String toString() {
          return "Szin{" + "szinKod=" + szinKod + ", szinNev=" + szinNev + '}';
     }
     
     
     
}
