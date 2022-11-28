#include <cstdio>
#include <iostream>
#include <regex>
#include <string>

using namespace std;

string sacar_etnia(string nombre){
    int resto = nombre.length() - 2;
    string ultimos = nombre.substr(resto, nombre.length());

    if (ultimos == "IX"){
        return "GALO";
    } else if (ultimos == "US" || ultimos == "UM") {
        return "ROMANO";
    } else if (ultimos == "IC") {
        return "GODO";
    } else if (ultimos == "AS") {
        return "GRIEGO";
    } else if (ultimos == "AF") {
        return "NORMANDO";
    } else if (ultimos == "IS" || ultimos == "OS" || ultimos == "AX") {
        return "BRETON";
    } else if (ultimos == "EZ") {
        return "HISPANO";
    } else if (ultimos.substr(1, 2) == "A") {
        return "INDIO";
    } else {
        return "PLUS ULTRA";
    }
}

bool es_picto(string nombre){
    string primeros = nombre.substr(0, 3);
        
    return primeros == "MAC";
}

void caso_de_prueba(){
    string nombre;

    getline(cin, nombre);

    if (nombre.length() < 3){
            nombre = "   " + nombre;
    }
        
    if (es_picto(nombre)){
        if (sacar_etnia(nombre) == "PLUS ULTRA"){
            cout << "PICTO" << endl;
        }else{
            cout << "MULATO" << endl;
        }
    }else{
        cout << sacar_etnia(nombre) << endl;
    }
}

int main(){
    string cantidad;

    getline(cin, cantidad);

    for (int i = 0; i < stoi(cantidad); i++) {
        caso_de_prueba();
    }

    return 0;
}

