import static org.junit.Assert.*;

import org.junit.Test;


public class romanAdderTest {

  @Test
  public void test() {
    // assertEquals("III", romanAdder.add("I","II"));
    
    // assertEquals("V", romanAdder.add("IIII","I"));
    
    assertEquals("X", romanAdder.add("V","V"));
  }

}
