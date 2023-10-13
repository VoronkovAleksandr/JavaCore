package HomeWork001;

import java.io.*;

public class WriteNote {
    String fileName;

    public WriteNote(String fileName) {
        this.fileName = fileName;
    }

    public boolean addNote(String note){
        try (PrintWriter writer = new PrintWriter(new File(this.fileName))){
            writer.append(note);
        } catch (IOException e) {
            return false;
        }
        return true;
    }
}
