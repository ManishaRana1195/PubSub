package com.manisharana.pubsub;

/**
 * Created by manisharana on 08/09/15.
 */
public interface ISubscriber {
    void addSubscribers(Topic topic);
    void removeSubscribers(Topic topic);
    String notifyObserver(Topic topic);
}
