def bust(hand : Int) : Boolean = hand > 21
val players : Array[String] = new Array[String](3)
players(0) = "A1"
players(1) = "B2"
players(2) = "C3"
for (player <- players) {
	println(player)
} 
println(bust(10 + 5 + 8))
println("hello world")
val demoList = List(10, 20, 30)
val newDemoList = 5 :: demoList 
println(newDemoList)
val list1 = 1::2::3::4::5::6::Nil
println(list1)
val wordsInIndia = "chalo"::"aao"::"wapas"::Nil
val wordsInEnglish = "let's go"::"go"::"return"::Nil
println(wordsInIndia:::wordsInEnglish)

