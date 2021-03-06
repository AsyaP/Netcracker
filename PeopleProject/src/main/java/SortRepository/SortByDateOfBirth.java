package SortRepository;

import Comparators.PersonComparator;
import Person.Person;

public class SortByDateOfBirth implements Sorter {

    @Override
    public void sort(Person[] p, PersonComparator c) {
        int minInd;
        Person buf;
        for (int i = 0; i < p.length - 1; i++) {
            minInd = i;
            for (int j = i + 1; j < p.length; j++) {
                if (c.compare(p[minInd], p[j]) == 1) {
                    minInd = j;
                }
            }
            buf = p[i];
            p[i] = p[minInd];
            p[minInd] = buf;
        }
    }
}
