package SRC.service;


import java.util.ArrayList;
import java.util.List;

import SRC.data.Human;
import SRC.data.Relation;
import SRC.data.Relative;

public class FindRelativeService {

    public FindRelativeService(){

    }

    public List<String> findRelatives(Human person, List<Relative> relatives) {
        List<String> relations = new ArrayList<>();
        for (Relative item : relatives) {
            if(person.equals(item.getPerson1())) {
                relations.add("(" + item.getPerson2().getSurname() + " " + item.getPerson2().getName() +
                                item.getStringRelation(item.getRelative()) + ")");
            }

        }
        return relations;
    }

    public Human findPersonByRelation(Human person, Relation relative, List<Relative> relatives) {
        Human find = new Human();
        for (Relative item: relatives) {
            if(person.equals(item.getPerson2()) && relative.equals(item.getRelative())) {
                find = item.getPerson1();
            }

        }
    return  find;
    }

}