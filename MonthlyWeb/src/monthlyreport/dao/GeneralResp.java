package monthlyreport.dao;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GeneralResp implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    HeaderResp headerResp = new HeaderResp();

    public HeaderResp getHeaderResp() {
        return headerResp;
    }

    public void setHeaderResp(HeaderResp headerResp) {
        this.headerResp = headerResp;
    }

}