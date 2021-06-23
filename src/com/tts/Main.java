package com.tts;
import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    System.out.println("\n =====Pet: Dog ==========");
    Pet dog = new Pet("dog");  //constructor
    dog.setName("Janna");  //attributes
    dog.setAge(11);  //attributes
    dog.setLocation("New Orleans, LA");  //attributes
    dog.setType("Pitbull and Terrier Mix"); //attributes

        System.out.println("This pet name is: " + dog.getName());
        System.out.println(dog.getName() + " is a " + dog.getAge() + " years old "
                + dog.getType() + " that lives in " + dog.getLocation() + ".");
        System.out.println("Come meet and greet " + dog.getName() + " down at the SPCA shelter!");
    dog.play();
    dog.eat();
    dog.sleep();

    System.out.println("\n =====Pet: Dog2 ==========");
    Pet dog2 = new Pet("pug", "Boston");
    dog2.setAge(1);
    dog2.setName("Gus Gus");
        System.out.println("This pet name is: " + dog2.getName());
        System.out.println(dog2.getName() + " is a " + dog2.getAge() + " year old "
                + dog2.getType() + " that lives in " + dog2.getLocation() + ".");
        System.out.println("Come meet and greet " + dog2.getName() + " down at the SPCA shelter!");
    dog2.play();
    dog2.eat();
    dog2.sleep();

        System.out.println("\n ================Pet: Cat==========");
    Pet cat = new Pet("Beignet", 3); //constructor
    cat.setType("cat");   //attributes
    cat.setLocation("Metairie, LA");  //attributes
        System.out.println("This pet name is: " + cat.getName());
        System.out.println(cat.getName() + " is a " + cat.getAge()
                + " years old " + cat.getType()
                + " living in " + cat.getLocation());

    cat.play();
    cat.eat();
    cat.sleep();

    System.out.println("\n =========Pet: Empty ===========");
        Pet bird = new Pet();
        System.out.println(bird);


    System.out.println("\n =========Pet: Null ===========");
        ArrayList<String> petList = new ArrayList<>();
        petList.add("dog");
        petList.add("cat");
        petList.add("Rabbit");
        petList.add("Frog");
        petList.add("Hedgehog");
        petList.add("Bird");
        petList.add("Hamster");

        Pet alligator = new Pet("alligator");
        if ( petList != null) {
            System.out.println("We have " + petList.size() + " different types of pets!");
        } else {
            System.out.println("Sorry, we don't have anymore pets!");
        }

        System.out.println("\n ===========Millennial Custom Class========");
        Millennial jessica = new Millennial(31, 75000);
        jessica.Name = "Jessica";
        System.out.println(jessica);

        System.out.println("\n ===========Millennial Class: Testing Positive Boolean========");
        Millennial joe = new Millennial(25, 10000);
        joe.Name = "Joe";
        joe.setJeans("Straight-leg");
        joe.setBangs("Bald");
        joe.Age(25);
        System.out.println(joe);

        System.out.println("\n ===========Millennial Class: Testing Negative Boolean========");
        Millennial tina = new Millennial("Middle-part","Wide-leg", "Green");
        tina.Name = "Tina";
        tina.setAge(18);
        tina.setStudentDebt(500);
        tina.Age(18);
        System.out.println(tina);

    }
}
