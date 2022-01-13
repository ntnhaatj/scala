/**
  * Class Composition With Mixins
  * https://docs.scala-lang.org/tour/mixin-class-composition.html
  */
package thor

abstract class AbsIterator {
  type T
  def hasNext: Boolean
  def next(): T
}

trait RichIterator extends AbsIterator {
  def forEach(f: T => Unit): Unit = while (hasNext) f(next())
}

class StringIterator(s: String) extends AbsIterator with RichIterator {
  type T = Char
  private var idx      = 0
  def hasNext: Boolean = idx < s.length
  def next(): T = {
    val ch = s.charAt(idx)
    idx = idx + 1
    ch
  }
}
