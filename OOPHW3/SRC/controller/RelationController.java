package SRC.controller;

import java.util.List;

import SRC.data.Human;
import SRC.data.Relation;
import SRC.data.Relative;
import SRC.service.FindRelativeService;

public class RelationController {

    private FindRelativeService findRelativeService;

    public RelationController() {
        this.findRelativeService = new FindRelativeService();
    }

    public List<String> findRelations(Human person, List<Relative> relatives) {
        return findRelativeService.findRelatives(person,relatives);
    }

    public Human findPersonByRelations(Human person, Relation relative, List<Relative> relatives) {
        return findRelativeService.findPersonByRelation(person,relative,relatives);
    }
}
