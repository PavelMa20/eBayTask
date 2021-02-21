package com.example.eBayTask;


import com.example.eBayTask.data.DocList;
import com.example.eBayTask.data.Root;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/")
public class Controller {

    @Autowired
    Service service;

    @PostMapping(value = "/transform", produces = { "application/json" })
    public ResponseEntity<List<DocList>> changeConstruction(@RequestBody Root root) throws JsonProcessingException {
       // ObjectMapper mapper = new ObjectMapper();
      //DocList[] docLists = mapper.readValue(json, DocList[].class);


            List<DocList> docList =   service.transform(root.getList());

        return ResponseEntity.ok(docList);

    }
}
