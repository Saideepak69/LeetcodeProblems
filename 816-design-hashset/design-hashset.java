class MyHashSet {

    public ArrayList<Integer> arr;
    public MyHashSet() {
        arr = new ArrayList<>();
    }
    
    public void add(int key) {
        arr.add(key);
    }
    
    public void remove(int key) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int a: arr){
            if(a == key) continue;
            res.add(a);
        }
        arr = res;
    }
    
    public boolean contains(int key) {
        for(int a: arr){
            if(a == key) return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */