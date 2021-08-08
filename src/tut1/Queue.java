package tut1;

public class Queue {
private int[] elements;
private int		size;
private int index;

public Queue() {
	elements=new int[8];
}

public void enQueue(int v) {
for(int i=0;i<elements.length;i++) {
	if(elements[i]==0) {
		elements[i]=v;
		break;
	}

}

}
public boolean isEmpty() {
	boolean empty=true;
	for(int i=0;i<elements.length;i++) {
		if(elements[i]!=0) {
			empty=false;
			break;
		}
	}
	return empty;
}
public Queue(int size) {
	this.size=size;
	this.elements=new int[size];
}
public void setSize(int size) {
	this.size=size;
}
public int getSize() {
	return size;
}


public int deQueue() {
	int temp=0;
	temp=elements[0];
	int[] arrTemp=new int[elements.length];
	for(int i=0;i<elements.length-1;i++) {
	arrTemp[i]=elements[i+1];
	}
	
	elements=arrTemp.clone();
	return temp;
	
}

public int[] getElements() {
	return elements;
}




}
