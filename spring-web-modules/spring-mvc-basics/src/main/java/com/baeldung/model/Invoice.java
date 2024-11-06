package com.baeldung.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Invoice {

    private String concept;
    private Integer quantity;
    private Double retention;

    public Invoice() { super(); }

    public Invoice(final String concept, final Integer quantity, final Double retention) {
        this.concept = concept;
        this.quantity = quantity;
        this.retention = retention;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(final String concept) {
        this.concept = concept;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
    }

    public Double getRetention() {
        //return quantity - (quantity * retention / 100.0);
        return retention;
    }

    public void setRetention(final Double retention) {
        this.retention = retention;
    }

    public Double calculateTotalWithRetention() {
        return quantity - (quantity * retention / 100.0);
    }

    @Override
    public String toString() {
        return "Invoice [concept=" + concept + ", quantity=" + quantity + ", retention=" + retention + "]";
    }

}
