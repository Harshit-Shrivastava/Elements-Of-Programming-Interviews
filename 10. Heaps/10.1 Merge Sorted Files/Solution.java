private class ArrayEntry {
    public Integer value;
    public Integer arrayId;

    public ArrayEntry(Integer value, Integer arrayId) {
        this.value = value;
        this.arrayId = arrayId;
    }
}

public class Solution {
    public List<Integer> mergeSortedArrays (List<List<Integer>> sortedArrays) {

        List<Iterator<Integer>> iters = new ArrayList<>(sortedArrays.size());

        for(List<Integer> array : sortedArrays) {
            iters.add(array.iterator());
        }

        PriorityQueue<ArrayEntry> minHeap = new PriorityQueue<>(
            sortedArrays.size(), (o1, o2) -> Integer.compare(o1.value, o2.value));

        for(int i = 0; i < iters.size(); i++) {
            if (iters.get(i).hasNext()) {
                minHeap.add(new ArrayEntry(iters.get(i).next(), i));
            }
        }

        List<Integer> result = new ArrayList<>();

        while(!minHeap.isEmpty()) {
            ArrayEntry headEntry = minHeap.poll();
            result.add(headEntry.value);
            if(iters.get(headEntry.arrayId).hasNext()){
                minHeap.add(new ArrayEntry(iters.get(headEntry.arrayId).next(), headEntry.arrayId));
            }
        }

        return result;
    }
}
