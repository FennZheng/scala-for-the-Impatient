/**
 * 扩展前一个练习的BankAccount类，
 * 新类SavingsAccount每个月都有利息产生(earnMonthlyInterest方法被调用)，
 * 并且有每月三次免手续费的存款或取款。在earnMonthlyInterest方法中重置交易计数。
 */
class BankAccount(initialBalance:Double){
  private var balance = initialBalance
  def deposit(amount:Double) = { balance += amount; balance}
  def withdraw(amount:Double) = {balance -= amount; balance}
}
class SavingsAccount(initialBalance:Double) extends BankAccount(initialBalance){
  private var num:Int = _
  def earnMonthlyInterest()={
    num = 3
    super.deposit(1)
  }

  override def deposit(amount: Double): Double = {
    num -= 1
    if(num < 0) super.deposit(amount - 1) else super.deposit(amount)
  }

  override def withdraw(amount: Double): Double = {
    num -= 1
    if (num < 0) super.withdraw(amount + 1) else super.withdraw(amount)
  }
}