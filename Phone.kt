package s3
//hola mundo
class Phone{

    var isOn = false

    //métodos
    fun turnOn(){
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }

    fun getTurn(){
        val turnMode = if(isOn) "Encendido" else "Apagado"
        println("el teléfono esta $turnMode")
    }
}