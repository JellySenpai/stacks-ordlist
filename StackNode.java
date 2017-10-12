package stack;

 class StackNode {
	 private Object element;
	 private StackNode next;
	 public StackNode(Object newElement, StackNode nextval)
	 {
		 this.element = newElement;
		 this.next = nextval;
	 }
	public StackNode getNext()
	 {
		return next;}
	 public Object getElement()
	 {
		return element;}
	 public void setNext(StackNode nextval)
	 {
		 this.next = nextval;
		 
	 }
	 public void setData (Object data)
	 {
		 this.element = data;
	 }
		public Object clone()
		{
			try {
				return super.clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				return null;
			}
		}
}
