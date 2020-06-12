package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import com.godaddy.logging.LoggingScope;
import com.godaddy.logging.Scope;
import java.util.Date;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.ons.ctp.integration.contactcentresvc.Constants;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class CaseRequestDTO {

  @NotBlank
  @Size(max = 60)
  private String addressLine1;

  @LoggingScope(scope = Scope.SKIP)
  @Size(max = 60)
  private String addressLine2;

  @LoggingScope(scope = Scope.SKIP)
  @Size(max = 60)
  private String addressLine3;

  @LoggingScope(scope = Scope.SKIP)
  @NotBlank
  @Size(max = 60)
  private String townName;

  @NotNull private Region region;

  @NotBlank
  @Pattern(regexp = Constants.POSTCODE_RE)
  private String postcode;

  @NotNull private Date dateTime;

  @Size(max = 60)
  private String ceOrgName;

  private Integer ceUsualResidents;
}
