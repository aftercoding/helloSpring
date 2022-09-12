package pers.aftercoding.proxy2;
// to split book service and transaction by using prox of subclass
public class BookServiceImpl {
    // only service business in parent class
    public void  buy(){
        System.out.println("Book service feature complete .....");
    }
}
