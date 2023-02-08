import java.util.*;
public class Main {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jesse");
        names.add("Bart");
        names.add("David");
        names.add("Abigail");
        names.add("Frank");
        names.add("Steph");
        names.add("Thomas");
        names.add("Jimmy");
        names.add("Joe");
        names.add("Klein");
        names.add("Daisy");

        System.out.println("BEFORE: " + names);

        for (int i = 0; i < names.size(); i++){
            if (names.get(i).length()==5){
                names.remove(i);
                i--;
            }
        }


        System.out.println("AFTER: " + names);


        /*ArrayList<String> names = new ArrayList<String>();
        names.add("Jessica");
        names.add("Abby");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");
        names.add("Sofia");
        names.add("Tim");
        names.add("James");
        names.add("Jim");

        System.out.println("BEFORE: " + names);

        for (int i = 0; i < names.size(); i++){
            if (names.get(i).contains("i")){
                names.add(i+1, "hi");
                i++;
            }
        }


        System.out.println("AFTER: " + names);
         */
    }
}
