/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TheBusiness.WorkOrderQueue;

import TheBusiness.Enterprise.Enterprise;
import TheBusiness.Network.StateNetwork;
import TheBusiness.OrderManagement.Order;
import TheBusiness.Organization.ClinicOrganization;
import TheBusiness.UserAccountManagement.UserAccount;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author karthik
 */

//WorkRequest for Provision of vaccine Orders
//Initializing class ProviderOrderRequest extends WorkRequest
public class ProviderOrderRequest extends WorkRequest{
    
    private Order orderVaccine;
    private Date deliDate;
    private boolean halfmonthContract;
    private boolean fullMonthContract;
    private boolean asReq;
    private boolean approvedByLHD;
    private boolean approvedByCDC;
    private Enterprise enterprise;
    private UserAccount lhdApprovedBy;
    private UserAccount cdcApprovedBy;
    private StateNetwork reqState;
    private boolean clinicOrder;
    private ClinicOrganization clinicOrganization;
    
    public ProviderOrderRequest() {
        orderVaccine = new Order();
        this.setRequestDate(new Date());
        clinicOrder = false;
    }

    public boolean isClinicOrder() {
        return clinicOrder;
    }

    public void setClinicOrder(boolean clinicOrder) {
        this.clinicOrder = clinicOrder;
    }

    public ClinicOrganization getClinicOrganization() {
        return clinicOrganization;
    }

    public void setClinicOrganization(ClinicOrganization clinicOrganization) {
        this.clinicOrganization = clinicOrganization;
    }
    
    
    
    public StateNetwork getreqState() {
        return reqState;
    }

    public void setreqState(StateNetwork reqState) {
        this.reqState = reqState;
    }
    
    

    public UserAccount getPhdApprovedBy() {
        return lhdApprovedBy;
    }

    public void setPhdApprovedBy(UserAccount lhdApprovedBy) {
        this.lhdApprovedBy = lhdApprovedBy;
    }

    public UserAccount getCdcApprovedBy() {
        return cdcApprovedBy;
    }

    public void setCdcApprovedBy(UserAccount cdcApprovedBy) {
        this.cdcApprovedBy = cdcApprovedBy;
    }
    
    public void calculateDeliveryDate(ProviderOrderRequest request){
        
        if(request.asReq)
        {
            return;
        }
        
        Date requestDate = request.getRequestDate();
        Calendar cal = Calendar.getInstance();
        cal.setTime(requestDate);      
       
        if(request.halfmonthContract)
            cal.add(Calendar.DATE, 15);
        if(request.fullMonthContract)
            cal.add(Calendar.DATE, 30);
        
        requestDate = cal.getTime();
        
        request.setdeliDate(requestDate);
        
        
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Order getVaccineOrder() {
        return orderVaccine;
    }

    public void setVaccineOrder(Order orderVaccine) {
        this.orderVaccine = orderVaccine;
    }

    public Date getdeliDate() {
        return deliDate;
    }

    public void setdeliDate(Date deliDate) {
        this.deliDate = deliDate;
    }

    public boolean ishalfmonthContract() {
        return halfmonthContract;
    }

    public void setHalfmonthContract(boolean halfmonthContract) {
        this.halfmonthContract = halfmonthContract;
    }

    public boolean isfullMonthContract() {
        return fullMonthContract;
    }

    public void setfullMonthContract(boolean fullMonthContract) {
        this.fullMonthContract = fullMonthContract;
    }

    public boolean isasReq() {
        return asReq;
    }

    public void setasReq(boolean asReq) {
        this.asReq = asReq;
    }

    public boolean isApprovedByLHD() {
        return approvedByLHD;
    }

    public void setApprovedByLHD(boolean approvedByLHD) {
        this.approvedByLHD = approvedByLHD;
    }

    public boolean isApprovedByCDC() {
        return approvedByCDC;
    }

    public void setApprovedByCDC(boolean approvedByCDC) {
        this.approvedByCDC = approvedByCDC;
    }

    @Override
    public String toString() {
        return String.valueOf(orderVaccine.getOrderNumber());
    }
 
}
