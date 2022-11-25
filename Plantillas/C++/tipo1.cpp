#include <iostream>
#include <string>

using namespace std;

void caso_de_prueba(){
}

int main(){
    string cantidad;

    getline(cin, cantidad);

    for (int i = 0; i < stoi(cantidad); i++) {
        caso_de_prueba();
    }

    return 0;
}
