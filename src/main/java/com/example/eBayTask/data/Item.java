package com.example.eBayTask.data;

import org.springframework.stereotype.Component;

import java.io.Serializable;


@Component
public class Item implements Serializable {

    public String accountManager;

    public Item() {
    }

    public String getAccountManager() {
        return accountManager;
    }

    public void setAccountManager(String accountManager) {
        this.accountManager = accountManager;
    }
}
