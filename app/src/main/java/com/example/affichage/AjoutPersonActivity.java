package com.example.affichage;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import dao.IPersonDAO;
import dao.Person;
import dao.PersonAdapter;
import dao.PersonDAOData;

public class AjoutPersonActivity extends AppCompatActivity {

    Button btn_ajouter;
    EditText prenom;
    EditText nom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_ajout);
        prenom= (EditText) findViewById(R.id.prenom);
        nom=(EditText) findViewById(R.id.nom);
        final IPersonDAO personDAOData = new PersonDAOData();

        btn_ajouter  =  (Button) findViewById(R.id.ajouterperson);
        btn_ajouter.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(), "Ajout en cours", Toast.LENGTH_LONG).show();
                        Person p= new Person(prenom.getText().toString(), nom.getText().toString(), Color.BLACK);
                        personDAOData.addPerson(p);
                        Toast.makeText(getApplicationContext(), "La personne a été ajoutée", Toast.LENGTH_LONG).show();
                        prenom.getText().clear();
                        nom.getText().clear();
                    }
                }
        );

    }
}