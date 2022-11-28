#include <iostream>
#include <string>

using namespace std;

void caso_de_prueba(){
    char caracter1, caracter2, desperdicio;
    int num1, num2;

    cin >> caracter1 >> desperdicio >> num1 >> caracter2 >> desperdicio >> num2;

    if (caracter1 != 'D' && caracter2 != 'D'){
        cout << "D=" << num1*num2 << endl;
    }else{
        if (caracter1 != 'V' && caracter2 != 'V'){
            cout << "V=";
        } else if (caracter1 != 'T' && caracter2 != 'T'){
            cout << "T="; 
        }

        if (caracter1 == 'D'){
            cout << num1/num2 << endl;
        } else{
            cout << num2/num1 << endl;
        }
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