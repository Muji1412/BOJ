# [Silver III] 달팽이 - 1913 

[문제 링크](https://www.acmicpc.net/problem/1913) 

### 성능 요약

메모리: 135436 KB, 시간: 4280 ms

### 분류

구현

### 제출 일자

2025년 1월 24일 22:30:29

### 문제 설명

<p style="user-select: auto !important;">홀수인 자연수 N이 주어지면, 다음과 같이 1부터 N<sup style="user-select: auto !important;">2</sup>까지의 자연수를 달팽이 모양으로 N×N의 표에 채울 수 있다.</p>

<table class="table table-bordered td-center" style="width: 9%; user-select: auto !important;">
	<tbody style="user-select: auto !important;">
		<tr style="user-select: auto !important;">
			<td style="width: 3%; user-select: auto !important;">9</td>
			<td style="width: 3%; user-select: auto !important;">2</td>
			<td style="width: 3%; user-select: auto !important;">3</td>
		</tr>
		<tr style="user-select: auto !important;">
			<td style="user-select: auto !important;">8</td>
			<td style="user-select: auto !important;">1</td>
			<td style="user-select: auto !important;">4</td>
		</tr>
		<tr style="user-select: auto !important;">
			<td style="user-select: auto !important;">7</td>
			<td style="user-select: auto !important;">6</td>
			<td style="user-select: auto !important;">5</td>
		</tr>
	</tbody>
</table>

<table class="table table-bordered td-center" style="width: 15%; user-select: auto !important;">
	<tbody style="user-select: auto !important;">
		<tr style="user-select: auto !important;">
			<td style="width: 3%; user-select: auto !important;">25</td>
			<td style="width: 3%; user-select: auto !important;">10</td>
			<td style="width: 3%; user-select: auto !important;">11</td>
			<td style="width: 3%; user-select: auto !important;">12</td>
			<td style="width: 3%; user-select: auto !important;">13</td>
		</tr>
		<tr style="user-select: auto !important;">
			<td style="user-select: auto !important;">24</td>
			<td style="user-select: auto !important;">9</td>
			<td style="user-select: auto !important;">2</td>
			<td style="user-select: auto !important;">3</td>
			<td style="user-select: auto !important;">14</td>
		</tr>
		<tr style="user-select: auto !important;">
			<td style="user-select: auto !important;">23</td>
			<td style="user-select: auto !important;">8</td>
			<td style="user-select: auto !important;">1</td>
			<td style="user-select: auto !important;">4</td>
			<td style="user-select: auto !important;">15</td>
		</tr>
		<tr style="user-select: auto !important;">
			<td style="user-select: auto !important;">22</td>
			<td style="user-select: auto !important;">7</td>
			<td style="user-select: auto !important;">6</td>
			<td style="user-select: auto !important;">5</td>
			<td style="user-select: auto !important;">16</td>
		</tr>
		<tr style="user-select: auto !important;">
			<td style="user-select: auto !important;">21</td>
			<td style="user-select: auto !important;">20</td>
			<td style="user-select: auto !important;">19</td>
			<td style="user-select: auto !important;">18</td>
			<td style="user-select: auto !important;">17</td>
		</tr>
	</tbody>
</table>

<p style="user-select: auto !important;">N이 주어졌을 때, 이러한 표를 출력하는 프로그램을 작성하시오. 또한 N<sup style="user-select: auto !important;">2</sup> 이하의 자연수가 하나 주어졌을 때, 그 좌표도 함께 출력하시오. 예를 들어 N=5인 경우 6의 좌표는 (4,3)이다.</p>

### 입력 

 <p style="user-select: auto !important;">첫째 줄에 홀수인 자연수 N(3 ≤ N ≤ 999)이 주어진다. 둘째 줄에는 위치를 찾고자 하는 N<sup style="user-select: auto !important;">2</sup> 이하의 자연수가 하나 주어진다.</p>

### 출력 

 <p style="user-select: auto !important;">N개의 줄에 걸쳐 표를 출력한다. 각 줄에 N개의 자연수를 한 칸씩 띄어서 출력하면 되며, 자릿수를 맞출 필요가 없다. N+1번째 줄에는 입력받은 자연수의 좌표를 나타내는 두 정수를 한 칸 띄어서 출력한다.</p>

