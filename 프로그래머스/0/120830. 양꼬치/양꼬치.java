class Solution {
    public int solution(int n, int k) {
        
        // 양꼬치 n 음료수 k
        // 서비스로 받은 음료수는 모두 마심
        // n 10개당 k 하나씩 빼주기
        int serviceDrink = n / 10;
        k -= serviceDrink;
        
        // k가 음수가 되는 경우에는 음료수값 무시처리
        if(k < 0){
            return n * 12000;
        }else{
            return ((n * 12000) + (k * 2000));
        }
    }
}