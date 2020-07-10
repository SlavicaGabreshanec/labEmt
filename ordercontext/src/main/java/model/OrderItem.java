package model;

public class OrderItem {
    private int productId;
    private int quantity;
    private float unitPrice;
    private float unitWeight;
    private float discount;

    public OrderItem(int productId, int quantity, float unitPrice, float unitWeight,float discount) {
        this.productId = productId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.unitWeight = unitWeight;
        this.discount = discount;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getTotalPrice() {
        return this.quantity * this.unitPrice;
    }

    public float getPriceWithDiscount(){
        return this.quantity * (this.unitPrice - (this.unitPrice * (this.discount/100)));
    }
    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getUnitWeight() {
        return unitWeight;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitWeight(float unitWeight) {
        this.unitWeight = unitWeight;
    }

    public float getDiscount(){
        return discount;
    }

    public void setDiscount(float discount){
        this.discount = discount;
    }
}
