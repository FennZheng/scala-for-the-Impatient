/**
 * 编写一段让你的Scala朋友们感到困惑的代码，使用一个不在顶部的com包
 */
package vernon {
  class T1() {}

  package com {
    class T2(t: T1) {}
  }


  package impatient {
    class T3(t1: T1, t2: com.T2) {}
  }
}