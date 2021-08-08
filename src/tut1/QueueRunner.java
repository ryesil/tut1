package tut1;

import java.util.Arrays;

public class QueueRunner {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		System.out.println(Arrays.toString(q.getElements()));
		System.out.println(Arrays.toString(q.getElements()));
		q.deQueue();
		System.out.println(Arrays.toString(q.getElements()));
		q.enQueue(1);
		System.out.println(Arrays.toString(q.getElements()));
		System.out.println(q.isEmpty());
		Queue q2=new Queue(20);
		for(int i=1;i<q2.getSize();i++) {
			q2.enQueue(i);
		}
		System.out.println(q2.getSize());
		System.out.println(Arrays.toString(q2.getElements()));
		System.out.println(q2.deQueue());
		for(int i=1;i<=q2.getSize();i++) {
			System.out.println(q2.deQueue());
		}
	}

}
