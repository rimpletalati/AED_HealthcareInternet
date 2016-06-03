/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author Rimple
 */
public class PersonDirectory {
    
    private ArrayList<Person> personList;

    public PersonDirectory() {
        this.personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

        public void addPerson(Person p) {
        personList.add(p);
    }
    
    public Person createPerson(String firstName, String lastNamme){
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastNamme);
        personList.add(person);
        return person;
    }
    
    public void deletePerson( Person pd){
        personList.remove(pd);
    }
    
}
