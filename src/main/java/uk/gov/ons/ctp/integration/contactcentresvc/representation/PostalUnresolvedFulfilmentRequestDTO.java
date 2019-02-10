package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class PostalUnresolvedFulfilmentRequestDTO extends FulfilmentRequestDTO {}
