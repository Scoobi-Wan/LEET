import java.util.ArrayList;

class MyHashSet {

	ArrayList<Object> hash;
    /** Initialize your data structure here. */
    public MyHashSet() {
        hash = new ArrayList<Object>();
    }
    
    public void add(int key) {
        if (!hash.contains(key)) {
            hash.add(key);
        }
        
    }
    
    public void remove(int key) {
    	if (hash.contains(key)) {
    		int indexOfKey = hash.indexOf(key);
    		hash.remove(indexOfKey);
    	}
        
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return hash.contains(key) ? true : false;
    }
}