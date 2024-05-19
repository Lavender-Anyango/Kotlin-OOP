//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var human = Human("Lavender", 22, 38.6)
    (human.eat(1))
    (human.speak("Hello Akirachix"))
    human.birthday()

    val user = User(
        firstName = "John",
        lastName = "Doe",
        email = "john.doe@example.com",
        phoneNumber = "123-456-7890",
        password = "password123"
    )
    println(user.firstName)
    println(user.email)
}

//    var car = Car("Toyota", "Prado", "KDD a23F", 0)
//    println(car.make)
//    println(car.start())
//
//    println(car.speed)
//    car.accelerate(80)
//    println(car.speed)
//
//    car.deccelerate(30)
//    println(car.speed)
//
//    car.stop()
//    println(car.speed)
//
//
//    println(car.hoot())
//
//
//var myBook= Book("Tell me Lies", "Lavender", 334)
//    println(myBook.title)
//    println(myBook.author)
//    println(myBook.pages)
//
//}
//
//class Car(var  make: String, var model:String, var registration: String, var speed: Int){
//    fun start(){
//        println("Vroooom!")
//    }
//
//    fun accelerate(acceleration: Int): Int{
//        speed += acceleration
//        return speed
//
//    }
//
//    fun deccelerate(deceleration: Int){
//        speed -= deceleration
//    }
//
//    fun hoot(){
//        print("beep beep!")
//    }
//
//    fun stop(){
//        deccelerate(speed)
//    }
//
//
//}
//
//
//// null assertion operator
//data class Book(var title:String, var author:String, var pages: Int)
//
//
//data class AgeStats(
//    var minAge
//)
//
//fun calculateAgeStats(ages: Array<Int>): AgeStats{
//
//}

class Human(var name:String,  var age:Int, var weight: Double){
    fun eat(foodWeight: Int){
        println("I am eating $foodWeight kg of food")
        weight += foodWeight
        println(weight)
    }
    fun speak(speech: String){
        println(speech)
    }
    fun birthday(){
        println(++age)
    }

}

data class User(
    val firstName: String,
    val lastName: String,
    val email: String,
    val phoneNumber: String,
    val password: String
)
// create  a data class User with these fields: firstName, lastName, email, phoneNumber, password. Create an instance of User Class and print out any 2 attributes

////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//fun main() {
//    val banker = Banker("Kevin", 24)
//    val doctor = Doctor("Anne", 30)
//    val farmer = Farmer("Scarlet", 22)
//
//    banker.introduction()
//    doctor.introduction()
//    farmer.introduction()
//
//
//    banker.name
//    banker.age
////    banker.countMoney(arrayOf(100, 50, 200, 500, 100))
////    banker.sleep()
////    banker.talk("Right turn")
////
////
////    doctor.eat()
////    doctor.sleep()
////    doctor.treatPatient("Vivian","Malaria")
////    doctor.talk("How are you today")
////
////    farmer.eat()
////    farmer.sleep()
////    farmer.cultivateLand()
////    doctor.talk("Nice yields")
//
//}
//
//class Banker(name: String, age: Int):Person(name, age){
//    fun countMoney(notes: Array<Int>): Int{
//        var sum = 0
//        notes.forEach { note -> sum+=note }
//        return sum
//    }
//}
//
//class Doctor(name: String, age:Int):Person(name, age){
//    fun treatPatient(patient: String, disease:String){
//        println("Treat $patient for $disease")
//    }
//    override fun introduction(){
//        super.introduction()
//        println("Hi, I am Doctor $name")
//    }
//
//}
//class Farmer(name: String, age:Int): Person(name, age){
//    fun cultivateLand(){
//        println("dig dig dig")
//    }
//    override fun eat(){
//
//        println("I am eating the food that I have grown")
//    }
//
//}
//
//open class  Person(var name: String, var age: Int){
//    fun talk(words: String){
//        println(words)
//    }
//    open fun eat(){
//        println("yum")
//    }
//
//    fun sleep(){
//        println("zzzzzzzzzzzz")
//    }
//    open fun introduction(){
//        println("Hi, I am $name")
//    }
//
//
//}
