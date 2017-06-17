package set;

public class RemoveDuplicates {
	
	public static int[] uniqueElements(int[] ints){
		MaxSet<Integer> max = new MaxSet<Integer>();
		if(ints!=null){
			for(int i = 0; i < ints.length; i++){
				max.add(ints[i]);
			}
		}else{
			throw new NullPointerException();
		}
		int[] sortedInts = new int[max.size()];
		for (int i = (max.size() - 1); i >= 0; i--){ //omvänd for-loop ty växande ordning önskas
			sortedInts [i] = max.getMax();
			max.remove(max.getMax());//genom att radera ser vi till att nytt maxtal väljs i nästa loop
			
		}
		return sortedInts;
	}
	
	public static void main(String[] args) {
		int[] test = new int [8];
		test[0] = 4;
		test [1]= 3;
		test[2]=10;
		test[3]= 10;
		test[4]=4;
		test[5]=2;
		test[6]=3;
		test[7]=8;
		test = uniqueElements(test);
		for(int i =0; i < test.length; i++){
		System.out.println(test[i]);
		}
	}
}
