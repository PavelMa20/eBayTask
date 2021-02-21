package com.example.eBayTask;


import com.example.eBayTask.data.DocList;
import com.example.eBayTask.data.Root;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/")
public class Controller {

   private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @PostMapping(value = "/transform", produces = { "application/json" })
    public ResponseEntity<List<DocList>> changeConstruction(@RequestBody String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Root root = mapper.readValue(json,Root.class);



            List<DocList> docList =   service.transform(root.getList());

        return ResponseEntity.ok(docList);

    }
}
