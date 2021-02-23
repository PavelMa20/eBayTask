package com.example.eBayTask.dataOutput;


import org.springframework.stereotype.Component;

@Component
public class ConditionSummary {

    private String epid;
    Boolean contextAsSite;
    Boolean contextAsSeller;

    public String getEpid() {
        return epid;
    }

    public void setEpid(String epid) {
        this.epid = epid;
    }

    public Boolean getContextAsSite() {
        return contextAsSite;
    }

    public void setContextAsSite(Boolean contextAsSite) {
        this.contextAsSite = contextAsSite;
    }

    public Boolean getContextAsSeller() {
        return contextAsSeller;
    }

    public void setContextAsSeller(Boolean contextAsSeller) {
        this.contextAsSeller = contextAsSeller;
    }
}
