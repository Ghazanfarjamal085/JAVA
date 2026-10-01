class calculator{
    int a ;
    public int add(int num1,int num2){
        int r = num1 + num2 ;
        return r;
    }
}

public class object_class {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 6;
        calculator  calc = new calculator(); 
        int result = calc.add(num1,num2);
        System.out.println(result);
    }  
}
