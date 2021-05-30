package com.fallindawn.qabottleprod.forecast;

public class Forecast {

    /**
     * true - спрос растёт
     * false - спрос падает
     */
    private boolean trend;

    /**
     * Результирующее значение изменения спроса
     */
    private double resultDemand;

    public Forecast() {
    }

    public Forecast(boolean trend, double resultDemand) {
        this.trend = trend;
        this.resultDemand = resultDemand;
    }


    public boolean isTrend() {
        return trend;
    }

    public void setTrend(boolean trend) {
        this.trend = trend;
    }

    public double getResultDemand() {
        return resultDemand;
    }

    public void setResultDemand(double resultDemand) {
        this.resultDemand = resultDemand;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                ", trend=" + trend +
                ", resultDemand=" + resultDemand +
                '}';
    }
}
