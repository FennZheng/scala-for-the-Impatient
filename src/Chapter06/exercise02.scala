/**
 * 前一个练习不是很面向对象。提供一个通用的超类 UnitConversion
 * 并定义扩展该超类的 InchesToCentimeters,GallonsToLiters 和 MilesToKilometers 对象
 */
abstract class UnitConversion(val factor:Double){
  def convert(value: Double): Double = factor * value
}
object InchesToSantimeters extends UnitConversion(2.54)
object GallonsToLiters extends UnitConversion(3.78541178)
object MilesToKilometers extends UnitConversion(1.609344)