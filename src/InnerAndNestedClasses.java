public class InnerAndNestedClasses {
    public static void main(String[] args) {
    Properties firstEx = new Properties(1,"straight","red");
        System.out.println(firstEx.getThickness() + " " + firstEx.getType() + " " + firstEx.getColour() );
    }
}
class Properties {
    private int thickness;
    private String type;
    private Color color;
    {
        color = new Color();
    }

    Properties(int thickness,String type,String clr)
    {
        this.thickness = thickness;
        this.type = type;
        color.setColor(clr);
    }

    String getColour(){
        return color.colour;
    }
    int getThickness(){
        return thickness;
    }
    String getType(){
        return type;
    }
//    void setColor(String colour){
//        color.setColor(colour);
//    }

    class Color {
      private String colour;

      Color(){}

      void displayColor(){
          System.out.println(colour);
      }
      void setColor(String clr){
          this.colour = clr;
      }
    }
}
