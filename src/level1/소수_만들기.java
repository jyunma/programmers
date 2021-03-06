package level1;
import java.util.*;
public class 소수_만들기 {
	public static int solution(int[] nums) {
		int count = 0;
		int n = 2997;
		ArrayList<Integer> al = primeArr(n);
        for (int i = 0; i < nums.length-2; i++) {
			for (int j = i+1; j < nums.length-1; j++) {
				for (int k = j+1; k < nums.length; k++) {
					if(al.contains(nums[i]+nums[j]+nums[k])) count++; 
				}
			}
		}
		return count;
	}

	public static ArrayList<Integer> primeArr(int n) {
		int[] arr = new int[n+1];
		ArrayList<Integer> al = new ArrayList<>();
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
			if(arr[i]!=0) al.add(i);
		}
        return al;
	}
}
/*
문제 설명
	주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

제한사항
	nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
	nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.
*/
