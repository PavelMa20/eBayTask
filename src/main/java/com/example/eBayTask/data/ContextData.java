package com.example.eBayTask.data;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class ContextData implements Serializable {

    public boolean contextAsSite ;
    public boolean contextAsSeller ;
    public String contextCondition ;

    public ContextData() {
    }

    public boolean isContextAsSite() {
        return contextAsSite;
    }

    public void setContextAsSite(boolean contextAsSite) {
        this.contextAsSite = contextAsSite;
    }

    public boolean isContextAsSeller() {
        return contextAsSeller;
    }

    public void setContextAsSeller(boolean contextAsSeller) {
        this.contextAsSeller = contextAsSeller;
    }

    public String getContextCondition() {
        return contextCondition;
    }

    public void setContextCondition(String contextCondition) {
        this.contextCondition = contextCondition;
    }
}
