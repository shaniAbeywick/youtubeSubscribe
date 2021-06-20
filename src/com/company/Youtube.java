package com.company;

public class Youtube {

    public static void main(String[] args) {
          Channel my_channel = new Channel();
          Subscriber s1 = new Subscriber("shani");
          Subscriber s2 = new Subscriber("Akumi");

          my_channel.subscribe(s1);
          my_channel.subscribe(s2);

         // my_channel.unSubscribe(s2);

          s1.subscribeChannel(my_channel);
          s2.subscribeChannel(my_channel);

          my_channel.upload("Learn java design patterns");



    }
}
