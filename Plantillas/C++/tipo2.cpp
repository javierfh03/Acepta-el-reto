#include <iostream>
#include <string>

using namespace std;

bool caso_de_prueba(){
    int cantidad;

    cin >> cantidad;

    if (cantidad == 0){
        return false;
    }

    return true;
}

int main(){
    while(caso_de_prueba()){
    }

    return 0;
}