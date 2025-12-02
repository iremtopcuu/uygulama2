public class Main {
    //çift yönlü (doubly) doğrusal bağlı liste
public static void main(String[] args){
    DoublyLinkedLits liste= new DoublyLinkedLits();
    liste.basaekle(40);
    liste.basaekle(30);
    liste.basaekle(20);
    liste.basaekle( 10);
    liste.sonaekle(50);
    liste.sonaekle(60);
    liste.arayaekle(2,25);
    liste.arayaekle(9,8);
    liste.bastansil();
    liste.sondansil();
    liste.aradansil(5);
    liste.aradansil(0);
    liste.aradansil(1);


    liste.print();


}

}