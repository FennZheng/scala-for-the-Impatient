/**
 * Created by vernonzheng on 15/1/20.
 */
/**
 * 针对下列Java循环编写一个Scala版本:

 for(int i=10;i>=0;i--) System.out.println(i);
 */
for (i <- 0 to 10 reverse) println(i)