class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding nodes to the linked list
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        // Printing the linked list
        System.out.println("Linked List: ");
        System.out.println(list.head.data);
        System.out.println();
        list.printList();

        // Searching for a node in the linked list
        int data = 3;
        if (list.searchNode(data)) {
            System.out.println("Node " + data + " found in the linked list");
        } else {
            System.out.println("Node " + data + " not found in the linked list");
        }

        // Updating a node in the linked list
        int oldData = 4;
        int newData = 40;
        list.updateNode(oldData, newData);
        System.out.println("Linked List after updating node " + oldData + " with " + newData);
        list.printList();
    }
}

class LinkedList {
    Node head;

    // Adding a node to the linked list
    public void addNode(int data) {
//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
        Node temp = new Node(data);
        if(head == null ) {
            head = temp;
        } else {
           Node current = head ;
           while (current.next!=null) {
               current = current.next;

            }

           current.next = temp ;
        }
    }

    // Searching for a node in the linked list
    public boolean searchNode(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Updating a node in the linked list
    public void updateNode(int data, int newData) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                current.data = newData;
                break;
            }
            current = current.next;
        }
    }

    // Deleting a node in the linked list
    public void deleteNode(int data) {
        Node current = head;
        Node previous = null;
        while (current != null) {
            if (current.data == data) {
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
                break;
            }
            previous = current;
            current = current.next;
        }
    }

    // Printing the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}





