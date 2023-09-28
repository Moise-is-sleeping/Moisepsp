interface Cliente {
    fun aplicardescuento(producto:Producto):Float{
        var precioFinal = producto.precio - ((producto.descuentoProducto/100)*producto.precio)
        return precioFinal
    }

    fun pagar(cantidad:Float){

    }
}