public class Formatting {

    public static String getFormattingDouble (double sumValue){

        return String.format("%.2f",sumValue);
    }

    public static String getFormattingEnding (double sumValue){

        int remOfDevision = ((int)sumValue) % 10;

        if (sumValue >= 11 && sumValue < 15)
            return "рублей";

        switch(remOfDevision){
            case 1:
                return "рубль";
            case 2:
            case 3:
            case 4:
                return "рубля";
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return "рублей";

        }
        return "рублей";
    }


}
