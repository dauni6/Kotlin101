package chap10.section1

import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.PrintWriter

fun main() {
    PrintWriter(FileOutputStream("d:\\output.txt")).use {
        it.println("hello")
    }
}