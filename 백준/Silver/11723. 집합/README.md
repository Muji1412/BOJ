# [Silver V] 집합 - 11723 

[문제 링크](https://www.acmicpc.net/problem/11723) 

### 성능 요약

메모리: 312516 KB, 시간: 1044 ms

### 분류

비트마스킹, 구현

### 제출 일자

2025년 1월 17일 14:11:27

### 문제 설명

<p style="user-select: auto !important;">비어있는 공집합 S가 주어졌을 때, 아래 연산을 수행하는 프로그램을 작성하시오.</p>

<ul style="user-select: auto !important;">
	<li style="user-select: auto !important;"><code style="user-select: auto !important;">add x</code>: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.</li>
	<li style="user-select: auto !important;"><code style="user-select: auto !important;">remove x</code>: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.</li>
	<li style="user-select: auto !important;"><code style="user-select: auto !important;">check x</code>: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)</li>
	<li style="user-select: auto !important;"><code style="user-select: auto !important;">toggle x</code>: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)</li>
	<li style="user-select: auto !important;"><code style="user-select: auto !important;">all</code>: S를 {1, 2, ..., 20} 으로 바꾼다.</li>
	<li style="user-select: auto !important;"><code style="user-select: auto !important;">empty</code>: S를 공집합으로 바꾼다.</li>
</ul>

### 입력 

 <p style="user-select: auto !important;">첫째 줄에 수행해야 하는 연산의 수 M (1 ≤ M ≤ 3,000,000)이 주어진다.</p>

<p style="user-select: auto !important;">둘째 줄부터 M개의 줄에 수행해야 하는 연산이 한 줄에 하나씩 주어진다.</p>

### 출력 

 <p style="user-select: auto !important;"><code style="user-select: auto !important;">check</code> 연산이 주어질때마다, 결과를 출력한다.</p>

