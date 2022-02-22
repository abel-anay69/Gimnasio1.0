import 'package:flutter/material.dart';
import 'package:olympus/pages/home_screen.dart';
import 'package:olympus/pages/login_screen.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: LoginPage(),
    );
  }
}
