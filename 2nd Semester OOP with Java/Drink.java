package finalproject;

public class Drink extends MenuResto {
    public Drink(String name, int quantity, Long initialPrice) {
        super(name, quantity, initialPrice);
        this.type = "Drink";
        this.setInitialPrice(calculate(initialPrice));
    }

    @Override
    public Long calculate(Long price) {
        // TODO calculate method
        Double temp = price + (price * tax);
        return temp.longValue();
    }
   
}