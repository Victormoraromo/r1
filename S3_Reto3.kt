package s3

fun main()
{
    var mario = Mario()
    if(mario.isAlive){
        mario.collision("Goomba")
        println("Te quedan ${mario.getLives()}")
    }
    mario.collision("Star")


}