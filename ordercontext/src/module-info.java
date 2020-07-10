module com.example.labEmt.ordercontext {
    requires com.example.labEmt.sharedkernel;
    exports com.example.labEmt.ordercontext.service;
    exports com.example.labEmt.ordercontext.model;
    exports com.example.labEmt.ordercontext.repository;
    provides com.example.labEmt.ordercontext.service.OrderService
            with com.example.labEmt.ordercontext.service.CustomerOrderService;
}