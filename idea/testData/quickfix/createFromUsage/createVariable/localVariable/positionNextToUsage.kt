// "Create local variable 'foo'" "true"

fun test(n: Int) {
    val i = 1
    test(i)
    test(i + 1)
    test(<caret>foo)
}