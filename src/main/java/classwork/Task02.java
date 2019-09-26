package classwork;

public class Task02 {
    public static void main(String[] args) {

currencyExchange(24.56, "GBP");


    }

    public static void currencyExchange(double sum, String type){
        double currency;

        switch (type){
            case "USD":
                currency = sum * 24.43;
                System.out.print(currency + " " + type);
                break;

            case "GBP":
                currency = sum * 30.54;
                System.out.print(currency + " " + type);
                break;

            case "EUR":
                currency = sum * 26.94;
                System.out.print(currency + " " + type);
                break;

            case "RUB":
                currency = sum * 0.38;
                System.out.print(currency + " " + type);
                break;


            default:
                System.out.println("No such currency!");



        }
    }

}
