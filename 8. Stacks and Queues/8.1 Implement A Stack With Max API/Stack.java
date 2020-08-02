private static class ElementWithCachedMax {
    public Integer element;
    public Integer max;

    public ElementWithCachedMax(Integer element, Integer max) {
        this.element = element;
        this.max = max;
    }
}

public class Stack {

    //Stores (element, cached maximum) pair
    private Deque<ElementWithCachedMax> elementWithCachedMax = new ArrayDeque<>();

    public boolean isEmpty() {
        return elementWithCachedMax.isEmpty();
    }

    public Integer max() {
        return elementWithCachedMax.peek().max;
    }

    public Integer pop() {
        return elementWithCachedMax.removeFirst().element;
    }

    public void push(Integer x) {
        elementWithCachedMax.addFirst(new ElementWithCachedMax(x, Math.max(x, isEmpty() ? 0 : max())));
    }
}
