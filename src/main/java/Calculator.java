public class Calculator {

    private String listProducts = "";
    private double sumOfProducts = 0;
    private final int NUMBER_OF_PEOPLES;

    Calculator (int numberOfPeoples ) {
        NUMBER_OF_PEOPLES = numberOfPeoples;
    }

    public void makeListOfProducts (Product product) {

        listProducts = listProducts + product.getNameProduct()  + "\n";
    }

    public void countSumOnBill (Product priceProduct) {
        sumOfProducts += priceProduct.getPriceProduct();
    }

    public String getListProducts() {
        System.out.println("\nДобавленные товары:");

        return listProducts;
    }

    public double getSumOfProducts (){
        return sumOfProducts;
    }
    public double getSumForOnePeople (){
        return sumOfProducts / NUMBER_OF_PEOPLES;
    }
}
