class Solution {
    public int clumsy(int n) {
        // Stack<Integer> st = new Stack<>();
        int count=n;
        // for(int i =1;i<=n;i++){
        //     st.push(i);
        // }
        // int count=0;
        // while(st.size()>1){
        //     System.out.println(st);
        if(n==1){
            return 1;
        }
        if(n==4){
            return 7;
        }
        if(n==3){
            return 6;
        }
        if(n==2){
            return 2;
        }
        if(count%4==0){
           return n+1;
        }
        if(count%4==1){
            return n+2;
        }
        if(count%4==2){
            return n+2;
        }
        if(count%4==3){
           return n-1;
        }
        return 0;
    }
}