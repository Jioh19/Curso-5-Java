package Super;

public interface Estado {
	public abstract void agregar() throws CarritoException;
	public abstract void cancelar() throws CarritoException;
	public abstract void volver() throws CarritoException;
	public abstract void siguiente() throws CarritoException;
}
