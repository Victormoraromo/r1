package s3
import java.util.*
import kotlin.concurrent.schedule
class Mario(var vidas: Int =3){ //vamos a dejar setear el número de vidas al iniciar el objeto Mario

    init {
        println("It's a me! Mario!") //vamos a hacer que Mario se presente al construirlo!
    }

    val isAlive: Boolean
        get() {
            return lives>=1
        }

    private var state = "small" //mario es pequeño al iniciar el juego
        set(value) {
            val before = field
            field = value
            println("tu estado ahora es $field")
            if(value=="Star"){
                Timer("SettingUp", false).schedule(10000) {
                    field = before
                    println("tu estado ahora es $field")
                }
            }
            field = value
        }


    private var lives = 3 //uno empieza el juego con tres vidas
        set(value){
            if(field == 1){ //si teníamos una vida, se termina el juego
                field = 0
                gameOver()
            } else if(field==0){ //si ya teníamos 0 vidas, no haz reiniciado el juego
                println("Necesitas volver a jugar")
            }
            else{
                field=value //podemos asignar el valor correctamente
            }
        }
        get() = field

    var Star ="Star"






    //resta una vida al jugador
    private fun die(){
        lives--
        println("Has perdido una vida!")
    }

    fun getLives(): String{
        return "$lives vidas"
    }

    private fun gameOver(){
        println("JUEGO TERMINADO")
    }



    //el modificador public es redundante
    //en función del objeto colisionante, se ejecuta un evento
    public fun collision(collisionObj: String){
        when(collisionObj){
            "Goomba" -> die()
            "Super Mushroom" -> state = "Super mario"
            "Fire flower" -> state = "Fire mario"
            "Star" -> state = "Star"
            else -> println("Objeto desconocido ¡no pasa nada!")

        }
    }

}