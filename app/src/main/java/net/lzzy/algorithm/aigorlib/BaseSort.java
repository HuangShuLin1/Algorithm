package net.lzzy.algorithm.aigorlib;

/**
 * Created by lzzy_gxy on 2019/6/15.
 * Description:
 */

public abstract class BaseSort<T extends Comparable<? super T>> {

    T[] items;
    private long duration;
    int compareCount;
    int swapCount;
    int moveStep;

    BaseSort(T[] items) {
        this.items=items;
        compareCount = 0;
        swapCount = 0;
        moveStep = 0;

    }

    boolean bigger(T a, T b) {
        compareCount++;
        return a.compareTo(b) > 0;
    }
    public  void sortTime(){
        long start = System.currentTimeMillis();
        Sort();
        duration = System.currentTimeMillis() - start;
    }
    public abstract void Sort();

    void swap(int i, int j) {
        T tmp = items[i];
        items[i] = items[j];
        items[j] = tmp;
        swapCount++;
    }

    public String getResult() {
        String display = "";
        for (T i : items) {
            display = display.concat(i + ",");

        }
        return display.substring(0, display.length() - 1);
    }
    public long getDuration() {
        return duration;
    }
    public int getCompareCount() {
        return compareCount;
    }
}