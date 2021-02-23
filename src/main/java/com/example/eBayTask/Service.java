package com.example.eBayTask;


import com.example.eBayTask.data.*;
import com.example.eBayTask.dataOutput.AccountManagerStatistics;
import com.example.eBayTask.dataOutput.ConditionSummary;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@org.springframework.stereotype.Service
public class Service {


    public Map<String, AccountManagerStatistics> getResultMap() throws IOException {


        Root root = getRoot("DocsConditionNew.json");

        root.getDocList().addAll(getRoot("DocsConditionUsed.json").getDocList());

        Map<String, AccountManagerStatistics> result = new HashMap<>();
        for (DocList list : root.getDocList()) {
            Product product = list.getProduct();
            if (product.getTotalActiveQuantity() > 5 || product.getTotalActiveSellers() > 3) {

                ContextData contextData = product.getContextData();
                String contextCondition = contextData.getContextCondition();
                ConditionSummary conditionSummary = new ConditionSummary();
                conditionSummary.setContextAsSeller(contextData.isContextAsSeller());
                conditionSummary.setContextAsSite(contextData.isContextAsSite());
                conditionSummary.setEpid(product.getEpid());

                for (Item item : list.getItems()) {
                    String accountManager = item.getAccountManager();
                    AccountManagerStatistics accountManagerStatistics;
                    if (result.containsKey(accountManager)) {
                        accountManagerStatistics = result.get(accountManager);
                    } else {
                        accountManagerStatistics = new AccountManagerStatistics();
                        accountManagerStatistics.setFullName(accountManager);

                        result.put(accountManager, accountManagerStatistics);
                    }

                    Map<String, List<ConditionSummary>> conditionMap = accountManagerStatistics.getMap();
                    if (conditionMap.containsKey(contextCondition)) {
                        conditionMap.get(contextCondition).add(conditionSummary);
                    } else {
                        List<ConditionSummary> conditionList = new ArrayList<>();
                        conditionList.add(conditionSummary);
                        conditionMap.put(contextCondition, conditionList);
                    }
                }
            }
        }
        return result;
    }

    private Root getRoot(String resourceName) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(resourceName);
        Root root = mapper.readValue(inputStream, Root.class);
        return root;
    }
}
