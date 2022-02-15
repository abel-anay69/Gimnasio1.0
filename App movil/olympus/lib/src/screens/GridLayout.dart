import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:fluttertoast/fluttertoast.dart';

class GridLayout extends StatelessWidget {
  List<String> events = [
    "Calendario",
    "Usuario",
    "Actividades",
    "Promociones",
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        body: Container(
      decoration: BoxDecoration(
        image: DecorationImage(
            image: AssetImage("assets/bg.png"), fit: BoxFit.cover),
      ),
      child: Container(
        margin: const EdgeInsets.only(top: 200.0),
        child: GridView(
          physics: BouncingScrollPhysics(),
          gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
            crossAxisCount: 2,
          ), // 2 items por fila
          children: events.map((title) {
            return GestureDetector(
              child: Card(
                  color: Color.fromARGB(227, 158, 161, 170),
                  shape: RoundedRectangleBorder(
                      borderRadius: BorderRadius.circular(35.0)),
                  margin: const EdgeInsets.all(30.0),
                  child: getCardByTitle(title)),
            );
            onTap:
            () {
              Fluttertoast.showToast(
                  msg: title + "click",
                  toastLength: Toast.LENGTH_SHORT,
                  gravity: ToastGravity.CENTER,
                  backgroundColor: Colors.red,
                  textColor: Colors.white,
                  fontSize: 16.0);
            };
          }).toList(),
        ),
      ),
    ));
  }

  Column getCardByTitle(String title) {
    String img = "";
    if (title == "Calendario")
      img = "assets/calendario.png";
    else if (title == "Usuario")
      img = "assets/usuario.png";
    else if (title == "Actividades")
      img = "assets/actividad.png";
    else
      img = "assets/promocion.png";

    return Column(
      mainAxisAlignment: MainAxisAlignment.center,
      children: <Widget>[
        new Center(
            child: Container(
          child: new Stack(
            children: <Widget>[
              new Image.asset(
                img,
                width: 100.0,
                height: 100.0,
              )
            ],
          ),
        )),
        Text(
          title,
          style: TextStyle(fontSize: 20.0, fontWeight: FontWeight.bold),
          textAlign: TextAlign.center,
        )
      ],
    );
  }
}
