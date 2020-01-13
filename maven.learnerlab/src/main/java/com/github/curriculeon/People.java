package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by leon on 1/13/2020.
 */
abstract public class People
        <SomePersonType extends Person>
        implements Iterable<SomePersonType> {

    protected List<SomePersonType> personList;

    public People() {
        this.personList = new ArrayList<>();
    }

    public People(List<SomePersonType> personList) {
        this.personList = personList;
    }

    public void add(SomePersonType person) {
        this.personList.add(person);
    }

    public SomePersonType findById(Long id) {
        for(SomePersonType person : this.personList) {
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

    public Boolean contains(SomePersonType person) {
        return this.personList.contains(person);
    }

    public void remove(SomePersonType person) {
        this.personList.remove(person);
    }

    public void remove(Long id) {
        SomePersonType personWithId = this.findById(id);
        this.remove(personWithId);
    }

    public void removeAll() {
        this.personList.clear();
    }

    public int count() {
        return personList.size();
    }

    abstract public SomePersonType[] toArray();

    @Override
    public Iterator<SomePersonType> iterator() {
        return personList.iterator();
    }
}
