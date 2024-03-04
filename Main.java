public class Main {
    public static void main(String[] args){
        kucing kucing = new kucing();
        kucing.eat();
    }
}
  class kucing {
    String name;
    String gender;

     void eat(){
        System.out.println("nyam nyam");
    }

}