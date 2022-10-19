package SRC;

import SRC.controller.RelationController;
import SRC.data.Human;
import SRC.data.Relation;
import SRC.data.Relative;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human> persons = new ArrayList<>();

        Human person1 = new Human("Долматов", "Павел", "Мужской", "26");
        Human person2 = new Human("Долматов", "Николай", "Мужской", "18");
        Human person3 = new Human("Долматов", "Сергей", "Мужской", "50");
        Human person4 = new Human("Долматова", "Антонина", "Женский", "48");
        Human person5 = new Human("Долматова", "Ангелина", "Женский", "29");

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        //System.out.println(persons);

        List<Relative> relatives = new ArrayList<>();

        relatives.add(new Relative(person1, person2, Relation.BROTHER));
        relatives.add(new Relative(person1, person3, Relation.FATHER));
        relatives.add(new Relative(person1, person4, Relation.MOTHER));
        relatives.add(new Relative(person1, person5, Relation.WIFE));
        relatives.add(new Relative(person2, person1, Relation.BROTHER));
        relatives.add(new Relative(person2, person3, Relation.FATHER));
        relatives.add(new Relative(person2, person4, Relation.MOTHER));
        relatives.add(new Relative(person3, person1, Relation.SON));
        relatives.add(new Relative(person3, person2, Relation.SON));
        relatives.add(new Relative(person3, person4, Relation.WIFE));
        relatives.add(new Relative(person4, person1, Relation.SON));
        relatives.add(new Relative(person4, person2, Relation.SON));
        relatives.add(new Relative(person4, person3, Relation.HUSBAND));
        relatives.add(new Relative(person5, person1, Relation.HUSBAND));


        //System.out.println(relatives);

        RelationController controller = new RelationController();

        System.out.println(person1.getSurname() + " " + person1.getName() + " является для: " +
                           controller.findRelations( person1, relatives));
        System.out.println(person3.getSurname() + " " + person3.getName() + " является для: " +
                controller.findRelations( person3, relatives));
        System.out.println(person1.getSurname() + " " + person1.getName() + " муж для " +
                           controller.findPersonByRelations(person1,Relation.HUSBAND,relatives));
        System.out.println(person2.getSurname() + " " + person2.getName() + " сын для " +
                           controller.findPersonByRelations(person2, Relation.SON, relatives));
    }
}