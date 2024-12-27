# [level 0] [PCCE 기출문제] 2번 / 각도 합치기 - 340206 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/340206) 

### 성능 요약

메모리: 70.8 MB, 시간: 190.67 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 12월 27일 20:07:58

### 문제 설명

<p style="user-select: auto !important;">일반적으로 두 선분이 이루는 각도는 한 바퀴를 360도로 하여 표현합니다. 따라서 각도에 360의 배수를 더하거나 빼더라도 같은 각을 의미합니다. 예를 들면, 30도와 390도는 같은 각도입니다.</p>

<p style="user-select: auto !important;">주어진 코드는 각도를 나타내는 두 정수 <code style="user-select: auto !important;">angle1</code>과 <code style="user-select: auto !important;">angle2</code>가 주어질 때, 이 두 각의 합을 0도 이상 360도 미만으로 출력하는 코드입니다. 코드가 올바르게 작동하도록 한 줄을 수정해 주세요.</p>

<hr style="user-select: auto !important;">

<h4 style="user-select: auto !important;">제한사항</h4>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">0 ≤ <code style="user-select: auto !important;">angle1</code> ≤ 5000</li>
<li style="user-select: auto !important;">0 ≤ <code style="user-select: auto !important;">angle2</code> ≤ 5000</li>
</ul>

<hr style="user-select: auto !important;">

<h4 style="user-select: auto !important;">입출력 예</h4>

<p style="user-select: auto !important;">입력 #1</p>
<div class="highlight" style="user-select: auto !important;"><pre class="codehilite" style="user-select: auto !important;"><code style="user-select: auto !important;">280
485
</code></pre></div>
<p style="user-select: auto !important;">출력 #1</p>
<div class="highlight" style="user-select: auto !important;"><pre class="codehilite" style="user-select: auto !important;"><code style="user-select: auto !important;">45
</code></pre></div>
<hr style="user-select: auto !important;">

<h4 style="user-select: auto !important;">입출력 예 설명</h4>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">angle1</code>과 <code style="user-select: auto !important;">angle2</code>의 합은 765도이고, 765를 720을 빼면 45도이므로 45를 출력합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges