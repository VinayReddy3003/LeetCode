class NumberContainers {

       private Map<Integer,Integer> indexNumber;
       private Map<Integer,TreeSet<Integer>> NumberIndices;

    public NumberContainers() {

        indexNumber = new HashMap<>();
        NumberIndices = new HashMap<>();
        
    }
    
    public void change(int index, int number) {
        if(indexNumber.containsKey(index)) {
            int oldNumber = indexNumber.get(index);
            NumberIndices.get(oldNumber).remove(index);

            if(NumberIndices.get(oldNumber).isEmpty()) {
                NumberIndices.remove(oldNumber);
            }
        }
        
            indexNumber.put(index,number);
            NumberIndices.computeIfAbsent(number, x -> new TreeSet<>()).add(index);
        
    }
    
    public int find(int number) {
        if(!NumberIndices.containsKey(number)) {
            return -1;
        }
        return NumberIndices.get(number).first();

        
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */