package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AddressQueryRequestDTO {
  @NotNull
  @Pattern(regexp = ".+")
  private String input;

  @Min(0)
  @Max(250)
  private int offset = 0;

  @Min(0)
  @Max(100)
  private int limit = 100;
}
