package Purchasing.Purchasing;

import org.springframework.data.annotation.Id;

public class PurchaseQuotationContent {

	@Id
	String productNum;
	String requiredDate;
	String qoutedDate;
	String requiredQuantity;
	String quotedQuantity;
	String unitPrice;
	
	public String getProductNum() {
		return productNum;
	}
	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}
	public String getRequiredDate() {
		return requiredDate;
	}
	public void setRequiredDate(String requiredDate) {
		this.requiredDate = requiredDate;
	}
	public String getQoutedDate() {
		return qoutedDate;
	}
	public void setQoutedDate(String qoutedDate) {
		this.qoutedDate = qoutedDate;
	}
	public String getRequiredQuantity() {
		return requiredQuantity;
	}
	public void setRequiredQuantity(String requiredQuantity) {
		this.requiredQuantity = requiredQuantity;
	}
	public String getQuotedQuantity() {
		return quotedQuantity;
	}
	public void setQuotedQuantity(String quotedQuantity) {
		this.quotedQuantity = quotedQuantity;
	}
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	

}
