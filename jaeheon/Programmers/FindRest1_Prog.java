package Programmers;

class FindRest1_Prog {
	public int solution(int n) {
		int answer = 0;

		for (int i = 2; i <= n; i++) {
			if (n % i == 1) {
				answer = i;
				break;
			}
		}

		return answer;
	}
}
