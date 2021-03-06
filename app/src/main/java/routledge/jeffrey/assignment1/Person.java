package routledge.jeffrey.assignment1;

import android.view.View;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by jeffreyroutledge on 2017-01-23.
 * This class stores the data of the records for a person that the user creates.
 */

public class Person {
    public String name;
    public float neck;
    public float bust;
    public float chest;
    public float waist;
    public float hip;
    public float inseam;
    public String comment;

    /**
     * Instantiates a new Person.
     *
     * @param name
     */
    public Person(String name) {
        this.name = name;
        neck =  0f;
        bust = 0f;
        chest = 0f;
        waist= 0f;
        inseam = 0f;
        comment = "";
    }

    /**
     * Makes the person into a readable string.
     *
     * @return
     */
    public String toString() {
        //when we want to add more things to textview do it here
        String s = "";
        s += name + " " ;
        if ( neck != 0 ) {
            s += neck + " " ;
        }
        if ( bust != 0 ) {
            s += bust + " " ;
        }
        if ( chest != 0 ) {
            s += chest + " " ;
        }
        if ( waist != 0 ) {
            s += waist + " " ;
        }
        if ( hip != 0 ) {
            s += hip + " " ;
        }
        if ( inseam != 0 ) {
            s += inseam + " " ;
        }
        if ( !comment.equals("")) {
            s += comment + " ";
        }
        s += "Last edited on: ";
        // accessed on Feb 5, 2017
        // code from:
        // http://stackoverflow.com/questions/8654990/how-can-i-get-current-date-in-android
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        s += date;

        return s;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public float getNeck() { return neck; }

    public void setNeck(float neck) {
        this.neck = neck;
    }

    public float getBust() { return bust; }

    public void setBust(float bust) {
        this.bust = bust;
    }

    public float getChest() {
        return chest;
    }

    public void setChest(float chest) {
        this.chest = chest;
    }

    public float getWaist() {
        return waist;
    }

    public void setWaist(float waist) {
        this.waist = waist;
    }

    public float getHip() { return hip; }

    public void setHip(float hip) { this.hip = hip; }

    public float getInseam() {
        return inseam;
    }

    public void setInseam(float inseam) {
        this.inseam = inseam;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
