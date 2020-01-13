package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by leon on 1/13/2020.
 */
public class People implements Iterable<Person> {
    private List<Person> personList;

    public People() {
        this(new ArrayList<>());
    }

    public People(List<Person> personList) {
        this.personList = personList;
    }

    public void add(Person person) {
        this.personList.add(person);
    }

    public Person findById(Long id) {
        for(Person person : this.personList) {
            if(person.getId().equals(id)) {
                return person;
            }
        }
        return null;

//        return personList
//                .stream()
//                .filter(person -> person.getId().equals(id))
//                .findFirst()
//                .get();
    }

    public Boolean contains(Person person) {
        return this.personList.contains(person);
    }

    public void remove(Person person) {
        this.personList.remove(person);
    }

    public void remove(Long id) {
        Person personWithId = this.findById(id);
        this.remove(personWithId);
    }

    public void removeAll() {
        this.personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public Person[] toArray() {
        return personList.toArray(new Person[0]);
    }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
