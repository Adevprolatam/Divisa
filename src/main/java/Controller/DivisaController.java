/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.DivisaModel;
import View.DivisaJFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author dell
 */

public class DivisaController implements ActionListener{
 DivisaModel model;
 DivisaJFrame view;

 //@CONSTRUCTOR
 public DivisaController(DivisaModel model, DivisaJFrame view) {
 this.model = model;
 this.view = view;
 view.jButtonCalcular.addActionListener(this);
 view.jButtonSalir.addActionListener(this);
 }

 @Override
 public void actionPerformed(ActionEvent e) {
 System.out.println(e.getActionCommand());
 switch(e.getActionCommand()){
 case "Calcular" -> {
 model.setCantidad(Double.parseDouble(view.jTextFieldCantidad.getText()));
 model.setMoneda(view.jComboBoxMoneda.getSelectedItem().toString());
 model.calcularDivisa();
 view.jLabel5.setText(String.valueOf(model.getValor()));
 }
 case "Salir" ->
 view.dispose();
 }
 }

 public void init(){
 view.setLocationRelativeTo(null);
 view.setVisible(true);
 }

}
