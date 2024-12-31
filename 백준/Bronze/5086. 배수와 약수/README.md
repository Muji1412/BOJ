# [Bronze III] 배수와 약수 - 5086 

[문제 링크](https://www.acmicpc.net/problem/5086) 

### 성능 요약

메모리: 17452 KB, 시간: 176 ms

### 분류

사칙연산, 수학

### 제출 일자

2024년 12월 31일 17:34:44

### 문제 설명

<p style="user-select: auto !important;">4 × 3 = 12이다.</p>

<p style="user-select: auto !important;">이 식을 통해 다음과 같은 사실을 알 수 있다.</p>

<p style="user-select: auto !important;">3은 12의 약수이고, 12는 3의 배수이다.</p>

<p style="user-select: auto !important;">4도 12의 약수이고, 12는 4의 배수이다.</p>

<p style="user-select: auto !important;">두 수가 주어졌을 때, 다음 3가지 중 어떤 관계인지 구하는 프로그램을 작성하시오.</p>

<ol style="user-select: auto !important;">
	<li style="user-select: auto !important;">첫 번째 숫자가 두 번째 숫자의 약수이다.</li>
	<li style="user-select: auto !important;">첫 번째 숫자가 두 번째 숫자의 배수이다.</li>
	<li style="user-select: auto !important;">첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다.</li>
</ol>

### 입력 

 <p style="user-select: auto !important;">입력은 여러 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 10,000이 넘지않는 두 자연수로 이루어져 있다. 마지막 줄에는 0이 2개 주어진다. 두 수가 같은 경우는 없다.</p>

### 출력 

 <p style="user-select: auto !important;">각 테스트 케이스마다 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither를 출력한다.</p>

