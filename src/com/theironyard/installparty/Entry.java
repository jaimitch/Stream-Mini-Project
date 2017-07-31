package com.theironyard.installparty;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Entry {
    private Day day;
    private String note;
    private int duration;

    public Entry(Day day, String note, int duration) {
        this.day = day;
        this.note = note;
        this.duration = duration;
    }

    public Day getDay() {
        return day;
    }

    public String getNote() {
        return note;
    }

    public int getDuration() {return duration;}

    @Override
    public String toString() {
        return "Entry{" +
          "day=" + day +
          ", note='" + note + '\'' +
          '}';
    }

    public static List<Entry> populate(){
        List<Entry> entries = new ArrayList<>();
        Random random = new Random();

        Entry entry = new Entry(Day.MONDAY,"Today I went to play sports", 50);
        entries.add(entry);

        entry = new Entry(Day.TUESDAY,"Lunch was a salad today... was still hungry", 25);
        entries.add(entry);

        entry = new Entry(Day.WEDNESDAY,"Hump day! Looking forward to the weekend.", 75);
        entries.add(entry);

        entry = new Entry(Day.WEDNESDAY,"Why isn't the day over yet?!", 28);
        entries.add(entry);

        entry = new Entry(Day.THURSDAY,"Poker night", 39);
        entries.add(entry);

        entry = new Entry(Day.FRIDAY,"Finally Friday!", 45);
        entries.add(entry);

        entry = new Entry(Day.SATURDAY,"Saturdaze", 83);
        entries.add(entry);

        entry = new Entry(Day.SUNDAY,"Sunday Bumday", 97);
        entries.add(entry);

        entry = new Entry(Day.MONDAY,"I dont like writing in this journal", 64);
        entries.add(entry);

        entry = new Entry(Day.SATURDAY,"Why am I writing on a Saturday?", 17);
        entries.add(entry);

        entry = new Entry(Day.TUESDAY,"toooos day", 8);
        entries.add(entry);

        return entries;

    }
}
