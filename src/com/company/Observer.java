package com.company;

public interface Observer {
    void update();

    void subscribeChannel(Channel ch);
}
