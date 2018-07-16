package sg.edu.rp.c346.simplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Step 1b: Create ListView Variable
    ListView lvMovie;

    // Step 2a: Create an ArrayList variable
    ArrayList<String> alMovieList;

    // Step 3a: Create an ArrayAdapter variable
    ArrayAdapter<String> aaMovieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Step 1c: Bind the ListView UI element to the java variable
        lvMovie = findViewById(R.id.listViewMovie);

        // Step 2b: Initialize the ArrayList
        alMovieList = new ArrayList<>();

        // Step 2c: Add data into ArrayList
        alMovieList.add("Avengers Infinity War Release Date: 2018.04");
        alMovieList.add("Justice League Release Date: 2017.11");

        // Step 3b: Initialize the ArrayAdapter and bind it to the ArrayList:
        // simple_list_item_1 -> For each row item
        aaMovieList = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alMovieList);

        // Step 4: Bind ListView to ArrayAdapter
        lvMovie.setAdapter(aaMovieList);
    }
}
