package com.example.eBayTask.data;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
public class Root implements Serializable {

    public List<DocList> list;

    public Root() {
    }

    public List<DocList> getList() {
        return list;
    }

    public void setList(List<DocList> list) {
        this.list = list;
    }
}
