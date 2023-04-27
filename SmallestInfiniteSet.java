class SmallestInfiniteSet {
    private TreeSet<Integer> infiSet;
    private int curr = 1;

    public SmallestInfiniteSet() {
      infiSet = new TreeSet<>(); 
    }
    
    public int popSmallest() {
        if (infiSet.isEmpty())
            return curr++;
    return infiSet.pollFirst().intValue();

    }
    
    public void addBack(int num) {
       if (num < curr)
        infiSet.add(num);
    }
}
