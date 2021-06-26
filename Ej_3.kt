package s3

fun main()
{
    /*
    val miVehiculo = Vehiculo()
    println("El coche está prendido? ${miVehiculo.encendido}")
    miVehiculo.encender()
    println("El coche está prendido? ${miVehiculo.encendido}")
     */

    var mario = Mario()

    mario.collision("Pipe")
   // mario.collision("Goomba")
   // println("Te quedan ${mario.getLives()}")

    for(i in 1..5){ //matando a mario 5 veces
        mario.collision("Goomba")
        println("Te quedan ${mario.getLives()}")
    }
}