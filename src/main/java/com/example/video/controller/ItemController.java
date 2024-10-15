package com.example.video.controller;

import com.example.video.dto.ItemDTO;
import com.example.video.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/item")
@CrossOrigin
public class ItemController
{
    @Autowired
    private ItemService itemService;

    @PostMapping(path = "/save")
    public String saveItem(@RequestBody ItemDTO itemDTO)
    {
        itemService.addItem(itemDTO);
        return "saved";
    }
}
