#include <iostream>
#include <string>

using namespace std;

bool caso_de_prueba(){
    int cantidad, jugador_1 = 0, jugador_2 = 0;
    bool es_jugador_1 = true;
    string golpe;

    cin >> cantidad;

    if (cantidad == 0){
        return false;
    }

    for (int i = 0; i < cantidad; i++) {
        cin >> golpe;

        if (golpe == "PIC"){
            if (es_jugador_1){
                es_jugador_1 = false;
            } else {
                es_jugador_1 = true;
            }
        } else if (golpe == "PONG!") {
            if (es_jugador_1){
                jugador_1++;
            } else{
                jugador_2++;
            }
        }
    }

    cout << jugador_1 << " " << jugador_2 << endl;

    return true;
}

int main(){
    while(caso_de_prueba()){
    }

    return 0;
}