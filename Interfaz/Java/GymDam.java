/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymdam;


import com.trolltech.qt.gui.*;
import com.trolltech.qt.gui.*;

/**
 *
 * @author dam_aap
 */
public class GymDam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QApplication.initialize(args);
                QDialog mw = new QDialog();
                MenuPrincipal mp = new MenuPrincipal();
                mp.setupUi(mw);
                mw.show();
                
                
        QApplication.execStatic();
    }
    
}
