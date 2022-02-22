import 'dart:async';
import 'dart:ffi';

import 'package:flutter/material.dart';
import 'package:olympus/providers/reserva_provider.dart';

void main() => runApp(calendario());

class calendario extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Calendario',
      home: MyHomePage(title: 'Flutter Demo Home Page'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  MyHomePage({Key? key, required this.title}) : super(key: key);

  final String title;

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  DateTime selectedDate = DateTime.now();

  Future<void> _selectDate(BuildContext context) async {
    final DateTime? picked = await showDatePicker(
        context: context,
        initialDate: selectedDate,
        firstDate: DateTime(2015, 8),
        lastDate: DateTime(2101));
    if (picked != null && picked != selectedDate)
      setState(() {
        var aux = picked.toString().split(" ");
        print(aux[0]);
        selectedDate = picked;
      });
  }

  _crearReserva() {
    final reservaProvider = ReservaProvider();
    var dni = "1234A";
    var id_clase = 1;
    reservaProvider.createReserva(dni, id_clase);
    print("Hola reserva");
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
      ),
      body: Center(
        child: Column(
          mainAxisSize: MainAxisSize.min,
          children: <Widget>[
            Text("${selectedDate.toLocal()}".split(' ')[0]),
            SizedBox(
              height: 20.0,
            ),
            RaisedButton(
              onPressed: () => _selectDate(context),
              child: Text('Select date'),
            ),
            MaterialButton(
              minWidth: 200.0,
              height: 40.0,
              onPressed: () => _crearReserva(),
              color: Colors.lightBlue,
              child:
                  Text('Crear Reserva', style: TextStyle(color: Colors.white)),
            ),
          ],
        ),
      ),
    );
  }
}
