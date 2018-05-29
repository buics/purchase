package Purchasing.Purchasing;

import java.util.List;

public class InvoiceAP {

	String id;
	String postingDate;
	String deliveryDate;
	String documentDate;
	String remarks;
	double totalBeforeDiscount;
	double discount;
	double tax;
	double totalPaymentDue;
	String status;
	
	
	List <ReceivingReportPO> itemspayable;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
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


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public List<ReceivingReportPO> getItemspayable() {
		return itemspayable;
	}


	public void setItemspayable(List<ReceivingReportPO> itemspayable) {
		this.itemspayable = itemspayable;
	}
	
	
}
