package com.example.eBayTask.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;


@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContextData  {

    private boolean contextAsSite ;
    private boolean contextAsSeller ;
    private String contextCondition ;

    public ContextData() {
    }

    public ContextData(boolean contextAsSite, boolean contextAsSeller, String contextCondition) {
        this.contextAsSite = contextAsSite;
        this.contextAsSeller = contextAsSeller;
        this.contextCondition = contextCondition;
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
