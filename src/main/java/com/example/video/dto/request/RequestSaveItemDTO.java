package com.example.video.dto.request;

import com.example.video.entity.enums.MeasuringUnitType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestSaveItemDTO
{
    private String itemName;
    private MeasuringUnitType measuringUnitType;
    private double balanceQty;
    private double sellingPrice;
    private double supplierPrice;
}
