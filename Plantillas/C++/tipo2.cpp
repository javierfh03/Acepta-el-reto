#include <iostream>
#include <string>

using namespace std;

bool caso_de_prueba(){
    string cantidad;

    getline(cin, cantidad);

    if (stoi(cantidad) == 0){
        return false;
    }

    return true;
}

int main(){
    

    while(caso_de_prueba()){
    }

    return 0;
}