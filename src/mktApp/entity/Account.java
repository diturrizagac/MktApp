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
public class Account extends User implements Serializable{
    
    private String name_adviser;
    private String name_account;
    private String firstname_adviser;
    private String lastname_adviser;
    private String name_combo;
    private String mobile;
    private String pay_method;
    
   
    public Account() {
    }

    public String getName_adviser() {
        return name_adviser;
    }

    public void setName_adviser(String name_adviser) {
        this.name_adviser = name_adviser;
    }
    
    public String getName_account() {
        return name_account;
    }

    public void setName_account(String name_account) {
        this.name_account = name_account;
    }

    public String getFirstname_adviser() {
        return firstname_adviser;
    }

    public void setFirstname_adviser(String firstname_adviser) {
        this.firstname_adviser = firstname_adviser;
    }

    public String getLastname_adviser() {
        return lastname_adviser;
    }

    public void setLastname_adviser(String lastname_adviser) {
        this.lastname_adviser = lastname_adviser;
    }

    public String getName_combo() {
        return name_combo;
    }

    public void setName_combo(String name_combo) {
        this.name_combo = name_combo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPay_method() {
        return pay_method;
    }

    public void setPay_method(String pay_method) {
        this.pay_method = pay_method;
    }
 
}
