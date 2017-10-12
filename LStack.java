package stack;

 class LStack implements Stack, Cloneable {
	 private int counter;
	 private StackNode head;
	 public LStack()
	 {
		 setup();
	 }
	 private void setup()
	 {
		 head = null;
		 counter = 0;
	 }
	@Override
	public void push(Object newElement) {
		// TODO Auto-generated method stub
		StackNode stackNode = new StackNode(newElement, null);
		if (head==null)
		{
			head = stackNode;
		}
		else
		{
			stackNode.setNext(head);
			head = stackNode;
		}
		counter++;
	}
	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		if (isEmpty())
		{
			System.out.println("The list/stack is empty.");
		}
		else
		{
			Object test = head.getElement();
			head = head.getNext();
			counter--;
			return test;
		}
		return null;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		setup();
	}
	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return head.getElement();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		
		return counter == 0;
	}
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void showStructure() {
		// TODO Auto-generated method stub
		StackNode current = head;
		String test = "";
		if (!isEmpty()){
		do 
		{
			test += current.getElement() + " ";
			current = current.getNext();
		} while (current != null);}
		System.out.println(test);
	}

}
