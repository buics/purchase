package Purchasing.Purchasing;

import java.util.List;

import org.springframework.data.annotation.Id;

public class ProjectPurchasing {

	@Id
	String id;
	String projectName;
	String projectDescription;
	
	List <PurchaseQuotation> projectPQs;
	List <PurchaseOrder> projectPOs;
	List <ReceivingReportPO> projectRRPO;
	List <InvoiceAP> projectIAP;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public List<PurchaseQuotation> getProjectPQs() {
		return projectPQs;
	}
	public void setProjectPQs(List<PurchaseQuotation> projectPQs) {
		this.projectPQs = projectPQs;
	}
	public List<PurchaseOrder> getProjectPOs() {
		return projectPOs;
	}
	public void setProjectPOs(List<PurchaseOrder> projectPOs) {
		this.projectPOs = projectPOs;
	}
	public List<ReceivingReportPO> getProjectRRPO() {
		return projectRRPO;
	}
	public void setProjectRRPO(List<ReceivingReportPO> projectRRPO) {
		this.projectRRPO = projectRRPO;
	}
	public List<InvoiceAP> getProjectIAP() {
		return projectIAP;
	}
	public void setProjectIAP(List<InvoiceAP> projectIAP) {
		this.projectIAP = projectIAP;
	}
	
	
	
}
