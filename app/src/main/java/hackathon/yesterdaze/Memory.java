package hackathon.yesterdaze;

import java.util.Date;

/**
 * Created by angielee on 6/9/18.
 */

public class Memory {
    String text;
    Date date;
    int rating;

    public Memory() {
        this.text = "";
        this.date = new Date();
        this.rating = 10;
    }

    public Memory(String text, Date date, int rating) {
        this.text = text;
        this.date = date;
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
