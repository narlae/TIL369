package TIL369;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public ArrayList<Integer> mergeSplitFunc(ArrayList<Integer> dataList) {
        if (dataList.size() <= 1) {
            return dataList;
        }
        int medium = dataList.size()/2;
        ArrayList<Integer> leftArr = new ArrayList<>();
        ArrayList<Integer> rightArr = new ArrayList<>();

        leftArr = this.mergeSplitFunc(new ArrayList<Integer>(dataList.subList(0, medium)));
        rightArr = this.mergeSplitFunc(new ArrayList<Integer>(dataList.subList(medium, dataList.size())));

        return this.mergeFunc(leftArr, rightArr);
    }

    public ArrayList<Integer> mergeFunc(ArrayList<Integer> leftList, ArrayList<Integer> rightList) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        int leftPoint = 0;
        int rightPoint = 0;

        while(leftList.size()>leftPoint&&rightList.size()>rightPoint){
            if(leftList.get(leftPoint)>rightList.get(rightPoint)){
                mergedList.add(rightList.get(rightPoint));
                rightPoint += 1;
            }else{
                mergedList.add(leftList.get(leftPoint));
                leftPoint += 1;
            }
        }

        while(leftList.size()>leftPoint){
            mergedList.add(leftList.get(leftPoint));
            leftPoint += 1;
        }

        while(rightList.size()>rightPoint){
            mergedList.add(rightList.get(rightPoint));
            rightPoint += 1;
        }

        return mergedList;
    }


    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<Integer>();

        for (int index = 0; index < 100; index++) {
            testData.add((int)(Math.random() * 100));
        }

        MergeSort ms = new MergeSort();
        System.out.println(ms.mergeSplitFunc(testData));
    }
}
