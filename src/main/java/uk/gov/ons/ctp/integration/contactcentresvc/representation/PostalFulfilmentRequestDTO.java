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
public class PostalFulfilmentRequestDTO {

 private UUID caseId;

 @Size(max=12)
 @NotNull
 private String title;
 
 @Size(max=60)
 private String forename;
 
 @Size(max=60)
 private String surname;

 @Size(max=6)
 private String productCode;

 private LocalDateTime dateTime;
}
