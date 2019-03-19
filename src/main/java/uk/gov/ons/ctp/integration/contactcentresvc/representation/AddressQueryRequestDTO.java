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
  @NotNull
  @Pattern(regexp = ".+")
  private String input;

  @Min(0)
  @Max(250)
  private Integer offset = 0;

  @Min(0)
  @Max(100)
  private Integer limit = 100;
}
