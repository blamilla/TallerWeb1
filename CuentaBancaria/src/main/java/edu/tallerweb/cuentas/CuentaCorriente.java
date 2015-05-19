package edu.tallerweb.cuentas;
/**
 * La m�s compleja de las cuentas, �sta permite establecer una
 * cantidad de dinero a girar en descubierto. Es por ello que
 * cada vez que se desee extraer dinero, no s�lo se considera
 * el que se posee, sino el l�mite adicional que el banco
 * estar� brindando.
 *
 * Por supuesto esto no es gratis, ya que el banco nos cobrar�
 * un 5% como comisi�n sobre todo el monto en descubierto
 * consumido en la operaci�n.
 *
 * Por ejemplo, si tuvi�ramos $ 100 en la cuenta, y quisi�ramos
 * retirar $ 200 (con un descubierto de $ 150), podremos hacerlo.
 * Pasaremos a deberle al banco $ 105 en total: los $ 100 que
 * nos cubri�, m�s el 5% adicional sobre el descubierto otorgado.
 */

public class CuentaCorriente  extends AbstractCuenta {

	private final Double descubiertoTotal = 0.0;
	private Double deuda = 0.0;
	private final Double porcentaje = 0.05;
	/**
	 * Toda cuenta corriente se inicia con un l�mite total
	 * para el descubierto.
	 * @param descubiertoTotal
	 */
	public CuentaCorriente(final Double descubiertoTotal) {
		this.setSaldo(this.getSaldo() + this.descubiertoTotal);
	}
	/**
	 * Todo dep�sito deber� cubrir primero el descubierto,
	 * si lo hubiera, y luego contar para el saldo de la
	 * cuenta.
	 * @param monto a depositar
	 */
	public void depositar(final Double monto) {

		if (monto <= descubiertoTotal || monto < 0.0) {
			throw new CuentaBancariaException("error con el monto de la transaccion");
		} else {

		this.setSaldo(this.getSaldo() + monto);
		}
		}
	/**
	 * Se cobrar� el 5% de comisi�n sobre el monto girado
	 * en descubierto.
	 * Por supuesto, no puede extraerse m�s que el total
	 * de la cuenta, m�s el descubierto (comisi�n inclu�da)
	 * @param monto a extraer
	 */
	public void extraer(final Double monto) {

		if (monto >= this.getSaldo() || monto < 0.0) {
			throw new CuentaBancariaException("error con el monto de la transaccion");
		} else {
			if (monto < this.getSaldo()) {

			this.setSaldo(this.getSaldo() - monto);

			} else {

				this.setDeuda((monto - this.getSaldo()) * this.porcentaje + (monto - this.getSaldo()));

			}
		}
	}
	/*public Double getSaldo() {

		return this.getSaldo();
	}*/
	public Double getDescubierto() {
		return this.descubiertoTotal;
	}
	public Double getDeuda() {
		return deuda;
	}
	public void setDeuda(final Double deuda) {
		this.deuda = deuda;
	}
}
