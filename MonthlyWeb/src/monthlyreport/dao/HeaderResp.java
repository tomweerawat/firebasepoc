package monthlyreport.dao;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HeaderResp implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String errCode;
    private String errDesc;

    private String sessExprDttm;

    public String getErrCode() {
        return errCode;
    }
    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }
    public String getErrDesc() {
        return errDesc;
    }
    public void setErrDesc(String errDesc) {
        this.errDesc = errDesc;
    }
    public String getSessExprDttm() {
        return sessExprDttm;
    }
    public void setSessExprDttm(String sessExprDttm) {
        this.sessExprDttm = sessExprDttm;
    }

}
