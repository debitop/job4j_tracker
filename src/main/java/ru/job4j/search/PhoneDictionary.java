package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> predicatePhone = (Person p) -> p.getPhone().contains(key);
        Predicate<Person> predicateName = (Person p) -> p.getName().contains(key);
        Predicate<Person> predicateAddress = (Person p) -> p.getAddress().contains(key);
        Predicate<Person> predicateSurname = (Person p) -> p.getSurname().contains(key);
        Predicate<Person> combine = predicatePhone.or(predicateAddress).or(predicateName).or(predicateSurname);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
