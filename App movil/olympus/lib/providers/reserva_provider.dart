import 'dart:async';
import 'dart:convert';
import 'package:olympus/models/reserva.dart';
import 'package:http/http.dart' as http;

class ReservaProvider {
  String _url = 'my-json-server.typicode.com';
  String _urlPC = '192.168.31.116:8080';

  List<Reserva> _listReservas = [];

  final _reservasStreamController = StreamController<List<Reserva>>();

  Function(List<Reserva>) get reservaSink => _reservasStreamController.sink.add;

  Stream<List<Reserva>> get reservasStream => _reservasStreamController.stream;

  void disposeStreams() {
    _reservasStreamController.close();
  }

  Future<List<Reserva>> _respuesta(Uri url) async {
    final resp = await http.get(url);
    final decodedData = json.decode(resp.body);
    print(decodedData);
    final reservas = new Reservas.fromJsonList(decodedData);
    return reservas.items;
  }

  Future<http.Response> createReserva(String dni, int id) {
    return http.post(Uri.parse('http://' + _urlPC + '/reserva'),
        headers: <String, String>{
          'content-Type': 'application/json; charset=UTF-8'
        },
        body: jsonEncode(
            <String, String>{'cliente': dni, 'clase': id.toString()}));
  }

  Future<List<Reserva>> getReservas() async {
    final url = Uri.http(_urlPC, '/reserva', {});
    final resp = await _respuesta(url);

    _listReservas.addAll(resp);
    reservaSink(_listReservas);
    return resp;
  }
}
