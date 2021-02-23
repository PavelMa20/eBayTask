package com.example.eBayTask;


import com.example.eBayTask.data.DocList;
import com.example.eBayTask.data.Root;
import com.example.eBayTask.dataOutput.AccountManagerStatistics;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/statistic")
public class Controller {

   private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping(value = "/{accountManager}", produces = { "application/json" })
    public AccountManagerStatistics changeConstruction(@PathVariable String accountManager) throws IOException {

                 Map<String, AccountManagerStatistics> resultMap = service.getResultMap();

             return resultMap.getOrDefault(accountManager,null);





    }
}
