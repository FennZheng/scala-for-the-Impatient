/**
 * 编写示例程序，展示为什么
    package com.horstmann.impatient
    不同于
    package com
    package horstmann
    package impatient
 */
package com {
  class T1() {}

  package horstmann {
    class T2(t: T1) {}

    package impatient {
      class T3(t1: T1, t2: T2) {}
    }
  }
}
package com.horstmann.impatient{
  //class T4(t1:T1,t3:T3)      //can not find type T1
}