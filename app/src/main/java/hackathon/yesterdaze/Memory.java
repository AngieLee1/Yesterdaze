package hackathon.yesterdaze;

import java.util.Date;

/**
 * Created by angielee on 6/9/18.
 */

public class Memory {
    String text;
    String date;
    int rating;

    public Memory() {
        this.text = "";
        this.date = "";
        this.rating = 10;
    }

    public Memory(String text, String date, int rating) {
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
