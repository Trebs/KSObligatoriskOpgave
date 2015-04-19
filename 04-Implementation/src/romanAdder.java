import java.util.Arrays;

import com.sun.xml.internal.ws.util.StringUtils;


public class romanAdder {

  public static String add(String venstre, String hojre) {
    return testStorrelse(normaliser(sortering(normaliser(sortering(venstre + hojre)))));
  }
  
  
  private static String normaliser(String resultat) {
    return resultat
        .replace("IIIII","V")
        .replace( "VV", "X" )
        .replace( "XXXXX", "L" )
        .replace( "LL", "C" )
        .replace( "CCCCC", "D" )
        .replace( "DD", "M")
        ;
  }
  
  private static String f�rSort (String f�rSort) {
   return f�rSort
       .replace( "M", "a" )
       .replace( "D", "b" )
       .replace( "C", "c" )
       .replace( "L", "d" )
       .replace( "V", "e" )
       .replace( "X", "f" )
       .replace( "I", "g" )
       ;
  }
  
  private static String efterSort (String efterSort) {
    return efterSort
        .replace( "a", "M" )
        .replace( "b", "D" )
        .replace( "c", "C" )
        .replace( "d", "L" )
        .replace( "e", "V" )
        .replace( "f", "X" )
        .replace( "g", "I" )
        ;
   }
  
  private static String sortering(String sort) {
    char[] chars = f�rSort(sort).toCharArray();
    Arrays.sort(chars);
    String sorted = new String(chars);
    return efterSort(sorted);
  }
  
  private static String testStorrelse (String test) {
    int count = test.length() - test.replace("M", "").length();  
  
    if ( count >= 5 ) {
        return "ERROR! Tal for stort!";
      } else {
        return test;
      }
  }
}
