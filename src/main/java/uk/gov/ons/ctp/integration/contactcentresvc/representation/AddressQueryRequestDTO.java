package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddressQueryRequestDTO {
  private static Integer DEFAULT_OFFSET = 0;
  private static Integer DEFAULT_LIMIT = 100;

  @NotNull
  @Pattern(regexp = ".+")
  private String input;

  @Min(0)
  @Max(250)
  private Integer offset;

  @Min(0)
  @Max(100)
  private Integer limit;

  
  public Integer getOffset() {
    if (offset != null) {
      return offset;
    }

    return DEFAULT_OFFSET;
  }

  public Integer getLimit() {
    if (limit != null) {
      return limit;
    }

    return DEFAULT_LIMIT;
  }
}
