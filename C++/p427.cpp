#include <iostream>
#include <string>

using namespace std;

void caso_de_prueba(){
    string frase_a, frase_b;

    cin >> frase_a >> frase_b;

    if (frase_a == "Luke" && frase_b == "padre"){
        cout << "TOP SECRET" << endl;
    }else{
        cout << frase_a << ", yo soy tu " << frase_b << endl;
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
