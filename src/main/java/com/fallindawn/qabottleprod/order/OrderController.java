package com.fallindawn.qabottleprod.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController implements IOrderController{

    Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private IOrderService orderService;

    @Override
    public void newOrder(Order order) {
        logger.info("Получена новая заявка");
        orderService.saveOrder(order);
        logger.info("Отправка запроса на прогноз спроса...");
        orderService.initForecst(order);
    }
}
