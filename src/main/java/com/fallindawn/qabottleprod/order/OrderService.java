package com.fallindawn.qabottleprod.order;

import com.fallindawn.qabottleprod.forecast.IForecastService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {

    Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private IOrderRepository orderRepository;

    @Autowired
    private IForecastService forecastService;

    /**
     * Сохранение новой заявки в БД
     *
     * @param order - пришедшая от клиента заявка
     */
    @Override
    public void saveOrder(Order order) {
        orderRepository.save(order);
        logger.info("Заявка компании \"{}\" сохранена", order.getCompany());
        logger.info("Инициализация прогноза...");
        forecastService.doForecast(order);
    }

    /**
     * Отправляем скорректированную заявку заказчику
     *
     * @param order - скорректированная заявка
     */
    @Override
    public void orderAccept(Order order) {
        logger.info("Заявка компании \"{}\" отправлена на согласование", order.getCompany());
    }

    @Override
    public void initForecst(Order order) {
        forecastService.doForecast(order);
    }


}
