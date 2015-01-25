import java.util.Calendar
import scala.collection.mutable

/**
 * 定义一个链式哈希映射,将"Monday"映射到java.util.Calendar.MONDAY,依次类推加入其他日期。展示元素是以插入的顺序被访问的
 */
def calendarDays():Unit = {
  val daysMap = mutable.LinkedHashMap(
    "Monday" -> Calendar.MONDAY,
    "Tuesday" -> Calendar.TUESDAY,
    "Wednesday" -> Calendar.WEDNESDAY,
    "Thursday" -> Calendar.THURSDAY,
    "Friday" -> Calendar.FRIDAY,
    "Saturday" -> Calendar.SATURDAY,
    "Sunday" -> Calendar.SUNDAY
  )
  println(daysMap.mkString(","))
}
