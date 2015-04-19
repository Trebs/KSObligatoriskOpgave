import static org.junit.Assert.*;

import org.junit.Test;


public class romanAdderTest {

  @Test
  public void test() {
    assertEquals("III", romanAdder.add("I","II"));
  }

}
