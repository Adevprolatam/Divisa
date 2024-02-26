/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package adevprolatam.divisa;

import Controller.DivisaController;
import Model.DivisaModel;
import View.DivisaJFrame;


/**
 *
 * @author dell
 */
public class Divisa {

    public static void main(String[] args) {
        DivisaModel model = new DivisaModel();
        DivisaJFrame view = new DivisaJFrame();
        DivisaController controller = new DivisaController(model, view);
        controller.init();
    }
}
