package model;
import java.util.List;

public class UserOrder {
    private int orderId;
    private String paymentMethod;
    private String address;
    private List<OrderItem> orderItems;

    public UserOrder() {

    }

    public float calculateTotalPrice() {
        return orderItems.stream().map(OrderItem::getTotalPrice)
                .reduce(0F, Float::sum);
    }

    public float calculateTotalPriceWithDiscount(){
        return orderItems.stream().map(OrderItem::getPriceWithDiscount).reduce(0F,Float::sum);
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
