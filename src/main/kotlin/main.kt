fun main() {
    val expect = "foo=value"
    println("expect: $expect")
    val actual = "foo=${System.getProperty("foo")}"
    println("actual: $actual")

    println(if (expect == actual) "OK" else "FAIL")
}
