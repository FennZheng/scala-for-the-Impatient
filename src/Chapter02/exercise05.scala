/**
 * Created by vernonzheng on 15/1/20.
 */
/**
 * 编写一个过程countdown(n:Int)，打印从n到0的数字。
 */
def countdown(n:Int){
  for(i <- 0 to n reverse){
    println(i)
  }
}

