import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args){
//        ArrayList<String> food = new ArrayList<String>();
//        food.add("pizza");
//        food.add("burger");
//        food.add("sub");
//
//        food.set(0,"sushi");
//        food.remove(2);
//
//        for(int i=0;i<food.size(); i++){
//            System.out.println(food.get(i));
//        }

        //2D arraylist ==> dynamic list of lists

        ArrayList<ArrayList<String>> animals = new ArrayList<>();
        //generating arraylist of arraylists... thats why arraylist written inside of another arraylist
        ArrayList<String> dogs = new ArrayList<>();
        dogs.add("Poodle");
        dogs.add("Labrador");
        dogs.add("German Shepherd");
        dogs.add("Great dane");
        ArrayList<String> cats = new ArrayList<>();
        cats.add("Bengal");
        cats.add("Persian");
        cats.add("Egyptian");
        ArrayList<String> snakes = new ArrayList<>();
        snakes.add("Python");
        snakes.add("Cobra");
        snakes.add("Anaconda");
        animals.add(dogs);
        animals.add(snakes);
        animals.add(cats);
        System.out.println(animals);
        System.out.println(animals.get(1).get(0));//should print python

        //Foreach loop syntax
        for(String i : dogs){
            System.out.println(i);
        }
        //or
        snakes.forEach(System.out::println);
        //or
        cats.forEach(cat ->System.out.println(cat));
    }
}
