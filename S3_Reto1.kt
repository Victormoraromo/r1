package s3

fun main() {

    val miVehiculo = Vehiculo()

    miVehiculo.color = "Verde"
    miVehiculo.marca = "Ford"
    miVehiculo.modelo = "Focus"
    miVehiculo.placas = "REM-4123"
    println("El coche está prendido? ${miVehiculo.encendido}")
    miVehiculo.encender()
    println("El coche está prendido? ${miVehiculo.encendido}")
    println("------------------")
    println("Datos del vehículo")
    println("Color: ${miVehiculo.color}")
    println("Marca: ${miVehiculo.marca}")
    println("Modelo: ${miVehiculo.modelo}")
    println("Placas: ${miVehiculo.placas}")


    println("El tanque tiene ${miVehiculo.gasolina}")
    miVehiculo.recargar(20.07f)
    println("Recargando......")
    println("Recargando......")
    println("Recargando......")
    println("Recargando......")
    println("El tanque tiene ${miVehiculo.gasolina}")
}