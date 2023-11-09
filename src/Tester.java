public class Tester {
    public static void main(String[] args) {
        // Create an instance of the Guest class
        Guest guest = new Guest("Alice", 17, 1234);

        // Access and print the Guest's information
        System.out.println("Guest Name: " + guest.getName());
        System.out.println("Guest Age: " + guest.getAge());
        System.out.println("Guest Budget: " + guest.getBudget());
    }
}
