/********************************************************************************
 ** Form generated from reading ui file 'EliminarCliente.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.6
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package gymdam;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;
import static java.lang.Integer.parseInt;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Abel, Aitor, Yaasin
 * @version v.5
 */

public class EliminarCliente implements com.trolltech.qt.QUiForm<QDialog>
{
    public QLabel textoBorrar_2;
    public QLineEdit lineEdit_Borrar;
    public QPushButton pushButton_3;
    public QPushButton pushButton_atras_4;
    JFrame jFrame = new JFrame();

    public EliminarCliente() { super(); }
    
    void eliminar(){
        String dni;
        
        try{
             dni = lineEdit_Borrar.text();
       
        
            RestClient rest = new RestClient();
        
            rest.eliminarCLiente(dni);
        
            JOptionPane.showMessageDialog(jFrame, "Cliente eliminado correctamente");
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(jFrame, "Error al eliminar cliente");
        }
    }


    public void setupUi(QDialog Dialog)
    {
        Dialog.setObjectName("Dialog");
        Dialog.resize(new QSize(413, 230).expandedTo(Dialog.minimumSizeHint()));
        QPalette palette= new QPalette();
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Light, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Midlight, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Dark, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
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
        textoBorrar_2 = new QLabel(Dialog);
        textoBorrar_2.setObjectName("textoBorrar_2");
        textoBorrar_2.setGeometry(new QRect(90, 20, 291, 31));
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
        textoBorrar_2.setPalette(palette1);
        QFont font = new QFont();
        font.setFamily("Onyx");
        font.setPointSize(21);
        textoBorrar_2.setFont(font);
        lineEdit_Borrar = new QLineEdit(Dialog);
        lineEdit_Borrar.setObjectName("lineEdit_Borrar");
        lineEdit_Borrar.setGeometry(new QRect(100, 90, 241, 20));
        pushButton_3 = new QPushButton(Dialog);
        pushButton_3.setObjectName("pushButton_3");
        pushButton_3.setGeometry(new QRect(170, 160, 91, 41));
        
        pushButton_3.clicked.connect(this, "eliminar()");
        
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
        pushButton_3.setPalette(palette2);
        QFont font1 = new QFont();
        font1.setFamily("Onyx");
        font1.setPointSize(18);
        pushButton_3.setFont(font1);
        pushButton_atras_4 = new QPushButton(Dialog);
        pushButton_atras_4.setObjectName("pushButton_atras_4");
        pushButton_atras_4.setGeometry(new QRect(10, 70, 61, 51));
        QPalette palette3= new QPalette();
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(255, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(255, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.HighlightedText, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(255, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(255, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.HighlightedText, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(255, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(255, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.HighlightedText, new QColor(0, 0, 0));
        pushButton_atras_4.setPalette(palette3);
        pushButton_atras_4.setStyleSheet("background-Color:rgb(255, 255, 255)");
        pushButton_atras_4.setIcon(new QIcon(new QPixmap("Logo/atras.png")));
        pushButton_atras_4.setIconSize(new QSize(50, 50));
        
        pushButton_atras_4.clicked.connect(Dialog, "close()");
        
        retranslateUi(Dialog);

        Dialog.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog Dialog)
    {
        Dialog.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("GymDam", "GymDam", null));
        textoBorrar_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Dime el DNI del cliente que desees borrar", null));
        pushButton_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Borrar", null));
        pushButton_atras_4.setText("");
    } // retranslateUi

}

