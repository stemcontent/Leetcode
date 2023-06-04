class Solution {
    public int fib(int n) {
         
    //constraints n > 0 and n<=30
    if (n ==0 || n==1){
        return n;
    }
    return fib(n-1)+fib(n-2);
  }
}
