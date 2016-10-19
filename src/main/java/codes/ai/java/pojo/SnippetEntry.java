package codes.ai.java.pojo;

/**
 * @author xuy.
 *         Copyright (c) Ai.codes
 */
/** POJO that represents snippet object in persistence layer.
 * In addition to the Snippet filed, this entry also contains metadata to uniquely identify
 * snippets, the programming language, and the associated intention.
 */
public class SnippetEntry {
  public String uuid;
  public String intent;
  public String lang;   /* Programming language */
  public Snippet snippet;
}
