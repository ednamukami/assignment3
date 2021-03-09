fun main(){
    name()
    me("Edna",17)
island()
    grace("edna")
    grace("jackline")
}
fun name(){
    var word="Akirachix"
    println(word[0])
    println(word[2])
    println(word[3])
}
fun me(name:String,age:Int){
    val character="Hi,my name is $name and I am $age years old"
   println(character)
}
fun island(){
    val deed="reed"
    println(deed.length)
}
fun grace(name: String){
    if(name=="edna"){
        println("that's me!")
    }
    else{
        println("i don't know who is that")
    }
}