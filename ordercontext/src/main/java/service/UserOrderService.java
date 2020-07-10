package service;

import model.UserOrder;

import repository.UserOrderRepository;
import sharedkernel.src.main.java;
import java.util.HashMap;
import java.util.Map;

public class UserOrderService implements OrderService{
    public static final String EVENT_ORDER_READY_FOR_SHIPMENT = "OrderReadyForShipmentEvent";

    private UserOrderRepository orderRepository;
    private EventBus eventBus;

    @Override
    public void placeOrder(UserOrder order) {
        this.orderRepository.saveUserOrder(order);
        Map<String, String> payload = new HashMap<>();
        payload.put("order_id", String.valueOf(order.getOrderId()));
        ApplicationEvent event = new ApplicationEvent(payload) {
            @Override
            public String getType() {
                return EVENT_ORDER_READY_FOR_SHIPMENT;
            }
        };
        this.eventBus.publish(event);
    }

    @Override
    public EventBus getEventBus() {
        return eventBus;
    }

    public void setOrderRepository(UserOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void setEventBus(EventBus eventBus) {
        this.eventBus = eventBus;
    }
}
