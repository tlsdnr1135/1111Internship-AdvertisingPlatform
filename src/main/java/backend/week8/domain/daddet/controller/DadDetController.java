package backend.week8.domain.daddet.controller;

import backend.week8.domain.daddet.dto.request.FindKeywordsInItemRequestDto;
import backend.week8.domain.daddet.dto.request.UpdateDadDetActOffRequestDto;
import backend.week8.domain.daddet.dto.request.UpdateDadDetUseConfigRequestDto;
import backend.week8.domain.daddet.dto.response.FindKeywordsInItemResponseDto;
import backend.week8.domain.daddet.service.DadDetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/daddet")
public class DadDetController {
	private final DadDetService dadDetService;

	/**
	 * 한 상품이 가지는 키워드 조회
	 */
	@PostMapping("/kwd/search")
	public ResponseEntity<FindKeywordsInItemResponseDto> findKeywordsInItem(@RequestBody FindKeywordsInItemRequestDto findKeywordsInItemRequestDto) {
		FindKeywordsInItemResponseDto findKeywordsInItemResponseDto = dadDetService.findKeywordsInItem(findKeywordsInItemRequestDto);
		return ResponseEntity.ok()
				.body(findKeywordsInItemResponseDto);
	}

	/**
	 * 직접광고 사용 설정 여부 변경
	 */
	@PutMapping("/use-config")
	public ResponseEntity<Void> updateDadDetUseConfig(@RequestBody UpdateDadDetUseConfigRequestDto updateDadDetUseConfigRequestDto) {
		dadDetService.updateDadDetUseConfig(updateDadDetUseConfigRequestDto);
		return ResponseEntity.ok()
				.build();
	}

	/**
	 * 직접광고 활성 여부 끄기
	 */
	@PutMapping("/act-off")
	public ResponseEntity<Void> updateDadDetActOff(@RequestBody UpdateDadDetActOffRequestDto updateDadDetActOffRequestDto) {
		dadDetService.updateDadDetActOff(updateDadDetActOffRequestDto);
		return ResponseEntity.ok()
				.build();
	}

}
