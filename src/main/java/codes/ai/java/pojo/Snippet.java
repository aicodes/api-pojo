package codes.ai.java.pojo;

import java.util.List;

/**
 * @author xuy.
 *         Copyright (c) Ai.codes
 */
/** Represents a Java snippet that can be inserted back to code editor */
public class Snippet {
  public List<String> imports;        // imports (type dependencies) of the snippet.
  public List<Parameter> parameters;  // parameters (usually generics) used in the snippet
  public List<Variable> variables;    // external variables (replaced in context) used in the snippet
  
  public String code;                 // code as text
  
  @Override
  public String toString() {
    return code;
  }
}


