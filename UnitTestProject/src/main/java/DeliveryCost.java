import java.util.Objects;

public class DeliveryCost {

    public double DeliveryCostCount(int distance, String size, boolean fragile, String load) {
        double deliveryResult = 0;
        double minDeliveryCost = 400;

        //Проверяем дистанцию
        if (distance > 30 && fragile) {
            System.out.println("Хрупкие грузы нельзя возить более чем на 30 км");

        } else if (distance > 30) {
            deliveryResult += 300;
        } else if (distance > 10) {
            deliveryResult += 200;
        } else if (distance > 2) {
            deliveryResult += 100;
        } else {
            deliveryResult += 50;
        }

        //Проверяем размеры
        if (Objects.equals(size, "big")) {
            deliveryResult += 200;
        } else {
            deliveryResult += 100;
        }
        //Проверяем хрупкость
        if (fragile) {
            deliveryResult += 300;
        }

        //Проверяем загруженность
        switch (load) {
            case "veryBigLoad":
                deliveryResult = deliveryResult * 1.6;
                break;
            case "bigLoad":
                deliveryResult = deliveryResult * 1.4;
                break;
            case "highLoad":
                deliveryResult = deliveryResult * 1.2;
                break;
            default:
                break;
        }

        return Math.max(deliveryResult, minDeliveryCost);
    }
}
