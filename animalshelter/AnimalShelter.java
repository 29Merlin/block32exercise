package animalshelter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niklas on 2016-02-07.
 */
public class AnimalShelter<a>{
    // TODO task 2b: This is the class you primarily need to update, using
    //  parametric polymorphism, to ensure that shelters can be specialised
    //  to specific animals, with complete static type guarantees.
    //  .
    //  Hint: the subclasses CatShelter and DogShelter should become obsolete.
    private List<a> animalsInShelter = new ArrayList<>(20);

    a adoptAnimal(){
        return animalsInShelter.remove(0);
    }

    void putAnimal(a animal){
        animalsInShelter.add(animal);
    }

}
