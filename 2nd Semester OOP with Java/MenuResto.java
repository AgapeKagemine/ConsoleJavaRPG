package finalproject;

public abstract class MenuResto implements Interface {
    protected String name;
    protected int quantity;
    protected Long initialPrice;
    protected String type;

    public MenuResto(String name, int quantity, Long initialPrice) {
        this.name = name;
        this.quantity = quantity;
        this.initialPrice = initialPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(Long initialPrice) {
        this.initialPrice = initialPrice;
    }
}