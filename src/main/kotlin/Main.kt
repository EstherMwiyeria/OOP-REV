fun main() {
//    Object-Oriented Programming is a technique used to break down complex problems into smaller
//    bits by creating objects

    var toyota = Car("KBT 289Y",60.0,0)
    toyota.start()
    toyota.speed
    println(toyota.speed)
    toyota.decelerate(72)
    println(toyota.speed)
    toyota.register()

    var value = Calculator(625,25.0)
    value.addition()
    value.subtraction()
    value.division()
    value.multiplication()

    println(Vehicles("Mazda",40))

    val female = Human("Eunice",21,3)
    female.eat(3)
    female.speak("Your belief system is your limit")
    female.birthday()

    val being = Person("Esther","Kanoro","esthermkanoro@gmail.com","757197884","esther@018")
    println(being.firstName)
    println(being.email)

}
// Write a function that takes in a list of Car objects each with a
//registration,speed,start attribute and returns the speed
//of the object.
class Car(var registration:String,var speed:Double,var start:Int) {
    fun start() {
        println("start journey")
    }

    fun decelerate(deceleration: Int): Double {
        speed = speed - deceleration
        return speed
    }

    fun register() {
        println(registration)
    }
}

//Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers

class Calculator(var number1: Int, var number2: Double) {
    fun addition(){
        var sum = number1 + number2
        println(sum)
    }
    fun subtraction(){
        var difference = number1 - number2
        println(difference)
    }
    fun division(){
        var divide = number1 / number2
        println(divide)
    }
    fun multiplication(){
        var product = number1 * number2
        println(product)
    }
}

//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Vehicles(var registration:String,var mileage:Int)

fun Vehicles(listOfVehicles:List<Vehicles>): Double {
    var sum =listOf<Int>()

    for(vehicle in listOfVehicles) {
        sum += vehicle.mileage
    }
    return (sum.average())
//    println(sum)
}

class Human(var name: String, var age: Int, var weight: Int) {
    fun eat(foodWeight: Int) {
        println("I am eating $foodWeight kgs of food")
        weight+= foodWeight
        println(weight)
    }

    fun speak(speech: String) {
        println(speech)
    }

    fun birthday(){
        ++age
        println(age)
    }
}

data class Person(var firstName: String, var lastName: String, var email: String,
                  var phoneNumber: String, var password: String )







