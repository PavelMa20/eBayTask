package com.example.eBayTask.dataOutput;


import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class AccountManagerStatistics {
    private String fullName;
    private Map<String, List<ConditionSummary>> map = new HashMap<>();



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Map<String, List<ConditionSummary>> getMap() {
        return map;
    }


}
