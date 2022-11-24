#include <cstdio>
#include <iostream>
#include <string>

using namespace std;

int main(){
    int cantSaludos;
    string saludo;

    cin >> cantSaludos;

    for (int i = 0; i < cantSaludos; i++) {
        cin >> saludo  >> saludo;
        cout << "Hola, " << saludo << "." << endl;
    }

    return 0;
}