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
    
    private String email_adviser;
    private String mobile;
    private String name_account;
    private String name_combo;
    private String pay_method;
    
    public Account() {
    }

    public String getEmail_adviser() {
        return email_adviser;
    }

    public void setEmail_adviser(String email_adviser) {
        this.email_adviser = email_adviser;
    }
    
    public String getName_account() {
        return name_account;
    }

    public void setName_account(String name_account) {
        this.name_account = name_account;
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
