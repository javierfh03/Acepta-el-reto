#include <cstdio>
#include <iostream>
#include <string>

using namespace std;

int main(){
    int cantSaludos;
    int busqueda;

    cin >> cantSaludos;

    string saludos[cantSaludos];

    for (int i = 0; i < cantSaludos; i++) {
        cin >> saludos[i]  >> saludos[i];
    }

    for (string saludo : saludos) {
        cout << "Hola, " << saludo << "." << endl;
    }

    return 0;
}