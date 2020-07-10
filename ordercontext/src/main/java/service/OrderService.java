package service;

import model.UserOrder;
import repository.UserOrderRepository;

public interface OrderService extends ApplicationService{
    void placeOrder(UserOrder order);

    void setOrderRepository(UserOrderRepository orderRepository);
}
