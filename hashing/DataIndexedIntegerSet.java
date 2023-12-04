public class DataIndexedIntegerSet {
	boolean[] present;
 
	public DataIndexedIntegerSet() {
    	present = new boolean[100000];
	}
 
	public insert(int i) {
    	present[i] = true;
	}
 
	public contains(int i) {
    	return present[i];
	}
}

