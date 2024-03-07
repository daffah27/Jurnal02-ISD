public class SinglyLinkedList {
    Node head;
    Node tail;

    public void tambahDepan(Buku data){
        Node newNode = new Node(data);

        if (head == null && tail == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void tambahBelakang(Buku data){
        Node newNode = new Node(data);

        if (head == null && tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void hapusDepan(){
        if (head == null && tail == null) {
            System.out.println("List kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void hapusBelakang(){
        if (head == null && tail == null) {
            System.out.println("List kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node iterator = head;
            while(iterator.next != tail){
                iterator = iterator.next;
            }
            tail = iterator;
            tail.next = null;
        }
    }

    public void cetak(){
        Node iterator = head;
        if (head == null) {
            System.out.println("Data kosong");
        }
        while(iterator != null){
            System.out.println(iterator.data.judul + " " + iterator.data.penulis + " " + iterator.data.tahun);
            iterator = iterator.next;
        }
    }

    
}