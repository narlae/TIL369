package TIL369;

import java.util.ArrayList;

public class RecursiveCall {

    public int factorial1(int n) {
        if(n>1){
            return n * this.factorial1(n-1);
        }else{
            return 1;
        }
    }

    public int factorial2(int n) {
        if(n<=1){
            return 1;
        } else{
            return n * this.factorial2(n - 1);
        }
    }

    public int factorial3(int num) {
        if(num<=1){
            return num;
        }
        return num * factorial3(num - 1);
    }

    public int factorial4(ArrayList<Integer> dataList) {
        if(dataList.size()<=0){
            return 0;
        }
        return dataList.get(0) + this.factorial4(new ArrayList<Integer>(dataList.subList(1,dataList.size())));
    }

    public int factorial5(int num) {
        if(num==1){
            return 1;
        }else if(num==2){
            return 2;
        }else if(num==3){
            return 4;
        }
        return this.factorial5(num-1)+ this.factorial5(num-2) + this.factorial5(num-3);
    }



    public static void main(String[] args) {
        RecursiveCall rc = new RecursiveCall();
        int result = rc.factorial2(5);
        System.out.println(result);

        ArrayList<Integer> testData = new ArrayList();
        for (int data = 0; data < 10; data++) {
            testData.add(data);
        }
        System.out.println("rc.factorial4(testData) = " + rc.factorial4(testData));

        System.out.println("rc.factorial5(5) = " + rc.factorial5(5));

    }
}
