#include <iostream>
#include <string>

using namespace std;

bool caso_de_prueba(){
    int tamanio, dibujar_caracteres, dibujar_espacios;
    char caracter;

    cin >> tamanio >> caracter;

    if (tamanio == 0 && caracter == '0'){
        return false;
    }

    dibujar_caracteres = tamanio;
    dibujar_espacios = tamanio - 1;

    for (int i = 0; i < tamanio; i++) {
        for (int p = 0; p < dibujar_espacios; p++) {
            cout << " ";
        }

        dibujar_espacios -= 1;

        for (int p = 0; p < dibujar_caracteres; p++) {
            cout << caracter;
        }

        cout << endl;

        dibujar_caracteres += 2;
    }

    dibujar_caracteres -= 4;
    dibujar_espacios += 2;
    tamanio--;

    for (int i = 0; i < tamanio; i++) {
        for (int p = 0; p < dibujar_espacios; p++) {
            cout << " ";
        }

        dibujar_espacios += 1;

        for (int p = 0; p < dibujar_caracteres; p++) {
            cout << caracter;
        }

        cout << endl;

        dibujar_caracteres -= 2;
    }

    return true;
}

int main(){
    

    while(caso_de_prueba()){
    }

    return 0;
}