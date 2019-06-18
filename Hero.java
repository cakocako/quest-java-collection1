
import java.util.Collections; // import the ArrayList class

    

public class  Hero{             //descriptif hero
    private String name;
    private int age;

    public Hero(String name){
        this.name = name;
        this.age = 0;
    }

    public Hero (String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}