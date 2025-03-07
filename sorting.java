package java_1;

public class sorting {
	public static void main(String srgs[]) {
		int num[]= {2,30,50,6,12,10,55,65,30};
		System.out.println("un-sorted array :");
		for (int i=0;i<num.length;i++) {
			System.out.print(num[i]+"\t");
		}
		
		System.out.println("");
		for (int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if (num[i]>num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("sorted array :");
		for (int i=0;i<num.length;i++) {
			System.out.print(num[i]+"\t");
		}
		
	}
	
}
