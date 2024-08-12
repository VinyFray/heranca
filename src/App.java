public class App {
    public static void main(String[] args) {

        Staff staff = new Staff("ViniFray",
                "12734684b", "Vinicius", "Ferreira", 30, "123mudar","Admin");

        User user = new User("mama", "xablau123", "Marcelo", "Ferraz", 42);


        System.out.println("\n###### Staff ########\n");
        System.out.println(staff);
        System.out.println("\n###### USER ########\n");
        System.out.println(user);
    }
}