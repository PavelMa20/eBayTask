package com.example.eBayTask.data;

import org.springframework.stereotype.Component;

@Component
public class Item {

    private String accountManager;

    public Item() {
    }

    public String getAccountManager() {
        return accountManager;
    }

    public void setAccountManager(String accountManager) {
        this.accountManager = accountManager;
    }
}
