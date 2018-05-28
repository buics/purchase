package Purchasing.Purchasing;

import java.util.List;

import org.springframework.data.annotation.Id;

public class PurchaseQuotation {
	@Id
	String id;
	String vendor;
	String contactPerson;
	String postDate;
	String validUntilDate;
	String requiredDate;
	String docDate;
	String buyer;
	String remarks;
	String status;
	
	List<PurchaseQuotationContent> productContent;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}

	public String getValidUntilDate() {
		return validUntilDate;
	}

	public void setValidUntilDate(String validUntilDate) {
		this.validUntilDate = validUntilDate;
	}

	public String getRequiredDate() {
		return requiredDate;
	}

	public void setRequiredDate(String requiredDate) {
		this.requiredDate = requiredDate;
	}

	public String getDocDate() {
		return docDate;
	}

	public void setDocDate(String docDate) {
		this.docDate = docDate;
	}

	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<PurchaseQuotationContent> getProductContent() {
		return productContent;
	}

	public void setProductContent(List<PurchaseQuotationContent> productContent) {
		this.productContent = productContent;
	}
	

}
