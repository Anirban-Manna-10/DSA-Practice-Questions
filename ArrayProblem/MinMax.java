public class MinMax {
    static class Value{
        Value(int a , int b){
            this.MinValue = a;
            this.MaxValue = b;
        }
        int MinValue;
        int MaxValue;
    }

    public static Value findMinMax(int[] arr){
        int min = arr[0] , max = arr[0];
        for(int i : arr){
            if(i < min){
                min = i;
            }
            if(i > max){
                max = i;
            }
        }
        return new Value(min, max);
    }
}
