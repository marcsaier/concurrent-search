package concurrentsearch;

import java.util.ArrayList;

public class SearchThread extends Thread {
    private ArrayList<Integer> list;
    private int start, end, value;
    private int count = 0;
    private ArrayList<Integer> indices = new ArrayList<>();


    public SearchThread(ArrayList<Integer> list, int start, int end, int value) {
        this.list = list;
        this.start = start;
        this.end = end;
        this.value = value;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            if (list.get(i) == value) {
                count++;
                indices.add(i);
            }
        }
    }

    public int getCount() {
        return count;
    }
    public ArrayList<Integer> getIndices() {
        return indices;
    }
}