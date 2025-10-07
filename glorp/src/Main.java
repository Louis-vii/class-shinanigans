
public class Main {
    public static void main(String[] args) {
        person person = new person();
        String name = person.name;
        person.set_name(name);

        System.out.println("name is " + person.get_name());

        System.out.println(" a dude " + !person.ismale);
    }
}
