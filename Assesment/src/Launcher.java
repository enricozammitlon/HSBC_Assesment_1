import java.util.ArrayList;

public class Launcher {

  public static void displayTextNotes(NoteStore ns) {
    ArrayList<Note> textNotes = ns.getAllTextNotes();
    int noteCounter = 1;
    for (Note currentNote : textNotes) {
      System.out.println("Text Note " + noteCounter + ": " + currentNote.getCommaSeparatedContents());
      noteCounter += 1;
    }
  }

  public static void displayTextAndImageNotes(NoteStore ns) {
    ArrayList<Note> textAndImageNotes = ns.getAllTextAndImageNotes();
    int noteCounter = 1;
    for (Note currentNote : textAndImageNotes) {
      System.out.println("Text and Image Note " + noteCounter + ": " + currentNote.getCommaSeparatedContents());
      noteCounter += 1;
    }
  }

  public static void main(String[] args) throws Exception {
    NoteStore ns = new NoteStore();
    ns.storeNote("TextNote1");
    ns.storeNote("TextNote2");
    ns.storeNote("TextAndImageNote1", "sampleURL1");
    ns.storeNote("TextAndImageNote2", "sampleURL2");
    displayTextNotes(ns);
    displayTextAndImageNotes(ns);
  }

}
