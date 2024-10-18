package com.example.video.service.impl;

import com.example.video.dto.ItemDTO;
import com.example.video.dto.request.RequestSaveItemDTO;
import com.example.video.entity.Item;
import com.example.video.repo.ItemRepo;
import com.example.video.service.ItemService;
import com.example.video.util.mappers.ItemMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceIMPL implements ItemService
{
  @Autowired
  private ItemRepo itemRepo;

  @Autowired
  private ModelMapper modelMapper;


  @Autowired
  private ItemMapper itemMapper;

  @Override
  public void addItem(RequestSaveItemDTO requestSaveItemDTO)
  {
//    Item item = modelMapper.map(requestSaveItemDTO, Item.class);
    Item item = itemMapper.requestDtoToEntity(requestSaveItemDTO);
    item.setActiveState(false);
    if(!itemRepo.existsById(item.getItemId()))
    {
      itemRepo.save(item);
    }
  }

  public List<ItemDTO> getItemByNameAndActiveState(String itemName)
  {
    if(itemName != null)
    {
      int b= 1;
      List<Item> items = itemRepo.findAllByItemName(itemName);
      List<ItemDTO> itemDTOList = itemMapper.entityListToDtoList(items);
      return itemDTOList;
    }
    else
    {
      return null;
    }
  }

}
