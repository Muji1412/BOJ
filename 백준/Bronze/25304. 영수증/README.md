# [Bronze IV] 영수증 - 25304 

[문제 링크](https://www.acmicpc.net/problem/25304) 

### 성능 요약

메모리: 17920 KB, 시간: 180 ms

### 분류

사칙연산, 구현, 수학

### 제출 일자

2024년 12월 21일 14:25:52

### 문제 설명

<p style="user-select: auto !important;">준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다. 정말 멋졌다. 그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다! 준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.</p>

<p style="user-select: auto !important;">영수증에 적힌,</p>

<ul style="user-select: auto !important;">
	<li style="user-select: auto !important;">구매한 각 물건의 가격과 개수</li>
	<li style="user-select: auto !important;">구매한 물건들의 총 금액</li>
</ul>

<p style="user-select: auto !important;">을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.</p>

### 입력 

 <p style="user-select: auto !important;">첫째 줄에는 영수증에 적힌 총 금액 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative; user-select: auto !important;"><mjx-math class="MJX-TEX" aria-hidden="true" style="user-select: auto !important;"><mjx-mi class="mjx-i" style="user-select: auto !important;"><mjx-c class="mjx-c1D44B TEX-I" style="user-select: auto !important;"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline" style="user-select: auto !important;"><math xmlns="http://www.w3.org/1998/Math/MathML" style="user-select: auto !important;"><mi style="user-select: auto !important;">X</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext" style="user-select: auto !important;">$X$</span></mjx-container>가 주어진다.</p>

<p style="user-select: auto !important;">둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative; user-select: auto !important;"><mjx-math class="MJX-TEX" aria-hidden="true" style="user-select: auto !important;"><mjx-mi class="mjx-i" style="user-select: auto !important;"><mjx-c class="mjx-c1D441 TEX-I" style="user-select: auto !important;"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline" style="user-select: auto !important;"><math xmlns="http://www.w3.org/1998/Math/MathML" style="user-select: auto !important;"><mi style="user-select: auto !important;">N</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext" style="user-select: auto !important;">$N$</span></mjx-container>이 주어진다.</p>

<p style="user-select: auto !important;">이후 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative; user-select: auto !important;"><mjx-math class="MJX-TEX" aria-hidden="true" style="user-select: auto !important;"><mjx-mi class="mjx-i" style="user-select: auto !important;"><mjx-c class="mjx-c1D441 TEX-I" style="user-select: auto !important;"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline" style="user-select: auto !important;"><math xmlns="http://www.w3.org/1998/Math/MathML" style="user-select: auto !important;"><mi style="user-select: auto !important;">N</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext" style="user-select: auto !important;">$N$</span></mjx-container>개의 줄에는 각 물건의 가격 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative; user-select: auto !important;"><mjx-math class="MJX-TEX" aria-hidden="true" style="user-select: auto !important;"><mjx-mi class="mjx-i" style="user-select: auto !important;"><mjx-c class="mjx-c1D44E TEX-I" style="user-select: auto !important;"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline" style="user-select: auto !important;"><math xmlns="http://www.w3.org/1998/Math/MathML" style="user-select: auto !important;"><mi style="user-select: auto !important;">a</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext" style="user-select: auto !important;">$a$</span></mjx-container>와 개수 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative; user-select: auto !important;"><mjx-math class="MJX-TEX" aria-hidden="true" style="user-select: auto !important;"><mjx-mi class="mjx-i" style="user-select: auto !important;"><mjx-c class="mjx-c1D44F TEX-I" style="user-select: auto !important;"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline" style="user-select: auto !important;"><math xmlns="http://www.w3.org/1998/Math/MathML" style="user-select: auto !important;"><mi style="user-select: auto !important;">b</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext" style="user-select: auto !important;">$b$</span></mjx-container>가 공백을 사이에 두고 주어진다.</p>

### 출력 

 <p style="user-select: auto !important;">구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 <code style="user-select: auto !important;">Yes</code>를 출력한다. 일치하지 않는다면 <code style="user-select: auto !important;">No</code>를 출력한다.</p>

