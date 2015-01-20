/**
 * Created by vernonzheng on 15/1/20.
 */
/**
 *  编写函数计算x^n, 其中n为整数。
 */
def getPower(x:Double, n:Int):Double = {
  if (n == 0 ) 1
  else if ( n>0 && n % 2 != 0 ) x * getPower(x, n-1)
  else if (n >0 && n % 2 == 0 ) getPower (x, n/2) * getPower (x, n/2)
  else 1/getPower( x, -n)
}