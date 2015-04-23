package edu.tallerweb.cuentas;
/**
 * Es el tipo de cuenta m�s simple, ya que se rige por la premisa
 * de que en tanto y en cuanto se tenga tanto o m�s dinero en
 * cuenta del que se quiere extraer, la operaci�n se debe efectuar
 * correctamente.
 */
public class CuentaSueldo extends AbstractCuenta {

	public void depositar(final Double monto) {

		if	(monto < 0.0) {
			throw new CuentaBancariaException("error con el monto de la transaccion");
		} else {
		this.setSaldo(this.getSaldo() + monto);
		}
	}

	public void extraer(final Double monto) {

		if (monto > this.getSaldo() || monto < 0.0) {

			throw new CuentaBancariaException("error con el monto de la transaccion");
		} else {
			this.setSaldo(this.getSaldo() - monto);
		}
	}
	/*public Double getSaldo() {
		return this.Saldo;
	}*/

}
