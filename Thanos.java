import java.util.ArrayList;
import java.util.Collections;

class Thanos{
   
    public static void main(String[] args) { 

        ArrayList<Hero> heroes = new ArrayList<Hero>(); 

        heroes.add(new Hero("Thor", 1501));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Vision", 3));
        heroes.add(new Hero("Iron Man", 48));
        heroes.add(new Hero("Scarlet Wich", 29));
        heroes.add(new Hero("Spider-Man", 18));
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Doctor Strange", 42));

       // Hero thor = new Hero("Thor", 1500);
        //heroes.add(thor);
       
        thor.setAge(1501);          //changement age Thor"

        Collections.shuffle(heroes);            //melange aleatoire de la liste
        
        heroes.subList(0, heroes.size()/2).clear();         //ne prend que la moitié du tableau

        for(int i = 0; i< heroes.size(); i++){
            System.out.println(heroes.get(i).getName());           //affiche les heros encore en vie
         }

    }  
}
