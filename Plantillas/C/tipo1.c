#include <stdio.h>

void caso_de_prueba(){
}

int main(){
    int cantidad, contador = 0;

    scanf("%d", &cantidad);

    while (contador < cantidad) {
        caso_de_prueba();
        contador++;
    }

    return 0;
}