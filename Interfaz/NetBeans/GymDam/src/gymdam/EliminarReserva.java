/********************************************************************************
 ** Form generated from reading ui file 'EliminarReserva.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.6
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package gymdam;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Abel, Aitor, Yaasin
 * @version v.5
 */

public class EliminarReserva implements com.trolltech.qt.QUiForm<QDialog>
{
    public QLabel textoBorrar_3;
    public QPushButton pushButton_borrar;
    public QSpinBox spinBox;
    public QPushButton pushButton_atras;
    JFrame jFrame = new JFrame();

    public EliminarReserva() { super(); }
    
    void eliminar(){
        int id;
        
        try{
             id = spinBox.value();
       
        
            RestClient rest = new RestClient();
            
            rest.eliminarReserva(id);
            
            JOptionPane.showMessageDialog(jFrame, "Reserva eliminada correctamente");
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(jFrame, "Error al eliminar la reserva");
        }
    }

    public void setupUi(QDialog Dialog)
    {
        Dialog.setObjectName("Dialog");
        Dialog.resize(new QSize(441, 249).expandedTo(Dialog.minimumSizeHint()));
        QPalette palette= new QPalette();
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Light, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Midlight, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Dark, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.AlternateBase, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Light, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Midlight, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Dark, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.AlternateBase, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Light, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Midlight, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Dark, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.AlternateBase, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        Dialog.setPalette(palette);
        textoBorrar_3 = new QLabel(Dialog);
        textoBorrar_3.setObjectName("textoBorrar_3");
        textoBorrar_3.setGeometry(new QRect(130, 40, 291, 31));
        QPalette palette1= new QPalette();
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(229, 187, 18));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(229, 187, 18));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Light, new QColor(255, 226, 108));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Midlight, new QColor(242, 206, 63));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Dark, new QColor(114, 93, 9));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(153, 125, 12));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(229, 187, 18));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.AlternateBase, new QColor(242, 221, 136));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(229, 187, 18));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(229, 187, 18));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Light, new QColor(255, 226, 108));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Midlight, new QColor(242, 206, 63));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Dark, new QColor(114, 93, 9));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(153, 125, 12));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(229, 187, 18));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.AlternateBase, new QColor(242, 221, 136));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(114, 93, 9));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(229, 187, 18));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Light, new QColor(255, 226, 108));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Midlight, new QColor(242, 206, 63));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Dark, new QColor(114, 93, 9));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(153, 125, 12));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(114, 93, 9));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(114, 93, 9));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(229, 187, 18));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(229, 187, 18));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.AlternateBase, new QColor(229, 187, 18));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        textoBorrar_3.setPalette(palette1);
        QFont font = new QFont();
        font.setFamily("Onyx");
        font.setPointSize(21);
        textoBorrar_3.setFont(font);
        pushButton_borrar = new QPushButton(Dialog);
        pushButton_borrar.setObjectName("pushButton_borrar");
        pushButton_borrar.setGeometry(new QRect(190, 180, 91, 41));
        QPalette palette2= new QPalette();
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        pushButton_borrar.setPalette(palette2);
        QFont font1 = new QFont();
        font1.setFamily("Onyx");
        font1.setPointSize(18);
        pushButton_borrar.setFont(font1);
        spinBox = new QSpinBox(Dialog);
        spinBox.setObjectName("spinBox");
        spinBox.setGeometry(new QRect(210, 110, 42, 22));
        QPalette palette3= new QPalette();
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        spinBox.setPalette(palette3);
        pushButton_atras = new QPushButton(Dialog);
        pushButton_atras.setObjectName("pushButton_atras");
        pushButton_atras.setGeometry(new QRect(20, 30, 61, 51));
        
        pushButton_borrar.clicked.connect(this, "eliminar()");
        
        QPalette palette4= new QPalette();
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.HighlightedText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.HighlightedText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.HighlightedText, new QColor(0, 0, 0));
        pushButton_atras.setPalette(palette4);
        pushButton_atras.setStyleSheet("background-Color:rgb(255, 255, 255)");
        pushButton_atras.setIcon(new QIcon(new QPixmap("Logo/atras.png")));
        pushButton_atras.setIconSize(new QSize(50, 50));
        
        pushButton_atras.clicked.connect(Dialog, "close()");
        
        QWidget.setTabOrder(spinBox, pushButton_borrar);
        retranslateUi(Dialog);

        Dialog.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog Dialog)
    {
        Dialog.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("GymDam", "GymDam", null));
        textoBorrar_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Dime la ID de la reserva que desees borrar", null));
        pushButton_borrar.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Borrar", null));
        pushButton_atras.setText("");
    } // retranslateUi

}

