public class Run {
    public static int indexOfLongestRun(String str) {

    	int indexnum=0; //handle the index of longrun
		int maxnum=0; //compare to the count in order to get the maximum number of char
		int count=0;
		
		if(str == null || str == ""){
			throw new UnsupportedOperationException("Waiting to be implemented.");

		}else{
			char temp = str.charAt(0);

			for(int i = 0; i < str.length(); i++){
		 	if(temp == str.charAt(i)){
		 		count++;
		 		if (maxnum <= count){
					maxnum = count;
					indexnum = i;
		 		}
		 	}
		 	else{
		 		temp = str.charAt(i);
		 		count = 1;

		 	}
			//System.out.println(temp + ":" + count + " ," + maxnum);
			}
		}
        
		return indexnum - maxnum + 1;

    }
    public static void main(String[] args) {
        System.out.println(indexOfLongestRun("abbcccddddcccbba"));
} }