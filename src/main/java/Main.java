
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final String STOP_VALUE = "завершить";

        Calculator.setNumberOfPeoples(inputPeopels());

        Product product = new Product();

        System.out.println("Отлично, вы не один! Вам нужно ввести наименование товаров и их цену.");

        while(true){

            product.setNameProduct(inputNameProduct());
            Calculator.makeListOfProducts(product);

            product.setPriceProduct(inputPriceProduct());
            Calculator.countSumOnBill(product);

            System.out.println("\n"+"******Ваш товар добавлен успешно!******"+"\n");

            System.out.print ("Если хотите завершить добавление товаров, наберите \"завершить\", если нет - введите любой символ: ");
            Scanner scanner = new Scanner(System.in);
            if(scanner.next().equalsIgnoreCase(STOP_VALUE))
                break;
        }

        System.out.println(Calculator.getListProducts());

        System.out.print("Общая сумма для оплаты: " + Formatting.getFormattingDouble(Calculator.getSumOfProducts()));
        System.out.println(" " + Formatting.getFormattingEnding(Calculator.getSumOfProducts()));

        System.out.print("Сумма оплаты для одного человека: " + Formatting.getFormattingDouble(Calculator.getSumForOnePeople()));
        System.out.println(" " + Formatting.getFormattingEnding(Calculator.getSumForOnePeople()) + ". Вместе дешевле и веселее!");

    }


    private static int inputPeopels () {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeoples;
        while (true) {
            System.out.print("Ввидите число людей, на которых нужно разделить счет: ");
            try {
                numberOfPeoples = Integer.parseInt(scanner.next());
                if (numberOfPeoples == 1)
                {
                    System.out.println("Похоже вы один... Вам счет делить не с кем =(. Введите другое число.");
                    continue;
                }
                else if (numberOfPeoples <= 0){
                    System.out.println("Ввидите значение больше нуля. Попробуйте еще раз.");
                    continue;
                }
                break;
            } catch (NumberFormatException exp) {
                System.out.println("Не корректный ввод! Ввидите число.");
            }
        }
        return numberOfPeoples;
    }

    private static String inputNameProduct (){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название товара:");

        return scanner.nextLine();
    }

    private static double inputPriceProduct () {
        Scanner scanner = new Scanner(System.in);
        double priceProduct;
        while (true) {
            System.out.print("Введите стоимость товара в следующем формате: \"'рубли.копейки' [10.45, 11.40]\": ");
            try {
                priceProduct = Double.parseDouble(scanner.next());
                if (priceProduct <= 0){
                    System.out.println("Вы ввели отрицательную стоимость. Такое может быть, но не в этой жизни =(.");
                    continue;
                }
                break;
            } catch (NumberFormatException exp) {
                System.out.println("Не корректный ввод! Ввидите число в указанном формате.");
            }
        }
        return priceProduct;
    }

}
