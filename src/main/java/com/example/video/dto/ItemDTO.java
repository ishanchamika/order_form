package com.example.video.dto;

import com.example.video.entity.enums.MeasuringUnitType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ItemDTO
{
    private int itemId;
    private String itemName;
    private MeasuringUnitType measuringUnitType;
    private double balanceQty;
    private double sellingPrice;
    private boolean activeState;
}
