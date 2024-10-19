package com.example.video.controller;

import com.example.video.dto.ItemDTO;
import com.example.video.dto.request.RequestSaveItemDTO;
import com.example.video.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/item")
@CrossOrigin
public class ItemController
{
    @Autowired
    private ItemService itemService;

    @PostMapping(path = "/save")
    public String saveItem(@RequestBody RequestSaveItemDTO requestSaveItemDTO)
    {
        itemService.addItem(requestSaveItemDTO);
        return "saved";
    }

    @GetMapping(path = "/get-by-name", params = "name")
    public List<ItemDTO> getItemByName(@RequestParam(value = "name") String itemName)
    {
        List<ItemDTO> itemDTO = itemService.getItemByNameAndActiveState(itemName);
        return itemDTO;
    }

    @GetMapping(path = "/get-all-items")
    public List<ItemDTO> getAllItems()
    {
        List<ItemDTO> itemDTOS = itemService.getAllItems();
        return itemDTOS;
    }
}
