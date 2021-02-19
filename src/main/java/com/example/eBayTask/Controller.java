package com.example.eBayTask;


import com.example.eBayTask.data.DocList;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class Controller {

    @Autowired
    Service service;

    @PostMapping(value = "/transform", produces = { "application/json" })
    public ResponseEntity<DocList[]> changeConstruction(@RequestBody String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        DocList[] docLists = mapper.readValue(json, DocList[].class);

  DocList[] transform =   service.transform(docLists);

        return  ResponseEntity.ok(transform);

    }
}
