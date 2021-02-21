package com.example.eBayTask.data;

import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class Root  {

    private List<DocList> list;


    public List<DocList> getList() {
        return list;
    }

    public void setList(List<DocList> list) {
        this.list = list;
    }
}
