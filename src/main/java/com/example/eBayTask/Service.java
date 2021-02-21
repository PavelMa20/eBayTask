package com.example.eBayTask;


import com.example.eBayTask.data.DocList;
import com.example.eBayTask.data.Item;
import com.example.eBayTask.data.Product;

import java.util.List;


@org.springframework.stereotype.Service
public class Service {


    public List<DocList> transform(List<DocList> source){

        for(DocList src : source){

          Product product =  src.getProduct();
          int epId = product.getEpid();
          if (!(Integer.valueOf(epId)==null)) {
              String idArray = Integer.toString(epId);
              char[] charIdArray = idArray.toCharArray();
              charIdArray[0] = 9;
              charIdArray[1] = 9;
              product.setEpid(Integer.parseInt(charIdArray.toString()));
          }
          if((Integer.valueOf(product.getTotalActiveQuantity()) != null) &&
                  (Integer.valueOf(product.getTotalActiveSellers()) !=null)){
              if (product.getContextData()!=null){
                  if((Boolean.valueOf(product.getContextData().isContextAsSeller())!=null) &&
                          (Boolean.valueOf(product.getContextData().isContextAsSite())!=null)){
                     if(product.getContextData().getContextCondition().equals("NEW")){
                        String condition =  product.getContextData().getContextCondition();
                        condition = "USED";
                        product.getContextData().setContextCondition(condition);
                     }
                  }
              }
          }
            List<Item> items = src.getList();

          if (items != null || (items.get(items.size()-1)).equals(" ") || (items.get(items.size()-2)).equals(null)){
          }
          src.setProduct(product);

        }

        return source;
    }
}
