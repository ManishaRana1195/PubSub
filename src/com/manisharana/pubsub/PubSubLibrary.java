package com.manisharana.pubsub;


import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by manisharana on 08/09/15.
 */
public class PubSubLibrary {

    public ArrayList<ISubscriber> subscriberList = new ArrayList<ISubscriber>();

    HashMap<Topic,ArrayList> registeredSubscribers = new HashMap<Topic, ArrayList>();

    public void addSubscribers(Topic topic , ISubscriber newSubscriber){
        subscriberList = getSubscriberList(topic );
        if(subscriberList.contains(newSubscriber))
            System.out.println(newSubscriber +" has already subscribed to" + topic );
        else {
            subscriberList.add(newSubscriber);
            registeredSubscribers.put(topic, subscriberList);
        }
    }

    public void removeSubscriber(Topic topic , ISubscriber subscriber){
        ArrayList<ISubscriber> subscriberList = getSubscriberList(topic);
        if(subscriberList.contains(subscriber)) {
            subscriberList.remove(subscriber);
            System.out.println(subscriber + " has unregistered from "+ topic);
        }
        else
            System.out.println(subscriber + " has not subscribed to "+topic );

    }

    private ArrayList<ISubscriber> getSubscriberList(Topic topic ) {
        if(registeredSubscribers.containsKey(topic)){
            subscriberList = registeredSubscribers.get(topic);
        }
        return subscriberList;
    }

    public void notifySubscriber(Topic topic,Float stockValue ) {
        subscriberList = getSubscriberList(topic );
        for( ISubscriber subscriber : subscriberList)
            subscriber.notifyObserver(topic, stockValue );
    }

}
