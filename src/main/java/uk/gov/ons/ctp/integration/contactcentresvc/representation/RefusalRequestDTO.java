package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import java.io.Serializable;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RefusalRequestDTO implements Serializable {
  private UUID caseId;
  private String refusalCode;
  private String name;
  private String telNo;
  private String notes;
}
