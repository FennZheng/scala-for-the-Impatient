/**
 * 设计一个Point类，其x和y坐标可以通过构造器提供。
 * 提供一个子类LabeledPoint，其构造器接受一个标签值和x,y坐标,
 * 比如:new LabeledPoint("Black Thursday",1929,230.07)
 */
package Q5 {

  class Point(x: Double, y: Double)

  class LabeledPoint(x: Double, y: Double, tag: String) extends Point(x, y)

}