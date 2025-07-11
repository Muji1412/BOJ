import java.math.*;

class Solution {
    public int solution(int num1, int num2) {
        
        // 더블 말고 빅데시미컬.. 써보기?
        BigDecimal a = BigDecimal.valueOf(num1);
        BigDecimal b = BigDecimal.valueOf(num2);
        
        // a / b = divide 쓰기, b를 나누고, 10자리에서 소수점 반올림
        BigDecimal c = a.divide(b, 10, RoundingMode.HALF_UP);  
        
        // 1000 먼저 곱하고 int로 변환
        int answer = c.multiply(BigDecimal.valueOf(1000)).intValue();
        return answer;
    }
}