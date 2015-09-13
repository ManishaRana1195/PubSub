package com.manisharana.pubsub;

/**
 * Created by manisharana on 08/09/15.
 */
public interface ISubscriber {
    void notifyObserver(Topic topic, Float stockValue);
}
