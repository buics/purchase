package Purchasing.Purchasing;

import java.util.List;

public class PurchaseOrderDetail {
	
	int quantity;
	String taxCode;
	double total;
	String status;
	List<Product> productOrderList;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Product> getProductOrderList() {
		return productOrderList;
	}
	public void setProductOrderList(List<Product> productOrderList) {
		this.productOrderList = productOrderList;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTaxCode() {
		return taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

}
