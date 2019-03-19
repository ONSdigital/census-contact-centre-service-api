package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PostcodeQueryRequestDTO {
  private static Integer DEFAULT_OFFSET = 0;
  private static Integer DEFAULT_LIMIT = 100;

  @NotNull
  @Pattern(
      regexp =
          "|GIR[ ]?0AA"
              + "|((AB|AL|B|BA|BB|BD|BH|BL|BN|BR|BS|BT|BX|CA|CB|CF|CH|CM|CO|CR|CT|CV|CW|DA|DD|DE"
              + "|DG|DH|DL|DN|DT|DY|E|EC|EH|EN|EX|FK|FY|G|GL|GY|GU|HA|HD|HG|HP|HR|HS|HU|HX|IG|IM"
              + "|IP|IV|JE|KA|KT|KW|KY|L|LA|LD|LE|LL|LN|LS|LU|M|ME|MK|ML|N|NE|NG|NN|NP|NR|NW|OL"
              + "|OX|PA|PE|PH|PL|PO|PR|RG|RH|RM|S|SA|SE|SG|SK|SL|SM|SN|SO|SP|SR|SS|ST|SW|SY|TA"
              + "|TD|TF|TN|TQ|TR|TS|TW|UB|W|WA|WC|WD|WF|WN|WR|WS|WV|YO|ZE)"
              + "(\\d[\\dA-Z]?[ ]?\\d[ABD-HJLN-UW-Z]{2}))"
              + "|BFPO[ ]?\\d{1,4}$")
  private String postcode;

  @Min(0)
  @Max(250)
  private Integer offset = 0;

  @Min(0)
  @Max(100)
  private Integer limit = 100;


  public Integer getOffset() {
    if (offset != null) {
      return offset;
    }

    return DEFAULT_OFFSET;
  }

  public Integer getLimit() {
    if (limit != null) {
      return limit;
    }

    return DEFAULT_LIMIT;
  }
}