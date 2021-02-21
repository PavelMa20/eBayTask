package com.example.eBayTask.data;


import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Product implements Serializable {

    private int epid;
    private int totalActiveQuantity;
    private int totalActiveSellers;
    private ContextData contextData;

    public Product() {
    }

    public int getEpid() {
        return epid;
    }

    public void setEpid(int epid) {
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
