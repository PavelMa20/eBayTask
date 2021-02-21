package com.example.eBayTask.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;



@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {

    public String accountManager;

    public Item() {
    }

    public Item(String accountManager) {
        this.accountManager = accountManager;
    }

    public String getAccountManager() {
        return accountManager;
    }

    public void setAccountManager(String accountManager) {
        this.accountManager = accountManager;
    }
}
