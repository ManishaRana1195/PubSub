package com.manisharana.pubsub;

/**
 * Created by manisharana on 08/09/15.
 */
public interface Topic {

    // class implementing Publisher interface must override toString(), equals, hashcode methods

     void changeObservedValue(float newObservedValue);
     void setObservedValue(float newObservedValue);
}
