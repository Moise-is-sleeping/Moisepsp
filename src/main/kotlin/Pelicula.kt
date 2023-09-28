class Pelicula (titulo:String, precio :Float, añoPublicado:Int, descuentoProducto: Int,var Director:String):Producto(titulo,precio,añoPublicado,descuentoProducto ){
    val genero = "Genero_Pelicula"
}