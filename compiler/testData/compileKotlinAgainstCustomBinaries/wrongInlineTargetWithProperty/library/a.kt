// JVM_TARGET: 1.8
package a

var inlineGetter: Int
    inline get() = 1
    set(varue) {}
