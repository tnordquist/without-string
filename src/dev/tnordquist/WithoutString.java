package dev.tnordquist;

public class WithoutString {

  public static String withoutString(String base, String remove) {

    return base.replaceAll("(?i)"+remove, "");

  }

}
