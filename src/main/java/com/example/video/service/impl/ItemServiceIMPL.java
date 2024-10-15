package com.example.video.service.impl;

import com.example.video.dto.request.RequestSaveItemDTO;
import com.example.video.entity.Item;
import com.example.video.repo.ItemRepo;
import com.example.video.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceIMPL implements ItemService
{
  @Autowired
  private ItemRepo itemRepo;

  @Override
  public void addItem(RequestSaveItemDTO itemDTO)
  {
    Item item = new Item(

    );
  }
}
