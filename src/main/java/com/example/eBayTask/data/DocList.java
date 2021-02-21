package com.example.eBayTask.data;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocList {

    private Product product;
    private List<Item> list;


    public DocList() {
    }

    public DocList(Product product, List<Item> list) {
        this.product = product;
        this.list = list;
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
