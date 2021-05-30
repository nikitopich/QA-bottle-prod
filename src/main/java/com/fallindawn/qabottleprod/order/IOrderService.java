package com.fallindawn.qabottleprod.order;

/**
 * Сервис обработки заявок
 */
public interface IOrderService {

    /**
     * Сохранение новой заявки в БД
     */
    void saveOrder(Order order);

    /**
     * Отправляем скорректированную заявку заказчику
     */
    void orderAccept(Order order);

    void initForecst(Order order);


}
