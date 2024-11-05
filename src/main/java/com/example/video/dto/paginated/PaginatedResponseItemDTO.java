package com.example.video.dto.paginated;

import com.example.video.dto.ItemDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaginatedResponseItemDTO
{
    private List<ItemDTO> list;
    private long dataCount;
}
