package HomeWork001;

public class Main {
    public static void main(String[]args){
        Note note = new Note("Hello world 2");
        WriteNote writeNote = new WriteNote("MyNote.txt");
        if (writeNote.addNote(note.getNote())){
            System.out.println(note);
        } else {
            System.out.println("Ошибка при записи файла");
        }
    }
}
