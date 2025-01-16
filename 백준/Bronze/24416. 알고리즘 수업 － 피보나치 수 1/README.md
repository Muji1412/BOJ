# [Bronze I] 알고리즘 수업 - 피보나치 수 1 - 24416 

[문제 링크](https://www.acmicpc.net/problem/24416) 

### 성능 요약

메모리: 18396 KB, 시간: 196 ms

### 분류

다이나믹 프로그래밍, 수학

### 제출 일자

2025년 1월 16일 14:15:22

### 문제 설명

<p style="user-select: auto !important;">오늘도 서준이는 동적 프로그래밍 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.</p>

<p style="user-select: auto !important;">오늘은 <em style="user-select: auto !important;">n</em>의 피보나치 수를 재귀호출과 동적 프로그래밍으로 구하는 알고리즘을 배웠다. 재귀호출에 비해 동적 프로그래밍이 얼마나 빠른지 확인해 보자. 아래 의사 코드를 이용하여 <em style="user-select: auto !important;">n</em>의 피보나치 수를 구할 경우 코드1 코드2 실행 횟수를 출력하자.</p>

<p style="user-select: auto !important;">피보나치 수 재귀호출 의사 코드는 다음과 같다.</p>

<pre style="user-select: auto !important;">fib(n) {
    if (n = 1 or n = 2)
    then return 1;  # 코드1
    else return (fib(n - 1) + fib(n - 2));
}</pre>

<p style="user-select: auto !important;">피보나치 수 동적 프로그래밍 의사 코드는 다음과 같다.</p>

<pre style="user-select: auto !important;">fibonacci(n) {
    f[1] <- f[2] <- 1;
    for i <- 3 to n
        f[i] <- f[i - 1] + f[i - 2];  # 코드2
    return f[n];
}</pre>

### 입력 

 <p style="user-select: auto !important;">첫째 줄에 <i style="user-select: auto !important;">n</i>(5 ≤ <em style="user-select: auto !important;">n</em> ≤ 40)이 주어진다.</p>

### 출력 

 <p style="user-select: auto !important;">코드1 코드2 실행 횟수를 한 줄에 출력한다.</p>

