package java_english.lnheritance;

public class NoodleRestaurant {
    String name;

    public NoodleRestaurant(String customerName) {
        name = customerName;
    }

    public void order(Noodle noodle) {
        System.out.println(noodle.getCookPrep());
        System.out.println("Order for " + name + " is ready.");
    }

    public static void main(String[] args) {
        NoodleRestaurant customer1 = new NoodleRestaurant("Sagirah");
        NoodleRestaurant customer2 = new NoodleRestaurant("Maritza");

        Ramen ramen = new Ramen();
        Pho pho = new Pho();

        customer1.order(ramen);
        customer2.order(pho);
    }
}
