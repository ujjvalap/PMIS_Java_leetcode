class Solution {
    public int countDigits(int num) {
        int n=num;
        int count=0;
        if(num==0 ||num==1) return 1;
        while(n!=0)
        {
            if(num%(n%10)==0) count++;
            n/=10;
        }
        return count;
    }
}