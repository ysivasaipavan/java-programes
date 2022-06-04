class BoxObj extends Box {
    Box(int length,int height,int Breadth)
    {
        System.out.println("I am useing constratior");
        System.out.println(lenght);
        System.out.println(height);
        System.out.println(breadth);
    }
    public static void main(String[] args) {
        {
          Box b1=new Box();
           b1.height=10;
           b1.breadth=20;
           b1.lenght=40;
           System.out.println("Height"+b1.height);
           System.out.println("Bra"+b1.breadth);
           System.out.println("Lengtha"+b1.lenght);
           
        }
     /*   Box(int length,int height,int Breadth)
        {
            length=50;
            Breadth=100;
            height=25
        }*/
       

    }
}
