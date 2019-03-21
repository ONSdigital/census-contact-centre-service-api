package uk.gov.ons.ctp.integration.contactcentresvc.representation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import lombok.Data;

@Data
public class PostcodeQueryRequestDTO {
  @NotBlank
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

  /**
   * Create method, as default values don't work if using an all args constructor or a builder. So
   * this is the least bad workaround.
   *
   * @param input address, or part off, to search for.
   * @param offset index of first result to return.
   * @param limit maximum number of addresses to return.
   * @return a newly constructed dto.
   */
  public static PostcodeQueryRequestDTO create(String postcode, int offset, int limit) {
    PostcodeQueryRequestDTO dto = new PostcodeQueryRequestDTO();

    dto.setPostcode(postcode);
    dto.setOffset(0);
    dto.setLimit(limit);

    return dto;
  }
}
