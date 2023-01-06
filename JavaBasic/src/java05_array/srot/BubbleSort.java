package java05_array.srot;

public class BubbleSort {

	public static void main(String[] args) {
		
		// 버블 정렬
		int[] arr = {3,2,5,4,1};
		
		// 버블 정렬은 처음에 앞 1번 인덱스와 2번 인덱스를 서로 비교한다.
		// 그 후에 두 값중 왼쪽이 크면 서로 교환한다.
		// Ex) 3  2  5  4  1    // 3,2를 비교
		//	   2  3  5  4  1    // 3이 크기 때문에 왼쪽으로 이동시킨다.
		// 이후 다시 옮겨진 값과 다음 값을 비교한다.
		// 만약 왼쪽이 크다면 서로 교환한다.
		// 크지 않다면 그 왼쪽 값 두 개를 다시 비교한다.
		// Ex) 2  3  5  4  1    // 3,5를 비교
		//     2  3  5  4  1    // 3보다 5가 크기 때문에 5와 4를 비교해서 큰값을 왼쪽으로 미룬다.
		//     2  3  4  5  1    // 5가 더 커서 왼쪽으로 이동했기 때문에 5와 1을 다시 비교한다.
		//     2  3  4  1  5    // 5가 1보다 커서 왼쪽으로 이동 시킨다. 5는 종단점에 도착했기에 비교를 멈추고
		//     2  3  4  1 (5)   // 계산에서 제외된다. 1회기 끝
		//     2  3  4  1 (5)	// 반복한다.
		//     2  3  1 (4  5) .........
		//    (1  2  3  4  5)
		
		//------------원본 출력----------------------------------
		System.out.println("-------------정렬 전---------------");
		for(int i= 0; i <arr.length;i++) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
		System.out.println();
		
		
		System.out.println();
		
	}

}
