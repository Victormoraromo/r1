package s3

const val PHONE_LENGTH = 10

class User(
    val name: String = "gg",
    private var age: Int = 38,
    private val userToken: String = "dd",
    private val email: String = "kk" ){

    private var phoneNumber: Long = 0
        set(value){  //Utilizamos un setter para guardar un valor sólo cuando cumpla con los 10 dígitos de un número telefónico
            if(value.toString().length == PHONE_LENGTH){
                field = value
            } else{
                println("El número que ingresaste es incorrecto")
            }
        }

}