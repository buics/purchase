package Purchasing.Purchasing;

import java.util.List;

import org.springframework.data.annotation.Id;

public class PurchaseOrder {
	@Id
	String id;
	String vendor;
	String contactPerson;
	String postingDate;
	String deliveryDate;
	String documentDate;
	String buyer;
	String remarks;
	double totalBeforeDiscount;
	double discount;
	double tax;
	double totalPaymentDue;
	String status;
	
	List <PurchaseOrderDetail> purchaseOrderContent;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

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

	public String getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(String postingDate) {
		this.postingDate = postingDate;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getDocumentDate() {
		return documentDate;
	}

	public void setDocumentDate(String documentDate) {
		this.documentDate = documentDate;
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

	public double getTotalBeforeDiscount() {
		return totalBeforeDiscount;
	}

	public void setTotalBeforeDiscount(double totalBeforeDiscount) {
		this.totalBeforeDiscount = totalBeforeDiscount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getTotalPaymentDue() {
		return totalPaymentDue;
	}

	public void setTotalPaymentDue(double totalPaymentDue) {
		this.totalPaymentDue = totalPaymentDue;
	}

	public List<PurchaseOrderDetail> getPurchaseOrderContent() {
		return purchaseOrderContent;
	}

	public void setPurchaseOrderContent(List<PurchaseOrderDetail> purchaseOrderContent) {
		this.purchaseOrderContent = purchaseOrderContent;
	}
	

}
