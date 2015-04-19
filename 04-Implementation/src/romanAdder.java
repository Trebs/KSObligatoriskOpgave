
public class romanAdder {

  public static String add(String venstre, String hojre) {
    return normaliser(venstre + hojre);
  }
  
  
  private static String normaliser(String resultat) {
    return resultat
        .replace("IIIII","V")
        
        .replace( "VV", "X" )
        ;
  }
  
}
