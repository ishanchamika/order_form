package com.example.video.util.mappers;

import com.example.video.dto.ItemDTO;
import com.example.video.dto.request.RequestSaveItemDTO;
import com.example.video.entity.Item;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper
{
    Item requestDtoToEntity(RequestSaveItemDTO requestSaveItemDTO);
//    List<Item> requestDtoListToEntityList(List<RequestSaveItemDTO> requestSaveItemDTO);
    List<ItemDTO> entityListToDtoList(List<Item>items);
    List<ItemDTO> pageToList(Page<Item> items);
}