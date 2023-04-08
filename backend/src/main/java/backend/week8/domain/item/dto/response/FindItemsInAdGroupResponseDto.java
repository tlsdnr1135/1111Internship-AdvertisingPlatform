package backend.week8.domain.item.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class FindItemsInAdGroupResponseDto {
	List<ItemInAdGroupResponseDto> items;
}