package level1;

public class 소수_찾기 {
	public int solution(int n) {
        int count = 0;
       int[] arr = new int[n+1];

       for(int i = 2; i <= n; i++){    //  각 배열에 자기 자신 담기
           arr[i] = i;
       }
       for(int i = 2; i <= Math.sqrt(n); i++){ //  2부터 제곱근까지 각 수의 배수 없애기
           if(arr[i]==0) continue;
           for(int j = i*2; j <= n; j+=i){     //  ex) 100까지라면 2,4,6,8.... 3,6,9,12....
               arr[j] = 0;
           }
       }
       for(int i = 2; i < arr.length; i++){    //  안 없어진 애들만 출력
           if(arr[i]!=0) count++;
       }
       
       return count;
   }
}
/*
문제 설명
	1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
	
	소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
	(1은 소수가 아닙니다.)

제한 조건
	n은 2이상 1000000이하의 자연수입니다. 
 */
