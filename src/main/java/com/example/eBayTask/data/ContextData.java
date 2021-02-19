package com.example.eBayTask.data;

import org.springframework.stereotype.Component;

@Component
public class ContextData {

    private boolean contextAsSite ;
    private boolean contextAsSeller ;
    private String contextCondition ;

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
