public class shape {
  public int area() {
    return 1;
  }
}
class square extends shape
{
  public int area(){
    return 2;
  }
}
class Main{
  public static void main(String[] args){
    shape shape= new shape();
    square square = new square();
    //square = shape;
    System.out.println(square.area());
  }
}