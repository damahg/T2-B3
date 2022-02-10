package E03;

public class Producto {
	private int codigo;
	private String descripcion;
	private double precioSinIVA;
	private Categoria categoria;
	
	private static int autoIncremento = 1;
	
	public Producto (String descripcion, double precioSinIVA, Categoria categoria) throws ProductoException {
		this.codigo = autoIncremento;
		
		autoIncremento++;
		
		this.descripcion = descripcion;
		setPrecioSinIVA(precioSinIVA);
		this.categoria = categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioSinIVA() {
		return precioSinIVA;
	}

	public void setPrecioSinIVA(double precioSinIVA) throws ProductoException {
		if (precioSinIVA <= 0) {
			throw new ProductoException("El valor no puede ser 0 o negativo");
		}
		
		this.precioSinIVA = precioSinIVA;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public double calcularPrecio () {
		double precio;
		
		precio = this.precioSinIVA * (1 + (this.categoria.getIVA()/100));
		
		return precio;
	}
	
}
