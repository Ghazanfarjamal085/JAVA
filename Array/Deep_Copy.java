import java.util.Arrays;
public class Deep_Copy {
    public static void main(String[] args) {
        int [] arr = {12,89,45,90};
        int [] deep = Arrays.copyOf(arr,arr.length);
        System.out.println(deep[3]);
        deep[3]=450000;
        System.out.println(deep[3]);
    }
}
