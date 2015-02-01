/**
 * 扩展如下的BankAccount类，新类CheckingAccount对每次存款和取款都收取1美元的手续费
    class BankAccount(initialBalance:Double){
        private var balance = initialBalance
        def deposit(amount:Double) = { balance += amount; balance}
        def withdraw(amount:Double) = {balance -= amount; balance}
    }
 */
class BankAccount(initialBalance:Double){
  private var balance = initialBalance
  def deposit(amount:Double) = { balance += amount; balance}
  def withdraw(amount:Double) = {balance -= amount; balance}
}

class CheckingAccount(initialBanlance:Double) extends BankAccount(initialBanlance){
  override def deposit(amount:Double) = super.deposit(amount-1)
  override def withdraw(amount:Double) = super.withdraw(amount+1)
}