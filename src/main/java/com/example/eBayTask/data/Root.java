package com.example.eBayTask.data;

import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class Root  {

   private List<DocList> docList;

    public List<DocList> getDocList() {
        return docList;
    }

    public void setDocList(List<DocList> docList) {
        this.docList = docList;
    }
}
