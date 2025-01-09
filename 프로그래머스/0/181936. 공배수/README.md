# [level 0] 공배수 - 181936 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181936) 

### 성능 요약

메모리: 85.1 MB, 시간: 0.03 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 01월 09일 10:56:39

### 문제 설명

<p style="user-select: auto !important;">정수 <code style="user-select: auto !important;">number</code>와 <code style="user-select: auto !important;">n</code>, <code style="user-select: auto !important;">m</code>이 주어집니다. <code style="user-select: auto !important;">number</code>가 <code style="user-select: auto !important;">n</code>의 배수이면서 <code style="user-select: auto !important;">m</code>의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">10 ≤ <code style="user-select: auto !important;">number</code> ≤ 100</li>
<li style="user-select: auto !important;">2 ≤ <code style="user-select: auto !important;">n</code>, <code style="user-select: auto !important;">m</code> &lt; 10</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">number</th>
<th style="user-select: auto !important;">n</th>
<th style="user-select: auto !important;">m</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">60</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">1</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">55</td>
<td style="user-select: auto !important;">10</td>
<td style="user-select: auto !important;">5</td>
<td style="user-select: auto !important;">0</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">60은 2의 배수이면서 3의 배수이기 때문에 1을 return합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">55는 5의 배수이지만 10의 배수가 아니기 때문에 0을 return합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges