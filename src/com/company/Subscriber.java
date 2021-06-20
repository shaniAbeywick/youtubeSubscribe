package com.company;

public class Subscriber implements Observer {
    private String name;
    private Channel channel= new Channel();


    public Subscriber(String name){
        super();
        this.name =name;
    }
   @Override
   public void update(){
       System.out.println(name+ ": video Uploaded : "  + channel.title);
   }
   @Override
   public  void subscribeChannel(Channel ch){
       channel =ch;
   }
}
