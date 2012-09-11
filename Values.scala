#!/bin/bash
scala $0 $@
exit
!#

/*
 * Scala has a rich set of value types.
 */

// Integers:
val anInt = 2

// Floating point:
val aDouble = 3.0

// Characters:
val aCharacter = 'c'

// Strings:
val aString= "Scala"

// Symbols:
val aSymbol = 'foo

// XML
val anXMLElement = <a href="http://www.google.com/">{aString}</a>

// Tuples:
val aPair = (aString,aDouble)

// Lists:
val aList = List(1,2,3,4) 

// Ranges:
val aRange = 1 to 5

// Maps:
val aMap = Map(3 -> "foo", 4 -> "bar")

// Sets:
val aSet = Set(8,9,10)

// Arrays:
val anArray = Array(1,2,3,4)

// Unit:
val unit = ()

// Null:
val nullValue = null

// Functions:
def incImplicit (x: Int) = x + 1

val incAnonymous = ((x : Int) => x + 1)
