package com.example.affichage;

import androidx.appcompat.app.AppCompatActivity;
import dao.IPersonDAO;
import dao.PersonAdapter;
import dao.PersonDAOData;

import android.os.Bundle;
import android.widget.ListView;

public class ListPersonActivity extends AppCompatActivity {

    ListView mListView;
    PersonAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_list);

        IPersonDAO personDAOData = new PersonDAOData();


        mListView = (ListView) findViewById(R.id.personsList);
        adapter = new PersonAdapter(ListPersonActivity.this, personDAOData.getPersons());
        mListView.setAdapter(adapter);
    }
}
