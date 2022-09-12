package pers.aftercoding.proxy1;

public class BookServiceImpl {
    public void buy(){
        try{
            System.out.println("Transaction start......");
            System.out.println("Buy book service execute correctly.......");
            System.out.println("transaction commit.......");
        }catch (Exception e){
            System.out.println("transaction roll back........");
        }

    }
}
