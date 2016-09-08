package edu.ltu.itimmis.bookworld;

/**
 * Created by itimmis on 9/8/2016.
 */

import java.util.List;
import java.util.ArrayList;

public class BookExpert
{
    List<String> getBooks(String genre)
    {
        List<String> books = new ArrayList<String>();

        if (genre.equals("fiction"))
        {
            books.add("Harry Potter");
            books.add("Lord Of The Rings");
        }
        else if (genre.equals("non-fiction"))
        {
            books.add("Future Of The Mind");
            books.add("Superintelligence");
            books.add("Abundance");
        }
        else if (genre.equals("horror"))
        {
            books.add("Frankenstein");
            books.add("Dracula");
        }
        else
        {
            books.add("Romeo And Juliet");
        }

        return books;
    }
}
