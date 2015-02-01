/**
 * 翻开你喜欢的Java或C++教科书，一定会找到用来讲解继承层级的实例，可能是员工，宠物，图形或类似的东西。用Scala来实现这个示例。
 */
/**
 * java
 * class Art{
    Art(){System.out.println("Art constructor");}
  }

  class Drawing extends Art{
    Drawing() {System.out.println("Drawing constructor");}
  }

  public class Cartoon extends Drawing{
    public Cartoon() { System.out.println("Cartoon constructor");}
  }
 */
class Art{
  println("Art constructor")
}

class Drawing extends Art{
  println("Drawing constructor")
}

class Cartoon extends Drawing{
  println("Cartoon constructor")
}
