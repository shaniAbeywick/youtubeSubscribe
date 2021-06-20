package com.company;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
     private List<Subscriber> subs = new ArrayList<>();
     String title;

     @Override
     public void subscribe(Subscriber sub){
         subs.add(sub);
     }
    @Override
    public void unSubscribe(Subscriber sub){
        subs.remove(sub);
    }
    @Override
    public void notifySubscriber(){
        for(Subscriber sub : subs){
            sub.update();
        }
    }
    @Override
    public void upload(String title){
          this.title= title;
          notifySubscriber();
    }


}
