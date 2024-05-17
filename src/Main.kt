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