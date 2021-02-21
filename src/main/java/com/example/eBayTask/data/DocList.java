package com.example.eBayTask.data;


import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
public class DocList implements Serializable {

    public Product product;
    public List<Item> list;


    public DocList() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Item> getList() {
        return list;
    }

    public void setList(List<Item> list) {
        this.list = list;
    }
}
