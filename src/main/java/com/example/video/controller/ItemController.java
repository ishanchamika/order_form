package com.example.video.controller;

import com.example.video.dto.ItemDTO;
import com.example.video.dto.paginated.PaginatedResponseItemDTO;
import com.example.video.dto.request.RequestSaveItemDTO;
import com.example.video.service.ItemService;
import com.example.video.util.StandardResponse;
import jakarta.validation.constraints.Max;
import jakarta.xml.bind.annotation.XmlAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

//    @GetMapping(path = "/get-all-items")
//    public List<ItemDTO> getAllItems()
//    {
//        List<ItemDTO> itemDTOS = itemService.getAllItems();
//        return itemDTOS;
//    }



    @GetMapping(path = "/get-all-items")
    public ResponseEntity<StandardResponse> getAllItems()
    {
        List<ItemDTO> itemDTOS = itemService.getAllItems();
        return new ResponseEntity<StandardResponse>(new StandardResponse(200, "success", itemDTOS), HttpStatus.OK);
    }

    @GetMapping(path = {"/get-all-item-active"}, params = {"page","size", "activeState"})
    public ResponseEntity<StandardResponse> getAllItemsActive(@RequestParam(value = "page") int page, @RequestParam(value = "size") @Max(50) int size, @RequestParam(value = "activeState") boolean activeState)
    {
        PaginatedResponseItemDTO paginatedResponseItemDTO = itemService.getAllItemsActive(page, size, activeState);
        return new ResponseEntity<StandardResponse>(new StandardResponse(200, "success", paginatedResponseItemDTO), HttpStatus.OK);
    }
}
