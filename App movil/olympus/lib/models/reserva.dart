class Reservas {
  List<Reserva> items = [];
  Reservas();

  Reservas.fromJsonList(List<dynamic> jsonList) {
    if (jsonList == null) return;
    for (var item in jsonList) {
      final reserva = new Reserva.fromJsonMap(item);
      items.add(reserva);
    }
  }
}

class Reserva {
  String? cliente;
  int? clase;

  Reserva({this.cliente, this.clase});

  Reserva.fromJsonMap(Map<String, dynamic> json) {
    cliente = json['cliente'];
    clase = json['clase'];
  }
}
