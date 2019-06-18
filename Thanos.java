import java.util.ArrayList;
import java.util.Collections;

class Thanos{
   
    public static void main(String[] args) { 

        ArrayList<Hero> heroes = new ArrayList<Hero>();

        Hero thor = new Hero("Thor", 1500);
        heroes.add(thor);
        Hero blackWidow = new Hero("Black Widow", 34);
        heroes.add(blackWidow);
        Hero captainAmerica = new Hero("Captain America", 100);
        heroes.add(captainAmerica);
        Hero vision = new Hero("Vision", 3);
        heroes.add(vision);
        Hero ironMan = new Hero("Iron Man", 48);
        heroes.add(ironMan);
        Hero scarletWich = new Hero("Scarlet Wich", 29);
        heroes.add(scarletWich);
        Hero spiderMan = new Hero("Spider-Man", 18);
        heroes.add(spiderMan);
        Hero hulk = new Hero("Hulk", 49);
        heroes.add(hulk);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
        heroes.add(doctorStrange);

        thor.setAge(1501);                  //changement age Thor

        Collections.shuffle(heroes);        //melange aleatoire de la liste
        
        heroes.subList(5, heroes.size()).clear();

        for(int i = 0; i< heroes.size(); i++){
            System.out.println(heroes.get(i).getName());       //affiche les heros encore en vie
         }

        }  
        }
