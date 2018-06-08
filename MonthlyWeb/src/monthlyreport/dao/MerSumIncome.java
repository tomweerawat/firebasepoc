package monthlyreport.dao;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class MerSumIncome {
    /*@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss",timezone="Asia/Bangkok")*/
	    private String startDate;
	    private String endDate;
	    private String name;
	    private String merchant;
	    private String service;
	    private String unitTime;
	    private String vATCase;
	    private String merchantIncome;
	    private String serviceValue;
	    private String vAT;
	    private String commissionFromMerchant;
	    private String merchantNetIncome;
	    private String fEE;
	    private String discountFromCode;
	    private String discountFromCoin;
	    private String feediscountfromcode;
	    private String totalDiscount;
	    private String nameOfTax;
	    private String taxNo;
	    private String bank;
	    private String bankAccountNo;
	    private String bankAccountName;
	    private String bankBanch;
	    private String billAddress;
	    private String mail;
	    private String stringVat;
	    private String bankaccount;
	

	    public String getStartDate() {
	        return startDate;
	    }

	    public void setStartDate(String startDate) {
	        this.startDate = startDate;
	    }

	    public String getEndDate() {
	        return endDate;
	    }

	    public void setEndDate(String endDate) {
	        this.endDate = endDate;
	    }

	    public String getMerchant() {
	        return merchant;
	    }

	    public void setMerchant(String merchant) {
	        this.merchant = merchant;
	    }

	    public String getService() {
	        return service;
	    }

	    public void setService(String service) {
	        this.service = service;
	    }

	    public String getUnitTime() {
	        return unitTime;
	    }

	    public void setUnitTime(String unitTime) {
	        this.unitTime = unitTime;
	    }

	    public String getvATCase() {
	        return vATCase;
	    }

	    public void setvATCase(String vATCase) {
	        this.vATCase = vATCase;
	    }

	    public String getMerchantIncome() {
	        return merchantIncome;
	    }

	    public void setMerchantIncome(String merchantIncome) {
	        this.merchantIncome = merchantIncome;
	    }

	    public String getServiceValue() {
	        return serviceValue;
	    }

	    public void setServiceValue(String serviceValue) {
	        this.serviceValue = serviceValue;
	    }

	    public String getvAT() {
	        return vAT;
	    }

	    public void setvAT(String vAT) {
	        this.vAT = vAT;
	    }

	    public String getCommissionFromMerchant() {
	        return commissionFromMerchant;
	    }

	    public void setCommissionFromMerchant(String commissionFromMerchant) {
	        this.commissionFromMerchant = commissionFromMerchant;
	    }

	    public String getMerchantNetIncome() {
	        return merchantNetIncome;
	    }

	    public void setMerchantNetIncome(String merchantNetIncome) {
	        this.merchantNetIncome = merchantNetIncome;
	    }

	    public String getfEE() {
	        return fEE;
	    }

	    public void setfEE(String fEE) {
	        this.fEE = fEE;
	    }

	    public String getDiscountFromCode() {
	        return discountFromCode;
	    }

	    public void setDiscountFromCode(String discountFromCode) {
	        this.discountFromCode = discountFromCode;
	    }

	    public String getDiscountFromCoin() {
	        return discountFromCoin;
	    }

	    public void setDiscountFromCoin(String discountFromCoin) {
	        this.discountFromCoin = discountFromCoin;
	    }

	    public String getTotalDiscount() {
	        return totalDiscount;
	    }

	    public void setTotalDiscount(String totalDiscount) {
	        this.totalDiscount = totalDiscount;
	    }

	    public String getNameOfTax() {
	        return nameOfTax;
	    }

	    public void setNameOfTax(String nameOfTax) {
	        this.nameOfTax = nameOfTax;
	    }

	    public String getTaxNo() {
	        return taxNo;
	    }

	    public void setTaxNo(String taxNo) {
	        this.taxNo = taxNo;
	    }

	    public String getBank() {
	        return bank;
	    }

	    public void setBank(String bank) {
	        this.bank = bank;
	    }

	    public String getBankAccountNo() {
	        return bankAccountNo;
	    }

	    public void setBankAccountNo(String bankAccountNo) {
	        this.bankAccountNo = bankAccountNo;
	    }

	    public String getBankAccountName() {
	        return bankAccountName;
	    }

	    public void setBankAccountName(String bankAccountName) {
	        this.bankAccountName = bankAccountName;
	    }

	    public String getBankBanch() {
	        return bankBanch;
	    }

	    public void setBankBanch(String bankBanch) {
	        this.bankBanch = bankBanch;
	    }

	    public String getBillAddress() {
	        return billAddress;
	    }

	    public void setBillAddress(String billAddress) {
	        this.billAddress = billAddress;
	    }

	    public String getMail() {
	        return mail;
	    }

	    public void setMail(String mail) {
	        this.mail = mail;
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStringVat() {
			return stringVat;
		}

		public void setStringVat(String stringVat) {
			this.stringVat = stringVat;
		}

		public String getBankaccount() {
			return bankaccount;
		}

		public void setBankaccount(String bankaccount) {
			this.bankaccount = bankaccount;
		}

		public String getFeediscountfromcode() {
			return feediscountfromcode;
		}

		public void setFeediscountfromcode(String feediscountfromcode) {
			this.feediscountfromcode = feediscountfromcode;
		}
}
