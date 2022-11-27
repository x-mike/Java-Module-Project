public class Calculator {

    private static String listProducts = "";
    private static double sumOfProducts = 0;
    private static int numberOfPeoples;

    public static void setNumberOfPeoples (int setNumberOfPeoples ) {
        numberOfPeoples = setNumberOfPeoples;
    }

    public static void makeListOfProducts (Product product) {

        listProducts = listProducts + product.getNameProduct()  + "\n";
    }

    public static void countSumOnBill (Product priceProduct) {
        sumOfProducts += priceProduct.getPriceProduct();
    }

    public static String getListProducts() {
        System.out.println("\nДобавленные товары:");

        return listProducts;
    }

    public static double getSumOfProducts (){
        return sumOfProducts;
    }
    public static double getSumForOnePeople(){
        return sumOfProducts / numberOfPeoples;
    }
}
