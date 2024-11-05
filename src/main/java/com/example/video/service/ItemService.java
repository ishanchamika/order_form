package com.example.video.service;

import com.example.video.dto.ItemDTO;
import com.example.video.dto.paginated.PaginatedResponseItemDTO;
import com.example.video.dto.request.RequestSaveItemDTO;
import jakarta.validation.constraints.Max;

import java.util.List;

public interface ItemService
{
    void addItem(RequestSaveItemDTO requestSaveItemDTO);

    List<ItemDTO> getItemByNameAndActiveState(String itemName);

    List<ItemDTO> getAllItems();

    PaginatedResponseItemDTO getAllItemsActive(int page, @Max(50) int size, boolean activeState);
}
