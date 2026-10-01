public class nPr_nCr {
    public static int permu_combi(int n , int r){
        int fact = 1;
        int fact2 = 1;
        int fact3 = 1;
        for (int i = 1 ; i <= n; i++){
            fact*=i;
        }
        for (int j = 1 ; j <= r; j++){
            fact2*=j;
        }
         for (int k = 1 ; k <= (n-r); k++){
            fact3*=k;
        }
        
        int nCr = fact/ (fact3* (fact2));
        System.out.println("The nCr is " + nCr );
        int nPr = fact/ fact3;
        System.out.println("The nPr is " + nPr );
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(permu_combi(6, 3));
    }
}
