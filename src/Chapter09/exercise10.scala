/**
 * 扩展那个可序列化的Person类，让它能以一个集合保存某个人的朋友信息。
 * 构造出一些Person对象，让他们中的一些人成为朋友，然后将Array[Person]保存到文件。将这个数组从文件中重新读出来，校验朋友关系是否完好
 */
import collection.mutable.ArrayBuffer
import java.io.{ObjectInputStream, FileOutputStream, FileInputStream, ObjectOutputStream}

class Person(var name:String) extends Serializable{

  val friends = new ArrayBuffer[Person]()

  def addFriend(friend : Person){
    friends += friend
  }

  override def toString() = {
    var str = "My name is " + name + " and my friends name is "
    friends.foreach(str += _.name + ",")
    str
  }
}


object Test extends App{
  val p1 = new Person("Ivan")
  val p2 = new Person("F2")
  val p3 = new Person("F3")

  p1.addFriend(p2)
  p1.addFriend(p3)
  println(p1)

  val out = new ObjectOutputStream(new FileOutputStream("test.txt"))
  out.writeObject(p1)
  out.close()

  val in =  new ObjectInputStream(new FileInputStream("test.txt"))
  val p = in.readObject().asInstanceOf[Person]
  println(p)
}