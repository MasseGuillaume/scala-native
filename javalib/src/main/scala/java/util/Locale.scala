package java.util

final class Locale {
  def this(language: String, country: String, variant: String) = this()
  def this(language: String, country: String) = this(language, country, "")
}

object Locale {
  def getDefault(): Locale = ???
  val US = new Locale("en", "US")
}
