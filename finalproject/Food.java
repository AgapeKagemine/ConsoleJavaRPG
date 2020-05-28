package finalproject;

public class Food extends MenuResto {
    public Food(String name, int quantity, Long initialPrice) {
        super(name, quantity, initialPrice);
        this.setInitialPrice(calculate(initialPrice));
    }

    @Override
    public Long calculate(Long price) {
        Double temp = price + (price * tax);
        return temp.longValue();
    }
}