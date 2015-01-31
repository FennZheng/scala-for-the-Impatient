/**
 * 编写一个 Conversions 对象，加入 inchesToCentimeters,gallonsToLiters 和 milesToKilometers 方法
 */
object Conversions{
  def inchesToSantimeters(value: Double) = value * 2.54
  def gallonsToLiters(value: Double) = value * 3.78541178
  def milesToKilometers(value: Double) = value * 1.609344
}