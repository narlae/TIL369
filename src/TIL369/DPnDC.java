package TIL369;

public class DPnDC {

    //Divide and Conquer
    public int fibonacci(int n) {
        if(n<=1)
            return n;
        return fibonacci(n-1)+ fibonacci(n-2);
    }

    //Dynamic Programming. 중복계산X로 시간복잡도에서 이득을 취하면서 공간복잡도를 희생시킨다.
    public int fibonacci2(int n) {
        Integer[] cache = new Integer[n + 1];
        cache[0] = 0;
        cache[1] = 1;
        for (int i = 2; i < n+1; i++) {
            cache[i] = cache[i-1] + cache[i-2];
        }
        return cache[n];
    }

    public static void main(String[] args) {
        DPnDC object = new DPnDC();
        System.out.println("object.fibonacci(10) = " + object.fibonacci(10));
        System.out.println("object.fibonacci2(10) = " + object.fibonacci2(10));
    }
}
