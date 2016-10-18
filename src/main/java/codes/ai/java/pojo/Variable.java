package codes.ai.java.pojo;

import java.util.List;

/**
 * @author xuy.
 *         Copyright (c) Ai.codes
 */
/** Represents a Java variable declaration. */
public class Variable {
  public String name;
  public String type;
  public List<String> parameters;   // generics
  public List<String> dimensions;   // array
}
