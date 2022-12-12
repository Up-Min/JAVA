package test_12_2nd_vector;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_ex {

	public static void main(String[] args) {
		Queue<Message> q = new LinkedList();
		// queue is interface, made by Linked list!!
		
		//put message
		q.offer(new Message("sendMain","홍"));
		q.offer(new Message("sendSMS","길"));
		q.offer(new Message("sendkoko","동"));
		
		// return message
		while(!q.isEmpty()) {
			Message msg = q.poll();
			System.out.println(msg.command + "," + msg.to);
		}
		

	}

}
