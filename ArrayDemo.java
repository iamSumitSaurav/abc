
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {2, 4, 6, 8, 10};        //int arr[] = {2, 4, 6, 8, 10};
		for(int i = 0; i < 5; i++)
			arr[i] = arr[i]+1;
		
		for(int x:arr) {
			System.out.println(x);
		}
	}
	
	
}
