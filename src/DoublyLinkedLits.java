public class DoublyLinkedLits {
    Node head = null;
    Node tail = null;

    void basaekle(int data) {
        Node eleman = new Node(data);
        if (head == null) {
            head = eleman;
            tail = eleman;
            System.out.println("listenin başına eleman eklendi");
        } else {
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
            System.out.println("listenin başına eleman eklendi");
        }

    }

    void sonaekle(int data){
        Node eleman=new Node(data);
        if(head==null){
            head=eleman;
            tail=eleman;
            System.out.println("sona eleman eklendi");
        }else {
            tail.next=eleman;
            eleman.prev=tail;
            tail=eleman;
            System.out.println("sona eleman eklendi");
        }









    }

    void arayaekle(int index, int data){
        Node eleman=new Node(data);
        if(head==null && index==0){
            head=eleman;
            tail=eleman;
            System.out.println("liste boş ilk eleman eklendi");
        } else if (head!=null && index==0) {
            eleman.next=head;
            head.prev=eleman;
            head=eleman;
            System.out.println("listenin başına eleman eklendi");
        }else{
            int n=0;
            Node temp=head;
            while (temp != null && n < index - 1) {
                temp = temp.next;
                n++;
            }if (temp == null) {
                System.out.println("Hatalı indeks!");
                return;
            }if (temp.next == null) {
                temp.next = eleman;
                eleman.prev = temp;
                tail = eleman;
                System.out.println("Listenin sonuna eleman eklendi");
                return;
            }else {
                eleman.next=temp.next;
                eleman.prev=temp;
                temp.next.prev=eleman;
                temp.next=eleman;
                System.out.println(index + ". sıraya eleman eklendi");
            }

            }
        }

    void bastansil(){
   if (head==null){
       System.out.println("liste boş");
   } else if (head.next==null) {
       head = null;
       tail = null;
       System.out.println("listedeki tek elemanda silindi");
   }else{
       head=head.next;
       head.prev=null;
       System.out.println("listenin başındaki elaman silindi");
    }

    }

    void sondansil(){
        if(head==null){
            System.out.println("liste boş");
        } else if (head.next==null) {
            head=null;
            tail=null;
            System.out.println("listedeki son elemanda silindi");
        }else {
          tail=tail.prev;
          tail.next=null;
          System.out.println("listenin son elemanı silindi");

        }
    }

    void aradansil(int index){
        if(head==null && index==0){
            System.out.println("liste boş");
        } else if (head!=null && index==0) {
            head=head.next;
            head.prev=null;
            System.out.println("listenin ilk elemanı silindi");
        }else {
            Node temp=head;
            int n=0;
            while (temp!=null && n<index-1){
                temp=temp.next;
                n++;
            } if (temp == null || temp.next == null) {
                System.out.println("Hatalı indeks! Böyle bir eleman yok.");
                return;
            }
            Node silinecek = temp.next;
            temp.next = silinecek.next;

            if (silinecek.next != null) {
                silinecek.next.prev = temp;
            } else {
                tail = temp; // sondaki eleman silindiyse
            }
        }


    }








    void print() {
        if (head == null) {
            System.out.print("liste boş");
        } else {
            Node temp = head;
            System.out.print("liste başı ");
            while (temp != null) {
                System.out.print(temp.data + " >> ");
                temp = temp.next;
            }
            System.out.println("liste sonu");

        }

    }

}
















