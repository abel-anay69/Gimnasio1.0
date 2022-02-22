/********************************************************************************
 ** Form generated from reading ui file 'Reservas.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.6
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package gymdam;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

/**
 *
 * @author Abel, Aitor, Yaasin
 * @version v.5
 */

public class Reservas implements com.trolltech.qt.QUiForm<QDialog>
{
    public QPushButton pushButton_Crear;
    public QPushButton pushButton_Modificar;
    public QLabel Ubi_2;
    public QPushButton pushButton_Eliminar;
    public QLabel label_2;
    public QPushButton pushButton_Reservas_5;
    public QPushButton pushButton;

    public Reservas() { super(); }
    
    void crear(){
        CrearReserva cr = new CrearReserva();
        QDialog dialog = new QDialog();
        cr.setupUi(dialog);
        dialog.show();
    }
    
    void modificar(){
        ListaParaModificarReserva lpmr = new ListaParaModificarReserva();
        QDialog dialog = new QDialog();
        lpmr.setupUi(dialog);
        dialog.show();
    }
    
    void eliminar(){
        EliminarReserva er = new EliminarReserva();
        QDialog dialog = new QDialog();
        er.setupUi(dialog);
        dialog.show();
    }
    
    void visualizar(){
        ListaReserva lr = new ListaReserva();
        QDialog dialog = new QDialog();
        lr.setupUi(dialog);
        dialog.show();
    }

    public void setupUi(QDialog Dialog)
    {
        Dialog.setObjectName("Dialog");
        Dialog.resize(new QSize(568, 566).expandedTo(Dialog.minimumSizeHint()));
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
        pushButton_Crear = new QPushButton(Dialog);
        pushButton_Crear.setObjectName("pushButton_Crear");
        pushButton_Crear.setGeometry(new QRect(190, 200, 211, 71));
        QPalette palette1= new QPalette();
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(116, 157, 156));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Light, new QColor(174, 236, 234));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Midlight, new QColor(145, 196, 195));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Dark, new QColor(58, 78, 78));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(77, 105, 104));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(116, 157, 156));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.AlternateBase, new QColor(185, 206, 205));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(116, 157, 156));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Light, new QColor(174, 236, 234));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Midlight, new QColor(145, 196, 195));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Dark, new QColor(58, 78, 78));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(77, 105, 104));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(116, 157, 156));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.AlternateBase, new QColor(185, 206, 205));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(58, 78, 78));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(116, 157, 156));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Light, new QColor(174, 236, 234));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Midlight, new QColor(145, 196, 195));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Dark, new QColor(58, 78, 78));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(77, 105, 104));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(58, 78, 78));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(58, 78, 78));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(116, 157, 156));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(116, 157, 156));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.AlternateBase, new QColor(116, 157, 156));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        pushButton_Crear.setPalette(palette1);
        QFont font = new QFont();
        font.setFamily("Onyx");
        font.setPointSize(26);
        pushButton_Crear.setFont(font);
        pushButton_Crear.setMouseTracking(false);
        
        pushButton_Crear.clicked.connect(this, "crear()");
        
        pushButton_Modificar = new QPushButton(Dialog);
        pushButton_Modificar.setObjectName("pushButton_Modificar");
        pushButton_Modificar.setGeometry(new QRect(190, 290, 211, 71));
        QPalette palette2= new QPalette();
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(116, 157, 156));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Light, new QColor(174, 236, 234));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Midlight, new QColor(145, 196, 195));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Dark, new QColor(58, 78, 78));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(77, 105, 104));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(116, 157, 156));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.AlternateBase, new QColor(185, 206, 205));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(116, 157, 156));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Light, new QColor(174, 236, 234));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Midlight, new QColor(145, 196, 195));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Dark, new QColor(58, 78, 78));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(77, 105, 104));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(116, 157, 156));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.AlternateBase, new QColor(185, 206, 205));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(58, 78, 78));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(116, 157, 156));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Light, new QColor(174, 236, 234));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Midlight, new QColor(145, 196, 195));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Dark, new QColor(58, 78, 78));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(77, 105, 104));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(58, 78, 78));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(58, 78, 78));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(116, 157, 156));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(116, 157, 156));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.AlternateBase, new QColor(116, 157, 156));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        pushButton_Modificar.setPalette(palette2);
        QFont font1 = new QFont();
        font1.setFamily("Onyx");
        font1.setPointSize(26);
        pushButton_Modificar.setFont(font1);
        pushButton_Modificar.setMouseTracking(false);
        
        pushButton_Modificar.clicked.connect(this, "modificar()");
        
        Ubi_2 = new QLabel(Dialog);
        Ubi_2.setObjectName("Ubi_2");
        Ubi_2.setGeometry(new QRect(240, 130, 121, 51));
        QPalette palette3= new QPalette();
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(229, 187, 18));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(229, 187, 18));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Light, new QColor(255, 226, 108));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Midlight, new QColor(242, 206, 63));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Dark, new QColor(114, 93, 9));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(153, 125, 12));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(229, 187, 18));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(229, 187, 18));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(229, 187, 18));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.AlternateBase, new QColor(242, 221, 136));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(229, 187, 18));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(229, 187, 18));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Light, new QColor(255, 226, 108));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Midlight, new QColor(242, 206, 63));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Dark, new QColor(114, 93, 9));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(153, 125, 12));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(229, 187, 18));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(229, 187, 18));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(229, 187, 18));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.AlternateBase, new QColor(242, 221, 136));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(114, 93, 9));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(229, 187, 18));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Light, new QColor(255, 226, 108));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Midlight, new QColor(242, 206, 63));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Dark, new QColor(114, 93, 9));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(153, 125, 12));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(114, 93, 9));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(114, 93, 9));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(229, 187, 18));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(229, 187, 18));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.AlternateBase, new QColor(229, 187, 18));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        Ubi_2.setPalette(palette3);
        QFont font2 = new QFont();
        font2.setFamily("Onyx");
        font2.setPointSize(40);
        font2.setUnderline(true);
        Ubi_2.setFont(font2);
        pushButton_Eliminar = new QPushButton(Dialog);
        pushButton_Eliminar.setObjectName("pushButton_Eliminar");
        pushButton_Eliminar.setGeometry(new QRect(190, 380, 211, 71));
        QPalette palette4= new QPalette();
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(116, 157, 156));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Light, new QColor(174, 236, 234));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Midlight, new QColor(145, 196, 195));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Dark, new QColor(58, 78, 78));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(77, 105, 104));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(116, 157, 156));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.AlternateBase, new QColor(185, 206, 205));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(116, 157, 156));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Light, new QColor(174, 236, 234));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Midlight, new QColor(145, 196, 195));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Dark, new QColor(58, 78, 78));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(77, 105, 104));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(116, 157, 156));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.AlternateBase, new QColor(185, 206, 205));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(58, 78, 78));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(116, 157, 156));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Light, new QColor(174, 236, 234));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Midlight, new QColor(145, 196, 195));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Dark, new QColor(58, 78, 78));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(77, 105, 104));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(58, 78, 78));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(58, 78, 78));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(116, 157, 156));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(116, 157, 156));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.AlternateBase, new QColor(116, 157, 156));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        pushButton_Eliminar.setPalette(palette4);
        QFont font3 = new QFont();
        font3.setFamily("Onyx");
        font3.setPointSize(26);
        pushButton_Eliminar.setFont(font3);
        pushButton_Eliminar.setMouseTracking(false);
        
        pushButton_Eliminar.clicked.connect(this, "eliminar()");
        
        label_2 = new QLabel(Dialog);
        label_2.setObjectName("label_2");
        label_2.setGeometry(new QRect(60, 20, 451, 101));
        label_2.setPixmap(new QPixmap(("Logo/OlympusTextBlanco.png")));
        label_2.setScaledContents(true);
        pushButton_Reservas_5 = new QPushButton(Dialog);
        pushButton_Reservas_5.setObjectName("pushButton_Reservas_5");
        pushButton_Reservas_5.setGeometry(new QRect(190, 470, 211, 71));
        QPalette palette5= new QPalette();
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(116, 157, 156));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Light, new QColor(174, 236, 234));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Midlight, new QColor(145, 196, 195));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Dark, new QColor(58, 78, 78));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(77, 105, 104));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(116, 157, 156));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.AlternateBase, new QColor(185, 206, 205));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(116, 157, 156));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Light, new QColor(174, 236, 234));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Midlight, new QColor(145, 196, 195));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Dark, new QColor(58, 78, 78));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(77, 105, 104));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(116, 157, 156));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.AlternateBase, new QColor(185, 206, 205));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(58, 78, 78));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(116, 157, 156));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Light, new QColor(174, 236, 234));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Midlight, new QColor(145, 196, 195));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Dark, new QColor(58, 78, 78));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(77, 105, 104));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(58, 78, 78));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(58, 78, 78));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(116, 157, 156));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(116, 157, 156));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.AlternateBase, new QColor(116, 157, 156));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        pushButton_Reservas_5.setPalette(palette5);
        QFont font4 = new QFont();
        font4.setFamily("Onyx");
        font4.setPointSize(26);
        pushButton_Reservas_5.setFont(font4);
        pushButton_Reservas_5.setMouseTracking(false);
        
        pushButton_Reservas_5.clicked.connect(this, "visualizar()");
        
        pushButton = new QPushButton(Dialog);
        pushButton.setObjectName("pushButton");
        pushButton.setGeometry(new QRect(50, 150, 61, 51));
        QPalette palette6= new QPalette();
        palette6.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(255, 255, 255));
        palette6.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette6.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(0, 0, 0));
        palette6.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette6.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette6.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(255, 255, 255));
        palette6.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.HighlightedText, new QColor(0, 0, 0));
        palette6.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(255, 255, 255));
        palette6.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette6.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(0, 0, 0));
        palette6.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette6.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette6.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(255, 255, 255));
        palette6.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.HighlightedText, new QColor(0, 0, 0));
        palette6.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(255, 255, 255));
        palette6.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette6.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(0, 0, 0));
        palette6.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette6.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette6.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(255, 255, 255));
        palette6.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.HighlightedText, new QColor(0, 0, 0));
        pushButton.setPalette(palette6);
        pushButton.setStyleSheet("background-Color:rgb(255, 255, 255)");
        pushButton.setIcon(new QIcon(new QPixmap("Logo/atras.png")));
        pushButton.setIconSize(new QSize(50, 50));
        pushButton.clicked.connect(Dialog, "close()");
        retranslateUi(Dialog);

        Dialog.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog Dialog)
    {
        Dialog.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Dialog", null));
        pushButton_Crear.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Crear", null));
        pushButton_Modificar.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Modificar", null));
        Ubi_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Reservas", null));
        pushButton_Eliminar.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Eliminar", null));
        label_2.setText("");
        pushButton_Reservas_5.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Visualizar", null));
        pushButton.setText("");
    } // retranslateUi

}

