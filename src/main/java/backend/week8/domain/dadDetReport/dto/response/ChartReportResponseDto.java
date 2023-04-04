package backend.week8.domain.dadDetReport.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ChartReportResponseDto {
	private String date;
	private String category;
	private double value;
}
