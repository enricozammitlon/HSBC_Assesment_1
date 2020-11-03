import java.util.ArrayList;

public class NoteStore {
  private ArrayList<Note> allNotes;

  public NoteStore() {
    allNotes = new ArrayList<Note>();
  }

  public void storeNote(String text) {
    allNotes.add(new TextNote(text));

  }

  public void storeNote(String text, String imageURL) {
    allNotes.add(new TextAndImageNote(text, imageURL));
  }

  public ArrayList<Note> getAllTextNotes() {
    return filterByType("text");
  }

  public ArrayList<Note> getAllTextAndImageNotes() {
    return filterByType("textandimage");
  }

  public ArrayList<Note> filterByType(String type) {
    ArrayList<Note> filteredNotes = new ArrayList<Note>();
    for (Note currentNote : allNotes) {
      if (currentNote.getType().equals(type)) {
        filteredNotes.add(currentNote);
      }
    }
    return filteredNotes;
  }

}
