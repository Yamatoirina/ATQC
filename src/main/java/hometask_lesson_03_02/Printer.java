package hometask_lesson_03_02;

public class Printer {
    private int tonerLevelBlack;
    private int numberOfPagesPrinted;
    private String model;
    private String manufacturer;
    private boolean duplexPagesPrinted;



    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.setNumberOfPagesPrinted(20);
        printer.setTonerLevelBlack(800);
        printer.print(200,true);
        System.out.println(printer.getTonerLevelBlack());

        if (printer.getTonerLevelBlack()<= 125) {
            printer.fillUp(500);
        }
        System.out.println(printer.getTonerLevelBlack());

        printer.tonerIsEmpty("Samsung");
    }

    public int getTonerLevelBlack() {
        return this.tonerLevelBlack;
    }

    public void setTonerLevelBlack(int tonerLevelBlack) {
        this.tonerLevelBlack = tonerLevelBlack;
    }

    public int getNumberOfPagesPrinted() {
        return this.numberOfPagesPrinted;
    }

    public void setNumberOfPagesPrinted(int numberOfPagesPrinted) {
        this.numberOfPagesPrinted = numberOfPagesPrinted;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public boolean getDuplexPagesPrinted() {
        return this.duplexPagesPrinted;
    }

    public void setDuplexPagesPrinted(boolean duplexPagesPrinted) {
        this.duplexPagesPrinted = duplexPagesPrinted;
    }

    public void fillUp(int tonerVolume)
    {
        this.tonerLevelBlack=this.tonerLevelBlack + tonerVolume;
    }
    public void print(int pages, boolean duplexPagesPrinted)
    {
        this.numberOfPagesPrinted = pages;
        if (duplexPagesPrinted==true) {
            this.tonerLevelBlack = pages*2;
        }
        else{
            this.tonerLevelBlack = pages;
        }
    }
    public boolean tonerIsEmpty(String model){
        if (this.tonerLevelBlack <=500){
            System.out.println(model + " is empty!");

            return false;}
        else {
            return true;}
    }



}
