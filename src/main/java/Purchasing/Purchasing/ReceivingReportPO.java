package Purchasing.Purchasing;

import java.util.List;

public class ReceivingReportPO {

	String batch;
	int quantity;
	String expirationDate;
	String manufacturingDate;
	String admissionDate;
	String Location;
	String details;
	
	List <PurchaseOrder> receivedgoods;

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	public String getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public List<PurchaseOrder> getReceivedgoods() {
		return receivedgoods;
	}

	public void setReceivedgoods(List<PurchaseOrder> receivedgoods) {
		this.receivedgoods = receivedgoods;
	}
	
}
