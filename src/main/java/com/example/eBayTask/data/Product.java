package com.example.eBayTask.data;


import org.springframework.stereotype.Component;

@Component
public class Product {

    private int epId;
    private int totalActiveQuantity;
    private int totalActiveSellers;
    private ContextData contextData;

    public Product() {
    }

    public int getEpId() {
        return epId;
    }

    public void setEpId(int epId) {
        this.epId = epId;
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
