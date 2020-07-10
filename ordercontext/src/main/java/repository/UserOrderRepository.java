package repository;

import model.UserOrder;

public interface UserOrderRepository {
    void saveUserOrder(UserOrder order);
}
