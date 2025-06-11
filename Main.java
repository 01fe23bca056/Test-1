public class Main {

    public static void eligiable(int age) {
        if (age < 18) {
            System.out.println("Not eligiable!");
        } else {
            System.out.println("Eligiable!");
        }
    }

    public static void main(String[] args) {

        int age = 20;
        eligiable(age);
        
        age = 16;
        eligiable(age);
    }
}
