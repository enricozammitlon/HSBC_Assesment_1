public class TextNote extends Note {
  public TextNote() {
    super();
  }

  public TextNote(String text) {
    this();
    this.text = text;
  }

  public String getCommaSeparatedContents() {
    return text;
  }

}
