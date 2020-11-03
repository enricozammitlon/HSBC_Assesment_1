public abstract class Note {
  protected String type;
  protected String text;

  public Note() {
    type = "text";
  }

  public Note(String type) {
    this.type = type;
  }

  public String getType() {
    return this.type;
  }

  public String getText() {
    return this.text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public abstract String getCommaSeparatedContents();
}
