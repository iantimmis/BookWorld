package edu.ltu.itimmis.bookworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private BookExpert expert = new BookExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBook(View view)
    {
        TextView books = (TextView)findViewById(R.id.books);

        Spinner genres = (Spinner)findViewById(R.id.genre);

        String genre = String.valueOf(genres.getSelectedItem());

        List<String> bookList = expert.getBooks(genre);

        StringBuilder brandsFormatted = new StringBuilder();

        for (String book : bookList)
        {
            brandsFormatted.append(book).append('\n');
        }

        books.setText(brandsFormatted);
    }
}
