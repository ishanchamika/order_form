package com.example.video.service;

import com.example.video.dto.ItemDTO;
import com.example.video.dto.request.RequestSaveItemDTO;

import java.util.List;

public interface ItemService
{
    void addItem(RequestSaveItemDTO requestSaveItemDTO);

    List<ItemDTO> getItemByNameAndActiveState(String itemName);

    List<ItemDTO> getAllItems();
}
