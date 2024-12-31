# [Silver V] 너의 평점은 - 25206 

[문제 링크](https://www.acmicpc.net/problem/25206) 

### 성능 요약

메모리: 14844 KB, 시간: 132 ms

### 분류

구현, 수학, 문자열

### 제출 일자

2024년 12월 31일 12:53:06

### 문제 설명

<p style="user-select: auto !important;">인하대학교 컴퓨터공학과를 졸업하기 위해서는, 전공평점이 3.3 이상이거나 졸업고사를 통과해야 한다. 그런데 아뿔싸, 치훈이는 깜빡하고 졸업고사를 응시하지 않았다는 사실을 깨달았다!</p>

<p style="user-select: auto !important;">치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.</p>

<p style="user-select: auto !important;">전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.</p>

<p style="user-select: auto !important;">인하대학교 컴퓨터공학과의 등급에 따른 과목평점은 다음 표와 같다.</p>

<table border="1" cellpadding="1" cellspacing="1" class="table table-bordered" style="width: 150px; user-select: auto !important;">
	<tbody style="user-select: auto !important;">
		<tr style="user-select: auto !important;">
			<td style="text-align: center; user-select: auto !important;">A+</td>
			<td style="text-align: center; user-select: auto !important;">4.5</td>
		</tr>
		<tr style="user-select: auto !important;">
			<td style="text-align: center; user-select: auto !important;">A0</td>
			<td style="text-align: center; user-select: auto !important;">4.0</td>
		</tr>
		<tr style="user-select: auto !important;">
			<td style="text-align: center; user-select: auto !important;">B+</td>
			<td style="text-align: center; user-select: auto !important;">3.5</td>
		</tr>
		<tr style="user-select: auto !important;">
			<td style="text-align: center; user-select: auto !important;">B0</td>
			<td style="text-align: center; user-select: auto !important;">3.0</td>
		</tr>
		<tr style="user-select: auto !important;">
			<td style="text-align: center; user-select: auto !important;">C+</td>
			<td style="text-align: center; user-select: auto !important;">2.5</td>
		</tr>
		<tr style="user-select: auto !important;">
			<td style="text-align: center; user-select: auto !important;">C0</td>
			<td style="text-align: center; user-select: auto !important;">2.0</td>
		</tr>
		<tr style="user-select: auto !important;">
			<td style="text-align: center; user-select: auto !important;">D+</td>
			<td style="text-align: center; user-select: auto !important;">1.5</td>
		</tr>
		<tr style="user-select: auto !important;">
			<td style="text-align: center; user-select: auto !important;">D0</td>
			<td style="text-align: center; user-select: auto !important;">1.0</td>
		</tr>
		<tr style="user-select: auto !important;">
			<td style="text-align: center; user-select: auto !important;">F</td>
			<td style="text-align: center; user-select: auto !important;">0.0</td>
		</tr>
	</tbody>
</table>

<p style="user-select: auto !important;">P/F 과목의 경우 등급이 <code style="user-select: auto !important;">P</code>또는 <code style="user-select: auto !important;">F</code>로 표시되는데, 등급이 <code style="user-select: auto !important;">P</code>인 과목은 계산에서 제외해야 한다.</p>

<p style="user-select: auto !important;">과연 치훈이는 무사히 졸업할 수 있을까?</p>

### 입력 

 <p style="user-select: auto !important;"><strong style="user-select: auto !important;">20</strong>줄에 걸쳐 치훈이가 수강한 전공과목의 과목명, 학점, 등급이 공백으로 구분되어 주어진다.</p>

### 출력 

 <p style="user-select: auto !important;">치훈이의 전공평점을 출력한다.</p>

<p style="user-select: auto !important;">정답과의 절대오차 또는 상대오차가 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative; user-select: auto !important;"><mjx-math class="MJX-TEX" aria-hidden="true" style="user-select: auto !important;"><mjx-msup style="user-select: auto !important;"><mjx-mn class="mjx-n" style="user-select: auto !important;"><mjx-c class="mjx-c31" style="user-select: auto !important;"></mjx-c><mjx-c class="mjx-c30" style="user-select: auto !important;"></mjx-c></mjx-mn><mjx-script style="vertical-align: 0.393em; user-select: auto !important;"><mjx-texatom size="s" texclass="ORD" style="user-select: auto !important;"><mjx-mo class="mjx-n" style="user-select: auto !important;"><mjx-c class="mjx-c2212" style="user-select: auto !important;"></mjx-c></mjx-mo><mjx-mn class="mjx-n" style="user-select: auto !important;"><mjx-c class="mjx-c34" style="user-select: auto !important;"></mjx-c></mjx-mn></mjx-texatom></mjx-script></mjx-msup></mjx-math><mjx-assistive-mml unselectable="on" display="inline" style="user-select: auto !important;"><math xmlns="http://www.w3.org/1998/Math/MathML" style="user-select: auto !important;"><msup style="user-select: auto !important;"><mn style="user-select: auto !important;">10</mn><mrow data-mjx-texclass="ORD" style="user-select: auto !important;"><mo style="user-select: auto !important;">−</mo><mn style="user-select: auto !important;">4</mn></mrow></msup></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext" style="user-select: auto !important;">\(10^{-4}\)</span></mjx-container> 이하이면 정답으로 인정한다.</p>

