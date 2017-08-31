import corporation.lohika.Person;

public class Main {
    public static void main(String[] args){
        Person person = new Person("Nastia","Kvas",27);
        person.setHeight(175);
        System.out.println(person.getHeight());
    }
}
