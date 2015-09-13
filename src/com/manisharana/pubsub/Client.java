package com.manisharana.pubsub;

/**
 * Created by manisharana on 09/09/15.
 */
public class Client implements ISubscriber {
    String subscriberName ;

    public Client(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void notifyObserver(Topic topic, Float stockValue) {
       System.out.println( this +" -- "+ topic.toString()+" stock value has changed to "+stockValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client that = (Client) o;

        return subscriberName.equals(that.subscriberName);

    }

    @Override
    public int hashCode() {
        return subscriberName.hashCode();
    }

    @Override
    public String toString() {
        return "subscriberName='" + subscriberName;
    }
}
