
/*
trait Greeter {
  def greet(): Unit
}

trait Robot {
  self: Greeter =>

  def start(): Unit = greet()
  override final def toString = "Robot"
}

trait Greeter2 {
  def greet(): Unit
}

trait Robot2 extends Greeter2 {
  def start(): Unit = greet()
  override final def toString = "Robot2"
}
*/
trait Robot {
  self: Greeter =>
  def name: String
  def start(): Unit = greet()
}
// コンパイルできる
trait Greeter {
  self: Robot =>
  def greet(): Unit = println(s"My name is $name")
}

