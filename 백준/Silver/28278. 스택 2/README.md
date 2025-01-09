# [Silver IV] 스택 2 - 28278 

[문제 링크](https://www.acmicpc.net/problem/28278) 

### 성능 요약

메모리: 308092 KB, 시간: 4592 ms

### 분류

자료 구조, 스택

### 제출 일자

2025년 1월 9일 17:40:17

### 문제 설명

<p style="user-select: auto !important;">정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.</p>

<p style="user-select: auto !important;">명령은 총 다섯 가지이다.</p>

<ol style="user-select: auto !important;">
	<li style="user-select: auto !important;"><span style="color: rgb(231, 76, 60); user-select: auto !important;"><code style="user-select: auto !important;">1 X</code></span>: 정수 <var style="user-select: auto !important;">X</var>를 스택에 넣는다. (1 ≤ <var style="user-select: auto !important;">X</var> ≤ 100,000)</li>
	<li style="user-select: auto !important;"><span style="color: rgb(231, 76, 60); user-select: auto !important;"><code style="user-select: auto !important;">2</code></span>: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 <span style="color: rgb(231, 76, 60); user-select: auto !important;"><code style="user-select: auto !important;">-1</code></span>을 대신 출력한다.</li>
	<li style="user-select: auto !important;"><span style="color: rgb(231, 76, 60); user-select: auto !important;"><code style="user-select: auto !important;">3</code></span>: 스택에 들어있는 정수의 개수를 출력한다.</li>
	<li style="user-select: auto !important;"><span style="color: rgb(231, 76, 60); user-select: auto !important;"><code style="user-select: auto !important;">4</code></span>: 스택이 비어있으면 <span style="color: rgb(231, 76, 60); user-select: auto !important;"><code style="user-select: auto !important;">1</code></span>, 아니면 <span style="color: rgb(231, 76, 60); user-select: auto !important;"><code style="user-select: auto !important;">0</code></span>을 출력한다.</li>
	<li style="user-select: auto !important;"><span style="color: rgb(231, 76, 60); user-select: auto !important;"><code style="user-select: auto !important;">5</code></span>: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 <span style="color: rgb(231, 76, 60); user-select: auto !important;"><code style="user-select: auto !important;">-1</code></span>을 대신 출력한다.</li>
</ol>

### 입력 

 <p style="user-select: auto !important;">첫째 줄에 명령의 수 <var style="user-select: auto !important;">N</var>이 주어진다. (1 ≤ <var style="user-select: auto !important;">N</var> ≤ 1,000,000)</p>

<p style="user-select: auto !important;">둘째 줄부터 <var style="user-select: auto !important;">N</var>개 줄에 명령이 하나씩 주어진다.</p>

<p style="user-select: auto !important;">출력을 요구하는 명령은 하나 이상 주어진다.</p>

### 출력 

 <p style="user-select: auto !important;">출력을 요구하는 명령이 주어질 때마다 명령의 결과를 한 줄에 하나씩 출력한다.</p>

