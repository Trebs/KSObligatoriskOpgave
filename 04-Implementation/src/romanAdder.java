import java.util.Arrays;


public class romanAdder {

  public static String add(String venstre, String hojre) {
    return normaliser(sortering(venstre + hojre));
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
  
  private static String førSort (String førSort) {
   return førSort
       .replace( "M", "a" )
       .replace( "D", "b" )
       .replace( "C", "c" )
       .replace( "L", "d" )
       .replace( "V", "e" )
       .replace( "X", "f" )
       .replace( "I", "g" )
       ;
  }
  
  private static String efterSort (String førSort) {
    return førSort
        .replace( "a", "M" )
        .replace( "b", "D" )
        .replace( "c", "C" )
        .replace( "d", "L" )
        .replace( "e", "E" )
        .replace( "f", "X" )
        .replace( "g", "I" )
        ;
   }
  
  private static String sortering(String sort) {
    førSort(sort);
    char[] chars = sort.toCharArray();
    Arrays.sort(chars);
    String sorted = new String(chars);
    return(efterSort(sorted));
  }
}
