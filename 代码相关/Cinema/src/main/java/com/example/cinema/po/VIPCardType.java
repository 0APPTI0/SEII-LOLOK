package com.example.cinema.po;

/**
 *
 * **/
public class VIPCardType {

    private int id;

    private String description;

    /**
     *优惠类型：
     * 1：购买影票时的打折优惠:
     *  a.discountRate为折扣，discount=7时表示7折
     *  b.无打折优惠时discountRate为10
     * 2：充值时的满减优惠
     *  a.无满减优惠时discountAmount为0
     * **/

    private double discountRate;

    private double targetAmount;

    private double discountAmount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(double targetAmount) {
        this.targetAmount = targetAmount;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }
}
