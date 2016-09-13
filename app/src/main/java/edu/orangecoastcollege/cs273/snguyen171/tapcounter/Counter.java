package edu.orangecoastcollege.cs273.snguyen171.tapcounter;

/**
 * Created by Nick on 9/13/2016.
 */
public class Counter {

    private int counter;
    private int totalCount;

    public Counter(){
        counter = 0;
    }

    public int getCounter() {return counter; }

    public int getTotalCount() {return totalCount; }

    public void setCounter(int counter){
        this.counter = counter;
        recalculateCounter();
    }

    private void recalculateCounter()
    {
        totalCount = totalCount + counter;
    }

}
