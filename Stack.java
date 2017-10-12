package stack;

public interface Stack {
public static final int DEF_MAX_STACK_SIZE = 10;

public void push(Object newElement);
public Object pop();
public void clear();
public Object peek();

public boolean isEmpty();
public boolean isFull();
public void showStructure();
}
