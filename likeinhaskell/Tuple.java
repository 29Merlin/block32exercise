package likeinhaskell;

/**
 * Created by Niklas on 2016-02-07.
 */
// TODO task 1: Implement this class. It should act like a tuple in e.g.
//  Haskell or Python. An object of this type should hold two values of
//  (possibly) different (arbitrary) types, and have the methods fst()
//  and snd() to return the respective components.
//  NOTE: The class should be read-only after initial construction.
public class Tuple<a,b>{
    public a first;
    public b second;
     public a fst(){
         return first;
     }
     public b snd(){
         return second;
     }

}
