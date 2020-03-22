package dao;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;


public class PersonDAOData implements IPersonDAO {

    private static List<Person> persons= new ArrayList<Person>() {{
        add(new Person("Sarra", "Ait Yahia", Color.BLACK));
        add(new Person("Sara", "Mekedem", Color.BLUE));
    }};

    @Override
    public List<Person> getPersons() {
        return persons;
    }

    @Override
    public void addPerson(Person person) {
        persons.add(person);
    }

    @Override
    public void removePerson(Person person) {
        persons.remove(person);
    }
}
