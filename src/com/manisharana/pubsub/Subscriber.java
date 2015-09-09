package com.manisharana.pubsub;

/**
 * Created by manisharana on 09/09/15.
 */
public class Subscriber implements ISubscriber {
    String subscriberName ;
    PubSubLibrary pubsub;

    public Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void addSubscribers(Topic topic) {
        pubsub.addSubscribers(topic,this);
    }

    @Override
    public void removeSubscribers(Topic topic) {
        pubsub.removeSubscriber(topic,this);
    }

    @Override
    public String notifyObserver(Topic topic) {
       return  topic.toString()+" stock value for has changed ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subscriber that = (Subscriber) o;

        return subscriberName.equals(that.subscriberName);

    }

    @Override
    public int hashCode() {
        return subscriberName.hashCode();
    }
}
