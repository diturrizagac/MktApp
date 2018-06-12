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
public class Adviser extends User implements Serializable{
    private String role_job;

    public Adviser() {
    }

    public String getRole_job() {
        return role_job;
    }

    public void setRole_job(String role_job) {
        this.role_job = role_job;
    }
}
