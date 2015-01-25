/**
 * 在5.2节的Person类中提供一个主构造器,将负年龄转换为0
 */
class Person(var age:Int){
  age = if(age<0) 0 else age
}