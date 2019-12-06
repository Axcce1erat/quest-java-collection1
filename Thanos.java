import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42
        heroes.add(new Hero("Balck Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Vision", 3));
        heroes.add(new Hero("Iron Man", 48));
        heroes.add(new Hero("Scarlet Witch", 29));
        heroes.add(new Hero("Thor", 1500));
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Doctor Strange", 42));

        /*
        heroes.add(widow);
        heroes.add(captain);
        heroes.add(vision);
        heroes.add(iron);
        heroes.add(witch);
        heroes.add(thor);
        heroes.add(hulk);
        heroes.add(dr);
        */

        // TODO 3 : It's Thor birthday, now he's 1501
        heroes.get(5).setAge(1501);
        //System.out.println(heroes);
        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);
        // TODO 5 : Keep only the half of the list
        heroes.subList(0, heroes.size()/2).clear();
        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for(Hero after: heroes){
            System.out.println(after.getName());
        }
    }
}
