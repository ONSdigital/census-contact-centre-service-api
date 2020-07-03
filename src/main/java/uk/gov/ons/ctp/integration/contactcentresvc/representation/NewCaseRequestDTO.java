package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uk.gov.ons.ctp.common.domain.CaseType;
import uk.gov.ons.ctp.common.domain.EstabType;
import uk.gov.ons.ctp.common.domain.UniquePropertyReferenceNumber;

/**
 * The request object when contact centre sends new case and address details
 *
 * @author philwhiles
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class NewCaseRequestDTO extends CaseRequestDTO {

  @NotNull private CaseType caseType;

  private UniquePropertyReferenceNumber uprn;

  @NotNull private EstabType estabType;
}
