public class MusicalInstruments {
    public static void main(String[] args) {
    MusicalInstruments firstOne = new MusicalInstruments("Gibson",1,70,150,40,7777.0,1992);
    MusicalInstruments secondOne = new MusicalInstruments("Fresco",3,700,650,440,99999.9,1984);
        System.out.println(firstOne.name + " Type " + firstOne.type + " Price " + firstOne.price + " Year of Production " + firstOne.yearOfProduction );
        firstOne.getSize();
        System.out.println(Statistics.idDrums + " = Барабанов ," + Statistics.idPiano + " = Пианино ," + Statistics.idGuitar + " = Гитар ");
    }

    private String name;
    private int type;
    private Size size = new Size();
    private double price;
    private int yearOfProduction;

    MusicalInstruments(String name,int type,double w, double h, double d, double price, int yearOfProduction){
        this.name = name;
        this.type = type;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
        size.setSizes(w,h,d);
        switch(type) {
            case 1:
                Statistics.idGuitar++;
                break;
            case 2:
                Statistics.idDrums++;
                break;
            case 3:
                Statistics.idPiano++;
                break;
        }
    }
    void getSize(){
        size.getSizes();
    }
    class Size{
        private double width;
        private double height;
        private double depth;

        void setSizes(double width,double height,double depth){
            this.width = width;
            this.height = height;
            this.depth = depth;
        }
        void getSizes(){
            System.out.println("Width = " + width);
            System.out.println("Height = " + height);
            System.out.println("Depth = " + depth);
        }

    }
    static class Statistics{
        public static int idGuitar = 0;
        public static int idPiano = 0;
        public static int idDrums = 0;
    }

}
