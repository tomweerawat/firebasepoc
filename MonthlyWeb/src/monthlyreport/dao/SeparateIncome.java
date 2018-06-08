package monthlyreport.dao;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class SeparateIncome {

/*    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss",timezone="Asia/Bangkok")*/
    String transactiondatetime;
    String Merchant;
    String Service;
    String Unit;
    String VATCase;
    String Incomefromcust;
    String commissionfromerchant;
    String merchantnetincome;
    String feeincludevat;
    String discountfromcode;
    String coinused;
    String Totaldiscount;
    String Nameoftax;
    String TaxNo;
    String billaddress;
    String CustName;
    String CustLastName;

    public String getTransactiondatetime() {
        return transactiondatetime;
    }

    public void setTransactiondatetime(String transactiondatetime) {
        this.transactiondatetime = transactiondatetime;
    }

    public String getMerchant() {
        return Merchant;
    }

    public void setMerchant(String merchant) {
        Merchant = merchant;
    }

    public String getService() {
        return Service;
    }

    public void setService(String service) {
        Service = service;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public String getVATCase() {
        return VATCase;
    }

    public void setVATCase(String VATCase) {
        this.VATCase = VATCase;
    }

    public String getIncomefromcust() {
        return Incomefromcust;
    }

    public void setIncomefromcust(String incomefromcust) {
        Incomefromcust = incomefromcust;
    }

    public String getCommissionfromerchant() {
        return commissionfromerchant;
    }

    public void setCommissionfromerchant(String commissionfromerchant) {
        this.commissionfromerchant = commissionfromerchant;
    }

    public String getMerchantnetincome() {
        return merchantnetincome;
    }

    public void setMerchantnetincome(String merchantnetincome) {
        this.merchantnetincome = merchantnetincome;
    }

    public String getFeeincludevat() {
        return feeincludevat;
    }

    public void setFeeincludevat(String feeincludevat) {
        this.feeincludevat = feeincludevat;
    }

    public String getDiscountfromcode() {
        return discountfromcode;
    }

    public void setDiscountfromcode(String discountfromcode) {
        this.discountfromcode = discountfromcode;
    }

    public String getCoinused() {
        return coinused;
    }

    public void setCoinused(String coinused) {
        this.coinused = coinused;
    }

    public String getTotaldiscount() {
        return Totaldiscount;
    }

    public void setTotaldiscount(String totaldiscount) {
        Totaldiscount = totaldiscount;
    }

    public String getNameoftax() {
        return Nameoftax;
    }

    public void setNameoftax(String nameoftax) {
        Nameoftax = nameoftax;
    }

    public String getTaxNo() {
        return TaxNo;
    }

    public void setTaxNo(String taxNo) {
        TaxNo = taxNo;
    }

    public String getBilladdress() {
        return billaddress;
    }

    public void setBilladdress(String billaddress) {
        this.billaddress = billaddress;
    }

    public String getCustName() {
        return CustName;
    }

    public void setCustName(String custName) {
        CustName = custName;
    }

    public String getCustLastName() {
        return CustLastName;
    }

    public void setCustLastName(String custLastName) {
        CustLastName = custLastName;
    }
}
