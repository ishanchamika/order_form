package com.example.video.util.mappers;

import com.example.video.dto.ItemDTO;
import com.example.video.dto.request.RequestSaveItemDTO;
import com.example.video.entity.Item;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper
{
    Item requestDtoToEntity(RequestSaveItemDTO requestSaveItemDTO);
//    List<Item> requestDtoListToEntityList(List<RequestSaveItemDTO> requestSaveItemDTO);
    List<ItemDTO> entityListToDtoList(List<Item>items);
}
