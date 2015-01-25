import scala.beans.BeanProperty

/**
 * 创建一个Student类，加入可读写的JavaBeans属性name(类型为String)和id(类型为Long)。
 * 有哪些方法被生产？(用javap查看。)
 * 你可以在Scala中调用JavaBeans的getter和setter方法吗？
 * 应该这样做吗？
 */
class Student{
  @BeanProperty var name:String = _
  @BeanProperty var id:Long = _
}
/**
javap -c Student 后显示如下

Compiled from "Student.scala"
public class Student extends java.lang.Object implements scala.ScalaObject{
  public java.lang.String name();
  Code:
  0:   aload_0
  1:   getfield        #13; //Field name:Ljava/lang/String;
  4:   areturn

  public void name_$eq(java.lang.String);
  Code:
  0:   aload_0
  1:   aload_1
  2:   putfield        #13; //Field name:Ljava/lang/String;
  5:   return

  public void setName(java.lang.String);
  Code:
  0:   aload_0
  1:   aload_1
  2:   putfield        #13; //Field name:Ljava/lang/String;
  5:   return

  public long id();
  Code:
  0:   aload_0
  1:   getfield        #19; //Field id:J
  4:   lreturn

  public void id_$eq(long);
  Code:
  0:   aload_0
  1:   lload_1
  2:   putfield        #19; //Field id:J
  5:   return

  public void setId(long);
  Code:
  0:   aload_0
  1:   lload_1
  2:   putfield        #19; //Field id:J
  5:   return

  public long getId();
  Code:
  0:   aload_0
  1:   invokevirtual   #25; //Method id:()J
  4:   lreturn

  public java.lang.String getName();
  Code:
  0:   aload_0
  1:   invokevirtual   #28; //Method name:()Ljava/lang/String;
  4:   areturn

  public Student();
  Code:
  0:   aload_0
  1:   invokespecial   #34; //Method java/lang/Object."<init>":()V
  4:   return

}
  **/