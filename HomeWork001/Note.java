package HomeWork001;

import java.util.Date;

public class Note {
    String note;
    Date date;

    public Note(String note){
        this.note = note;
        this.date = new Date();
    }

    public String getNote() {
        return note;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return date.toString() +
                " -> " +
                note;
    }
}
