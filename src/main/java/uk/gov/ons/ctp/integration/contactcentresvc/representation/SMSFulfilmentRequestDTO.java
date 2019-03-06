package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import java.time.LocalDateTime;
import java.util.UUID;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SMSFulfilmentRequestDTO {
  private UUID caseId;

  @Size(max=60)
  private String telNo;

  @Size(max=6)
  private String productCode;

  private LocalDateTime dateTime;
}
