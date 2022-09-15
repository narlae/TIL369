package TIL369;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {

    public ArrayList<Integer> sort(ArrayList<Integer> datalist){
        int lowest;
        for (int i = 0; i < datalist.size()-1; i++) {
            lowest = i;

            for (int j = i+1; j < datalist.size(); j++) {
                if(datalist.get(j)<datalist.get(lowest)){
                    lowest = j;
                }
            }
            Collections.swap(datalist,i,lowest);
        }
        return datalist;
    }




    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            testData.add((int)(Math.random() * 100));
        }
        SelectionSort sSort = new SelectionSort();
        sSort.sort(testData);
        System.out.println(testData);
    }
}
