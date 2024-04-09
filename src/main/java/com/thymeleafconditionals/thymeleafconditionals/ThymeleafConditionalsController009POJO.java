package com.thymeleafconditionals.thymeleafconditionals;

public class ThymeleafConditionalsController009POJO {
    private String item;
    private double revenue;
    private double cost;

    public ThymeleafConditionalsController009POJO(String item, double revenue, double cost) {
        this.item = item;
        this.revenue = revenue;
        this.cost = cost;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getProfit() {
        return calculateProfit();
    }

    private double calculateProfit() {
        double profit = revenue - cost;
        return Math.round(profit * 100.0) / 100.0;
    }

}
