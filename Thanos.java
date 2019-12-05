import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList(10);

        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42
        Hero widow = new Hero("Balck Widow", 34);
        Hero captain = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero iron = new Hero("Iron Man", 48);
        Hero witch = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero hulk = new Hero("Hulk", 49);
        Hero dr = new Hero("Doctor Strange", 42);

        heroes.add(widow);
        heroes.add(captain);
        heroes.add(vision);
        heroes.add(iron);
        heroes.add(witch);
        heroes.add(thor);
        heroes.add(hulk);
        heroes.add(dr);

        // TODO 3 : It's Thor birthday, now he's 1501
        heroes.get(5).setAge(1501);
        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);
        // TODO 5 : Keep only the half of the list
        List<Hero> snap = heroes.subList(4,8);
        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for(Hero after: snap){
            System.out.println(after.getName());
        }
    }
}
