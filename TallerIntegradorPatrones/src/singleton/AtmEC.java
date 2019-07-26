/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;
import Patrones.Account;
import Patrones.Manejador;
import java.util.Currency;

/**
 *
 * @author CltControl
 */
public class AtmEC {
        private static AtmEC instance;
        private Currency moneda;
        private Double dinero ;
        private Manejador manejador;
        
        private AtmEC(){
            
        }
        public static AtmEC getInstance(){
            if (instance == null){
                instance = new AtmEC();
            }
             
            return instance;
        }
        
        public boolean sacarDinero(int dinero){
            return manejador.retirar(dinero);
        }
        
        public boolean ingresarDinero(int n, double denominacion){
            return manejador.depositar(n, (int) denominacion);
        }
        
        public void addManejador(Manejador m){
            
        }
        
        public Manejador removeManejador(int i){
            return null;
        }
        
        public void transaction(Account cuenta){
            
        }
        
        public void anotherTransaction(Account cuenta){
            
        }
}
