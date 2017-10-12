import java.util.Arrays;


public class ListArray 
{
	Object[] elements;
	private int numElements;
	private int cursorPos;
	private int size;
	public ListArray()
	{
		setup(20);
		
		
	}
	private void setup(int size)
	{
		elements = new Object[size];
		size = elements.length;
		cursorPos = 0;
		numElements = 0;
	}
	public boolean isEmpty()
	{
		return numElements == 0;
	}
	public boolean isFull()
	{
		return numElements == size;
	}
	public void insert(Object newEl)
	{
		if (isEmpty())
		{
			elements[0] = newEl;
		}
		else 
		{
			verifyCap();
			elements [cursorPos+1] = newEl;
			cursorPos++;
		}
		numElements++;
	}
	public Object delete()
	{
		Object temp = null;
		if (!isEmpty())
		{
			temp = getCursor();
			for (int i = cursorPos; i < size-1; i++)
			{
				elements[i] = elements[i+1];
			}
			if (cursorPos>size-1)
			{
				cursorPos=0;
			}
		}
		return temp;
	}
	public void verifyCap()
	{
		if (isFull())
		{
			elements = Arrays.copyOf(elements, elements.length+1);
			size = elements.length;
		}
	}
	public void showStruct()
	{
		String outPut = " ";
		for (int i = 0; i < size; i++ )
		{
			outPut += elements[i].toString()+ " ";
		}
		System.out.println(outPut);
	}
	public void clear()
	{
		setup(5);
	}
	public Object getCursor()
	{
		return elements[cursorPos];
	}
	public void goToNext()
	{
		if (!isEmpty() && cursorPos < size-1)
		{
			cursorPos++;
		}
	}
	public void goToPrev()
	{
		if (!isEmpty() && cursorPos != 0)
		{
			cursorPos--;
		}
	}
	public void goTobegin()
	{
		cursorPos = 0;
	}
	public void goToEnd()
	{
		cursorPos = size-1;
	} 
	public void replace(Object newItem)
	{
		if (!isEmpty() && newItem != null)
		{
			elements[cursorPos] = newItem;
		}
	}
}
