public class TextAndImageNote extends Note {
  private String imageURL;

  public TextAndImageNote() {
    super("textandimage");
  }

  public TextAndImageNote(String text, String imageURL) {
    this();
    this.text = text;
    this.imageURL = imageURL;
  }

  public String getimageURL() {
    return this.imageURL;
  }

  public void setimageURL(String imageURL) {
    this.imageURL = imageURL;
  }

  public String getCommaSeparatedContents() {
    return text + ", " + imageURL;
  }

}
