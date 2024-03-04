
package mycat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MyCat {
    
    public String name;
    public int age;
    public String color;
    public String favToy;
    public String type;
    
    public MyCat(String name, int age, String color, String favToy, String type){
        this.name = name;
        this.age = age;
        this.color = color;
        this.favToy = favToy;
        this.type = type;   
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getColor() {
        return color;
    }
    
    public String getFavToy() {
        return favToy;
    }
    
    public String getType() {
        return type;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Color: " + color);
        System.out.println("Favorite Toy: " + favToy);
        System.out.println("type: " + type);
    }
    
    public void meow() {
        System.out.println(name + " says: Meow!");
    }
    
    public void play() {
        System.out.println(name + " says: this miaw miaw need to play ma man...");
    }
    
    public void serialKiller() {
        System.out.println(name + " says: miaw gonna hunt you down when u fall a sleep he.. he.. he...");
    }
    
    
    
    public static void main(String[] args) {
        // Contoh penggunaan class MyCat
        MyCat myCat1 = new MyCat("pindang", 3, "orange","glok 19","anggora");
        myCat1.displayInfo();
        myCat1.meow();

        System.out.println();

        MyCat myCat2 = new MyCat("ayam tetangga", 2, "White","stick","kampung");
        myCat2.displayInfo();
        myCat2.meow();
    }
}
