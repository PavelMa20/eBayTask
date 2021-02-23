package com.example.eBayTask.data;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;



@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {

    private String epid;
    private int totalActiveQuantity;
    private int totalActiveSellers;
    private ContextData contextData;

    public Product() {
    }

    public Product(String epid, int totalActiveQuantity, int totalActiveSellers, ContextData contextData) {
        this.epid = epid;
        this.totalActiveQuantity = totalActiveQuantity;
        this.totalActiveSellers = totalActiveSellers;
        this.contextData = contextData;
    }

    public String getEpid() {
        return epid;
    }

    public void setEpid(String epid) {
        this.epid = epid;
    }

    public int getTotalActiveQuantity() {
        return totalActiveQuantity;
    }

    public void setTotalActiveQuantity(int totalActiveQuantity) {
        this.totalActiveQuantity = totalActiveQuantity;
    }

    public int getTotalActiveSellers() {
        return totalActiveSellers;
    }

    public void setTotalActiveSellers(int totalActiveSellers) {
        this.totalActiveSellers = totalActiveSellers;
    }

    public ContextData getContextData() {
        return contextData;
    }

    public void setContextData(ContextData contextData) {
        this.contextData = contextData;
    }
}
