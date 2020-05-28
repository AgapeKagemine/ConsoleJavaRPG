package finalproject;

public class Drink extends MenuResto {
    public Drink(String name, int quantity, Long initialPrice) {
        super(name, quantity, initialPrice);
        this.setInitialPrice(calculate(initialPrice));
    }

    @Override
    public Long calculate(Long price) {
        Double temp = price + (price * tax);
        return temp.longValue();
    }
   
}