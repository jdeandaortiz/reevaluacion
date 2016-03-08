/**
 * 
 */
package mx.edu.utng.reevaluacion;

/**
 * 
 * @author Jesús Deanda Ortiz
 * @date 04/03/2016
 * @group GITI7083-S
 *
 */
public class Cliente {
	public void usa(){
		IBanco banco = new IBanco() {	
			@Override
			public void operacionesBancarias() {
				// TODO Auto-generated method stub				
			}
		};
	}
	
	public void solicita(){
		ICredito credito = new ICredito() {
			@Override
			public void estadoCrediticio() {
				// TODO Auto-generated method stub			
			}
		};
	}
	
	public void verifica(){
		AVerificador verificar = new AVerificador() {
			@Override
			public void getCredito() {
				// TODO Auto-generated method stub			
			}
			
			@Override
			public void getBanco() {
				// TODO Auto-generated method stub	
			}
		};
	}
}
