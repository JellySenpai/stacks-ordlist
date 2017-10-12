package stack;

public class AStack implements Stack { 
private int top,elementsInStack,totalElements;
private Object [] elements;

public AStack()
{
	setup(DEF_MAX_STACK_SIZE);
}
public AStack(int size)
{
	setup(size);
}
private void setup(int size)
{
	elements = new Object [size];
	totalElements= elements.length;
	elementsInStack=-1;
}
@Override
public void push(Object newElement) {
	// TODO Auto-generated method stub
	if (isFull())
	{System.out.println("The Stack is full, please remove an object");}
	else if (newElement == null)
	{System.out.println("The stack does not except Null values.");}
	else
	{
		elements [++elementsInStack] = newElement;
	}
}
@Override
public Object pop() {
	// TODO Auto-generated method stub
	if (isEmpty())
	{System.out.println("The Stack is empty.");}
	else
	{
		
		Object temp = elements [elementsInStack];
		elements[elementsInStack]= null;
		elementsInStack--;
		return temp;
	}
	return null;
}
@Override
public void clear() {
	// TODO Auto-generated method stub
	setup(totalElements);
}
@Override
public Object peek() {
	// TODO Auto-generated method stub
	return elements [elementsInStack];
}
@Override
public boolean isEmpty() {
	// TODO Auto-generated method stub
	
	return elementsInStack == -1;
}
@Override
public boolean isFull() {
	// TODO Auto-generated method stub
	return elementsInStack == totalElements-1;
}
@Override
public void showStructure() {
	// TODO Auto-generated method stub
	String temp = "";
	for (int i = 0; i < elementsInStack+1; i++)
	{
		temp += elements[i] + " ";
		//System.out.print(elements[i] + " ");
	}
	System.out.println(temp);
}
}
