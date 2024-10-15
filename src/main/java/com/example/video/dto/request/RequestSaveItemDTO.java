package com.example.video.dto.request;

import com.example.video.entity.enums.MeasuringUnitType;

public class RequestSaveItemDTO
{
    private String itemName;
    private MeasuringUnitType measuringUnitType;
    private double balanceQty;
    private double sellingPrice;
    private boolean activeState;
}
