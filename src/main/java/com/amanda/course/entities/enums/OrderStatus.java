package com.amanda.course.entities.enums;

import com.amanda.course.entities.Order;

public enum OrderStatus {

    WAITTING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DEVILERED(4),
    CANCELED(5);

    private int code;

    private OrderStatus(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static OrderStatus valueOf(int code){
        for (OrderStatus value : OrderStatus.values()){
            if(value.getCode() == code){
                return value;
            }
        }

        throw new IllegalArgumentException("Invalid OrderStatus code");
    }


}


