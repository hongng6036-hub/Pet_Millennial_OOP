package com.tts;

public class Pet {
    //name (PRIVATE)
    //age (PRIVATE)
    //location (PRIVATE)
    //type (PRIVATE)

    private String Name;
    private int Age;
    private String Location;
    private String Type;

    public void sleep() {
        System.out.println("Pet is sleeping.");
    }

    public void eat() {
        System.out.println("Pet is eating.");
    }

    public void play() {
        System.out.println("Pet is playing.");
    }

    //This is an example of Java encapsulation.
        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            Age = age;
        }

        public String getLocation() {
            return Location;
        }

        public void setLocation(String location) {
            Location = location;
        }

        public String getType() {
            return Type;
        }

        public void setType(String type) {
            Type = type;
        }

    //two constructors
    public Pet(String type, String location) {
        this.Type = type;
        this.Location = location;
    }

    public Pet(String name, int age) {
        this.Name = name;
        this.Age = age;
    }

    public Pet(String type) {
        this.Type = type;
    }

//empty
    Pet() {
        System.out.println("This is an empty constructor.");
    }


    @Override
    public String toString() {
        return "Pet{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Location='" + Location + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }
}
