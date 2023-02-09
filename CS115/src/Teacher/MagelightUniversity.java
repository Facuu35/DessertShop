package Teacher;
import java.util.*;
public class MagelightUniversity {
    public static void main(String[] args) {

		    ArrayList<Person> Person = new ArrayList<Person>();

            Person p1 = new Person("Rachel","F", "1993-05-12","801-555-1212");
            Person.add(p1);
            Person p2 = new Person("Jose","M", "2004-12-01","480-555-1212");
            Person.add(p2);
            Person p3 = new Person("Prya","F", "2001-02-27","385-555-1212");
            Person.add(p3);
            Person p4 = new Person("Bob","M","1984-06-06","916-555-1212");
            Person.add(p4);



        
            System.out.printf("%-15s %-15s %-15s %s %n", "NAME","AGE","GENDER","PHONE#");
            for (Person p : Person) {

                System.out.printf("%-15s %-15s %-15s %s %n",p.getName(),p.getDob(), p.getGender(), p.getPhone());
            }



    }
}
