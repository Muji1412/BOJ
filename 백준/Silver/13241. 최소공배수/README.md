# [Silver V] 최소공배수 - 13241 

[문제 링크](https://www.acmicpc.net/problem/13241) 

### 성능 요약

메모리: 17648 KB, 시간: 180 ms

### 분류

유클리드 호제법, 수학, 정수론

### 제출 일자

2025년 1월 8일 11:26:24

### 문제 설명

<p style="user-select: auto !important;">정수 B에 0보다 큰 정수인 N을 곱해 정수 A를 만들 수 있다면, A는 B의 배수이다.</p>

<p style="user-select: auto !important;">예:</p>

<ul style="user-select: auto !important;">
	<li style="user-select: auto !important;">10은 5의 배수이다 (5*2 = 10)</li>
	<li style="user-select: auto !important;">10은 10의 배수이다(10*1 = 10)</li>
	<li style="user-select: auto !important;">6은 1의 배수이다(1*6 = 6)</li>
	<li style="user-select: auto !important;">20은 1, 2, 4,5,10,20의 배수이다.</li>
</ul>

<p style="user-select: auto !important;">다른 예:</p>

<ul style="user-select: auto !important;">
	<li style="user-select: auto !important;">2와 5의 최소공배수는 10이고, 그 이유는 2와 5보다 작은 공배수가 없기 때문이다.</li>
	<li style="user-select: auto !important;">10과 20의 최소공배수는 20이다.</li>
	<li style="user-select: auto !important;">5와 3의 최소공배수는 15이다.</li>
</ul>

<p style="user-select: auto !important;">당신은 두 수에 대하여 최소공배수를 구하는 프로그램을 작성 하는 것이 목표이다.</p>

### 입력 

 <p style="user-select: auto !important;">한 줄에 두 정수 A와 B가 공백으로 분리되어 주어진다.</p>

<p style="user-select: auto !important;">50%의 입력 중 A와 B는 1000(10<sup style="user-select: auto !important;">3</sup>)보다 작다. 다른 50%의 입력은 1000보다 크고 100000000(10<sup style="user-select: auto !important;">8</sup>)보다 작다.</p>

<p style="user-select: auto !important;">추가: 큰 수 입력에 대하여 변수를 64비트 정수로 선언하시오. C/C++에서는 long long int를 사용하고, Java에서는 long을 사용하시오.</p>

### 출력 

 <p style="user-select: auto !important;">A와 B의 최소공배수를 한 줄에 출력한다.</p>

