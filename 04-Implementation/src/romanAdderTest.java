import static org.junit.Assert.*;

import org.junit.Test;


public class romanAdderTest {

  @Test
  public void test() {
    // assertEquals("III", romanAdder.add("I","II"));
    
    // assertEquals("V", romanAdder.add("IIII","I"));
    
    // assertEquals("X", romanAdder.add("V","V"));
    
    // assertEquals("L", romanAdder.add("XXXX","X"));
    
    //assertEquals("C", romanAdder.add("L","L"));
    
    //assertEquals("D", romanAdder.add("CCCC","C"));
    
    //assertEquals("M", romanAdder.add("D","D"));
    
    //assertEquals("XV", romanAdder.add( "VII", "VIII" ));
    
    assertEquals("MMMMXXXI", romanAdder.add( "MDCCCXXXXVII", "MMLCXXXIIII" ));
  }

}
