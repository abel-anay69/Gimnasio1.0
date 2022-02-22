/********************************************************************************
 ** Form generated from reading ui file 'EleminarClase.jui'
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

public class EliminarClase implements com.trolltech.qt.QUiForm<QDialog>
{
    public QPushButton pushButton_2;
    public QLabel textoBorrar;
    public QPushButton pushButton_atras_3;
    public QTableView tableView_2;
    public QLabel label_3;
    public QSpinBox spinBox;
    JFrame jFrame = new JFrame();

    public EliminarClase() { super(); }
    
    void eliminar(){
        int id;
        
        try{
             id = spinBox.value();
       
        
            RestClient rest = new RestClient();
        
            rest.eliminarClase(id);
        
            JOptionPane.showMessageDialog(jFrame, "Clase eliminada correctamente");
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(jFrame, "Error al eliminar la clase");
        }
    }

    public void setupUi(QDialog Dialog)
    {
        Dialog.setObjectName("Dialog");
        Dialog.resize(new QSize(1001, 482).expandedTo(Dialog.minimumSizeHint()));
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
        pushButton_2 = new QPushButton(Dialog);
        pushButton_2.setObjectName("pushButton_2");
        pushButton_2.setGeometry(new QRect(680, 400, 91, 41));
        
        pushButton_2.clicked.connect(this, "eliminar()");
        
        QPalette palette1= new QPalette();
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        pushButton_2.setPalette(palette1);
        QFont font = new QFont();
        font.setFamily("Onyx");
        font.setPointSize(18);
        pushButton_2.setFont(font);
        textoBorrar = new QLabel(Dialog);
        textoBorrar.setObjectName("textoBorrar");
        textoBorrar.setGeometry(new QRect(140, 400, 311, 31));
        QPalette palette2= new QPalette();
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(229, 187, 18));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(229, 187, 18));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Light, new QColor(255, 226, 108));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Midlight, new QColor(242, 206, 63));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Dark, new QColor(114, 93, 9));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(153, 125, 12));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(229, 187, 18));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.AlternateBase, new QColor(242, 221, 136));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(229, 187, 18));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(229, 187, 18));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Light, new QColor(255, 226, 108));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Midlight, new QColor(242, 206, 63));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Dark, new QColor(114, 93, 9));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(153, 125, 12));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(229, 187, 18));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.AlternateBase, new QColor(242, 221, 136));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(114, 93, 9));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(229, 187, 18));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Light, new QColor(255, 226, 108));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Midlight, new QColor(242, 206, 63));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Dark, new QColor(114, 93, 9));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(153, 125, 12));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(114, 93, 9));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(114, 93, 9));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(229, 187, 18));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(229, 187, 18));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.AlternateBase, new QColor(229, 187, 18));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        textoBorrar.setPalette(palette2);
        QFont font1 = new QFont();
        font1.setFamily("Onyx");
        font1.setPointSize(21);
        textoBorrar.setFont(font1);
        pushButton_atras_3 = new QPushButton(Dialog);
        pushButton_atras_3.setObjectName("pushButton_atras_3");
        pushButton_atras_3.setGeometry(new QRect(40, 50, 61, 51));
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
        pushButton_atras_3.setPalette(palette3);
        pushButton_atras_3.setStyleSheet("background-Color:rgb(255, 255, 255)");
        pushButton_atras_3.setIcon(new QIcon(new QPixmap("Logo/atras.png")));
        pushButton_atras_3.setIconSize(new QSize(50, 50));
        
        pushButton_atras_3.clicked.connect(Dialog, "close()");
        
        tableView_2 = new QTableView(Dialog);
        tableView_2.setObjectName("tableView_2");
        tableView_2.setGeometry(new QRect(20, 130, 961, 192));
        QPalette palette4= new QPalette();
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Light, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Midlight, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Dark, new QColor(127, 127, 127));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(170, 170, 170));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.AlternateBase, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Light, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Midlight, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Dark, new QColor(127, 127, 127));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(170, 170, 170));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.AlternateBase, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(127, 127, 127));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Light, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Midlight, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Dark, new QColor(127, 127, 127));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(170, 170, 170));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(127, 127, 127));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(127, 127, 127));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.AlternateBase, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        tableView_2.setPalette(palette4);
        label_3 = new QLabel(Dialog);
        label_3.setObjectName("label_3");
        label_3.setGeometry(new QRect(280, 10, 451, 101));
        label_3.setPixmap(new QPixmap(("Logo/OlympusTextBlanco.png")));
        label_3.setScaledContents(true);
        spinBox = new QSpinBox(Dialog);
        spinBox.setObjectName("spinBox");
        spinBox.setGeometry(new QRect(480, 400, 61, 41));
        QPalette palette5= new QPalette();
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        spinBox.setPalette(palette5);
        retranslateUi(Dialog);

        Dialog.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog Dialog)
    {
        Dialog.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("GymDam", "GymDam", null));
        pushButton_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Borrar", null));
        textoBorrar.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Dimela ID de la clase que desees borrar", null));
        pushButton_atras_3.setText("");
        label_3.setText("");
    } // retranslateUi

}

