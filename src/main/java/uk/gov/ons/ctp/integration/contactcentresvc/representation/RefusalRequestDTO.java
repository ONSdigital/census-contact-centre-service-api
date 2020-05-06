package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import com.godaddy.logging.LoggingScope;
import com.godaddy.logging.Scope;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.ons.ctp.common.domain.UniquePropertyReferenceNumber;
import uk.gov.ons.ctp.integration.contactcentresvc.Constants;

/**
 * The request object when contact centre registers a refusal
 *
 * @author philwhiles
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RefusalRequestDTO {

  private String caseId;

  @Pattern(regexp = "\\d{1,5}")
  @NotNull
  private String agentId;

  @Size(max = 12)
  @LoggingScope(scope = Scope.SKIP)
  private String title;

  @Size(max = 60)
  @LoggingScope(scope = Scope.SKIP)
  private String forename;

  @Size(max = 60)
  @LoggingScope(scope = Scope.SKIP)
  private String surname;

  @Pattern(regexp = Constants.OPTIONAL_PHONENUMBER_RE)
  @LoggingScope(scope = Scope.SKIP)
  private String telNo;

  @Size(max = 512)
  @LoggingScope(scope = Scope.SKIP)
  private String notes;

  @Size(max = 60)
  private String addressLine1;

  @Size(max = 60)
  @LoggingScope(scope = Scope.SKIP)
  private String addressLine2;

  @Size(max = 60)
  @LoggingScope(scope = Scope.SKIP)
  private String addressLine3;

  @Size(max = 60)
  @LoggingScope(scope = Scope.SKIP)
  private String townName;

  @NotNull private Reason reason;

  private Region region;

  @Pattern(regexp = Constants.OPTIONAL_POSTCODE_RE)
  private String postcode;

  private UniquePropertyReferenceNumber uprn;

  @NotNull private Date dateTime;
}
