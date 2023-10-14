package HomeWork001;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
        DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        String strDate = formatter.format(date);
        return strDate +
                " -> " +
                note;
    }
}
