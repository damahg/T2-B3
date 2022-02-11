package E03;

public class Categoria {
	private String nombre;
	private double IVA;
	
	public Categoria (String nombre, double IVA) throws ProductoException {
		this.nombre = nombre;
		setIVA(IVA);
	}

	public double getIVA() {
		return IVA;
	}

	public void setIVA(double IVA) throws ProductoException{
		if (IVA <= 0) {
			throw new ProductoException("El IVA no puede ser 0 o negativo");
		}
		
		this.IVA = IVA;
	}
	
	@Override
	public String toString() {
		return "Categoria [nombre=" + nombre + ", IVA=" + IVA + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(IVA);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (Double.doubleToLongBits(IVA) != Double.doubleToLongBits(other.IVA))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
}
