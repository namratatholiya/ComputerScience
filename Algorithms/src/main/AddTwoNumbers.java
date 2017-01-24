class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { 
		val = x; 
	}

	public void add(ListNode node, int val) {
		if (node == null) {
			node = new ListNode(val);
		}
		while (node.next != null) {
			node = node.next;
		}
		node.next = new ListNode(val);
	}
}

public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0), temp = result;
		int carry = 0;
		while ((l1 != null) || (l2 != null) || (carry != 0)) {
			int sum = 0;
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			sum += carry;
			carry = sum / 10;
			sum = sum % 10;
			ListNode sumNode = new ListNode(sum);
			temp.next = sumNode;
			temp = temp.next;
		}
		return result.next;


	}

	public ListNode addTwoNumber(ListNode l1, ListNode l2) {
		ListNode result = null, temp = null;
		int carry = 0;
		while ((l1 != null) || (l2 != null) || (carry != 0)) {
			int val1 = 0, val2 = 0;
			if (l1 != null) {
				val1 = l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				val2 = l2.val;
				l2 = l2.next;
			}
			int sum = val1 + val2 + carry;
			carry = sum / 10;
			sum = sum % 10;
			ListNode sumNode = new ListNode(sum);
			if (temp == null) {
				temp = sumNode;
				result = temp;
			} else {
				temp.next = sumNode;
				temp = temp.next;
			}
		}
		return result;

	}

	void print(ListNode head) {
		ListNode temp = head;
		if (temp == null) {
			System.out.println("Empty list");
			return;
		}
		while(temp != null) {
			System.out.println("Node :" + temp.val);
			temp = temp.next;
		}
	}

	void add(ListNode node, int val) {
		if (node == null) {
			node = new ListNode(val);
		}
		while (node.next != null) {
			node = node.next;
		}
		node.next = new ListNode(val);
	}

	public static void main(String[] args) {
		AddTwoNumbers numbers = new AddTwoNumbers();
		ListNode l1 = new ListNode(5);
		l1.add(l1, 4);
		l1.add(l1, 3);
		l1.add(l1, 0);
		ListNode l2 = new ListNode(9);
		l2.add(l2, 9);
		l2.add(l2, 3);
		ListNode result = numbers.addTwoNumbers(l1, l2);
		numbers.print(result);
	}
}
