package com.manisharana.pubsub;

/**
 * Created by manisharana on 09/09/15.
 */
public class IBMStocks implements Topic {
    float stockValue ;
    String stockName ;
    PubSubLibrary pubsub = new PubSubLibrary();

    public IBMStocks(float stockValue) {
        this.stockValue = stockValue;
        this.stockName = "IBM";
    }


    @Override
    public void addSubscribers(Client subscriber) {
        pubsub.addSubscribers(this,subscriber);
    }

    @Override
    public void removeSubscribers(Client subscriber) {
        pubsub.removeSubscriber(this,subscriber);
    }

    @Override
    public void changeObservedValue(float newObservedValue) {
        if(this.stockValue != newObservedValue) {
            setObservedValue(newObservedValue);
            pubsub.notifySubscriber(this, newObservedValue);
        }
    }

    @Override
    public void setObservedValue(float newObservedValue) {
        this.stockValue = newObservedValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AAPLStocks that = (AAPLStocks) o;

        if (Float.compare(that.stockValue, stockValue) != 0) return false;
        return stockName.equals(that.stockName);

    }

    @Override
    public int hashCode() {
        int result = (stockValue != +0.0f ? Float.floatToIntBits(stockValue) : 0);
        result = 31 * result + stockName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return stockName;
    }
}
