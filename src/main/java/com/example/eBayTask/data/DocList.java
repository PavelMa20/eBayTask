package com.example.eBayTask.data;


import org.springframework.stereotype.Component;

@Component
public class DocList {

    private Product product;
    private Item[] items;


    public DocList() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }
}
