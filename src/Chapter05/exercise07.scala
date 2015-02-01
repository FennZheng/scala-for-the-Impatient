/**
 * 编写一个Person类，其主构造器接受一个字符串，
 * 该字符串包含名字，空格和姓，如new Person("Fred Smith")。
 * 提供只读属性firstName和lastName。
 * 主构造器参数应该是var,val还是普通参数？为什么？
 */
package Q7 {

  class Person(private[this] val name: String) {
    private[this] val tmp = name.split("\\s+")
    val firstName = tmp(0)
    val lastName = tmp(1)
  }

}