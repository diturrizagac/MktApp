/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mktApp.entity;
import java.io.Serializable;

/**
 *
 * @author DIEGO
 */
public class Potential extends User implements Serializable{
    
    
    private String name_adviser;
    private String mobile;
    private String name_company;
    private String call_status;
    private String interest;
    private String customer_status;

    public Potential() {
    }

    public String getName_adviser() {
        return name_adviser;
    }

    public void setName_adviser(String name_adviser) {
        this.name_adviser = name_adviser;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName_company() {
        return name_company;
    }

    public void setName_company(String name_company) {
        this.name_company = name_company;
    }

    public String getCall_status() {
        return call_status;
    }

    public void setCall_status(String call_status) {
        this.call_status = call_status;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getCustomer_status() {
        return customer_status;
    }

    public void setCustomer_status(String customer_status) {
        this.customer_status = customer_status;
    }

}
