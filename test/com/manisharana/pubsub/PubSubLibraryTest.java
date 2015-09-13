package com.manisharana.pubsub;

import org.junit.Test;

/**
 * Created by manisharana on 13/09/15.
 */
public class PubSubLibraryTest {

    @Test
    public void shouldTestPubSubLibrary(){

        Client manisha = new Client("Manisha");
        Client k3 = new Client("K3");

        AAPLStocks aaplStocks = new AAPLStocks(1000);
        IBMStocks ibmStocks = new IBMStocks(2000);

        aaplStocks.addSubscribers(manisha);
        aaplStocks.addSubscribers(k3);

        ibmStocks.addSubscribers(manisha);

        aaplStocks.changeObservedValue(500);
        ibmStocks.changeObservedValue(1500);

        aaplStocks.removeSubscribers(manisha);

        aaplStocks.changeObservedValue(2000);
        ibmStocks.changeObservedValue(1000);
    }
}