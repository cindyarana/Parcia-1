/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AVLArbol;


import javax.swing.JOptionPane;

/**
 * 
 * @author Rodrigo
 * @version 1.2 07/01/2018
 */
public class main {

    
    public static void main(String[] args) throws InterruptedException {
        //Se crea un objeto de tipo ArbolAVL en donde se insertaran todos los numeros
        ArbolAVL arbolAVL = new ArbolAVL();
       int numero,opc;
       do{
           numero=0;opc=0;
           numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un valor para agregarlo al arbol:","Insertar Valor ",JOptionPane.QUESTION_MESSAGE));
           arbolAVL.insertar(numero);
           opc=JOptionPane.showConfirmDialog(null, "Desea insertar otro elemento en el arbol?","Seguir?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
       }while(opc!=JOptionPane.NO_OPTION);
        
        
       JOptionPane.showMessageDialog(null, "Recorrido del arbol en Preorden","Mostrando Duplicados",JOptionPane.INFORMATION_MESSAGE);
    arbolAVL.Listado(arbolAVL.raiz);
        
       
    }
    
   
    
}
