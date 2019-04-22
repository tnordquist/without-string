package dev.tnordquist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class WithoutStringTest {

  private static Object[][] withoutString() {
    return new Object[][]{

        {"Hello there", "llo", "He there"},
        {"Hello there", "e","Hllo thr"}
    };
  }

  @ParameterizedTest()
  @MethodSource(value = "withoutString")
  void withoutString(String base,String remove, String expected) {

    String actual = WithoutString.withoutString(base,remove);
    assertEquals(expected, actual);

  }
}