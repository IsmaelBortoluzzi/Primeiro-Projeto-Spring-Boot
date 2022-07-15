package com.cursojava.cursojava.entities.enums;

import java.util.Map;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private final Integer code;


    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderStatus valueOf(Integer code) {

        for (OrderStatus val: OrderStatus.values()) {
            if (val.getCode() == code) {
                return val;
            }
        }
        throw new IllegalArgumentException("Invalid Order Status Code!");
    }
}
