# [Bronze III] 최댓값 - 2566 

[문제 링크](https://www.acmicpc.net/problem/2566) 

### 성능 요약

메모리: 18472 KB, 시간: 200 ms

### 분류

구현

### 제출 일자

2024년 12월 31일 13:47:14

### 문제 설명

<p style="user-select: auto !important;"><그림 1>과 같이 9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.</p>

<p style="user-select: auto !important;">예를 들어, 다음과 같이 81개의 수가 주어지면</p>

<table class="table table-bordered td-center th-center table-center-40" style="user-select: auto !important;">
	<tbody style="user-select: auto !important;">
		<tr style="user-select: auto !important;">
			<th style="user-select: auto !important;"> </th>
			<th style="user-select: auto !important;">1열</th>
			<th style="user-select: auto !important;">2열</th>
			<th style="user-select: auto !important;">3열</th>
			<th style="user-select: auto !important;">4열</th>
			<th style="user-select: auto !important;">5열</th>
			<th style="user-select: auto !important;">6열</th>
			<th style="user-select: auto !important;">7열</th>
			<th style="user-select: auto !important;">8열</th>
			<th style="user-select: auto !important;">9열</th>
		</tr>
		<tr style="user-select: auto !important;">
			<th style="user-select: auto !important;">1행</th>
			<td style="user-select: auto !important;">3</td>
			<td style="user-select: auto !important;">23</td>
			<td style="user-select: auto !important;">85</td>
			<td style="user-select: auto !important;">34</td>
			<td style="user-select: auto !important;">17</td>
			<td style="user-select: auto !important;">74</td>
			<td style="user-select: auto !important;">25</td>
			<td style="user-select: auto !important;">52</td>
			<td style="user-select: auto !important;">65</td>
		</tr>
		<tr style="user-select: auto !important;">
			<th style="user-select: auto !important;">2행</th>
			<td style="user-select: auto !important;">10</td>
			<td style="user-select: auto !important;">7</td>
			<td style="user-select: auto !important;">39</td>
			<td style="user-select: auto !important;">42</td>
			<td style="user-select: auto !important;">88</td>
			<td style="user-select: auto !important;">52</td>
			<td style="user-select: auto !important;">14</td>
			<td style="user-select: auto !important;">72</td>
			<td style="user-select: auto !important;">63</td>
		</tr>
		<tr style="user-select: auto !important;">
			<th style="user-select: auto !important;">3행</th>
			<td style="user-select: auto !important;">87</td>
			<td style="user-select: auto !important;">42</td>
			<td style="user-select: auto !important;">18</td>
			<td style="user-select: auto !important;">78</td>
			<td style="user-select: auto !important;">53</td>
			<td style="user-select: auto !important;">45</td>
			<td style="user-select: auto !important;">18</td>
			<td style="user-select: auto !important;">84</td>
			<td style="user-select: auto !important;">53</td>
		</tr>
		<tr style="user-select: auto !important;">
			<th style="user-select: auto !important;">4행</th>
			<td style="user-select: auto !important;">34</td>
			<td style="user-select: auto !important;">28</td>
			<td style="user-select: auto !important;">64</td>
			<td style="user-select: auto !important;">85</td>
			<td style="user-select: auto !important;">12</td>
			<td style="user-select: auto !important;">16</td>
			<td style="user-select: auto !important;">75</td>
			<td style="user-select: auto !important;">36</td>
			<td style="user-select: auto !important;">55</td>
		</tr>
		<tr style="user-select: auto !important;">
			<th style="user-select: auto !important;">5행</th>
			<td style="user-select: auto !important;">21</td>
			<td style="user-select: auto !important;">77</td>
			<td style="user-select: auto !important;">45</td>
			<td style="user-select: auto !important;">35</td>
			<td style="user-select: auto !important;">28</td>
			<td style="user-select: auto !important;">75</td>
			<td style="user-select: auto !important;">90</td>
			<td style="user-select: auto !important;">76</td>
			<td style="user-select: auto !important;">1</td>
		</tr>
		<tr style="user-select: auto !important;">
			<th style="user-select: auto !important;">6행</th>
			<td style="user-select: auto !important;">25</td>
			<td style="user-select: auto !important;">87</td>
			<td style="user-select: auto !important;">65</td>
			<td style="user-select: auto !important;">15</td>
			<td style="user-select: auto !important;">28</td>
			<td style="user-select: auto !important;">11</td>
			<td style="user-select: auto !important;">37</td>
			<td style="user-select: auto !important;">28</td>
			<td style="user-select: auto !important;">74</td>
		</tr>
		<tr style="user-select: auto !important;">
			<th style="user-select: auto !important;">7행</th>
			<td style="user-select: auto !important;">65</td>
			<td style="user-select: auto !important;">27</td>
			<td style="user-select: auto !important;">75</td>
			<td style="user-select: auto !important;">41</td>
			<td style="user-select: auto !important;">7</td>
			<td style="user-select: auto !important;">89</td>
			<td style="user-select: auto !important;">78</td>
			<td style="user-select: auto !important;">64</td>
			<td style="user-select: auto !important;">39</td>
		</tr>
		<tr style="user-select: auto !important;">
			<th style="user-select: auto !important;">8행</th>
			<td style="user-select: auto !important;">47</td>
			<td style="user-select: auto !important;">47</td>
			<td style="user-select: auto !important;">70</td>
			<td style="user-select: auto !important;">45</td>
			<td style="user-select: auto !important;">23</td>
			<td style="user-select: auto !important;">65</td>
			<td style="user-select: auto !important;">3</td>
			<td style="user-select: auto !important;">41</td>
			<td style="user-select: auto !important;">44</td>
		</tr>
		<tr style="user-select: auto !important;">
			<th style="user-select: auto !important;">9행</th>
			<td style="user-select: auto !important;">87</td>
			<td style="user-select: auto !important;">13</td>
			<td style="user-select: auto !important;">82</td>
			<td style="user-select: auto !important;">38</td>
			<td style="user-select: auto !important;">31</td>
			<td style="user-select: auto !important;">12</td>
			<td style="user-select: auto !important;">29</td>
			<td style="user-select: auto !important;">29</td>
			<td style="user-select: auto !important;">80</td>
		</tr>
	</tbody>
</table>

<p style="user-select: auto !important;">이들 중 최댓값은 90이고, 이 값은 5행 7열에 위치한다.</p>

### 입력 

 <p style="user-select: auto !important;">첫째 줄부터 아홉 번째 줄까지 한 줄에 아홉 개씩 수가 주어진다. 주어지는 수는 100보다 작은 자연수 또는 0이다.</p>

### 출력 

 <p style="user-select: auto !important;">첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 위치한 행 번호와 열 번호를 빈칸을 사이에 두고 차례로 출력한다. 최댓값이 두 개 이상인 경우 그 중 한 곳의 위치를 출력한다.</p>

