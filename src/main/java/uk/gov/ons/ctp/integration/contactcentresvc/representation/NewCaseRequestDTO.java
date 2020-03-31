package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import com.godaddy.logging.LoggingScope;
import com.godaddy.logging.Scope;
import java.util.Date;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The request object when contact centre sends new case and address details
 *
 * @author philwhiles
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NewCaseRequestDTO {

  @NotBlank private String addressLine1;

  @LoggingScope(scope = Scope.SKIP)
  private String addressLine2;

  @LoggingScope(scope = Scope.SKIP)
  private String addressLine3;

  @LoggingScope(scope = Scope.SKIP)
  @NotBlank
  private String townName;

  @NotNull private Region region;

  private String postcode;

  @NotNull private CaseType caseType;

  @NotNull private Date dateTime;

  private String ceOrgName;

  private Integer ceUsualResidents;
}
