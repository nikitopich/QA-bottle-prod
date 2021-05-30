package com.fallindawn.qabottleprod.forecast;

import com.fallindawn.qabottleprod.order.Order;

public interface IForecastService {

    /**
     * Запуск процесса прогноза
     *
     * @param order
     * @return
     */
    Forecast doForecast(Order order);
}
