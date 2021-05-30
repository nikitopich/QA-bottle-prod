package com.fallindawn.qabottleprod.forecast;

import com.fallindawn.qabottleprod.order.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ForecastService implements IForecastService {

    Logger logger = LoggerFactory.getLogger(ForecastService.class);

    @Override
    public Forecast doForecast(Order order) {
        logger.info("Запуск прогноза по заявке #{}", order.getId());
        Forecast forecast = new Forecast();


        double firstDemand = (double)(getDemand()[1])/(double)(getDemand()[0]);
        double secondDemand = (double)(getDemand()[2])/(double)(getDemand()[1]);
        double demandResult = (firstDemand + secondDemand) / 2;

        forecast.setResultDemand(demandResult);

        return forecast;
    }

    private int[] getDemand() {
        return new int[]{546,600,651};
    }
}
