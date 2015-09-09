package com.manisharana.pubsub;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by manisharana on 09/09/15.
 */
public class PubSubLibraryTest extends TestCase {

    public void shouldTestPubSubLibrary(){

        Subscriber manisha = new Subscriber("Manisha");
        Subscriber k3 = new Subscriber("K3");

        AAPLStocks aaplStocks = new AAPLStocks(1000);
        IBMStocks ibmStocks = new IBMStocks(2000);
        k3.addSubscribers(aaplStocks);
        manisha.addSubscribers(ibmStocks);
        k3.addSubscribers(ibmStocks);


        aaplStocks.changeObservedValue(500);
        ibmStocks.changeObservedValue(1500);


    }
}