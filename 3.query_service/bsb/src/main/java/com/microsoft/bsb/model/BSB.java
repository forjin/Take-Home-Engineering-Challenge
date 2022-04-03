package com.microsoft.bsb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bsb")
public class BSB implements Serializable {

    @Id
    private String bsb;

    public String getBsb() {
        return bsb;
    }

    public void setBsb(String bsb) {
        this.bsb = bsb;
    }

    private String fi_code;

    public String getFi_code() {
        return fi_code;
    }

    public void setFi_code(String fi_code) {
        this.fi_code = fi_code;
    }

    private String financial_institution;

    public String getFinancial_institution() {
        return financial_institution;
    }

    public void setFinancial_institution(String financial_institution) {
        this.financial_institution = financial_institution;
    }

    private String bsb_address;

    public String getBsb_address() {
        return bsb_address;
    }

    public void setBsb_address(String bsb_address) {
        this.bsb_address = bsb_address;
    }

    private String suburb;

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    private String address_state;

    public String getAddress_state() {
        return address_state;
    }

    public void setAddress_state(String address_state) {
        this.address_state = address_state;
    }

    private String post_code;

    public String getPost_code() {
        return post_code;
    }

    public void setPost_code(String post_code) {
        this.post_code = post_code;
    }

    private String payment_systems;

    public String getPayment_systems() {
        return payment_systems;
    }

    public void setPayment_systems(String payment_systems) {
        this.payment_systems = payment_systems;
    }
}
