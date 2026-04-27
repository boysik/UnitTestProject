
public class Delivery {
    public static void main(String[] args) {
        DeliveryCost delivery = new DeliveryCost();

        double result = delivery.DeliveryCostCount(
                35,         // distance
                "big",      // size
                true,       // fragile
                "highLoad"  // load
        );

        System.out.println("Стоимость доставки: " + result + " рублей");
    }
}
